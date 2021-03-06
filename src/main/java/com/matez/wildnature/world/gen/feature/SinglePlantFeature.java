package com.matez.wildnature.world.gen.feature;

import com.matez.wildnature.other.BlockWeighList;
import com.matez.wildnature.other.Utilities;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class SinglePlantFeature extends Feature<NoFeatureConfig> {
    private BlockWeighList list;
    private int spawnChance = 0;
    public SinglePlantFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49869_1_, BlockWeighList list, int spawnChance) {
        super(p_i49869_1_);
        this.spawnChance=spawnChance;
        this.list=list;
    }

    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if(!worldIn.getDimension().isSurfaceWorld()){
            return false;
        }
        if(spawnChance==0 || Utilities.rint(0,spawnChance,rand)==0) {
            BlockState state = Utilities.getWeighBlock(list);
            if (state != null) {
                for (BlockState blockstate = worldIn.getBlockState(pos); (blockstate.isAir() || blockstate.isIn(BlockTags.LEAVES)) && pos.getY() > 0; blockstate = worldIn.getBlockState(pos)) {
                    pos = pos.down();
                }

                int i = 0;
                boolean placed = false;

                for (int j = 0; j < 128; ++j) {
                    BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
                    try {
                        if (worldIn.isAirBlock(blockpos) && state.isValidPosition(worldIn, blockpos)) {
                            worldIn.setBlockState(blockpos, state, 2);
                            ++i;
                            placed = true;
                        }

                        if (placed) {
                            break;
                        }
                    } catch (NullPointerException e) {
                    }
                }

                return i > 0;
            }
        }
        return false;
    }


}
