package com.matez.wildnature.world.gen.structures.nature.woods.cherry;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class cherry2 extends SchemFeature {
    public cherry2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public cherry2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
        terrainIncrease=1;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,2,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=1]");
Block(0,2,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,2,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,3,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,3,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,3,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,3,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,4,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,4,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,5,-2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,2,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,2,-1,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,3,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,3,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,3,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,3,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-4,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,4,-1,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,4,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=2]");
Block(-3,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(3,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(4,5,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,-1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,1,0,"wildnature:cherry_log[axis=y]");
Block(0,2,0,"wildnature:cherry_log[axis=y]");
Block(-2,3,0,"wildnature:cherry_branch[down=false,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-1,3,0,"wildnature:cherry_branch[down=false,east=true,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(0,3,0,"wildnature:cherry_log[axis=y]");
Block(-4,4,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,4,0,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,4,0,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-1,4,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,0,"wildnature:cherry_log[axis=y]");
Block(1,4,0,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,4,0,"wildnature:cherry_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-3,5,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,5,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,5,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,0,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,5,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,5,0,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,5,0,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,5,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=1]");
Block(-1,6,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,0,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,6,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,6,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(3,6,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,0,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,3,1,"wildnature:cherry_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(-4,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,4,1,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,4,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(2,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(3,5,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=1]");
Block(-1,6,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,1,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,6,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,8,1,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,3,2,"wildnature:cherry_branch[down=false,east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-4,4,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-3,4,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-2,4,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,2,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,4,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,5,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,6,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,6,2,"wildnature:cherry_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(1,6,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,7,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,2,"wildnature:cherry_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,7,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,8,2,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,3,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,4,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,7,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,3,"wildnature:cherry_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,7,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,8,3,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,4,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,4,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(1,4,4,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");
Block(0,7,4,"wildnature:cherry_leaves[distance=7,persistent=true,stage=0]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}