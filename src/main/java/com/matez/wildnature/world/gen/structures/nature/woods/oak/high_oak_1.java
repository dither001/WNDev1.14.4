package com.matez.wildnature.world.gen.structures.nature.woods.oak;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;public class high_oak_1 extends SchemFeature {
    public high_oak_1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public high_oak_1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-2,15,-5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,15,-5,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,15,-5,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,16,-5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,16,-5,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,16,-5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(2,16,-5,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,14,-4,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-3,15,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,15,-4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,15,-4,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,15,-4,"minecraft:oak_log[axis=z]");
Block(1,15,-4,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,-4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,16,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,16,-4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,16,-4,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,16,-4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,16,-4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(3,16,-4,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,14,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,14,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,14,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,14,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,15,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,15,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,15,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,15,-3,"minecraft:oak_log[axis=z]");
Block(1,15,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,15,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,16,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,16,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,16,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,16,-3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,16,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,16,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(3,16,-3,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,17,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,17,-3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,17,-3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(2,17,-3,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,13,-2,"wildnature:oak_branch[down=false,east=false,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(-2,14,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,14,-2,"minecraft:oak_log[axis=y]");
Block(0,14,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,14,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(3,14,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,15,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,15,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,15,-2,"minecraft:oak_log[axis=y]");
Block(0,15,-2,"minecraft:oak_log[axis=z]");
Block(1,15,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,15,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(4,15,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,16,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,16,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,16,-2,"minecraft:oak_log[axis=x]");
Block(0,16,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,16,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,16,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,16,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(4,16,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,17,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,17,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,17,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,17,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(2,17,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(3,17,-2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,18,-2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,18,-2,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,1,-1,"minecraft:oak_log[axis=y]");
Block(0,2,-1,"minecraft:oak_log[axis=y]");
Block(0,3,-1,"minecraft:oak_log[axis=y]");
Block(2,13,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,14,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,14,-1,"minecraft:oak_log[axis=z]");
Block(0,14,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,14,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,14,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,14,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,15,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,15,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,15,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,15,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,15,-1,"minecraft:oak_log[axis=z]");
Block(1,15,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,15,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,16,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,16,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,16,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,16,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,16,-1,"minecraft:oak_log[axis=z]");
Block(1,16,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,16,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,16,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(4,16,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(5,16,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,17,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,17,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,17,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,17,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,17,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,17,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,17,-1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,18,-1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-1,18,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,18,-1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,18,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(2,18,-1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,1,0,"minecraft:oak_log[axis=y]");
Block(1,1,0,"minecraft:oak_log[axis=y]");
Block(0,2,0,"minecraft:oak_log[axis=y]");
Block(1,2,0,"minecraft:oak_log[axis=y]");
Block(0,3,0,"minecraft:oak_log[axis=y]");
Block(0,4,0,"minecraft:oak_log[axis=y]");
Block(0,5,0,"minecraft:oak_log[axis=y]");
Block(0,6,0,"minecraft:oak_log[axis=y]");
Block(0,7,0,"minecraft:oak_log[axis=y]");
Block(0,8,0,"minecraft:oak_log[axis=y]");
Block(0,9,0,"minecraft:oak_log[axis=y]");
Block(0,10,0,"minecraft:oak_log[axis=y]");
Block(0,11,0,"minecraft:oak_log[axis=y]");
Block(0,12,0,"minecraft:oak_log[axis=y]");
Block(0,13,0,"minecraft:oak_log[axis=y]");
Block(1,13,0,"minecraft:oak_log[axis=x]");
Block(2,13,0,"minecraft:oak_log[axis=x]");
Block(-3,14,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,14,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,14,0,"minecraft:oak_log[axis=z]");
Block(0,14,0,"minecraft:oak_log[axis=y]");
Block(1,14,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,14,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,14,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-4,15,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,15,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,15,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,15,0,"minecraft:oak_log[axis=x]");
Block(0,15,0,"minecraft:oak_log[axis=y]");
Block(1,15,0,"minecraft:oak_log[axis=x]");
Block(2,15,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,15,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(4,15,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-5,16,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-4,16,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,16,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,16,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,16,0,"minecraft:oak_log[axis=x]");
Block(0,16,0,"minecraft:oak_log[axis=y]");
Block(1,16,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,16,0,"minecraft:oak_log[axis=x]");
Block(3,16,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(4,16,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(5,16,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,17,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-3,17,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,17,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,17,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,17,0,"minecraft:oak_log[axis=y]");
Block(1,17,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,17,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,17,0,"minecraft:oak_log[axis=y]");
Block(4,17,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-3,18,0,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,18,0,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,18,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,18,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,18,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,18,0,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,18,0,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,7,1,"wildnature:oak_branch[down=false,east=false,north=true,south=false,up=false,waterlogged=false,west=false]");
Block(0,12,1,"minecraft:oak_log[axis=z]");
Block(0,13,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,13,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,14,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,14,1,"minecraft:oak_log[axis=x]");
Block(0,14,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,14,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-5,15,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-4,15,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,15,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,15,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,15,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,15,1,"minecraft:oak_log[axis=z]");
Block(1,15,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(4,15,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-4,16,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,16,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,16,1,"minecraft:oak_log[axis=z]");
Block(-1,16,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,16,1,"minecraft:oak_log[axis=z]");
Block(1,16,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,16,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,16,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(4,16,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(5,16,1,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-4,17,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,17,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,17,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,17,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,17,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,17,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,17,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,17,1,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(4,17,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,18,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,18,1,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,18,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(2,18,1,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,12,2,"minecraft:oak_log[axis=z]");
Block(0,13,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,14,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,14,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,14,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,14,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,15,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,15,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,15,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,15,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,15,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,15,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,15,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-4,16,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,16,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-2,16,2,"minecraft:oak_log[axis=z]");
Block(-1,16,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(0,16,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,16,2,"minecraft:oak_log[axis=z]");
Block(2,16,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,16,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(4,16,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,17,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,17,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,17,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,17,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,17,2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,17,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,17,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,18,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,18,2,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,18,2,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,12,3,"wildnature:oak_branch[down=false,east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(0,13,3,"minecraft:oak_log[axis=y]");
Block(-1,14,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,14,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,14,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,15,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,15,3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,15,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,15,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-4,16,3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,16,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,16,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-1,16,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,16,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(1,16,3,"minecraft:oak_log[axis=z]");
Block(2,16,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(3,16,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-2,17,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,17,3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,17,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,17,3,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,17,3,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(0,18,3,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,15,4,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(1,15,4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-3,16,4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-2,16,4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(-1,16,4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,16,4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(1,16,4,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(2,16,4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(3,16,4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(0,17,4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,17,4,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,17,4,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-3,16,5,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(-2,16,5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,16,5,"minecraft:oak_leaves[distance=4,persistent=true]");
Block(0,16,5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(1,16,5,"minecraft:oak_leaves[distance=2,persistent=true]");
Block(2,16,5,"minecraft:oak_leaves[distance=3,persistent=true]");
Block(-1,16,6,"minecraft:oak_leaves[distance=5,persistent=true]");
Block(1,16,6,"minecraft:oak_leaves[distance=3,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}