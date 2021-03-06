package com.matez.wildnature.world.gen.structures.nature.woods.larch;

import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_larch6 extends SchemFeature {
    public tree_larch6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
    }

    public tree_larch6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-4,2,0,LEAVES);
Block(-4,4,0,LEAVES);
Block(-3,2,-3,LEAVES);
Block(-3,2,3,LEAVES);
Block(-3,3,0,LEAVES);
Block(-3,4,-3,LEAVES);
Block(-3,4,3,LEAVES);
Block(-3,5,0,LEAVES);
Block(-3,6,-3,LEAVES);
Block(-3,6,3,LEAVES);
Block(-3,7,0,LEAVES);
Block(-3,9,0,LEAVES);
Block(-2,2,-2,LEAVES);
Block(-2,3,0,LEAVES);
Block(-2,3,2,LEAVES);
Block(-2,5,-2,LEAVES);
Block(-2,5,2,LEAVES);
Block(-2,6,0,LEAVES);
Block(-2,7,-2,LEAVES);
Block(-2,7,2,LEAVES);
Block(-2,8,0,LEAVES);
Block(-2,9,-2,LEAVES);
Block(-2,9,2,LEAVES);
Block(-2,10,0,LEAVES);
Block(-2,11,0,LEAVES);
Block(-2,13,0,LEAVES);
Block(-1,3,-1,LEAVES);
Block(-1,3,1,LEAVES);
Block(-1,4,0,LEAVES);
Block(-1,5,-1,LEAVES);
Block(-1,5,0,BRANCH);
Block(-1,5,1,LEAVES);
Block(-1,6,0,LEAVES);
Block(-1,7,-1,LEAVES);
Block(-1,7,0,BRANCH);
Block(-1,7,1,LEAVES);
Block(-1,8,0,LEAVES);
Block(-1,9,-1,LEAVES);
Block(-1,9,1,LEAVES);
Block(-1,10,0,LEAVES);
Block(-1,11,0,BRANCH);
Block(-1,12,0,LEAVES);
Block(-1,14,0,LEAVES);
Block(-1,15,0,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,0,LOG);
Block(0,2,-4,LEAVES);
Block(0,2,0,LOG);
Block(0,3,-3,LEAVES);
Block(0,3,-2,LEAVES);
Block(0,3,-1,BRANCH);
Block(0,3,0,LOG);
Block(0,3,1,BRANCH);
Block(0,3,2,LEAVES);
Block(0,3,3,LEAVES);
Block(0,4,-4,LEAVES);
Block(0,4,-1,LEAVES);
Block(0,4,0,LOG);
Block(0,4,1,LEAVES);
Block(0,5,-3,LEAVES);
Block(0,5,-2,LEAVES);
Block(0,5,-1,BRANCH);
Block(0,5,0,LOG);
Block(0,5,2,LEAVES);
Block(0,5,3,LEAVES);
Block(0,6,-1,LEAVES);
Block(0,6,0,LOG);
Block(0,6,1,LEAVES);
Block(0,6,3,LEAVES);
Block(0,7,-3,LEAVES);
Block(0,7,-2,LEAVES);
Block(0,7,-1,BRANCH);
Block(0,7,0,LOG);
Block(0,7,2,LEAVES);
Block(0,8,-1,LEAVES);
Block(0,8,0,LOG);
Block(0,8,1,LEAVES);
Block(0,8,3,LEAVES);
Block(0,9,-3,LEAVES);
Block(0,9,-1,BRANCH);
Block(0,9,0,LOG);
Block(0,9,1,LEAVES);
Block(0,9,2,LEAVES);
Block(0,10,-2,LEAVES);
Block(0,10,-1,LEAVES);
Block(0,10,0,LOG);
Block(0,10,1,BRANCH);
Block(0,10,2,LEAVES);
Block(0,11,-2,LEAVES);
Block(0,11,0,LOG);
Block(0,11,1,LEAVES);
Block(0,12,-1,LEAVES);
Block(0,12,0,LOG);
Block(0,12,1,BRANCH);
Block(0,12,2,LEAVES);
Block(0,13,-2,LEAVES);
Block(0,13,0,LOG);
Block(0,13,1,LEAVES);
Block(0,14,-1,LEAVES);
Block(0,14,0,LOG);
Block(0,14,1,LEAVES);
Block(0,15,-1,LEAVES);
Block(0,15,0,LEAVES);
Block(0,15,1,LEAVES);
Block(0,16,0,LEAVES);
Block(0,17,0,LEAVES);
Block(1,4,-1,LEAVES);
Block(1,4,0,BRANCH);
Block(1,4,1,LEAVES);
Block(1,5,0,LEAVES);
Block(1,6,-1,LEAVES);
Block(1,6,0,BRANCH);
Block(1,6,1,LEAVES);
Block(1,7,0,LEAVES);
Block(1,8,0,BRANCH);
Block(1,8,1,LEAVES);
Block(1,9,0,LEAVES);
Block(1,11,-1,LEAVES);
Block(1,11,0,BRANCH);
Block(1,11,1,LEAVES);
Block(1,12,0,LEAVES);
Block(1,13,0,BRANCH);
Block(1,14,0,LEAVES);
Block(1,15,0,LEAVES);
Block(2,3,2,LEAVES);
Block(2,4,-2,LEAVES);
Block(2,4,0,LEAVES);
Block(2,6,-2,LEAVES);
Block(2,6,2,LEAVES);
Block(2,7,0,LEAVES);
Block(2,8,2,LEAVES);
Block(2,9,0,LEAVES);
Block(2,10,-2,LEAVES);
Block(2,10,2,LEAVES);
Block(2,11,0,LEAVES);
Block(2,13,0,LEAVES);
Block(3,3,-3,LEAVES);
Block(3,3,3,LEAVES);
Block(3,4,0,LEAVES);
Block(3,5,-3,LEAVES);
Block(3,5,3,LEAVES);
Block(3,6,0,LEAVES);
Block(3,8,0,LEAVES);
Block(4,3,0,LEAVES);
Block(4,5,0,LEAVES);

//   wildnature mod 2019/08/01 13:33:50
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
