package com.matez.wildnature.world.gen.structures.dungeons.easter;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;


public class estatue4 extends SchemFeature {
    public estatue4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public estatue4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {
        terrainIncrease=2;
Block(-2,1,-4,"minecraft:dirt");
Block(-1,1,-4,"minecraft:dirt");
Block(0,1,-4,"minecraft:dirt");
Block(1,1,-4,"minecraft:dirt");
Block(2,1,-4,"minecraft:dirt");
Block(-2,2,-4,"minecraft:grass_block[snowy=false]");
Block(-1,2,-4,"minecraft:grass_block[snowy=false]");
Block(0,2,-4,"minecraft:grass_block[snowy=false]");
Block(1,2,-4,"minecraft:grass_block[snowy=false]");
Block(2,2,-4,"minecraft:grass_block[snowy=false]");
Block(-1,0,-3,"wildnature:rhyolite_cobble");
Block(0,0,-3,"wildnature:rhyolite_cobble");
Block(1,0,-3,"wildnature:rhyolite_cobble");
Block(-3,1,-3,"minecraft:dirt");
Block(-2,1,-3,"minecraft:grass_block[snowy=false]");
Block(-1,1,-3,"minecraft:stone");
Block(0,1,-3,"minecraft:stone");
Block(1,1,-3,"minecraft:stone");
Block(2,1,-3,"minecraft:dirt");
Block(3,1,-3,"minecraft:dirt");
Block(-3,2,-3,"minecraft:grass_block[snowy=false]");
Block(-2,2,-3,"minecraft:stone_stairs[facing=south,half=top,shape=straight,waterlogged=false]");
Block(-1,2,-3,"minecraft:stone");
Block(0,2,-3,"minecraft:stone");
Block(1,2,-3,"minecraft:stone");
Block(2,2,-3,"minecraft:stone_stairs[facing=south,half=top,shape=straight,waterlogged=false]");
Block(3,2,-3,"minecraft:grass_block[snowy=false]");
Block(-2,3,-3,"minecraft:stone");
Block(-1,3,-3,"minecraft:stone");
Block(0,3,-3,"minecraft:stone");
Block(1,3,-3,"minecraft:stone");
Block(2,3,-3,"minecraft:stone");
Block(-2,4,-3,"minecraft:stone");
Block(-1,4,-3,"minecraft:stone");
Block(0,4,-3,"minecraft:stone");
Block(1,4,-3,"minecraft:stone");
Block(2,4,-3,"minecraft:stone");
Block(-2,5,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=outer_left,waterlogged=false]");
Block(-1,5,-3,"minecraft:stone");
Block(0,5,-3,"minecraft:stone");
Block(1,5,-3,"minecraft:stone");
Block(2,5,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=outer_right,waterlogged=false]");
Block(-2,6,-3,"minecraft:stone_stairs[facing=south,half=top,shape=outer_left,waterlogged=false]");
Block(-1,6,-3,"minecraft:stone");
Block(0,6,-3,"minecraft:stone");
Block(1,6,-3,"minecraft:stone");
Block(2,6,-3,"minecraft:stone_stairs[facing=south,half=top,shape=outer_right,waterlogged=false]");
Block(-2,7,-3,"minecraft:stone");
Block(-1,7,-3,"minecraft:stone");
Block(0,7,-3,"minecraft:stone");
Block(1,7,-3,"minecraft:stone");
Block(2,7,-3,"minecraft:stone");
Block(-2,8,-3,"minecraft:stone");
Block(-1,8,-3,"minecraft:stone");
Block(0,8,-3,"minecraft:stone");
Block(1,8,-3,"minecraft:stone");
Block(2,8,-3,"minecraft:stone");
Block(-2,9,-3,"minecraft:stone");
Block(-1,9,-3,"minecraft:stone");
Block(0,9,-3,"minecraft:stone");
Block(1,9,-3,"minecraft:stone");
Block(2,9,-3,"minecraft:stone");
Block(-2,10,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=outer_left,waterlogged=false]");
Block(-1,10,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=straight,waterlogged=false]");
Block(0,10,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=straight,waterlogged=false]");
Block(1,10,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=straight,waterlogged=false]");
Block(2,10,-3,"minecraft:stone_stairs[facing=south,half=bottom,shape=outer_right,waterlogged=false]");
Block(-3,0,-2,"wildnature:rhyolite_cobble");
Block(-2,0,-2,"wildnature:rhyolite_cobble");
Block(-1,0,-2,"wildnature:rhyolite_cobble");
Block(0,0,-2,"wildnature:rhyolite_cobble");
Block(1,0,-2,"wildnature:rhyolite_cobble");
Block(2,0,-2,"wildnature:rhyolite_cobble");
Block(3,0,-2,"wildnature:rhyolite_cobble");
Block(-3,1,-2,"wildnature:rhyolite_cobble");
Block(-2,1,-2,"wildnature:rhyolite_cobble");
Block(-1,1,-2,"minecraft:stone");
Block(0,1,-2,"minecraft:stone");
Block(1,1,-2,"minecraft:stone");
Block(2,1,-2,"wildnature:rhyolite_cobble");
Block(3,1,-2,"wildnature:rhyolite_cobble");
Block(-3,2,-2,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-2,2,-2,"minecraft:stone");
Block(-1,2,-2,"minecraft:stone");
Block(0,2,-2,"minecraft:stone");
Block(1,2,-2,"minecraft:stone");
Block(2,2,-2,"minecraft:stone");
Block(3,2,-2,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-2,3,-2,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(-1,3,-2,"minecraft:redstone_wire[east=side,north=none,power=0,south=none,west=none]");
Block(0,3,-2,"wildnature:rs_proximity_sensor[facing=east,power=0,powered=false]");
Block(1,3,-2,"minecraft:redstone_wire[east=none,north=none,power=0,south=up,west=side]");
Block(2,3,-2,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,4,-2,"minecraft:stone");
Block(2,4,-2,"minecraft:stone");
Block(-2,5,-2,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(0,5,-2,"minecraft:stone");
Block(2,5,-2,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-2,6,-2,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(0,6,-2,"minecraft:stone");
Block(2,6,-2,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-3,7,-2,"minecraft:andesite_wall[east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-2,7,-2,"minecraft:stone");
Block(0,7,-2,"minecraft:stone");
Block(2,7,-2,"minecraft:stone");
Block(3,7,-2,"minecraft:andesite_wall[east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-3,8,-2,"minecraft:andesite_wall[east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-2,8,-2,"minecraft:stone");
Block(0,8,-2,"minecraft:stone");
Block(2,8,-2,"minecraft:stone");
Block(3,8,-2,"minecraft:andesite_wall[east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-3,9,-2,"minecraft:andesite_wall[east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-2,9,-2,"minecraft:stone");
Block(0,9,-2,"minecraft:stone");
Block(2,9,-2,"minecraft:stone");
Block(3,9,-2,"minecraft:andesite_wall[east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-2,10,-2,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-1,10,-2,"minecraft:stone");
Block(0,10,-2,"minecraft:stone");
Block(1,10,-2,"minecraft:stone");
Block(2,10,-2,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-3,0,-1,"wildnature:rhyolite_cobble");
Block(-2,0,-1,"wildnature:rhyolite_cobble");
Block(-1,0,-1,"minecraft:stone");
Block(0,0,-1,"minecraft:stone");
Block(1,0,-1,"minecraft:stone");
Block(2,0,-1,"wildnature:rhyolite_cobble");
Block(3,0,-1,"wildnature:rhyolite_cobble");
Block(-3,1,-1,"wildnature:rhyolite_cobble");
Block(-2,1,-1,"wildnature:rhyolite_cobble");
Block(-1,1,-1,"minecraft:stone");
Block(0,1,-1,"minecraft:stone");
Block(1,1,-1,"minecraft:stone");
Block(2,1,-1,"wildnature:rhyolite_cobble");
Block(3,1,-1,"wildnature:rhyolite_cobble");
Block(-3,2,-1,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-2,2,-1,"minecraft:stone");
Block(-1,2,-1,"minecraft:redstone_wall_torch[facing=south,lit=true]");
Block(0,2,-1,"minecraft:redstone_wire[east=side,north=none,power=15,south=side,west=side]");
Block(1,2,-1,"minecraft:redstone_wire[east=none,north=none,power=14,south=side,west=side]");
Block(2,2,-1,"minecraft:stone");
Block(3,2,-1,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-2,3,-1,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(0,3,-1,"minecraft:stone");
Block(1,3,-1,"minecraft:stone");
Block(2,3,-1,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,4,-1,"minecraft:stone");
Block(0,4,-1,"minecraft:redstone_wire[east=side,north=none,power=0,south=none,west=none]");
Block(1,4,-1,"minecraft:redstone_wire[east=none,north=side,power=0,south=none,west=side]");
Block(2,4,-1,"minecraft:stone");
Block(-2,5,-1,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-1,5,-1,"minecraft:stone");
Block(0,5,-1,"minecraft:daylight_detector[inverted=true,power=0]");
Block(1,5,-1,"minecraft:stone");
Block(2,5,-1,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-2,6,-1,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(-1,6,-1,"minecraft:stone");
Block(1,6,-1,"minecraft:stone");
Block(2,6,-1,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,7,-1,"minecraft:stone");
Block(-1,7,-1,"minecraft:stone");
Block(1,7,-1,"minecraft:stone");
Block(2,7,-1,"minecraft:stone");
Block(-2,8,-1,"minecraft:stone");
Block(-1,8,-1,"minecraft:stone");
Block(1,8,-1,"minecraft:stone");
Block(2,8,-1,"minecraft:stone");
Block(-2,9,-1,"minecraft:stone");
Block(-1,9,-1,"minecraft:stone");
Block(1,9,-1,"minecraft:stone");
Block(2,9,-1,"minecraft:stone");
Block(-2,10,-1,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-1,10,-1,"minecraft:stone");
Block(0,10,-1,"wildnature:gneiss_cobble_trapdoor[facing=south,half=top,open=false,powered=false,waterlogged=false]");
Block(1,10,-1,"minecraft:stone");
Block(2,10,-1,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-1,0,0,"minecraft:stone");
Block(1,0,0,"minecraft:stone");
Block(-3,1,0,"minecraft:dirt");
Block(-2,1,0,"minecraft:dirt");
Block(-1,1,0,"minecraft:stone");
Block(0,1,0,"minecraft:stone");
Block(1,1,0,"minecraft:stone");
Block(2,1,0,"minecraft:dirt");
Block(3,1,0,"minecraft:dirt");
Block(-3,2,0,"minecraft:grass_block[snowy=false]");
Block(-2,2,0,"minecraft:stone");
Block(-1,2,0,"minecraft:repeater[delay=1,facing=north,locked=false,powered=true]");
Block(0,2,0,"minecraft:redstone_wire[east=none,north=side,power=14,south=none,west=none]");
Block(1,2,0,"minecraft:repeater[delay=1,facing=north,locked=false,powered=true]");
Block(2,2,0,"minecraft:stone");
Block(3,2,0,"minecraft:grass_block[snowy=false]");
Block(-2,3,0,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(-1,3,0,"minecraft:netherrack");
Block(0,3,0,"minecraft:netherrack");
Block(1,3,0,"minecraft:netherrack");
Block(2,3,0,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,4,0,"minecraft:stone");
Block(-1,4,0,"minecraft:fire[age=15,east=false,north=false,south=false,up=false,west=false]");
Block(0,4,0,"minecraft:fire[age=15,east=false,north=false,south=false,up=false,west=false]");
Block(1,4,0,"minecraft:fire[age=15,east=false,north=false,south=false,up=false,west=false]");
Block(2,4,0,"minecraft:stone");
Block(-2,5,0,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(0,5,0,"minecraft:stone");
Block(2,5,0,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-2,6,0,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(-1,6,0,"minecraft:stone");
Block(0,6,0,"minecraft:stone");
Block(1,6,0,"minecraft:stone");
Block(2,6,0,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,7,0,"minecraft:stone");
Block(-1,7,0,"minecraft:stone");
Block(0,7,0,"minecraft:stone");
Block(1,7,0,"minecraft:stone");
Block(2,7,0,"minecraft:stone");
Block(-2,8,0,"minecraft:stone");
Block(-1,8,0,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(0,8,0,"minecraft:stone");
Block(1,8,0,"minecraft:stone_slab[type=bottom,waterlogged=false]");
Block(2,8,0,"minecraft:stone");
Block(-2,9,0,"minecraft:stone");
Block(-1,9,0,"minecraft:stone");
Block(0,9,0,"minecraft:stone");
Block(1,9,0,"minecraft:stone");
Block(2,9,0,"minecraft:stone");
Block(-2,10,0,"minecraft:stone_stairs[facing=east,half=bottom,shape=straight,waterlogged=false]");
Block(-1,10,0,"minecraft:stone");
Block(0,10,0,"minecraft:stone");
Block(1,10,0,"minecraft:stone");
Block(2,10,0,"minecraft:stone_stairs[facing=west,half=bottom,shape=straight,waterlogged=false]");
Block(-1,0,1,"minecraft:stone");
Block(0,0,1,"minecraft:stone");
Block(1,0,1,"minecraft:stone");
Block(-3,1,1,"minecraft:dirt");
Block(-2,1,1,"minecraft:dirt");
Block(-1,1,1,"minecraft:stone");
Block(0,1,1,"minecraft:stone");
Block(1,1,1,"minecraft:stone");
Block(2,1,1,"minecraft:dirt");
Block(3,1,1,"minecraft:dirt");
Block(-3,2,1,"minecraft:grass_block[snowy=false]");
Block(-2,2,1,"minecraft:stone");
Block(-1,2,1,"minecraft:sticky_piston[extended=true,facing=up]");
Block(0,2,1,"minecraft:sticky_piston[extended=true,facing=up]");
Block(1,2,1,"minecraft:sticky_piston[extended=true,facing=up]");
Block(2,2,1,"minecraft:stone");
Block(3,2,1,"minecraft:grass_block[snowy=false]");
Block(-2,3,1,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(-1,3,1,"minecraft:piston_head[facing=up,short=false,type=sticky]");
Block(0,3,1,"minecraft:piston_head[facing=up,short=false,type=sticky]");
Block(1,3,1,"minecraft:piston_head[facing=up,short=false,type=sticky]");
Block(2,3,1,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(-2,4,1,"minecraft:stone");
Block(-1,4,1,"minecraft:stone");
Block(0,4,1,"minecraft:stone");
Block(1,4,1,"minecraft:stone");
Block(2,4,1,"minecraft:stone");
Block(-2,5,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=outer_right,waterlogged=false]");
Block(-1,5,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(0,5,1,"minecraft:stone");
Block(1,5,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(2,5,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=outer_left,waterlogged=false]");
Block(0,6,1,"minecraft:stone");
Block(0,7,1,"minecraft:andesite_wall[east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(0,8,1,"minecraft:andesite_wall[east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-1,9,1,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(0,9,1,"minecraft:andesite_wall[east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(1,9,1,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(-2,10,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=outer_right,waterlogged=false]");
Block(-1,10,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(0,10,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(1,10,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(2,10,1,"minecraft:stone_stairs[facing=north,half=bottom,shape=outer_left,waterlogged=false]");
Block(-3,1,2,"minecraft:dirt");
Block(-2,1,2,"minecraft:grass_block[snowy=false]");
Block(-1,1,2,"minecraft:dirt");
Block(0,1,2,"minecraft:grass_block[snowy=false]");
Block(1,1,2,"minecraft:grass_block[snowy=false]");
Block(2,1,2,"minecraft:dirt");
Block(3,1,2,"minecraft:dirt");
Block(-3,2,2,"minecraft:grass_block[snowy=false]");
Block(-2,2,2,"minecraft:stone_stairs[facing=east,half=top,shape=outer_left,waterlogged=false]");
Block(-1,2,2,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(0,2,2,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(1,2,2,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(2,2,2,"minecraft:stone_stairs[facing=north,half=top,shape=straight,waterlogged=false]");
Block(3,2,2,"minecraft:grass_block[snowy=false]");
Block(-1,3,2,"minecraft:stone");
Block(0,3,2,"minecraft:stone");
Block(1,3,2,"minecraft:stone");
Block(-1,4,2,"minecraft:stone_stairs[facing=west,half=top,shape=straight,waterlogged=false]");
Block(0,4,2,"minecraft:stone_slab[type=top,waterlogged=false]");
Block(1,4,2,"minecraft:stone_stairs[facing=east,half=top,shape=straight,waterlogged=false]");
Block(0,5,2,"minecraft:stone");
Block(0,6,2,"minecraft:stone_stairs[facing=north,half=bottom,shape=straight,waterlogged=false]");
Block(-2,1,3,"minecraft:dirt");
Block(-1,1,3,"minecraft:dirt");
Block(0,1,3,"minecraft:dirt");
Block(1,1,3,"minecraft:dirt");
Block(2,1,3,"minecraft:dirt");
Block(-2,2,3,"minecraft:grass_block[snowy=false]");
Block(-1,2,3,"minecraft:grass_block[snowy=false]");
Block(0,2,3,"minecraft:grass_block[snowy=false]");
Block(1,2,3,"minecraft:grass_block[snowy=false]");
Block(2,2,3,"minecraft:grass_block[snowy=false]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}