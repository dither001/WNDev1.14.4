package com.matez.wildnature.world.gen.structures.nature.woods.willow;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;
public class pointy_willow_4 extends SchemFeature {
    public pointy_willow_4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public pointy_willow_4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,6,-3,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(-1,5,-2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,5,-2,"wildnature:willow_branch[down=false,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(0,6,-2,"wildnature:willow_branch[down=true,east=true,north=false,south=true,up=false,waterlogged=false,west=false]");
Block(1,6,-2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(1,7,-2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(-1,10,-2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,10,-2,"wildnature:willow_branch[down=false,east=true,north=false,south=true,up=false,waterlogged=false,west=true]");
Block(1,10,-2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,1,-1,"wildnature:willow_log[axis=y]");
Block(-1,4,-1,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,5,-1,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,5,-1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(-1,6,-1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,6,-1,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(-1,7,-1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(2,7,-1,"wildnature:willow_leaves[distance=3,persistent=true]");
Block(0,8,-1,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(1,8,-1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,10,-1,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,10,-1,"wildnature:willow_branch[down=false,east=false,north=true,south=false,up=false,waterlogged=false,west=true]");
Block(0,11,-1,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,1,0,"wildnature:willow_log[axis=y]");
Block(1,1,0,"wildnature:willow_log[axis=y]");
Block(0,2,0,"wildnature:willow_log[axis=y]");
Block(1,2,0,"wildnature:willow_log[axis=y]");
Block(0,3,0,"wildnature:willow_log[axis=y]");
Block(1,3,0,"wildnature:willow_log[axis=y]");
Block(-2,4,0,"wildnature:willow_branch[down=false,east=true,north=false,south=true,up=false,waterlogged=false,west=false]");
Block(-1,4,0,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,4,0,"wildnature:willow_log[axis=y]");
Block(-1,5,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,5,0,"wildnature:willow_log[axis=y]");
Block(1,5,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(-2,6,0,"wildnature:willow_branch[down=false,east=true,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(-1,6,0,"wildnature:willow_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,6,0,"wildnature:willow_log[axis=y]");
Block(1,6,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(-2,7,0,"wildnature:willow_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(-1,7,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,7,0,"wildnature:willow_log[axis=y]");
Block(1,7,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(2,7,0,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(-2,8,0,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(-1,8,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,8,0,"wildnature:willow_log[axis=y]");
Block(1,8,0,"wildnature:willow_branch[down=true,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,9,0,"wildnature:willow_log[axis=y]");
Block(1,9,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(-1,10,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,10,0,"wildnature:willow_log[axis=y]");
Block(-1,11,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,11,0,"wildnature:willow_log[axis=y]");
Block(1,11,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(0,12,0,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(-1,1,1,"wildnature:willow_log[axis=y]");
Block(0,1,1,"wildnature:willow_log[axis=y]");
Block(0,2,1,"wildnature:willow_log[axis=y]");
Block(-2,4,1,"wildnature:willow_branch[down=false,east=true,north=true,south=false,up=false,waterlogged=false,west=false]");
Block(-1,4,1,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(-2,6,1,"wildnature:willow_leaves[distance=3,persistent=true]");
Block(-1,6,1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,6,1,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(1,6,1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(-2,7,1,"wildnature:willow_branch[down=true,east=false,north=true,south=false,up=false,waterlogged=false,west=false]");
Block(0,7,1,"wildnature:willow_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,7,1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,8,1,"wildnature:willow_leaves[distance=1,persistent=true]");
Block(1,8,1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,10,1,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=false,waterlogged=false,west=false]");
Block(1,10,1,"wildnature:willow_leaves[distance=3,persistent=true]");
Block(1,11,1,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(2,6,2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,7,2,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,7,2,"wildnature:willow_branch[down=false,east=false,north=true,south=false,up=false,waterlogged=false,west=true]");
Block(0,8,2,"wildnature:willow_leaves[distance=2,persistent=true]");
Block(0,10,2,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(1,10,2,"wildnature:willow_branch[down=false,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(2,10,2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,11,2,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,7,3,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(0,10,3,"wildnature:willow_leaves[distance=7,persistent=true]");
Block(1,10,3,"wildnature:willow_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}