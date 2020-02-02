package com.matez.wildnature.world.gen.structures.nature.woods.spruce;


import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_taiga19 extends SchemFeature {
    public tree_taiga19(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_taiga19(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
        Block(-4,5,-4,LEAVES);
        Block(-4,5,3,LEAVES);
        Block(-3,1,-1,LOG);
        Block(-3,2,-1,LOG);
        Block(-3,5,-3,LEAVES);
        Block(-3,5,2,LEAVES);
        Block(-3,6,-3,LEAVES);
        Block(-3,6,-2,LEAVES);
        Block(-3,6,1,LEAVES);
        Block(-3,6,2,LEAVES);
        Block(-3,12,4,LEAVES);
        Block(-2,1,-2,LEAVES);
        Block(-2,1,-1,LOG);
        Block(-2,1,0,LOG);
        Block(-2,2,-2,LOG);
        Block(-2,2,-1,LOG);
        Block(-2,2,0,LOG);
        Block(-2,3,-2,LOG);
        Block(-2,3,-1,LOG);
        Block(-2,4,-1,LOG);
        Block(-2,4,0,LEAVES);
        Block(-2,5,-1,LEAVES);
        Block(-2,6,-3,LEAVES);
        Block(-2,6,-2,LEAVES);
        Block(-2,6,0,LEAVES);
        Block(-2,6,1,LEAVES);
        Block(-2,7,-2,LEAVES);
        Block(-2,7,-1,LEAVES);
        Block(-2,7,0,LEAVES);
        Block(-2,7,1,LEAVES);
        Block(-2,8,-1,LEAVES);
        Block(-2,8,0,LEAVES);
        Block(-2,13,3,LEAVES);
        Block(-2,13,4,LEAVES);
        Block(-2,14,-2,LEAVES);
        Block(-2,14,3,LEAVES);
        Block(-1,1,-3,LOG);
        Block(-1,1,-2,LEAVES);
        Block(-1,1,-1,LOG);
        Block(-1,1,0,LOG);
        Block(-1,2,-2,LOG);
        Block(-1,2,-1,LOG);
        Block(-1,3,-2,LOG);
        Block(-1,3,-1,LOG);
        Block(-1,4,-2,LOG);
        Block(-1,4,-1,LOG);
        Block(-1,4,0,LOG);
        Block(-1,5,-1,LOG);
        Block(-1,5,0,LOG);
        Block(-1,5,1,LEAVES);
        Block(-1,6,-2,LEAVES);
        Block(-1,6,-1,LOG);
        Block(-1,6,0,LOG);
        Block(-1,6,1,LEAVES);
        Block(-1,6,2,LEAVES);
        Block(-1,7,-2,LEAVES);
        Block(-1,7,-1,LOG);
        Block(-1,7,0,LEAVES);
        Block(-1,7,1,LEAVES);
        Block(-1,8,-2,LEAVES);
        Block(-1,8,-1,LEAVES);
        Block(-1,8,0,LEAVES);
        Block(-1,9,-1,LEAVES);
        Block(-1,10,-5,LEAVES);
        Block(-1,10,0,LEAVES);
        Block(-1,13,3,LEAVES);
        Block(-1,14,2,LEAVES);
        Block(-1,14,3,LEAVES);
        Block(-1,15,-1,LEAVES);
        Block(-1,16,0,LEAVES);
        Block(0,0,0,DIRT);
        Block(0,1,-1,LEAVES);
        Block(0,4,-1,LOG);
        Block(0,5,-1,LOG);
        Block(0,5,0,LOG);
        Block(0,6,-2,LEAVES);
        Block(0,6,-1,LOG);
        Block(0,6,0,LOG);
        Block(0,6,1,LEAVES);
        Block(0,7,-2,LEAVES);
        Block(0,7,-1,LOG);
        Block(0,7,0,LOG);
        Block(0,7,1,LEAVES);
        Block(0,8,-1,LOG);
        Block(0,8,0,LOG);
        Block(0,8,1,LEAVES);
        Block(0,8,5,LEAVES);
        Block(0,8,6,LEAVES);
        Block(0,9,-1,LEAVES);
        Block(0,9,0,LEAVES);
        Block(0,9,4,LEAVES);
        Block(0,10,-4,LEAVES);
        Block(0,10,-1,LEAVES);
        Block(0,10,0,LEAVES);
        Block(0,10,1,LEAVES);
        Block(0,10,2,LEAVES);
        Block(0,11,-4,LEAVES);
        Block(0,11,-3,LEAVES);
        Block(0,11,1,LEAVES);
        Block(0,12,0,LEAVES);
        Block(0,13,1,LEAVES);
        Block(0,14,1,LEAVES);
        Block(0,14,2,LEAVES);
        Block(0,15,0,LEAVES);
        Block(0,15,2,LEAVES);
        Block(0,16,-1,LEAVES);
        Block(0,16,0,LEAVES);
        Block(0,16,5,LEAVES);
        Block(0,17,1,LEAVES);
        Block(1,5,-2,LEAVES);
        Block(1,5,0,LEAVES);
        Block(1,5,2,LEAVES);
        Block(1,6,-3,LEAVES);
        Block(1,6,-2,LEAVES);
        Block(1,6,-1,LEAVES);
        Block(1,6,0,LEAVES);
        Block(1,6,1,LEAVES);
        Block(1,6,2,LEAVES);
        Block(1,7,-1,LEAVES);
        Block(1,7,0,LEAVES);
        Block(1,8,-1,LEAVES);
        Block(1,8,0,LOG);
        Block(1,8,1,LEAVES);
        Block(1,9,-2,LEAVES);
        Block(1,9,-1,LEAVES);
        Block(1,9,0,LOG);
        Block(1,9,1,LEAVES);
        Block(1,9,3,LEAVES);
        Block(1,9,4,LEAVES);
        Block(1,9,5,LEAVES);
        Block(1,10,-1,LEAVES);
        Block(1,10,0,LOG);
        Block(1,10,1,LEAVES);
        Block(1,10,2,LEAVES);
        Block(1,10,3,LEAVES);
        Block(1,10,4,LEAVES);
        Block(1,11,-4,LEAVES);
        Block(1,11,-3,LEAVES);
        Block(1,11,-1,LEAVES);
        Block(1,11,0,LEAVES);
        Block(1,11,1,LEAVES);
        Block(1,12,-3,LEAVES);
        Block(1,12,-2,LEAVES);
        Block(1,12,-1,LEAVES);
        Block(1,12,0,LOG);
        Block(1,12,1,LEAVES);
        Block(1,12,2,LEAVES);
        Block(1,13,-1,LEAVES);
        Block(1,13,0,LEAVES);
        Block(1,13,1,LOG);
        Block(1,14,0,LEAVES);
        Block(1,14,1,LOG);
        Block(1,14,2,LEAVES);
        Block(1,15,0,LEAVES);
        Block(1,15,1,LEAVES);
        Block(1,15,2,LEAVES);
        Block(1,15,3,LEAVES);
        Block(1,16,-1,LEAVES);
        Block(1,16,0,LEAVES);
        Block(1,16,1,LEAVES);
        Block(1,17,0,LEAVES);
        Block(1,17,1,LEAVES);
        Block(1,17,3,LEAVES);
        Block(1,17,4,LEAVES);
        Block(1,18,3,LEAVES);
        Block(2,4,3,LEAVES);
        Block(2,5,-4,LEAVES);
        Block(2,5,-3,LEAVES);
        Block(2,5,1,LEAVES);
        Block(2,5,2,LEAVES);
        Block(2,6,-3,LEAVES);
        Block(2,6,0,LEAVES);
        Block(2,6,1,LEAVES);
        Block(2,8,0,LEAVES);
        Block(2,8,1,LEAVES);
        Block(2,9,-1,LEAVES);
        Block(2,9,0,LEAVES);
        Block(2,9,1,LEAVES);
        Block(2,9,2,LEAVES);
        Block(2,10,-1,LEAVES);
        Block(2,10,0,LEAVES);
        Block(2,10,1,LEAVES);
        Block(2,10,2,LEAVES);
        Block(2,10,3,LEAVES);
        Block(2,11,0,LEAVES);
        Block(2,11,1,LOG);
        Block(2,11,2,LEAVES);
        Block(2,12,-3,LEAVES);
        Block(2,12,-2,LEAVES);
        Block(2,12,-1,LEAVES);
        Block(2,12,0,LEAVES);
        Block(2,12,1,LOG);
        Block(2,13,-2,LEAVES);
        Block(2,13,-1,LEAVES);
        Block(2,13,0,LOG);
        Block(2,13,1,LOG);
        Block(2,13,2,LEAVES);
        Block(2,14,-1,LEAVES);
        Block(2,14,0,LOG);
        Block(2,14,1,LOG);
        Block(2,14,2,LEAVES);
        Block(2,15,0,LEAVES);
        Block(2,15,1,LOG);
        Block(2,15,2,LEAVES);
        Block(2,16,0,LEAVES);
        Block(2,16,1,LOG);
        Block(2,16,2,LEAVES);
        Block(2,17,0,LEAVES);
        Block(2,17,1,LOG);
        Block(2,17,2,LEAVES);
        Block(2,17,3,LEAVES);
        Block(2,18,1,LEAVES);
        Block(2,18,2,LEAVES);
        Block(2,18,3,LEAVES);
        Block(2,19,1,LEAVES);
        Block(2,19,2,LEAVES);
        Block(2,20,2,LEAVES);
        Block(2,20,3,LEAVES);
        Block(2,21,3,LEAVES);
        Block(3,4,-5,LEAVES);
        Block(3,4,-4,LEAVES);
        Block(3,4,3,LEAVES);
        Block(3,5,-4,LEAVES);
        Block(3,5,3,LEAVES);
        Block(3,8,-1,LEAVES);
        Block(3,9,-2,LEAVES);
        Block(3,9,-1,LEAVES);
        Block(3,9,0,LEAVES);
        Block(3,9,1,LEAVES);
        Block(3,9,2,LEAVES);
        Block(3,10,-1,LEAVES);
        Block(3,10,0,LEAVES);
        Block(3,10,2,LEAVES);
        Block(3,11,0,LEAVES);
        Block(3,11,1,LEAVES);
        Block(3,12,-1,LEAVES);
        Block(3,12,0,LEAVES);
        Block(3,13,-1,LEAVES);
        Block(3,13,0,LEAVES);
        Block(3,13,1,LEAVES);
        Block(3,13,2,LEAVES);
        Block(3,14,1,LEAVES);
        Block(3,14,2,LEAVES);
        Block(3,14,3,LEAVES);
        Block(3,15,0,LEAVES);
        Block(3,15,1,LEAVES);
        Block(3,15,2,LEAVES);
        Block(3,16,1,LEAVES);
        Block(3,16,3,LEAVES);
        Block(3,17,0,LEAVES);
        Block(3,17,1,LEAVES);
        Block(3,17,2,LEAVES);
        Block(3,17,3,LEAVES);
        Block(3,18,1,LEAVES);
        Block(3,18,2,LEAVES);
        Block(3,18,3,LEAVES);
        Block(3,18,4,LEAVES);
        Block(3,19,2,LEAVES);
        Block(3,19,3,LEAVES);
        Block(3,20,2,LEAVES);
        Block(3,20,3,LEAVES);
        Block(3,20,4,LEAVES);
        Block(3,21,2,LEAVES);
        Block(3,21,3,LEAVES);
        Block(3,22,3,LEAVES);
        Block(3,23,3,LEAVES);
        Block(4,4,4,LEAVES);
        Block(4,8,-2,LEAVES);
        Block(4,8,-1,LEAVES);
        Block(4,8,2,LEAVES);
        Block(4,9,-2,LEAVES);
        Block(4,9,-1,LEAVES);
        Block(4,9,2,LEAVES);
        Block(4,10,0,LEAVES);
        Block(4,12,3,LEAVES);
        Block(4,13,2,LEAVES);
        Block(4,13,3,LEAVES);
        Block(4,15,0,LEAVES);
        Block(4,15,1,LEAVES);
        Block(4,16,0,LEAVES);
        Block(4,17,3,LEAVES);
        Block(4,17,4,LEAVES);
        Block(4,18,2,LEAVES);
        Block(4,18,3,LEAVES);
        Block(4,18,4,LEAVES);
        Block(4,19,3,LEAVES);
        Block(4,20,2,LEAVES);
        Block(5,7,-3,LEAVES);
        Block(5,7,-2,LEAVES);
        Block(5,8,-2,LEAVES);
        Block(5,8,3,LEAVES);
        Block(5,12,3,LEAVES);
        Block(5,12,4,LEAVES);
        Block(5,14,-1,LEAVES);
        Block(5,14,0,LEAVES);
        Block(5,15,0,LEAVES);
        Block(5,16,4,LEAVES);
        Block(5,17,1,LEAVES);
        Block(5,17,4,LEAVES);
        Block(6,12,4,LEAVES);
        Block(6,13,-1,LEAVES);
        Block(6,14,-1,LEAVES);
        Block(6,16,5,LEAVES);
        Block(7,11,5,LEAVES);
        Block(7,13,-2,LEAVES);

//   wildnature mod 2019/07/30 20:56:00
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
