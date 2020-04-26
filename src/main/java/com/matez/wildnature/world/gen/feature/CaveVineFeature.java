package com.matez.wildnature.world.gen.feature;

import com.matez.wildnature.Main;
import com.matez.wildnature.lists.WNBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class CaveVineFeature extends Feature<NoFeatureConfig> {
   public CaveVineFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51438_1_) {
      super(p_i51438_1_);
   }
    private static final Direction[] DIRECTIONS = Direction.values();

    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if(!worldIn.getDimension().isSurfaceWorld()){
            return false;
        }
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos(pos);

        for(int i = pos.getY(); i > 2; i--) {
            mutable.setPos(pos);
            mutable.move(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));
            mutable.setY(i);
            if (worldIn.isAirBlock(mutable)) {
                for(Direction direction : DIRECTIONS) {
                    if ( direction != Direction.DOWN && direction != Direction.UP && worldIn.getBlockState(mutable.offset(direction)).isSolid()) {
                        worldIn.setBlockState(mutable, WNBlocks.GLOW_VINE.getDefaultState().with(VineBlock.getPropertyFor(direction), Boolean.valueOf(true)), 2);
                        break;
                    }
                }

            }
        }

        return true;
    }
}