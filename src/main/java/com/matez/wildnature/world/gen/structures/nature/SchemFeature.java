package com.matez.wildnature.world.gen.structures.nature;

import com.google.common.collect.Sets;
import com.matez.wildnature.blocks.BranchBase;
import com.matez.wildnature.other.Utilities;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.*;
import net.minecraft.command.arguments.BlockStateArgument;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class SchemFeature extends AbstractTreeFeature<NoFeatureConfig> {

    private ArrayList<BlockPos> addedBlocks = new ArrayList<>();
    private ArrayList<BlockPos> bottomBlocks = new ArrayList<>();

    public BlockState LEAVES = notDecayingLeaf(Blocks.OAK_LEAVES);
    public BlockState LOG = Blocks.OAK_LOG.getDefaultState();
    public BlockState DIRT = Blocks.DIRT.getDefaultState();
    public BlockState BRANCH = LEAVES;

    public SchemFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        LOG = Blocks.OAK_LOG.getDefaultState();
        LEAVES =notDecayingLeaf(Blocks.OAK_LEAVES);
        BRANCH = LEAVES;
    }



    public SchemFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace,BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        LOG = log;
        LEAVES =leaves;
        BRANCH = LEAVES;
    }



    public void setDirt(BlockState dirt){
        DIRT = dirt;
    }

    public static BlockState notDecayingLeaf(Block block){
        if(block instanceof LeavesBlock){
            return ((LeavesBlock)block).getDefaultState().with(LeavesBlock.PERSISTENT,true);
        }
        return block.getDefaultState();
    }


    public IWorld world;
    public BlockPos startBlockPos;
    public Random random;
    public ArrayList<BlockStatePos> addionalBlocks = new ArrayList<>();
    private int rotation;
    public int terrainIncrease = 0;

    @Override
    protected boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox p_208519_5_) {
        if(!canGrowTree(worldIn, position.down(), getSapling())){
            return false;
        }
        BlockPos soilPos = position.down();
        int x = 0;
        while (isWater(worldIn,soilPos)){
            soilPos = soilPos.down();
            x++;
        }
        if(x>=5){
            return false;
        }

        this.world=(IWorld)worldIn;
        this.startBlockPos=soilPos;
        this.random=rand;
        rotation= Utilities.rint(1,4,rand);
        setBlocks();
        //setAddionalBlocks();
        return true;
    }

    public boolean canGrowTree(IWorldGenerationReader world, BlockPos pos,net.minecraftforge.common.IPlantable sapling){
        return world.hasBlockState(pos, state -> state.canSustainPlant((net.minecraft.world.IBlockReader)world, pos, Direction.UP, sapling));
    }

    public Set<BlockPos> setBlocks(){
        return Sets.newHashSet(addedBlocks);
    }

    public void setAddionalBlocks(){
        for(BlockStatePos stps : addionalBlocks){
            if(stps.getState().getBlock() instanceof BranchBase){
                ((BranchBase)stps.getState().getBlock()).neighborChanged(stps.getState(),world,stps.getPos(),stps.getState().getBlock(),stps.getPos(),false);
            }
        }
    }

    public void Block(int x, int y, int z, BlockState state){
        BlockPos pos = startBlockPos;
        int sx = startBlockPos.getX();
        int sy = startBlockPos.getY()-1;
        int sz = startBlockPos.getZ();
        if(rotation>=1 && rotation<=4){
            if(rotation==1){
                pos = new BlockPos(x,y,z);//0
            }else if(rotation==2){
                pos = new BlockPos(x,y,z).rotate(Rotation.CLOCKWISE_180);//180
                state = state.rotate(Rotation.CLOCKWISE_180);
            }else if (rotation==3){
                pos = new BlockPos(x,y,z).rotate(Rotation.CLOCKWISE_90);//90
                state = state.rotate(Rotation.CLOCKWISE_90);
            }else{
                pos = new BlockPos(x,y,z).rotate(Rotation.COUNTERCLOCKWISE_90);//-90
                state = state.rotate(Rotation.COUNTERCLOCKWISE_90);
            }
            pos = new BlockPos(pos.getX()+sx,pos.getY()+sy,pos.getZ()+sz);
        }else{
            throw new IllegalArgumentException("Unknown rotation for tree at " + startBlockPos.toString() + " :\nrotation = " + rotation + " (1-4)\n   Please report it to author!");
        }

        //world.setBlockState(pos, state, 2);
        //setBlockState(world,pos,state);
        if(world.getBlockState(pos).getBlock()==Blocks.WATER && state.getBlock() instanceof IWaterLoggable){
            state=state.with(BlockStateProperties.WATERLOGGED,true);
        }
        world.setBlockState(pos,state,19);
        addedBlocks.add(pos);
    }



    public void Block(int x, int y, int z, String s){
        try {
            BlockState bs = BlockStateArgument.blockState().parse(new StringReader(s)).getState();
            Block(x,y,z,bs);

            return;
        } catch (CommandSyntaxException e) {

        }
    }

    public void generatePlatform(IWorldGenerationReader world){
        if(bottomBlocks==null){
            return;
        }

        int x = 0;
        BlockPos down = null;
        while(x<addedBlocks.size()){
            if(down==null){
                down = addedBlocks.get(x);
            }
            if(addedBlocks.get(x).getY()<down.getY()){
                down = addedBlocks.get(x);
            }
            x++;
        }

        x = 0;
        while(x<addedBlocks.size()){
            if(addedBlocks.get(x).getY()==down.getY()+1){
                bottomBlocks.add(downBlock(addedBlocks.get(x),1));
            }
            x++;
        }
        x = 0;
        int loop = 0;
        int done = 0;

        while(true){
            try {
                if (world.hasBlockState(downBlock(bottomBlocks.get(x), loop), new Predicate<BlockState>() {
                    @Override
                    public boolean test(BlockState state) {
                        return state.isSolid();
                    }
                })) {
                    setBlockState(world, downBlock(bottomBlocks.get(x), loop), LOG);

                } else {
                    done++;
                }

                if ((bottomBlocks.size() - 1) == x) {
                    x = 0;
                    loop++;
                    done = 0;
                }
                if (loop == 10) {
                    break;
                }
                x++;
            }catch(Exception e){
                break;
            }
        }

        addedBlocks.clear();
        bottomBlocks.clear();
    }

    private BlockPos downBlock(BlockPos blockPos, int down){
        return new BlockPos(blockPos.getX(),blockPos.getY()-down,blockPos.getZ());
    }

    public static class BlockStatePos{
        private BlockState state;
        private BlockPos pos;
        public BlockStatePos(BlockState state, BlockPos pos){
            this.state=state;
            this.pos=pos;
        }

        public BlockPos getPos() {
            return pos;
        }

        public BlockState getState() {
            return state;
        }
    }

}
