package com.matez.wildnature.world.gen.feature;

import com.matez.wildnature.Main;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.other.Utilities;
import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class ShellFeature extends Feature<NoFeatureConfig> {
   public ShellFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49908_1_) {
      super(p_i49908_1_);
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
      if(!worldIn.getDimension().isSurfaceWorld()){
         return false;
      }
      int i = 0;


      Main.LOGGER.debug("Shell " + pos);
      for(int j = 0; j < 64; ++j) {
         BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
         if ((worldIn.isAirBlock(blockpos) || worldIn.getBlockState(blockpos).getBlock()==Blocks.WATER) && (!worldIn.getDimension().isNether() || blockpos.getY() < worldIn.getWorld().getDimension().getHeight()) && (worldIn.getBlockState(blockpos).getBlock()== Blocks.SAND || worldIn.getBlockState(blockpos).getBlock()== Blocks.GRAVEL || worldIn.getBlockState(blockpos).getBlock()== WNBlocks.WHITE_SAND ) ) {
            BlockState shell = null;
            Main.LOGGER.debug("ShellX");
            if(worldIn.getBlockState(blockpos.down()).getBlock()== Blocks.SAND){
               //NORMAL BEACH

               if(Utilities.rint(0,1)==0){
                  switch (Utilities.rint(0,4)){
                     case 0:
                     case 1:
                        shell = WNBlocks.SAND_DOLLAR.getDefaultState();
                        break;
                     case 2:
                     case 3:
                        shell = WNBlocks.HORN_SHELL.getDefaultState();
                        break;
                     case 4:
                        shell = WNBlocks.LIONS_PAW.getDefaultState();
                        break;
                  }
               }
            }
            if(worldIn.getBlockState(blockpos.down()).getBlock()== Blocks.GRAVEL){
               if(Utilities.rint(0,2)==0){
                  switch (Utilities.rint(0,1)){
                     case 0:
                        shell = WNBlocks.HORN_SHELL.getDefaultState();
                        break;
                     case 1:
                        shell = WNBlocks.LIONS_PAW.getDefaultState();
                        break;
                  }
               }
            }
            if(worldIn.getBlockState(blockpos.down()).getBlock()== WNBlocks.WHITE_SAND){
               switch (Utilities.rint(0,4)){
                  case 0:
                  case 1:
                     shell = WNBlocks.LIONS_PAW.getDefaultState();
                     break;
                  case 2:
                  case 3:
                     shell = WNBlocks.COCKLESHELL.getDefaultState();
                     break;
                  case 4:
                     shell = WNBlocks.STAR_FISH.getDefaultState();
                     break;
               }
            }
            if(shell!=null){
               worldIn.setBlockState(blockpos,shell,2);
            }
            ++i;
         }
      }

      return i > 0;
   }
}