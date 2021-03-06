package com.matez.wildnature.world.gen.structures.nature.woods.baobab;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class baobab4 extends SchemFeature {
    public baobab4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public baobab4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,9,-4,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,8,-3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-2,9,-3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,9,-3,"wildnature:baobab_log[axis=y]");
Block(0,9,-3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,9,-3,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,10,-3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,1,-2,"wildnature:baobab_log[axis=y]");
Block(0,1,-2,"wildnature:baobab_log[axis=y]");
Block(1,1,-2,"wildnature:baobab_log[axis=y]");
Block(0,2,-2,"wildnature:baobab_log[axis=y]");
Block(1,2,-2,"wildnature:baobab_log[axis=y]");
Block(0,3,-2,"wildnature:baobab_log[axis=y]");
Block(-2,8,-2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,8,-2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,8,-2,"minecraft:oak_leaves[distance=1,persistent=true]");
Block(-3,9,-2,"wildnature:baobab_leaves[distance=3,persistent=true]");
Block(-2,9,-2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,9,-2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,9,-2,"wildnature:baobab_log[axis=y]");
Block(1,9,-2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,9,-2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,10,-2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,10,-2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-2,1,-1,"wildnature:baobab_log[axis=y]");
Block(-1,1,-1,"wildnature:baobab_log[axis=y]");
Block(0,1,-1,"wildnature:baobab_log[axis=y]");
Block(1,1,-1,"wildnature:baobab_log[axis=y]");
Block(2,1,-1,"wildnature:baobab_log[axis=y]");
Block(-2,2,-1,"wildnature:baobab_log[axis=y]");
Block(-1,2,-1,"wildnature:baobab_log[axis=y]");
Block(0,2,-1,"wildnature:baobab_log[axis=y]");
Block(1,2,-1,"wildnature:baobab_log[axis=y]");
Block(2,2,-1,"wildnature:baobab_log[axis=y]");
Block(-2,3,-1,"wildnature:baobab_log[axis=y]");
Block(-1,3,-1,"wildnature:baobab_log[axis=y]");
Block(0,3,-1,"wildnature:baobab_log[axis=y]");
Block(1,3,-1,"wildnature:baobab_log[axis=y]");
Block(2,3,-1,"wildnature:baobab_log[axis=y]");
Block(-2,4,-1,"wildnature:baobab_log[axis=y]");
Block(-1,4,-1,"wildnature:baobab_log[axis=y]");
Block(0,4,-1,"wildnature:baobab_log[axis=y]");
Block(1,4,-1,"wildnature:baobab_log[axis=y]");
Block(2,4,-1,"wildnature:baobab_log[axis=y]");
Block(-1,5,-1,"wildnature:baobab_log[axis=y]");
Block(0,5,-1,"wildnature:baobab_log[axis=y]");
Block(1,5,-1,"wildnature:baobab_log[axis=y]");
Block(-1,6,-1,"wildnature:baobab_log[axis=y]");
Block(0,6,-1,"wildnature:baobab_log[axis=y]");
Block(1,6,-1,"wildnature:baobab_log[axis=y]");
Block(-1,7,-1,"wildnature:baobab_log[axis=y]");
Block(0,7,-1,"wildnature:baobab_log[axis=y]");
Block(1,7,-1,"wildnature:baobab_log[axis=y]");
Block(-3,8,-1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,8,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,8,-1,"wildnature:baobab_log[axis=y]");
Block(0,8,-1,"wildnature:baobab_log[axis=y]");
Block(1,8,-1,"wildnature:baobab_log[axis=y]");
Block(-4,9,-1,"wildnature:baobab_leaves[distance=3,persistent=true]");
Block(-3,9,-1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,9,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,9,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,9,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,9,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,9,-1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-2,10,-1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,10,-1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(1,10,-1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,1,0,"wildnature:baobab_log[axis=y]");
Block(-1,1,0,"wildnature:baobab_log[axis=y]");
Block(0,1,0,"wildnature:baobab_log[axis=y]");
Block(1,1,0,"wildnature:baobab_log[axis=y]");
Block(2,1,0,"wildnature:baobab_log[axis=y]");
Block(3,1,0,"wildnature:baobab_log[axis=x]");
Block(-2,2,0,"wildnature:baobab_log[axis=y]");
Block(-1,2,0,"wildnature:baobab_log[axis=y]");
Block(0,2,0,"wildnature:baobab_log[axis=y]");
Block(1,2,0,"wildnature:baobab_log[axis=y]");
Block(2,2,0,"wildnature:baobab_log[axis=y]");
Block(-2,3,0,"wildnature:baobab_log[axis=y]");
Block(-1,3,0,"wildnature:baobab_log[axis=y]");
Block(0,3,0,"wildnature:baobab_log[axis=y]");
Block(1,3,0,"wildnature:baobab_log[axis=y]");
Block(2,3,0,"wildnature:baobab_log[axis=y]");
Block(-2,4,0,"wildnature:baobab_log[axis=y]");
Block(-1,4,0,"wildnature:baobab_log[axis=y]");
Block(0,4,0,"wildnature:baobab_log[axis=y]");
Block(1,4,0,"wildnature:baobab_log[axis=y]");
Block(2,4,0,"wildnature:baobab_log[axis=y]");
Block(-2,5,0,"wildnature:baobab_log[axis=y]");
Block(-1,5,0,"wildnature:baobab_log[axis=y]");
Block(0,5,0,"wildnature:baobab_log[axis=y]");
Block(1,5,0,"wildnature:baobab_log[axis=y]");
Block(2,5,0,"wildnature:baobab_log[axis=y]");
Block(-1,6,0,"wildnature:baobab_log[axis=y]");
Block(0,6,0,"wildnature:baobab_log[axis=y]");
Block(1,6,0,"wildnature:baobab_log[axis=y]");
Block(2,6,0,"wildnature:baobab_log[axis=y]");
Block(-1,7,0,"wildnature:baobab_log[axis=y]");
Block(0,7,0,"wildnature:baobab_log[axis=y]");
Block(1,7,0,"wildnature:baobab_log[axis=y]");
Block(-2,8,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,8,0,"wildnature:baobab_log[axis=y]");
Block(0,8,0,"wildnature:baobab_log[axis=y]");
Block(1,8,0,"wildnature:baobab_log[axis=y]");
Block(2,8,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-4,9,0,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-3,9,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-2,9,0,"wildnature:baobab_log[axis=x]");
Block(-1,9,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,9,0,"wildnature:baobab_log[axis=y]");
Block(1,9,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,9,0,"wildnature:baobab_log[axis=y]");
Block(3,9,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-3,10,0,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,10,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,10,0,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,10,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,10,0,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,11,0,"wildnature:baobab_leaves[distance=3,persistent=true]");
Block(-2,1,1,"wildnature:baobab_log[axis=y]");
Block(-1,1,1,"wildnature:baobab_log[axis=y]");
Block(0,1,1,"wildnature:baobab_log[axis=y]");
Block(1,1,1,"wildnature:baobab_log[axis=y]");
Block(2,1,1,"wildnature:baobab_log[axis=y]");
Block(-2,2,1,"wildnature:baobab_log[axis=y]");
Block(-1,2,1,"wildnature:baobab_log[axis=y]");
Block(0,2,1,"wildnature:baobab_log[axis=y]");
Block(1,2,1,"wildnature:baobab_log[axis=y]");
Block(2,2,1,"wildnature:baobab_log[axis=y]");
Block(-2,3,1,"wildnature:baobab_log[axis=y]");
Block(-1,3,1,"wildnature:baobab_log[axis=y]");
Block(0,3,1,"wildnature:baobab_log[axis=y]");
Block(1,3,1,"wildnature:baobab_log[axis=y]");
Block(-1,4,1,"wildnature:baobab_log[axis=y]");
Block(0,4,1,"wildnature:baobab_log[axis=y]");
Block(1,4,1,"wildnature:baobab_log[axis=y]");
Block(-1,5,1,"wildnature:baobab_log[axis=y]");
Block(0,5,1,"wildnature:baobab_log[axis=y]");
Block(1,5,1,"wildnature:baobab_log[axis=y]");
Block(-1,6,1,"wildnature:baobab_log[axis=y]");
Block(0,6,1,"wildnature:baobab_log[axis=y]");
Block(1,6,1,"wildnature:baobab_log[axis=y]");
Block(-1,7,1,"wildnature:baobab_log[axis=y]");
Block(0,7,1,"wildnature:baobab_log[axis=y]");
Block(1,7,1,"wildnature:baobab_log[axis=y]");
Block(-1,8,1,"wildnature:baobab_log[axis=y]");
Block(0,8,1,"wildnature:baobab_log[axis=y]");
Block(1,8,1,"wildnature:baobab_log[axis=y]");
Block(2,8,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-3,9,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,9,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,9,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,9,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,9,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,9,1,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(3,9,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-2,10,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,10,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,10,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(2,10,1,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(-1,1,2,"wildnature:baobab_log[axis=y]");
Block(0,1,2,"wildnature:baobab_log[axis=y]");
Block(1,1,2,"wildnature:baobab_log[axis=y]");
Block(0,2,2,"wildnature:baobab_log[axis=y]");
Block(1,2,2,"wildnature:baobab_log[axis=y]");
Block(0,3,2,"wildnature:baobab_log[axis=y]");
Block(1,3,2,"wildnature:baobab_log[axis=y]");
Block(0,4,2,"wildnature:baobab_log[axis=y]");
Block(1,4,2,"wildnature:baobab_log[axis=y]");
Block(0,5,2,"wildnature:baobab_log[axis=y]");
Block(-1,8,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,8,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-3,9,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-2,9,2,"wildnature:baobab_log[axis=y]");
Block(-1,9,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,9,2,"wildnature:baobab_log[axis=y]");
Block(1,9,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(2,9,2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(3,9,2,"wildnature:baobab_leaves[distance=3,persistent=true]");
Block(-2,10,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,10,2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,10,2,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,10,2,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,1,3,"wildnature:baobab_log[axis=y]");
Block(-2,9,3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(-1,9,3,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(0,9,3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,9,3,"wildnature:baobab_log[axis=y]");
Block(2,9,3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(0,10,3,"wildnature:baobab_leaves[distance=2,persistent=true]");
Block(1,10,3,"wildnature:baobab_leaves[distance=1,persistent=true]");
Block(1,9,4,"wildnature:baobab_leaves[distance=1,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}