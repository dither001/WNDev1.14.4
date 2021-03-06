package com.matez.wildnature.world.gen.structures.nature.woods.spooky;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class spooky9 extends SchemFeature {
    public spooky9(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public spooky9(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-2,5,-3,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(-1,5,-3,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,5,-3,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(1,5,-3,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,5,-3,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(3,5,-3,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(0,1,-2,"minecraft:dark_oak_log[axis=y]");
Block(1,1,-2,"minecraft:dark_oak_log[axis=y]");
Block(1,2,-2,"minecraft:dark_oak_log[axis=y]");
Block(0,3,-2,"minecraft:cobweb");
Block(-2,4,-2,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(0,4,-2,"minecraft:dark_oak_log[axis=z]");
Block(1,4,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,4,-2,"minecraft:cobweb");
Block(-3,5,-2,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(-2,5,-2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,5,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,5,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,5,-2,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,5,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(3,5,-2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,6,-2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,6,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(1,6,-2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,1,-1,"minecraft:dark_oak_log[axis=x]");
Block(0,1,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,1,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,1,-1,"minecraft:dark_oak_log[axis=x]");
Block(3,1,-1,"minecraft:dark_oak_log[axis=x]");
Block(-1,2,-1,"wildnature:lightning_bug[facing=west]");
Block(0,2,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,2,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,2,-1,"minecraft:dark_oak_log[axis=y]");
Block(-1,3,-1,"minecraft:dark_oak_log[axis=x]");
Block(0,3,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,3,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,3,-1,"wildnature:lightning_bug[facing=up]");
Block(-1,4,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,4,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,4,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,4,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(-3,5,-1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-2,5,-1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,5,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,5,-1,"minecraft:dark_oak_log[axis=y]");
Block(1,5,-1,"minecraft:dark_oak_log[axis=y]");
Block(2,5,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(3,5,-1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-2,6,-1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,6,-1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,6,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,6,-1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(-1,7,-1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,1,0,"minecraft:dark_oak_log[axis=y]");
Block(1,1,0,"minecraft:dark_oak_log[axis=y]");
Block(2,1,0,"minecraft:dark_oak_log[axis=z]");
Block(0,2,0,"minecraft:dark_oak_log[axis=y]");
Block(1,2,0,"minecraft:dark_oak_log[axis=y]");
Block(0,3,0,"minecraft:dark_oak_log[axis=y]");
Block(1,3,0,"minecraft:dark_oak_log[axis=y]");
Block(-1,4,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,4,0,"minecraft:dark_oak_log[axis=y]");
Block(1,4,0,"minecraft:dark_oak_log[axis=y]");
Block(-3,5,0,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-2,5,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,5,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(0,5,0,"minecraft:dark_oak_log[axis=y]");
Block(1,5,0,"minecraft:dark_oak_log[axis=y]");
Block(2,5,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(3,5,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-1,6,0,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,6,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,6,0,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,6,0,"minecraft:cobweb");
Block(-1,7,0,"minecraft:cobweb");
Block(0,1,1,"minecraft:dark_oak_log[axis=z]");
Block(0,3,1,"wildnature:lightning_bug[facing=south]");
Block(2,3,1,"minecraft:cobweb");
Block(-2,4,1,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(-1,4,1,"minecraft:cobweb");
Block(0,4,1,"minecraft:dark_oak_log[axis=z]");
Block(2,4,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-3,5,1,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(-2,5,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,5,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(0,5,1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(1,5,1,"minecraft:dark_oak_leaves[distance=1,persistent=true]");
Block(2,5,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(3,5,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(-1,6,1,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,6,1,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(-2,5,2,"minecraft:dark_oak_leaves[distance=4,persistent=true]");
Block(-1,5,2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(0,5,2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(1,5,2,"minecraft:dark_oak_leaves[distance=2,persistent=true]");
Block(2,5,2,"minecraft:dark_oak_leaves[distance=3,persistent=true]");
Block(3,5,2,"minecraft:dark_oak_leaves[distance=4,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}