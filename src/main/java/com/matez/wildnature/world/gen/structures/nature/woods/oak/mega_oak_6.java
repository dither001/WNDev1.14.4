package com.matez.wildnature.world.gen.structures.nature.woods.oak;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;public class mega_oak_6 extends SchemFeature {
    public mega_oak_6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public mega_oak_6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-2,21,-5,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-1,21,-5,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(0,21,-5,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-1,22,-5,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-2,20,-4,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-1,20,-4,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,20,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,20,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,21,-4,"minecraft:oak_leaves[distance=6,persistent=true]");
Block(-1,21,-4,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,21,-4,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,21,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,22,-4,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-1,22,-4,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(0,22,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,23,-4,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-1,19,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,19,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,20,-3,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-2,20,-3,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,20,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,20,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,20,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,21,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,21,-3,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,21,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,21,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,22,-3,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,22,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,22,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,22,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,1,-2,"minecraft:oak_log[axis=y]");
Block(1,2,-2,"minecraft:oak_log[axis=y]");
Block(1,3,-2,"minecraft:oak_log[axis=y]");
Block(1,4,-2,"minecraft:oak_log[axis=y]");
Block(1,5,-2,"minecraft:oak_log[axis=y]");
Block(1,6,-2,"minecraft:oak_log[axis=y]");
Block(1,7,-2,"minecraft:oak_wood[axis=y]");
Block(-1,18,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,18,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,18,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,19,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,19,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,19,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,19,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,19,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,19,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,20,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,20,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,20,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,20,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,20,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,20,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,21,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,21,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,21,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,21,-2,"minecraft:oak_log[axis=z]");
Block(1,21,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,21,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,21,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,22,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,22,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,22,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,22,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,22,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(3,22,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,23,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,23,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,23,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,23,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,24,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,24,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,1,-1,"minecraft:oak_log[axis=y]");
Block(1,1,-1,"minecraft:oak_log[axis=y]");
Block(2,1,-1,"minecraft:oak_log[axis=y]");
Block(0,2,-1,"minecraft:oak_log[axis=y]");
Block(1,2,-1,"minecraft:oak_log[axis=y]");
Block(2,2,-1,"minecraft:oak_log[axis=y]");
Block(0,3,-1,"minecraft:oak_log[axis=y]");
Block(1,3,-1,"minecraft:oak_log[axis=y]");
Block(2,3,-1,"minecraft:oak_log[axis=y]");
Block(0,4,-1,"minecraft:oak_log[axis=y]");
Block(1,4,-1,"minecraft:oak_log[axis=y]");
Block(2,4,-1,"minecraft:oak_log[axis=y]");
Block(0,5,-1,"minecraft:oak_log[axis=y]");
Block(1,5,-1,"minecraft:oak_log[axis=y]");
Block(2,5,-1,"minecraft:oak_log[axis=y]");
Block(0,6,-1,"minecraft:oak_log[axis=y]");
Block(1,6,-1,"minecraft:oak_log[axis=y]");
Block(2,6,-1,"minecraft:oak_log[axis=y]");
Block(0,7,-1,"minecraft:oak_log[axis=y]");
Block(1,7,-1,"minecraft:oak_log[axis=y]");
Block(2,7,-1,"minecraft:oak_log[axis=y]");
Block(0,8,-1,"minecraft:oak_log[axis=y]");
Block(1,8,-1,"minecraft:oak_log[axis=y]");
Block(2,8,-1,"minecraft:oak_wood[axis=y]");
Block(0,9,-1,"minecraft:oak_log[axis=y]");
Block(1,9,-1,"minecraft:oak_log[axis=y]");
Block(0,10,-1,"minecraft:oak_log[axis=y]");
Block(1,10,-1,"minecraft:oak_log[axis=y]");
Block(0,11,-1,"minecraft:oak_log[axis=y]");
Block(1,11,-1,"minecraft:oak_log[axis=y]");
Block(0,12,-1,"minecraft:oak_log[axis=y]");
Block(1,12,-1,"minecraft:oak_log[axis=y]");
Block(0,13,-1,"minecraft:oak_log[axis=y]");
Block(1,13,-1,"minecraft:oak_log[axis=y]");
Block(0,14,-1,"minecraft:oak_log[axis=y]");
Block(1,14,-1,"minecraft:oak_log[axis=y]");
Block(0,15,-1,"minecraft:oak_log[axis=y]");
Block(1,15,-1,"minecraft:oak_log[axis=y]");
Block(0,16,-1,"minecraft:oak_log[axis=y]");
Block(1,16,-1,"minecraft:oak_log[axis=y]");
Block(0,17,-1,"minecraft:oak_log[axis=y]");
Block(1,17,-1,"minecraft:oak_log[axis=y]");
Block(-1,18,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,18,-1,"minecraft:oak_log[axis=y]");
Block(1,18,-1,"minecraft:oak_log[axis=y]");
Block(2,18,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,18,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,19,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,19,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,19,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,19,-1,"minecraft:oak_log[axis=y]");
Block(1,19,-1,"minecraft:oak_log[axis=y]");
Block(2,19,-1,"minecraft:oak_log[axis=x]");
Block(3,19,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,19,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,20,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,20,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,20,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,20,-1,"minecraft:oak_log[axis=y]");
Block(1,20,-1,"minecraft:oak_log[axis=y]");
Block(2,20,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,20,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,20,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,21,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,21,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,21,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,21,-1,"minecraft:oak_log[axis=y]");
Block(1,21,-1,"minecraft:oak_log[axis=y]");
Block(2,21,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,21,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,21,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,22,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,22,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,22,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,22,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,22,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,22,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,22,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,22,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,23,-1,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-2,23,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,23,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,23,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,23,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,23,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-1,24,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,24,-1,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,24,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,25,-1,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(0,1,0,"minecraft:oak_log[axis=y]");
Block(1,1,0,"minecraft:oak_log[axis=y]");
Block(2,1,0,"minecraft:oak_log[axis=y]");
Block(0,2,0,"minecraft:oak_log[axis=y]");
Block(1,2,0,"minecraft:oak_log[axis=y]");
Block(2,2,0,"minecraft:oak_log[axis=y]");
Block(0,3,0,"minecraft:oak_log[axis=y]");
Block(1,3,0,"minecraft:oak_log[axis=y]");
Block(2,3,0,"minecraft:oak_log[axis=y]");
Block(0,4,0,"minecraft:oak_log[axis=y]");
Block(1,4,0,"minecraft:oak_log[axis=y]");
Block(2,4,0,"minecraft:oak_log[axis=y]");
Block(0,5,0,"minecraft:oak_wood[axis=y]");
Block(1,5,0,"minecraft:oak_log[axis=y]");
Block(2,5,0,"minecraft:oak_log[axis=y]");
Block(1,6,0,"minecraft:oak_log[axis=y]");
Block(2,6,0,"minecraft:oak_log[axis=y]");
Block(1,7,0,"minecraft:oak_log[axis=y]");
Block(2,7,0,"minecraft:oak_wood[axis=x]");
Block(1,8,0,"minecraft:oak_log[axis=y]");
Block(1,9,0,"minecraft:oak_log[axis=y]");
Block(1,10,0,"minecraft:oak_log[axis=y]");
Block(1,11,0,"minecraft:oak_log[axis=y]");
Block(1,12,0,"minecraft:oak_log[axis=y]");
Block(1,13,0,"minecraft:oak_log[axis=y]");
Block(0,14,0,"minecraft:oak_wood[axis=y]");
Block(1,14,0,"minecraft:oak_log[axis=y]");
Block(0,15,0,"minecraft:oak_log[axis=y]");
Block(1,15,0,"minecraft:oak_log[axis=y]");
Block(0,16,0,"minecraft:oak_log[axis=y]");
Block(1,16,0,"minecraft:oak_log[axis=y]");
Block(0,17,0,"minecraft:oak_log[axis=y]");
Block(1,17,0,"minecraft:oak_log[axis=y]");
Block(-1,18,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,18,0,"minecraft:oak_log[axis=y]");
Block(1,18,0,"minecraft:oak_wood[axis=y]");
Block(2,18,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-3,19,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,19,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,19,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,19,0,"minecraft:oak_log[axis=y]");
Block(1,19,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,19,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,19,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-4,20,0,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,20,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,20,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-1,20,0,"minecraft:oak_log[axis=x]");
Block(0,20,0,"minecraft:oak_log[axis=y]");
Block(1,20,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,20,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,20,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,21,0,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,21,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,21,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,21,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,21,0,"minecraft:oak_log[axis=y]");
Block(1,21,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,21,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,21,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,22,0,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,22,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,22,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,22,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,22,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,22,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,22,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-4,23,0,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-3,23,0,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-2,23,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,23,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,23,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,24,0,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(-1,24,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,24,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,1,1,"minecraft:oak_log[axis=y]");
Block(1,2,1,"minecraft:oak_log[axis=y]");
Block(1,3,1,"minecraft:oak_log[axis=y]");
Block(1,4,1,"minecraft:oak_log[axis=y]");
Block(1,5,1,"minecraft:oak_wood[axis=y]");
Block(0,18,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,18,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,19,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,19,1,"minecraft:oak_log[axis=z]");
Block(1,19,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,19,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,20,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,20,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,20,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,20,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,20,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,20,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,21,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,21,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,21,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,21,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,21,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,22,1,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-2,22,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,22,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,22,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,23,1,"minecraft:oak_leaves[distance=6,persistent=true]");
Block(-1,23,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,24,1,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-1,25,1,"minecraft:oak_leaves[distance=6,persistent=true]");
Block(0,18,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,19,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,19,2,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,19,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,20,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,20,2,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,20,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,21,2,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-1,21,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,21,2,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,21,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,22,2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,22,2,"wildnature:oak_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(1,22,2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,23,2,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(0,19,3,"minecraft:oak_leaves[distance=7,persistent=true]");
Block(0,20,3,"minecraft:oak_leaves[distance=6,persistent=true]");
Block(-1,21,3,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,21,3,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(-1,22,3,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(0,22,3,"minecraft:oak_leaves[distance=6,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}