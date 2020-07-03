package com.matez.wildnature.world.gen.structures.nature.woods.hazel;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class hazel1 extends SchemFeature {
    public hazel1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public hazel1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-3,9,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,-5,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,-4,"wildnature:oak_branch[down=false,east=false,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(-3,7,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,7,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,-4,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(0,8,-4,"wildnature:oak_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(1,8,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,-4,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,9,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,-4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,-3,"wildnature:oak_branch[down=false,east=false,north=true,south=true,up=false,waterlogged=false,west=false]");
Block(-3,7,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,7,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,7,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,8,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,8,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-4,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,11,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,11,-3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,-2,"minecraft:oak_log[axis=y]");
Block(0,6,-2,"minecraft:oak_log[axis=y]");
Block(1,6,-2,"wildnature:oak_branch[down=false,east=true,north=false,south=false,up=false,waterlogged=false,west=true]");
Block(2,6,-2,"wildnature:oak_branch[down=false,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-3,7,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,7,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,7,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,-2,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(2,7,-2,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-3,8,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,8,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,8,-2,"wildnature:oak_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(1,8,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,8,-2,"wildnature:oak_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(3,8,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-4,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,10,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,-2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,4,-1,"wildnature:oak_branch[down=false,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-1,4,-1,"wildnature:oak_branch[down=false,east=true,north=false,south=false,up=false,waterlogged=false,west=true]");
Block(0,4,-1,"minecraft:oak_log[axis=z]");
Block(-2,5,-1,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-2,6,-1,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-3,7,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,7,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,8,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,8,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-4,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-4,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,10,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,11,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,11,-1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,1,0,"minecraft:oak_log[axis=y]");
Block(0,2,0,"minecraft:oak_log[axis=y]");
Block(0,3,0,"minecraft:oak_log[axis=y]");
Block(0,4,0,"minecraft:oak_log[axis=y]");
Block(0,5,0,"minecraft:oak_log[axis=y]");
Block(1,5,0,"minecraft:oak_log[axis=x]");
Block(-1,6,0,"minecraft:oak_log[axis=y]");
Block(2,6,0,"minecraft:oak_log[axis=y]");
Block(-2,7,0,"wildnature:oak_branch[down=false,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-1,7,0,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=false,waterlogged=false,west=true]");
Block(2,7,0,"minecraft:oak_log[axis=y]");
Block(-3,8,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,8,0,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(2,8,0,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-4,9,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(3,9,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,10,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,11,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,11,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,11,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,11,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,12,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,12,0,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,7,1,"wildnature:oak_branch[down=false,east=false,north=true,south=true,up=false,waterlogged=false,west=false]");
Block(0,8,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,8,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,8,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-4,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,10,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,11,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,11,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,11,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,12,1,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,7,2,"wildnature:oak_branch[down=false,east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-3,8,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,8,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,8,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,8,2,"wildnature:oak_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-3,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,10,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-3,11,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,11,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,11,2,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-2,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(3,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(4,9,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,10,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,10,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,10,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,11,3,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(-1,9,4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(0,9,4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(1,9,4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");
Block(2,9,4,"wildnature:hazel_leaves[distance=7,persistent=true,stage=0]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}