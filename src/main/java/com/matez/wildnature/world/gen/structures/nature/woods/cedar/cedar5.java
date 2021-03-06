package com.matez.wildnature.world.gen.structures.nature.woods.cedar;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class cedar5 extends SchemFeature {
    public cedar5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public cedar5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,2,-3,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-1,2,-2,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,2,-2,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,-2,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,3,-2,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(0,4,-2,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(-2,2,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-1,2,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,2,-1,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(2,2,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,3,-1,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(-1,4,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,4,-1,"wildnature:cedar_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,4,-1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,5,-1,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(0,6,-1,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(0,7,-1,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(0,1,0,"wildnature:cedar_log[axis=y]");
Block(-3,2,0,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-2,2,0,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-1,2,0,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,0,"wildnature:cedar_log[axis=y]");
Block(1,2,0,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,2,0,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,2,0,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-2,3,0,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(-1,3,0,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(0,3,0,"wildnature:cedar_log[axis=y]");
Block(1,3,0,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(2,3,0,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(-2,4,0,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(-1,4,0,"wildnature:cedar_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,4,0,"wildnature:cedar_log[axis=y]");
Block(1,4,0,"wildnature:cedar_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,4,0,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(-1,5,0,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(0,5,0,"wildnature:cedar_log[axis=y]");
Block(1,5,0,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(-1,6,0,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(0,6,0,"wildnature:cedar_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,6,0,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(-1,7,0,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(0,7,0,"wildnature:cedar_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,7,0,"wildnature:cedar_leaves[distance=3,persistent=true]");
Block(0,8,0,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-2,2,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(-1,2,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,2,1,"wildnature:cedar_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(2,2,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,3,1,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(-1,4,1,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(0,4,1,"wildnature:cedar_leaves[distance=1,persistent=true]");
Block(1,4,1,"wildnature:cedar_leaves[distance=2,persistent=true]");
Block(0,6,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,7,1,"wildnature:cedar_leaves[distance=7,persistent=true]");
Block(0,2,2,"wildnature:cedar_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}