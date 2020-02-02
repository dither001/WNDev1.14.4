package com.matez.wildnature.world.gen.structures.nature.woods.boreal;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_bpine2 extends SchemFeature {
    public tree_bpine2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_bpine2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-1,7,0,LEAVES);
Block(-1,10,0,LEAVES);
Block(-1,11,0,LEAVES);
Block(-1,14,0,LEAVES);
Block(-1,15,0,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,0,LOG);
Block(0,2,0,LOG);
Block(0,3,0,LOG);
Block(0,4,0,LOG);
Block(0,5,0,LOG);
Block(0,6,0,LOG);
Block(0,7,0,LOG);
Block(0,7,1,LEAVES);
Block(0,8,-1,LEAVES);
Block(0,8,0,LOG);
Block(0,9,0,LOG);
Block(0,10,-1,LEAVES);
Block(0,10,0,LOG);
Block(0,10,1,LEAVES);
Block(0,11,0,LOG);
Block(0,12,-1,LEAVES);
Block(0,12,0,LOG);
Block(0,13,0,LOG);
Block(0,14,-1,LEAVES);
Block(0,14,0,LOG);
Block(0,15,-1,LEAVES);
Block(0,15,0,LOG);
Block(0,15,1,LEAVES);
Block(0,16,0,LEAVES);
Block(1,7,0,LEAVES);
Block(1,10,0,LEAVES);
Block(1,11,0,LEAVES);
Block(1,14,0,LEAVES);
Block(1,15,0,LEAVES);

//   wildnature mod 2019/07/30 20:55:28
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
