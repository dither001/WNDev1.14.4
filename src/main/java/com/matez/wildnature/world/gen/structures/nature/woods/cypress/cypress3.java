package com.matez.wildnature.world.gen.structures.nature.woods.cypress;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;public class cypress3 extends SchemFeature {
    public cypress3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public cypress3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,6,-2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,7,-2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,8,-2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,9,-2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,10,-2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,4,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(-1,5,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,5,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,5,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,6,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,6,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,6,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,7,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,7,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,7,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,8,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,8,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,8,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,9,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,9,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,9,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,10,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,10,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,10,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,11,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,11,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,12,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,12,-1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,13,-1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,1,0,"wildnature:redwood_log[axis=y]");
Block(0,2,0,"wildnature:redwood_log[axis=y]");
Block(-1,3,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,3,0,"wildnature:redwood_log[axis=y]");
Block(1,3,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(-1,4,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,4,0,"wildnature:redwood_log[axis=y]");
Block(1,4,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(-1,5,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,5,0,"wildnature:redwood_log[axis=y]");
Block(1,5,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,5,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,6,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,6,0,"wildnature:redwood_log[axis=y]");
Block(1,6,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,6,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-2,7,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,7,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,7,0,"wildnature:redwood_log[axis=y]");
Block(1,7,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,7,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-2,8,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,8,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,8,0,"wildnature:redwood_log[axis=y]");
Block(1,8,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,8,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-2,9,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,9,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,9,0,"wildnature:redwood_log[axis=y]");
Block(1,9,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,9,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-2,10,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,10,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,10,0,"wildnature:redwood_log[axis=y]");
Block(1,10,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,10,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,11,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,11,0,"wildnature:redwood_log[axis=y]");
Block(1,11,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(2,11,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,12,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,12,0,"wildnature:redwood_log[axis=y]");
Block(1,12,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(-1,13,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,13,0,"wildnature:redwood_log[axis=y]");
Block(1,13,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,14,0,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,15,0,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,3,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,4,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(-1,5,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,5,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,5,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,6,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,6,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,6,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,7,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,7,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,7,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,8,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,8,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,8,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,9,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,9,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,9,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,10,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,10,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,10,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(-1,11,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,11,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(1,11,1,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,12,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,13,1,"minecraft:spruce_leaves[distance=1,persistent=true]");
Block(0,5,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,6,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,7,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,8,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,9,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,10,2,"minecraft:spruce_leaves[distance=2,persistent=true]");
Block(0,11,2,"minecraft:spruce_leaves[distance=2,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}