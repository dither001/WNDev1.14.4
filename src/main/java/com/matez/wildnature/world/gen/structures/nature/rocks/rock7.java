package com.matez.wildnature.world.gen.structures.nature.rocks;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class rock7 extends SchemFeature {
    public rock7(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public rock7(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,1,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=straight,waterlogged=false]");
Block(2,0,-2,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-1,1,-2,"minecraft:stone");
Block(0,1,-2,"minecraft:stone");
Block(1,1,-2,"minecraft:stone");
Block(-1,2,-2,"minecraft:andesite");
Block(0,2,-2,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(-2,1,-1,"minecraft:stone");
Block(-1,1,-1,"minecraft:coal_ore");
Block(0,1,-1,"wildnature:slate");
Block(1,1,-1,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(-1,2,-1,"minecraft:stone");
Block(-3,1,0,"minecraft:coal_ore");
Block(-2,1,0,"minecraft:cobblestone");
Block(-1,1,0,"minecraft:stone");
Block(0,1,0,"minecraft:stone");
Block(1,1,0,"minecraft:coal_ore");
Block(2,1,0,"minecraft:stone");
Block(-2,2,0,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(-1,2,0,"minecraft:stone");
Block(0,2,0,"minecraft:andesite");
Block(1,2,0,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(0,3,0,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(-3,0,1,"minecraft:cobblestone_slab[type=bottom,waterlogged=false]");
Block(-2,0,1,"minecraft:andesite_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-1,1,1,"wildnature:slate");
Block(0,1,1,"wildnature:limestone");
Block(1,1,1,"minecraft:cobblestone");
Block(2,1,1,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(-1,2,1,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(0,2,1,"minecraft:stone");
Block(2,0,2,"minecraft:cobblestone_slab[type=bottom,waterlogged=false]");
Block(0,1,2,"minecraft:coal_ore");
Block(1,1,2,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(0,2,2,"minecraft:cobblestone");
Block(-2,0,3,"minecraft:cobblestone_slab[type=bottom,waterlogged=false]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}