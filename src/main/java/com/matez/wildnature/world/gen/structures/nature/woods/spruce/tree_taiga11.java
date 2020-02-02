package com.matez.wildnature.world.gen.structures.nature.woods.spruce;


import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_taiga11 extends SchemFeature {
    public tree_taiga11(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_taiga11(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
        Block(-4,5,0,LEAVES);
        Block(-4,6,-1,LEAVES);
        Block(-3,4,-1,LEAVES);
        Block(-3,5,2,LEAVES);
        Block(-3,6,-2,LEAVES);
        Block(-3,6,0,LEAVES);
        Block(-3,7,-1,LEAVES);
        Block(-3,7,1,LEAVES);
        Block(-3,7,2,LEAVES);
        Block(-3,8,0,LEAVES);
        Block(-3,10,0,LEAVES);
        Block(-2,3,2,LEAVES);
        Block(-2,4,-2,LEAVES);
        Block(-2,4,-1,LEAVES);
        Block(-2,4,0,LEAVES);
        Block(-2,4,1,LEAVES);
        Block(-2,5,0,LEAVES);
        Block(-2,6,-2,LEAVES);
        Block(-2,6,2,LEAVES);
        Block(-2,7,-1,LEAVES);
        Block(-2,7,0,LEAVES);
        Block(-2,7,1,LEAVES);
        Block(-2,7,3,LEAVES);
        Block(-2,8,-2,LEAVES);
        Block(-2,9,-1,LEAVES);
        Block(-2,9,0,LEAVES);
        Block(-2,9,2,LEAVES);
        Block(-2,10,1,LEAVES);
        Block(-2,11,0,LEAVES);
        Block(-2,12,1,LEAVES);
        Block(-2,13,0,LEAVES);
        Block(-2,16,0,LEAVES);
        Block(-1,3,-3,LEAVES);
        Block(-1,4,-2,LEAVES);
        Block(-1,4,1,LEAVES);
        Block(-1,4,2,LEAVES);
        Block(-1,4,3,LEAVES);
        Block(-1,5,-1,LEAVES);
        Block(-1,5,0,LEAVES);
        Block(-1,5,1,LEAVES);
        Block(-1,6,-3,LEAVES);
        Block(-1,7,-2,LEAVES);
        Block(-1,7,-1,LEAVES);
        Block(-1,7,0,LEAVES);
        Block(-1,7,1,LEAVES);
        Block(-1,7,3,LEAVES);
        Block(-1,8,2,LEAVES);
        Block(-1,9,-2,LEAVES);
        Block(-1,9,-1,LEAVES);
        Block(-1,10,0,LEAVES);
        Block(-1,10,1,LEAVES);
        Block(-1,10,2,LEAVES);
        Block(-1,11,-1,LEAVES);
        Block(-1,11,1,LEAVES);
        Block(-1,12,-1,LEAVES);
        Block(-1,12,0,LEAVES);
        Block(-1,13,-1,LEAVES);
        Block(-1,13,1,LEAVES);
        Block(-1,14,0,LEAVES);
        Block(-1,14,1,LEAVES);
        Block(-1,15,-1,LEAVES);
        Block(-1,16,1,LEAVES);
        Block(-1,17,0,LEAVES);
        Block(-1,19,0,LEAVES);
        Block(0,0,0,DIRT);
        Block(0,1,0,LOG);
        Block(0,2,0,LOG);
        Block(0,3,0,LOG);
        Block(0,4,-3,LEAVES);
        Block(0,4,-2,LEAVES);
        Block(0,4,0,LOG);
        Block(0,4,3,LEAVES);
        Block(0,5,-1,LEAVES);
        Block(0,5,0,LOG);
        Block(0,5,1,LEAVES);
        Block(0,5,2,LEAVES);
        Block(0,6,-2,LEAVES);
        Block(0,6,0,LOG);
        Block(0,6,2,LEAVES);
        Block(0,7,-1,LEAVES);
        Block(0,7,0,LOG);
        Block(0,7,1,LEAVES);
        Block(0,8,-3,LEAVES);
        Block(0,8,0,LOG);
        Block(0,8,1,LEAVES);
        Block(0,8,2,LEAVES);
        Block(0,9,-2,LEAVES);
        Block(0,9,-1,LEAVES);
        Block(0,9,0,LOG);
        Block(0,9,1,LEAVES);
        Block(0,10,-1,LEAVES);
        Block(0,10,0,LOG);
        Block(0,10,3,LEAVES);
        Block(0,11,-2,LEAVES);
        Block(0,11,0,LOG);
        Block(0,11,2,LEAVES);
        Block(0,12,-1,LEAVES);
        Block(0,12,0,LOG);
        Block(0,12,1,LEAVES);
        Block(0,13,-2,LEAVES);
        Block(0,13,0,LOG);
        Block(0,13,2,LEAVES);
        Block(0,14,-1,LEAVES);
        Block(0,14,0,LOG);
        Block(0,14,1,LEAVES);
        Block(0,15,0,LOG);
        Block(0,16,-1,LEAVES);
        Block(0,16,0,LOG);
        Block(0,16,1,LEAVES);
        Block(0,17,0,LEAVES);
        Block(0,18,-1,LEAVES);
        Block(0,18,0,LEAVES);
        Block(0,18,1,LEAVES);
        Block(0,19,0,LEAVES);
        Block(0,20,0,LEAVES);
        Block(0,21,0,LEAVES);
        Block(1,4,-3,LEAVES);
        Block(1,4,-2,LEAVES);
        Block(1,4,-1,LEAVES);
        Block(1,4,1,LEAVES);
        Block(1,4,2,LEAVES);
        Block(1,5,0,LEAVES);
        Block(1,6,0,LEAVES);
        Block(1,6,1,LEAVES);
        Block(1,6,2,LEAVES);
        Block(1,6,3,LEAVES);
        Block(1,7,-3,LEAVES);
        Block(1,7,-1,LEAVES);
        Block(1,7,0,LEAVES);
        Block(1,7,1,LEAVES);
        Block(1,7,2,LEAVES);
        Block(1,8,-2,LEAVES);
        Block(1,9,-2,LEAVES);
        Block(1,9,-1,LEAVES);
        Block(1,9,0,LEAVES);
        Block(1,9,1,LEAVES);
        Block(1,9,2,LEAVES);
        Block(1,10,1,LEAVES);
        Block(1,11,-1,LEAVES);
        Block(1,11,1,LEAVES);
        Block(1,12,0,LEAVES);
        Block(1,13,1,LEAVES);
        Block(1,14,0,LEAVES);
        Block(1,15,-1,LEAVES);
        Block(1,15,0,LEAVES);
        Block(1,15,1,LEAVES);
        Block(1,17,-1,LEAVES);
        Block(1,17,0,LEAVES);
        Block(1,18,0,LEAVES);
        Block(2,3,-3,LEAVES);
        Block(2,4,-2,LEAVES);
        Block(2,4,0,LEAVES);
        Block(2,4,3,LEAVES);
        Block(2,6,-2,LEAVES);
        Block(2,6,0,LEAVES);
        Block(2,7,-1,LEAVES);
        Block(2,7,1,LEAVES);
        Block(2,8,-2,LEAVES);
        Block(2,9,-1,LEAVES);
        Block(2,10,-1,LEAVES);
        Block(2,10,1,LEAVES);
        Block(2,11,0,LEAVES);
        Block(2,13,0,LEAVES);
        Block(2,14,1,LEAVES);
        Block(3,3,0,LEAVES);
        Block(3,4,1,LEAVES);
        Block(3,5,0,LEAVES);
        Block(3,6,1,LEAVES);
        Block(3,8,-1,LEAVES);
        Block(3,10,-1,LEAVES);
        Block(4,3,1,LEAVES);

//   wildnature mod 2019/07/30 20:55:59
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
