package com.matez.wildnature.world.gen.structures.nature.woods.ebony;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class small_ebony1 extends SchemFeature {
    public small_ebony1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public small_ebony1(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(0,5,-3,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,6,-3,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,4,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-1,5,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,5,-2,"wildnature:ebony_log[axis=y]");
Block(1,5,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-1,6,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,6,-2,"wildnature:ebony_log[axis=y]");
Block(1,6,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,7,-2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,4,-1,"wildnature:ebony_log[axis=y]");
Block(0,5,-1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,6,-1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-2,6,-1,"wildnature:ebony_leaves[distance=2,persistent=true]");
Block(0,6,-1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,7,-1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,1,0,"wildnature:ebony_log[axis=y]");
Block(0,2,0,"wildnature:ebony_log[axis=y]");
Block(0,3,0,"wildnature:ebony_log[axis=y]");
Block(-1,4,0,"wildnature:ebony_log[axis=y]");
Block(0,4,0,"wildnature:ebony_log[axis=y]");
Block(-3,5,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-2,5,0,"wildnature:ebony_log[axis=y]");
Block(0,5,0,"wildnature:ebony_log[axis=z]");
Block(-4,6,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,6,0,"wildnature:ebony_log[axis=y]");
Block(-2,6,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-4,7,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,7,0,"wildnature:ebony_log[axis=y]");
Block(-2,7,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,8,0,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-2,5,1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,5,1,"wildnature:ebony_log[axis=y]");
Block(1,5,1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,6,1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,6,1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-3,7,1,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,7,1,"wildnature:ebony_leaves[distance=2,persistent=true]");
Block(0,5,2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-1,6,2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,6,2,"wildnature:ebony_log[axis=y]");
Block(1,6,2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(-1,7,2,"wildnature:ebony_leaves[distance=2,persistent=true]");
Block(0,7,2,"wildnature:ebony_leaves[distance=1,persistent=true]");
Block(0,6,3,"wildnature:ebony_leaves[distance=1,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}