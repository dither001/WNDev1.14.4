package com.matez.wildnature.blocks;

import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.lists.WNItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.*;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import java.util.ArrayList;
import java.util.List;

public class BlockBeams extends Block {
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static IntegerProperty TYPE = IntegerProperty.create("type",0,5);//4 = max

    public int getMaxTypes(){return 5;}

    public Item item;


    public BlockBeams(Properties properties, Item.Properties builder, ResourceLocation regName) {
        super(properties);

        this.setRegistryName(regName);
        item = new BlockItem(this,builder).setRegistryName(regName);


        WNBlocks.BLOCKS.add(this);
        WNBlocks.ITEMBLOCKS.add(item);


    }

    public VoxelShape result(List<VoxelShape> shapes){
        VoxelShape result = VoxelShapes.empty();
        int x=0;
        while(x<shapes.size()){
            result = VoxelShapes.combine(result,shapes.get(x), IBooleanFunction.OR);
            x++;
        }
        return result.simplify();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

        switch((Direction)state.get(FACING))
        {
            case NORTH: {
                switch (state.get(TYPE)) {
                    case 0: {
                        return Block.makeCuboidShape(4, 0, 0, 12, 16, 4);
                    }
                    case 1: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 0, 0, 12, 16, 4)); // CUBE
                        shapes.add(makeCuboidShape(4, 12, 4, 12, 16, 16)); // CUBE
                        return result(shapes);
                    }
                    case 2: {
                        return Block.makeCuboidShape(4, 12, 0, 12, 16, 16);
                    }
                    case 3: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(0, 12, 4, 4, 16, 12),
                                Block.makeCuboidShape(4, 12, 0, 12, 16, 16), IBooleanFunction.OR);
                    }
                    case 4: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(12, 12, 4, 16, 16, 12),
                                Block.makeCuboidShape(4, 12, 0, 12, 16, 16), IBooleanFunction.OR);
                    }
                    case 5: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 12, 0, 12, 16, 16)); // CUBE
                        shapes.add(makeCuboidShape(12, 12, 4, 16, 16, 12)); // CUBE
                        shapes.add(makeCuboidShape(0, 12, 4, 4, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    default: {
                        return Block.makeCuboidShape(0, 0, 0, 16, 16, 16);
                    }
                }
            }
            case SOUTH: {
                switch (state.get(TYPE)) {
                    case 0: {
                        return Block.makeCuboidShape(4, 0, 12, 12, 16, 16);
                    }
                    case 1: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 0, 12, 12, 16, 16)); // CUBE
                        shapes.add(makeCuboidShape(4, 12, 0, 12, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    case 2: {
                        return Block.makeCuboidShape(4, 12, 0, 12, 16, 16);
                    }
                    case 3: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 0, 12, 16, 16),
                                Block.makeCuboidShape(0, 12, 4, 4, 16, 12), IBooleanFunction.OR);
                    }
                    case 4: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 0, 12, 16, 16),
                                Block.makeCuboidShape(12, 12, 4, 16, 16, 12), IBooleanFunction.OR);
                    }
                    case 5: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 12, 0, 12, 16, 16)); // CUBE
                        shapes.add(makeCuboidShape(12, 12, 4, 16, 16, 12)); // CUBE
                        shapes.add(makeCuboidShape(0, 12, 4, 4, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    default: {
                        return Block.makeCuboidShape(0, 0, 0, 16, 16, 16);
                    }
                }
            }
            case WEST: {
                switch (state.get(TYPE)) {
                    case 0: {
                        return Block.makeCuboidShape(0, 0, 4, 4, 16, 12);
                    }
                    case 1: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(0, 0, 4, 4, 16, 12)); // CUBE
                        shapes.add(makeCuboidShape(4, 12, 4, 16, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    case 2: {
                        return Block.makeCuboidShape(0, 12, 4, 16, 16, 12);
                    }
                    case 3: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 0, 12, 16, 4),
                                Block.makeCuboidShape(0, 12, 4, 16, 16, 12), IBooleanFunction.OR);
                    }
                    case 4: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 12, 12, 16, 16),
                                Block.makeCuboidShape(0, 12, 4, 16, 16, 12), IBooleanFunction.OR);
                    }
                    case 5: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 12, 12, 12, 16, 16)); // CUBE
                        shapes.add(makeCuboidShape(4, 12, 0, 12, 16, 4)); // CUBE
                        shapes.add(makeCuboidShape(0, 12, 4, 16, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    default: {
                        return Block.makeCuboidShape(0, 0, 0, 16, 16, 16);
                    }
                }
            }
            case EAST: {
                switch (state.get(TYPE)) {
                    case 0: {
                        return Block.makeCuboidShape(12, 0, 4, 16, 16, 12);
                    }
                    case 1: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(12, 0, 4, 16, 16, 12)); // CUBE
                        shapes.add(makeCuboidShape(0, 12, 4, 12, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    case 2: {
                        return Block.makeCuboidShape(0, 12, 4, 16, 16, 12);
                    }
                    case 3: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 12, 12, 16, 16),
                                Block.makeCuboidShape(0, 12, 4, 16, 16, 12), IBooleanFunction.OR);
                    }
                    case 4: {
                        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 12, 0, 12, 16, 4),
                                Block.makeCuboidShape(0, 12, 4, 16, 16, 12), IBooleanFunction.OR);
                    }
                    case 5: {
                        List<VoxelShape> shapes = new ArrayList<>();
                        shapes.add(makeCuboidShape(4, 12, 12, 12, 16, 16)); // CUBE
                        shapes.add(makeCuboidShape(4, 12, 0, 12, 16, 4)); // CUBE
                        shapes.add(makeCuboidShape(0, 12, 4, 16, 16, 12)); // CUBE
                        return result(shapes);
                    }
                    default: {
                        return Block.makeCuboidShape(0, 0, 0, 16, 16, 16);
                    }
                }
            }
            default:
                return Block.makeCuboidShape(0, 0, 0, 16, 16, 16);
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult rayTraceResult) {
        if(entity.getHeldItem(hand).getItem()== WNItems.CHISEL)/*checks if held item is stick for example*/ {
            int currentType = state.get(TYPE);//gets current type from clicked block
            int validType = currentType;
            if (currentType >= getMaxTypes()) {
                validType = 0;//resets validType if currentType is bigger than allowed
            } else {
                validType++;
            }

            world.setBlockState(pos, state.with(TYPE, validType));//replaces that block with same block but another TYPE property
            return true;
        }
        return false;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING).add(TYPE);
    }

}