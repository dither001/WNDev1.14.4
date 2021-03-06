package com.matez.wildnature.world.gen.structures.nature.woods.spooky;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class spooky4 extends SchemFeature {
    public spooky4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public spooky4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(1,3,-4,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,3,-3,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(1,3,-3,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,3,-3,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,1,-2,"wildnature:lightning_bug[facing=north]");
Block(1,1,-2,"minecraft:cobweb");
Block(1,2,-2,"minecraft:dark_oak_log[axis=z]");
Block(-1,3,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,3,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,3,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,3,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(3,3,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,4,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(3,4,-2,"minecraft:cobweb");
Block(-1,1,-1,"minecraft:dark_oak_log[axis=y]");
Block(0,1,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,1,-1,"minecraft:dark_oak_log[axis=y]");
Block(-1,2,-1,"minecraft:cobweb");
Block(0,2,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,2,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,2,-1,"minecraft:dark_oak_log[axis=x]");
Block(-1,3,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,3,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,3,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,3,-1,"minecraft:dark_oak_log[axis=x]");
Block(3,3,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(4,3,-1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,4,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,4,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,4,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,5,-1,"minecraft:cobweb");
Block(-1,1,0,"wildnature:lightning_bug[facing=south]");
Block(0,1,0,"minecraft:dark_oak_log[axis=y]");
Block(1,1,0,"minecraft:dark_oak_log[axis=y]");
Block(2,1,0,"wildnature:lightning_bug[facing=east]");
Block(0,2,0,"minecraft:dark_oak_log[axis=y]");
Block(1,2,0,"minecraft:dark_oak_log[axis=y]");
Block(-2,3,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,3,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,3,0,"minecraft:dark_oak_log[axis=y]");
Block(1,3,0,"minecraft:dark_oak_log[axis=y]");
Block(2,3,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(3,3,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(4,3,0,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,4,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,4,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,4,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(1,5,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,1,1,"minecraft:dark_oak_log[axis=z]");
Block(1,2,1,"minecraft:cobweb");
Block(-2,3,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,3,1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,3,1,"minecraft:dark_oak_log[axis=z]");
Block(1,3,1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,3,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(3,3,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(4,3,1,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(0,4,1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,4,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,4,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,3,2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,3,2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,3,2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,3,2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(3,3,2,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(1,3,3,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(2,3,3,"minecraft:dark_oak_leaves[distance=4,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}