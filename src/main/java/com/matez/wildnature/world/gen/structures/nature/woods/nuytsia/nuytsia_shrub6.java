package com.matez.wildnature.world.gen.structures.nature.woods.nuytsia;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;


public class nuytsia_shrub6 extends SchemFeature {
    public nuytsia_shrub6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public nuytsia_shrub6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,2,-3,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(-1,2,-2,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(-2,2,-1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(-1,2,-1,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,-1,"wildnature:nuytsia_leaves[distance=1,persistent=true]");
Block(-1,3,-1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(1,3,-1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(2,3,-1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(0,1,0,"wildnature:rosaceae_log[axis=y]");
Block(-2,2,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(-1,2,0,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,2,0,"wildnature:rosaceae_log[axis=y]");
Block(1,2,0,"wildnature:rosaceae_branch[down=false,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-1,3,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(1,3,0,"wildnature:rosaceae_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(2,3,0,"wildnature:rosaceae_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,3,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(4,3,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(1,4,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(2,4,0,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(-1,2,1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(1,3,1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");
Block(2,3,1,"wildnature:nuytsia_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}