package com.matez.wildnature.world.gen.structures.nature.rocks;

import com.matez.wildnature.Main;
import com.matez.wildnature.customizable.CommonConfig;
import com.matez.wildnature.other.Utilities;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class big_rock_2 extends SchemFeature {
    public big_rock_2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public big_rock_2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
        terrainIncrease=1;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(2,1,-5,"minecraft:stone");
Block(1,1,-4,"minecraft:stone");
Block(2,1,-4,"minecraft:stone");
Block(3,1,-4,"minecraft:stone");
Block(-1,1,-3,"minecraft:stone");
Block(0,1,-3,"minecraft:stone");
Block(1,1,-3,"minecraft:stone");
Block(2,1,-3,"minecraft:stone");
Block(3,1,-3,"minecraft:stone");
Block(4,1,-3,"minecraft:stone");
Block(5,1,-3,"minecraft:stone");
Block(2,2,-3,"minecraft:stone");
Block(-2,1,-2,"minecraft:stone");
Block(-1,1,-2,"minecraft:stone");
Block(0,1,-2,"minecraft:stone");
Block(1,1,-2,"minecraft:stone");
Block(2,1,-2,"minecraft:stone");
Block(3,1,-2,"minecraft:stone");
Block(4,1,-2,"minecraft:stone");
Block(0,2,-2,"minecraft:stone");
Block(1,2,-2,"minecraft:stone");
Block(2,2,-2,"minecraft:stone");
Block(1,3,-2,"minecraft:stone");
Block(2,3,-2,"minecraft:stone");
Block(-2,1,-1,"minecraft:stone");
Block(-1,1,-1,"minecraft:stone");
Block(0,1,-1,"minecraft:stone");
Block(1,1,-1,"minecraft:stone");
Block(2,1,-1,"minecraft:stone");
Block(3,1,-1,"minecraft:stone");
Block(4,1,-1,"minecraft:stone");
Block(-1,2,-1,"minecraft:stone");
Block(0,2,-1,"minecraft:stone");
Block(1,2,-1,"minecraft:stone");
Block(2,2,-1,"minecraft:stone");
Block(3,2,-1,"minecraft:stone");
Block(-2,1,0,"minecraft:stone");
Block(-1,1,0,"minecraft:stone");
Block(0,1,0,"minecraft:stone");
Block(1,1,0,"minecraft:stone");
Block(2,1,0,"minecraft:stone");
Block(3,1,0,"minecraft:stone");
Block(-1,2,0,"minecraft:stone");
Block(0,2,0,"minecraft:stone");
Block(1,2,0,"minecraft:stone");
Block(2,2,0,"minecraft:stone");
Block(-4,1,1,"minecraft:stone");
Block(-3,1,1,"minecraft:stone");
Block(-2,1,1,"minecraft:stone");
Block(-1,1,1,"minecraft:stone");
Block(0,1,1,"minecraft:stone");
Block(1,1,1,"minecraft:stone");
Block(2,1,1,"minecraft:stone");
Block(0,2,1,"minecraft:stone");
Block(1,2,1,"minecraft:stone");
Block(-4,1,2,"minecraft:stone");
Block(-3,1,2,"minecraft:stone");
Block(-2,1,2,"minecraft:stone");
Block(-1,1,2,"minecraft:stone");
Block(0,1,2,"minecraft:stone");
Block(1,1,2,"minecraft:stone");
Block(2,1,2,"minecraft:stone");
Block(-3,1,3,"minecraft:stone");
Block(-2,1,3,"minecraft:stone");
Block(-1,1,3,"minecraft:stone");
Block(0,1,3,"minecraft:stone");
Block(1,1,3,"minecraft:stone");
Block(2,1,3,"minecraft:stone");
Block(3,1,3,"minecraft:stone");
Block(-2,1,4,"minecraft:stone");
Block(-1,1,4,"minecraft:stone");
Block(0,1,4,"minecraft:stone");
Block(0,1,5,"minecraft:stone");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}