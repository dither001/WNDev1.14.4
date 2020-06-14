package com.matez.wildnature.world.gen.structures.nature.woods.orchard;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class apple3 extends SchemFeature {
    public apple3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        terrainIncrease=1;
    }

    public apple3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(1,1,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,2,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,2,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(1,2,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(2,2,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,3,-3,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-2,2,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,2,-2,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,-2,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(2,2,-2,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,2,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,3,-2,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(0,3,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(2,3,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,4,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(1,4,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(1,5,-2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,1,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-2,2,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,2,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(0,2,-1,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,2,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(2,2,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(3,2,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-2,3,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-1,3,-1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(0,3,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(1,3,-1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(2,3,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(3,3,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,4,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(0,4,-1,"wildnature:rosaceae_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,4,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(2,4,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,5,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,5,-1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(1,5,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(2,5,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(3,5,-1,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,1,0,"wildnature:rosaceae_log[axis=y]");
Block(-2,2,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-1,2,0,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,0,"wildnature:rosaceae_log[axis=y]");
Block(1,2,0,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,2,0,"wildnature:rosaceae_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,3,0,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(-1,3,0,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(0,3,0,"wildnature:rosaceae_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,3,0,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(2,3,0,"wildnature:rosaceae_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,3,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-2,4,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-1,4,0,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(0,4,0,"wildnature:rosaceae_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,4,0,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(2,4,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-1,5,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(0,5,0,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(1,5,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(0,6,0,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(1,6,0,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(0,1,1,"wildnature:apple_leaves[distance=1,persistent=true,stage=0]");
Block(-2,2,1,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-1,2,1,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,1,"wildnature:apple_leaves[distance=1,persistent=true,stage=0]");
Block(1,2,1,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,2,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(3,2,1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-3,3,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(-2,3,1,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(-1,3,1,"wildnature:apple_leaves[distance=3,persistent=true,stage=0]");
Block(0,3,1,"wildnature:apple_leaves[distance=2,persistent=true,stage=0]");
Block(1,3,1,"wildnature:apple_leaves[distance=3,persistent=true,stage=0]");
Block(2,3,1,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(3,3,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(-1,4,1,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(0,4,1,"wildnature:apple_leaves[distance=3,persistent=true,stage=0]");
Block(1,4,1,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(2,4,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(3,4,1,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-1,5,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(0,5,1,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(1,5,1,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(-3,2,2,"wildnature:apple_leaves[distance=7,persistent=true,stage=0]");
Block(-1,2,2,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(1,2,2,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(2,2,2,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");
Block(-2,3,2,"wildnature:apple_leaves[distance=5,persistent=true,stage=0]");
Block(-1,3,2,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(1,3,2,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(0,4,2,"wildnature:apple_leaves[distance=4,persistent=true,stage=0]");
Block(2,4,2,"wildnature:apple_leaves[distance=6,persistent=true,stage=0]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}