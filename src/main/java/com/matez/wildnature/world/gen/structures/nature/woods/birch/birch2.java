package com.matez.wildnature.world.gen.structures.nature.woods.birch;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class birch2 extends SchemFeature {
    public birch2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public birch2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,5,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,5,-2,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,5,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,6,-2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,1,-1,"minecraft:birch_log[axis=x]");
Block(-2,5,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,5,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,5,-1,"minecraft:birch_log[axis=z]");
Block(1,5,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-2,6,-1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,6,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,6,-1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,7,-1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,1,0,"minecraft:birch_log[axis=y]");
Block(0,1,0,"minecraft:birch_log[axis=y]");
Block(1,1,0,"minecraft:birch_log[axis=x]");
Block(0,2,0,"minecraft:birch_log[axis=y]");
Block(0,3,0,"minecraft:birch_log[axis=y]");
Block(0,4,0,"minecraft:birch_log[axis=y]");
Block(-3,5,0,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-2,5,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,5,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,5,0,"minecraft:birch_log[axis=y]");
Block(-2,6,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,6,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,6,0,"minecraft:birch_log[axis=y]");
Block(-1,7,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,0,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,7,0,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-2,5,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,5,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,5,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-2,6,1,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(-1,6,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,6,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-1,7,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(0,7,1,"minecraft:birch_log[axis=y]");
Block(1,7,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-1,8,1,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,8,1,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(-1,5,2,"minecraft:birch_leaves[distance=3,persistent=true]");
Block(0,6,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(-1,7,2,"minecraft:birch_leaves[distance=2,persistent=true]");
Block(0,7,2,"minecraft:birch_leaves[distance=1,persistent=true]");
Block(1,7,2,"minecraft:birch_leaves[distance=2,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}