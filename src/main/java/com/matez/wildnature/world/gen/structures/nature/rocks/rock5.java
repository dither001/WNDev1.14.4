package com.matez.wildnature.world.gen.structures.nature.rocks;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class rock5 extends SchemFeature {
    public rock5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public rock5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,1,-1,"minecraft:stone");
Block(0,1,-1,"minecraft:cobblestone");
Block(0,2,-1,"minecraft:andesite_slab[type=bottom,waterlogged=false]");
Block(-1,1,0,"minecraft:andesite_slab[type=bottom,waterlogged=false]");
Block(0,1,0,"minecraft:stone");
Block(1,1,0,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(0,2,0,"minecraft:stone");
Block(0,3,0,"minecraft:cobblestone");
Block(0,4,0,"minecraft:andesite_slab[type=bottom,waterlogged=false]");
Block(0,0,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}