package com.matez.wildnature.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class WNScatteredPlantFeature extends Feature<NoFeatureConfig> {
   protected final BlockState plant;

   public WNScatteredPlantFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, BlockState plantIn) {
      super(configFactoryIn);
      this.plant = plantIn;
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
      if(!worldIn.getDimension().isSurfaceWorld()){
         return false;
      }
      int i = 0;

      for(int j = 0; j < 64; ++j) {
         BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
         if (worldIn.isAirBlock(blockpos) && worldIn.getBlockState(blockpos.down()).getBlock() instanceof GrassBlock) {
            worldIn.setBlockState(blockpos, this.plant, 2);
            ++i;
         }
      }

      return i > 0;
   }
}