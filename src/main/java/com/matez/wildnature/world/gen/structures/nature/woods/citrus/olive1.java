package com.matez.wildnature.world.gen.structures.nature.woods.citrus;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class olive1 extends SchemFeature {
    public olive1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public olive1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,7,-4,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(-1,8,-4,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-2,7,-3,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(-1,7,-3,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(0,7,-3,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(1,7,-3,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-2,8,-3,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,8,-3,"wildnature:citrus_log[axis=y]");
Block(0,8,-3,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,9,-3,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,1,-2,"wildnature:citrus_log[axis=y]");
Block(0,1,-2,"wildnature:citrus_log[axis=y]");
Block(0,2,-2,"wildnature:citrus_log[axis=y]");
Block(-1,6,-2,"wildnature:citrus_log[axis=y]");
Block(1,6,-2,"wildnature:citrus_log[axis=y]");
Block(-1,7,-2,"wildnature:citrus_log[axis=y]");
Block(0,7,-2,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,7,-2,"wildnature:citrus_log[axis=y]");
Block(2,7,-2,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,8,-2,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,8,-2,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,1,-1,"wildnature:citrus_log[axis=y]");
Block(0,1,-1,"wildnature:citrus_log[axis=y]");
Block(1,1,-1,"wildnature:citrus_log[axis=y]");
Block(-1,2,-1,"wildnature:citrus_log[axis=y]");
Block(0,2,-1,"wildnature:citrus_log[axis=y]");
Block(1,2,-1,"wildnature:citrus_log[axis=y]");
Block(-1,3,-1,"wildnature:citrus_log[axis=y]");
Block(0,3,-1,"wildnature:citrus_log[axis=y]");
Block(-1,4,-1,"wildnature:citrus_log[axis=y]");
Block(0,4,-1,"wildnature:citrus_log[axis=y]");
Block(-1,5,-1,"wildnature:citrus_log[axis=y]");
Block(0,5,-1,"wildnature:citrus_log[axis=y]");
Block(-1,6,-1,"wildnature:citrus_log[axis=y]");
Block(0,6,-1,"wildnature:citrus_log[axis=y]");
Block(-1,7,-1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(0,7,-1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,7,-1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-4,8,-1,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(-3,8,-1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,8,-1,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(-1,1,0,"wildnature:citrus_log[axis=y]");
Block(0,1,0,"wildnature:citrus_log[axis=y]");
Block(1,1,0,"wildnature:citrus_log[axis=y]");
Block(-1,2,0,"wildnature:citrus_log[axis=y]");
Block(0,2,0,"wildnature:citrus_log[axis=y]");
Block(-1,3,0,"wildnature:citrus_log[axis=y]");
Block(0,3,0,"wildnature:citrus_log[axis=y]");
Block(-1,4,0,"wildnature:citrus_log[axis=y]");
Block(0,4,0,"wildnature:citrus_log[axis=y]");
Block(-1,5,0,"wildnature:citrus_log[axis=y]");
Block(0,5,0,"wildnature:citrus_log[axis=y]");
Block(-2,6,0,"wildnature:citrus_log[axis=y]");
Block(-1,6,0,"wildnature:citrus_log[axis=y]");
Block(0,6,0,"wildnature:citrus_log[axis=y]");
Block(-3,7,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-2,7,0,"wildnature:citrus_log[axis=y]");
Block(-1,7,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(0,7,0,"wildnature:citrus_log[axis=y]");
Block(1,7,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-4,8,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-3,8,0,"wildnature:citrus_log[axis=y]");
Block(-2,8,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(0,8,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,8,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-3,9,0,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,1,1,"wildnature:citrus_log[axis=y]");
Block(0,1,1,"wildnature:citrus_log[axis=y]");
Block(-1,2,1,"wildnature:citrus_log[axis=y]");
Block(-3,7,1,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(-2,7,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,7,1,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(0,7,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,7,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-3,8,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-2,8,1,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(0,8,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,8,1,"wildnature:citrus_log[axis=y]");
Block(2,8,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(1,9,1,"wildnature:olive_leaves[distance=1,persistent=true]");
Block(-1,1,2,"wildnature:citrus_log[axis=z]");
Block(1,7,2,"wildnature:olive_leaves[distance=2,persistent=true]");
Block(1,8,2,"wildnature:olive_leaves[distance=1,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}