package com.matez.wildnature.world.gen.structures.nature.woods.birch;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;public class spiky_birch_1 extends SchemFeature {
    public spiky_birch_1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public spiky_birch_1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,4,-3,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,5,-3,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,3,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,4,-2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,4,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(1,4,-2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,5,-2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,5,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(1,5,-2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,6,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,8,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,9,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,3,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,3,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,3,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-2,4,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,4,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,4,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,4,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(2,4,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,5,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,5,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,5,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,5,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(2,5,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,6,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,6,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,6,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,6,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,7,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,7,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,8,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,8,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,8,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,9,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,9,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,9,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,10,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,11,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,1,0,"minecraft:birch_log[axis=y]");
Block(0,2,0,"minecraft:birch_log[axis=y]");
Block(-2,3,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,3,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,3,0,"minecraft:birch_log[axis=y]");
Block(1,3,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,3,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-3,4,0,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,4,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,4,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,4,0,"minecraft:birch_log[axis=y]");
Block(1,4,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,4,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(3,4,0,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-3,5,0,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,5,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,5,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,5,0,"minecraft:birch_log[axis=y]");
Block(1,5,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,5,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(3,5,0,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,6,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,6,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,6,0,"minecraft:birch_log[axis=y]");
Block(1,6,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,6,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-2,7,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,7,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,7,0,"minecraft:birch_log[axis=y]");
Block(1,7,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,7,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-2,8,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,8,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,8,0,"minecraft:birch_log[axis=y]");
Block(1,8,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,8,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,9,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,9,0,"minecraft:birch_log[axis=y]");
Block(1,9,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-1,10,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,10,0,"minecraft:birch_log[axis=y]");
Block(1,10,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-1,11,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,11,0,"minecraft:birch_log[axis=y]");
Block(1,11,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,12,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,13,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,3,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,3,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,3,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-2,4,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,4,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,4,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(2,4,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,5,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,5,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,5,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,5,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(2,5,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,6,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,6,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,6,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,7,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,7,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,8,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,8,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,8,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,9,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,9,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,9,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,10,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,11,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,3,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,4,2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,4,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(1,4,2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,5,2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,5,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(1,5,2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,6,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,8,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,4,3,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,5,3,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,6,3,"minecraft:birch_leaves[distance=3,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}