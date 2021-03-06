package com.matez.wildnature.world.gen.feature;

import com.matez.wildnature.blocks.WisteriaBlock;
import com.matez.wildnature.other.Utilities;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;
import java.util.function.Function;

public class WNWisteriaFeature extends Feature<BushConfig> {
   private static final Direction[] DIRECTIONS = Direction.values();

   public WNWisteriaFeature(Function<Dynamic<?>, ? extends BushConfig> p_i51418_1_) {
      super(p_i51418_1_);
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, BushConfig config) {
      if(!worldIn.getDimension().isSurfaceWorld()){
         return false;
      }
      if(!(config.state.getBlock() instanceof WisteriaBlock)){
         return false;
      }
      BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos(pos);
      for(int i = pos.getY(); i > 2; i--) {
         mutable.setPos(pos);
         mutable.move(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));
         mutable.setY(i);
         if (worldIn.isAirBlock(mutable) && worldIn.isAirBlock(mutable.down())) {
            for (Direction direction : DIRECTIONS) {
               if (direction != Direction.DOWN && direction != Direction.UP) {
                  if (worldIn.getBlockState(mutable.offset(direction)).getBlock().isIn(BlockTags.LEAVES)) {
                     worldIn.setBlockState(mutable, config.state.with(WisteriaBlock.FACING, direction.getOpposite()), 2);
                     break;
                  }
               }
            }
         }
      }

      return true;
   }
}