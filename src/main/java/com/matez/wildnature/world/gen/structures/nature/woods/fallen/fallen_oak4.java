package com.matez.wildnature.world.gen.structures.nature.woods.fallen;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class fallen_oak4 extends SchemFeature {
    public fallen_oak4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public fallen_oak4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-3,1,-2,"minecraft:oak_log[axis=x]");
Block(-2,1,-2,"minecraft:vine[east=false,north=false,south=false,up=false,west=true]");
Block(-1,1,-2,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-2,1,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,1,-1,"minecraft:vine[east=false,north=false,south=true,up=false,west=false]");
Block(1,1,-1,"minecraft:vine[east=false,north=false,south=true,up=false,west=false]");
Block(3,1,-1,"minecraft:vine[east=false,north=false,south=true,up=false,west=false]");
Block(-3,1,0,"minecraft:oak_log[axis=x]");
Block(-2,1,0,"minecraft:oak_log[axis=x]");
Block(-1,1,0,"minecraft:oak_log[axis=x]");
Block(0,1,0,"minecraft:oak_log[axis=x]");
Block(1,1,0,"minecraft:oak_log[axis=x]");
Block(3,1,0,"minecraft:oak_log[axis=y]");
Block(-3,1,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,1,1,"minecraft:vine[east=false,north=true,south=false,up=false,west=false]");
Block(0,1,1,"minecraft:vine[east=false,north=true,south=false,up=false,west=false]");
Block(-1,1,2,"minecraft:oak_log[axis=z]");
Block(0,1,2,"minecraft:vine[east=false,north=false,south=false,up=false,west=true]");
Block(-2,1,3,"minecraft:oak_log[axis=x]");
Block(-1,1,3,"minecraft:oak_log[axis=z]");
Block(0,1,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,2,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,1,4,"minecraft:vine[east=false,north=true,south=false,up=false,west=false]");
Block(-1,1,4,"minecraft:vine[east=false,north=true,south=false,up=false,west=false]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}