package com.matez.wildnature.world.gen.structures.nature.woods.birch;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class thin_birch2 extends SchemFeature {
    public thin_birch2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public thin_birch2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
        terrainIncrease=1;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,6,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,6,-1,"wildnature:birch_branch[down=false,east=false,north=false,south=true,up=false,waterlogged=false,west=true]");
Block(-1,8,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,8,-1,"wildnature:birch_branch[down=false,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(0,9,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,11,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(1,12,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,13,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,16,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,18,-1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,1,0,"wildnature:birch_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,2,0,"wildnature:birch_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,3,0,"wildnature:birch_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,4,0,"wildnature:birch_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-1,5,0,"wildnature:birch_branch[down=false,east=true,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(0,5,0,"wildnature:birch_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-1,6,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,6,0,"wildnature:birch_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,6,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,7,0,"wildnature:birch_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(0,8,0,"wildnature:birch_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(1,8,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,9,0,"wildnature:birch_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,9,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,10,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,10,0,"wildnature:birch_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(1,10,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,11,0,"wildnature:birch_branch[down=true,east=true,north=false,south=true,up=false,waterlogged=false,west=false]");
Block(0,11,0,"wildnature:birch_branch[down=true,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,12,0,"wildnature:birch_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(1,12,0,"wildnature:birch_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,12,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,13,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,13,0,"wildnature:birch_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,13,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,14,0,"wildnature:birch_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(1,14,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-2,15,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,15,0,"wildnature:birch_branch[down=false,east=true,north=false,south=true,up=false,waterlogged=false,west=true]");
Block(0,15,0,"wildnature:birch_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(0,16,0,"wildnature:birch_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(1,16,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,17,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,17,0,"wildnature:birch_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(1,17,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,18,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,18,0,"wildnature:birch_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,18,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,19,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,20,0,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,5,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,5,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,6,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,7,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(1,8,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,9,1,"wildnature:birch_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,9,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,10,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(1,10,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,11,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,11,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(1,12,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,13,1,"wildnature:birch_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(0,14,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(1,14,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,15,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,15,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,17,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,18,1,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,9,2,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(-1,13,2,"minecraft:birch_leaves[distance=7,persistent=true]");
Block(0,13,2,"minecraft:birch_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}