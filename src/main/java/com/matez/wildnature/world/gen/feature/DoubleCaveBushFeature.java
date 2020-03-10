package com.matez.wildnature.world.gen.feature;

import com.matez.wildnature.blocks.DoubleCaveBushBase;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;
import java.util.function.Function;

public class DoubleCaveBushFeature extends Feature<BushConfig> {
   private boolean reverse;
   public DoubleCaveBushFeature(Function<Dynamic<?>, ? extends BushConfig> p_i49908_1_, boolean reverse) {
      super(p_i49908_1_);
      this.reverse=reverse;
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, BushConfig config) {
      if(!worldIn.getDimension().isSurfaceWorld()){
         return false;
      }
      int i = 0;
      BlockState blockstate = config.state;

      for(int j = 0; j < 8; ++j) {
         BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
         if (worldIn.isAirBlock(blockpos) && (!worldIn.getDimension().isNether() || blockpos.getY() < worldIn.getWorld().getDimension().getHeight()) && blockstate.isValidPosition(worldIn, blockpos) && blockstate.getBlock() instanceof DoublePlantBlock) {
            if(reverse){
               worldIn.setBlockState(blockpos, blockstate.with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER), 2);
               worldIn.setBlockState(blockpos.down(), blockstate.with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER), 2);
            }else {
               worldIn.setBlockState(blockpos, blockstate.with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER), 2);
               worldIn.setBlockState(blockpos.up(), blockstate.with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER), 2);
            }
            ++i;
         }
      }

      return i > 0;
   }
}