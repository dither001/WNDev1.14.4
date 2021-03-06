package com.matez.wildnature.world.gen.biomes.biomes.surface;

import com.matez.wildnature.Main;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.feature.VinesFeature;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;
import java.util.function.Function;

public class PolderSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    int max = 0;
    public PolderSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> p_i51305_1_,int maxYToReplace) {
        super(p_i51305_1_);
        this.max=maxYToReplace;
    }



    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        int i = 0;

        int lowestHeight = 0;
        for (int height = seaLevel - 1; height > seaLevel-1 - max; height--) {
            if(chunkIn.getBlockState(new BlockPos(x,height,z)).getFluidState().getFluid()== Fluids.WATER) {
                chunkIn.setBlockState(new BlockPos(x, height, z), Blocks.AIR.getDefaultState(), false);
                lowestHeight = height;
            }else {
                continue;
            }

        }
        buildPolderSurface(random, chunkIn, biomeIn, x, z, lowestHeight-1, noise, defaultBlock, defaultFluid, config.getTop(), config.getUnder(), seaLevel);



    }

    private boolean isSameBiomeNear(IChunk chunk, Biome current, BlockPos pos){
        /*for(Direction d : Direction.values()){
            if(d==Direction.UP || d==Direction.DOWN){
                continue;
            }
            try{
                if(chunk.getBiome(pos.offset(d))!=current){
                    return false;
                }
            }catch(Exception e){
                return false;
            }
        }*/
        return true;

    }

    protected void buildPolderSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, BlockState top, BlockState middle,int sealevel) {
        BlockState blockstate = top;
        BlockState blockstate1 = middle;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        int i = -1;
        int j = (int)(noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int k = x & 15;
        int l = z & 15;

        boolean groundPlace = false;

        for(int i1 = startHeight; i1 >= 0; --i1) {
            blockpos$mutableblockpos.setPos(k, i1, l);
            BlockState blockstate2 = chunkIn.getBlockState(blockpos$mutableblockpos);
            if (blockstate2.isAir()) {
                i = -1;
            } else if (blockstate2.getBlock() == defaultBlock.getBlock()) {
                if (i == -1) {
                    if (j <= 0) {
                        blockstate = Blocks.AIR.getDefaultState();
                        blockstate1 = defaultBlock;
                    } else if (i1 >= sealevel - 4 && i1 <= sealevel + 1) {
                        blockstate = top;
                        blockstate1 = middle;
                    }

                    if (i1 < sealevel && (blockstate == null || blockstate.isAir())) {
                        if (biomeIn.func_225486_c(blockpos$mutableblockpos.setPos(x, i1, z)) < 0.15F) {
                            blockstate = Blocks.ICE.getDefaultState();
                        } else {
                            blockstate = defaultFluid;
                        }

                        blockpos$mutableblockpos.setPos(k, i1, l);
                    }

                    i = j;
                    if (i1 >= sealevel - 1) {
                        chunkIn.setBlockState(blockpos$mutableblockpos, blockstate, false);
                    }else {
                        if(groundPlace) {
                            chunkIn.setBlockState(blockpos$mutableblockpos, blockstate1, false);
                        }else{
                            chunkIn.setBlockState(blockpos$mutableblockpos, blockstate, false);
                            groundPlace=true;
                        }
                    }
                } else if (i > 0) {
                    --i;
                    chunkIn.setBlockState(blockpos$mutableblockpos, blockstate1, false);
                    if (i == 0 && blockstate1.getBlock() == Blocks.SAND && j > 1) {
                        i = random.nextInt(4) + Math.max(0, i1 - 63);
                        blockstate1 = blockstate1.getBlock() == Blocks.RED_SAND ? Blocks.RED_SANDSTONE.getDefaultState() : Blocks.SANDSTONE.getDefaultState();
                    }
                }
            }
        }

    }


    public static boolean isAnotherBiomeNear(Biome myBiome, BlockPos pos, Chunk chunk, int radius){
        boolean itIs = false;
        int i = radius;
        if (chunk.getBiome(pos.east(i)) != myBiome) {
            itIs = true;
        }

        if (chunk.getBiome(pos.west(i)) != myBiome) {
            itIs = true;
        }

        if (chunk.getBiome(pos.north(i)) != myBiome) {
            itIs = true;
        }

        if (chunk.getBiome(pos.south(i)) != myBiome) {
            itIs = true;
        }

        return itIs;
    }

    public static boolean isWaterNear(BlockPos pos, IChunk chunk, int radius){
        boolean itIs = false;
        int i = radius;
        if (chunk.getBlockState(pos.east(i)).getBlock()==Blocks.WATER) {
            itIs = true;
        }

        if (chunk.getBlockState(pos.west(i)).getBlock()==Blocks.WATER) {
            itIs = true;
        }

        if (chunk.getBlockState(pos.north(i)).getBlock()==Blocks.WATER) {
            itIs = true;
        }

        if (chunk.getBlockState(pos.south(i)).getBlock()==Blocks.WATER) {
            itIs = true;
        }

        return false;
    }
}
