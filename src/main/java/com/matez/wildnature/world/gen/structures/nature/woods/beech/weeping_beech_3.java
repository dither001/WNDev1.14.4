package com.matez.wildnature.world.gen.structures.nature.woods.beech;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;
public class weeping_beech_3 extends SchemFeature {
    public weeping_beech_3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public weeping_beech_3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,7,-3,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,8,-3,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,-3,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,9,-3,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,8,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,8,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,9,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,9,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,9,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,9,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,10,-2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,7,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,7,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,8,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,8,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,9,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,9,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,-1,"wildnature:beech_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,9,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,9,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,10,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,10,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,10,-1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,1,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,2,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,3,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,4,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,5,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,6,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,7,0,"wildnature:beech_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(0,8,0,"wildnature:beech_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(-3,9,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,9,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,9,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,0,"wildnature:beech_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,9,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,9,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,10,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,10,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,10,0,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,6,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-3,7,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,7,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-3,8,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,8,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,8,1,"wildnature:beech_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,8,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-3,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(2,9,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,10,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,10,1,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,7,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,8,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,8,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-2,9,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(-1,9,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(0,9,2,"wildnature:beech_leaves[distance=7,persistent=true]");
Block(1,9,2,"wildnature:beech_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}