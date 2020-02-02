package com.matez.wildnature.world.gen.structures.nature.woods.shrubs;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class shrub1 extends SchemFeature {
    public shrub1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public shrub1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {
        this.Block(0, 0, 0,LOG);
        BlockPos position = startBlockPos.up();
        for (int i = position.getY(); i <= position.getY() + 2; ++i)
        {
            int j = i - position.getY();
            int k = 2 - j;

            for (int l = position.getX() - k; l <= position.getX() + k; ++l)
            {
                int i1 = l - position.getX();

                for (int j1 = position.getZ() - k; j1 <= position.getZ() + k; ++j1)
                {
                    int k1 = j1 - position.getZ();

                    if (Math.abs(i1) != k || Math.abs(k1) != k || random.nextInt(2) != 0)
                    {
                        BlockPos blockpos = new BlockPos(l, i, j1);
                        if(!world.getBlockState(blockpos).isSolid()) {
                            this.setBlockState(world, blockpos, LEAVES);
                        }

                    }
                }
            }
        }
        

//   wildnature mod 2019/07/30 20:55:59
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
