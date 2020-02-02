package com.matez.wildnature.world.gen.structures.nature.woods.bialowieza;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_bialowiezaTree6 extends SchemFeature {
    public tree_bialowiezaTree6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_bialowiezaTree6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-6,8,0,LEAVES);
Block(-5,8,-1,LEAVES);
Block(-5,8,0,LOG);
Block(-5,8,1,LEAVES);
Block(-5,9,0,LEAVES);
Block(-5,13,0,LEAVES);
Block(-5,16,1,LEAVES);
Block(-5,16,2,LEAVES);
Block(-4,8,1,LOG);
Block(-4,8,2,LEAVES);
Block(-4,9,-1,LEAVES);
Block(-4,9,0,LOG);
Block(-4,9,1,LEAVES);
Block(-4,10,0,LEAVES);
Block(-4,13,0,LOG);
Block(-4,13,1,LEAVES);
Block(-4,14,0,LEAVES);
Block(-4,15,2,LEAVES);
Block(-4,16,1,LEAVES);
Block(-4,16,2,LOG);
Block(-4,16,3,LEAVES);
Block(-4,17,1,LEAVES);
Block(-3,6,2,LEAVES);
Block(-3,9,-1,LEAVES);
Block(-3,10,0,LOG);
Block(-3,10,1,LEAVES);
Block(-3,13,-2,LEAVES);
Block(-3,14,-1,LEAVES);
Block(-3,14,0,LOG);
Block(-3,14,1,LEAVES);
Block(-3,15,0,LEAVES);
Block(-3,16,0,LEAVES);
Block(-3,16,1,LEAVES);
Block(-3,16,2,LEAVES);
Block(-3,17,0,LEAVES);
Block(-3,17,1,LOG);
Block(-3,17,2,LEAVES);
Block(-3,18,1,LEAVES);
Block(-2,6,1,LEAVES);
Block(-2,6,2,LOG);
Block(-2,6,3,LEAVES);
Block(-2,6,4,LEAVES);
Block(-2,7,2,LEAVES);
Block(-2,9,-2,LEAVES);
Block(-2,9,-1,LOG);
Block(-2,9,0,LOG);
Block(-2,9,1,LOG);
Block(-2,9,2,LEAVES);
Block(-2,10,0,LOG);
Block(-2,13,-3,LEAVES);
Block(-2,13,-2,LOG);
Block(-2,13,-1,LEAVES);
Block(-2,14,-4,LEAVES);
Block(-2,14,-2,LEAVES);
Block(-2,14,-1,LOG);
Block(-2,14,0,LOG);
Block(-2,14,1,LEAVES);
Block(-2,15,-3,LEAVES);
Block(-2,15,-1,LEAVES);
Block(-2,15,0,LEAVES);
Block(-2,16,1,LEAVES);
Block(-2,17,0,LEAVES);
Block(-2,17,1,LOG);
Block(-2,17,2,LEAVES);
Block(-2,18,0,LEAVES);
Block(-2,18,1,LEAVES);
Block(-1,6,-1,LEAVES);
Block(-1,6,2,LOG);
Block(-1,6,4,LOG);
Block(-1,6,5,LEAVES);
Block(-1,7,1,LEAVES);
Block(-1,7,2,LOG);
Block(-1,7,4,LEAVES);
Block(-1,8,2,LEAVES);
Block(-1,8,3,LEAVES);
Block(-1,10,-1,LEAVES);
Block(-1,10,0,LOG);
Block(-1,11,3,LEAVES);
Block(-1,11,4,LEAVES);
Block(-1,12,3,LEAVES);
Block(-1,13,-2,LEAVES);
Block(-1,13,3,LEAVES);
Block(-1,13,4,LEAVES);
Block(-1,14,-5,LEAVES);
Block(-1,14,-4,LOG);
Block(-1,14,0,LOG);
Block(-1,14,2,LEAVES);
Block(-1,15,-4,LEAVES);
Block(-1,15,-3,LOG);
Block(-1,15,0,LOG);
Block(-1,15,1,LEAVES);
Block(-1,16,-3,LEAVES);
Block(-1,16,-2,LEAVES);
Block(-1,18,-1,LEAVES);
Block(-1,18,0,LOG);
Block(-1,18,1,LOG);
Block(-1,18,2,LEAVES);
Block(-1,19,0,LEAVES);
Block(-1,19,1,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,0,LOG);
Block(0,2,0,LOG);
Block(0,3,0,LOG);
Block(0,4,0,LOG);
Block(0,5,-2,LEAVES);
Block(0,5,0,LOG);
Block(0,6,-2,LEAVES);
Block(0,6,-1,LOG);
Block(0,6,0,LOG);
Block(0,6,4,LEAVES);
Block(0,7,0,LOG);
Block(0,7,1,LOG);
Block(0,7,4,LOG);
Block(0,7,5,LEAVES);
Block(0,8,0,LOG);
Block(0,8,1,LOG);
Block(0,8,2,LOG);
Block(0,8,3,LEAVES);
Block(0,8,4,LEAVES);
Block(0,9,0,LOG);
Block(0,9,1,LOG);
Block(0,9,2,LEAVES);
Block(0,10,0,LOG);
Block(0,10,1,LEAVES);
Block(0,11,0,LOG);
Block(0,11,4,LOG);
Block(0,11,5,LEAVES);
Block(0,12,0,LOG);
Block(0,12,2,LEAVES);
Block(0,12,3,LOG);
Block(0,12,4,LEAVES);
Block(0,13,-3,LEAVES);
Block(0,13,0,LOG);
Block(0,13,2,LOG);
Block(0,13,3,LOG);
Block(0,13,4,LEAVES);
Block(0,14,-5,LEAVES);
Block(0,14,-4,LOG);
Block(0,14,-3,LOG);
Block(0,14,0,LOG);
Block(0,14,1,LOG);
Block(0,14,2,LOG);
Block(0,14,3,LEAVES);
Block(0,15,-4,LEAVES);
Block(0,15,-3,LOG);
Block(0,15,-2,LOG);
Block(0,15,0,LOG);
Block(0,15,1,LEAVES);
Block(0,15,2,LEAVES);
Block(0,16,-3,LEAVES);
Block(0,16,-2,LOG);
Block(0,16,-1,LOG);
Block(0,16,0,LOG);
Block(0,17,-2,LEAVES);
Block(0,17,0,LOG);
Block(0,18,-1,LEAVES);
Block(0,18,0,LOG);
Block(0,18,1,LEAVES);
Block(0,19,-1,LEAVES);
Block(0,19,0,LOG);
Block(0,19,1,LEAVES);
Block(0,20,0,LEAVES);
Block(1,5,-3,LEAVES);
Block(1,5,-2,LOG);
Block(1,6,-2,LEAVES);
Block(1,6,-1,LEAVES);
Block(1,6,1,LOG);
Block(1,7,1,LOG);
Block(1,7,4,LEAVES);
Block(1,7,5,LEAVES);
Block(1,8,1,LEAVES);
Block(1,8,3,LOG);
Block(1,8,4,LEAVES);
Block(1,9,3,LEAVES);
Block(1,10,-2,LEAVES);
Block(1,10,-1,LEAVES);
Block(1,11,-1,LEAVES);
Block(1,11,0,LOG);
Block(1,11,3,LEAVES);
Block(1,11,4,LEAVES);
Block(1,11,5,LEAVES);
Block(1,12,-1,LEAVES);
Block(1,12,0,LOG);
Block(1,12,1,LEAVES);
Block(1,12,2,LEAVES);
Block(1,12,3,LEAVES);
Block(1,12,4,LEAVES);
Block(1,13,2,LEAVES);
Block(1,13,3,LEAVES);
Block(1,14,-4,LEAVES);
Block(1,14,-3,LEAVES);
Block(1,14,1,LEAVES);
Block(1,14,2,LEAVES);
Block(1,15,-3,LEAVES);
Block(1,15,-2,LOG);
Block(1,16,-2,LEAVES);
Block(1,16,0,LOG);
Block(1,17,-1,LEAVES);
Block(1,17,0,LOG);
Block(1,17,1,LEAVES);
Block(1,18,0,LEAVES);
Block(2,5,-2,LEAVES);
Block(2,6,1,LEAVES);
Block(2,7,1,LEAVES);
Block(2,8,3,LEAVES);
Block(2,10,-2,LEAVES);
Block(2,10,-1,LEAVES);
Block(2,10,0,LOG);
Block(2,10,1,LEAVES);
Block(2,11,-1,LEAVES);
Block(2,11,0,LOG);
Block(2,11,1,LEAVES);
Block(2,12,0,LEAVES);
Block(2,12,3,LEAVES);
Block(2,15,-2,LEAVES);
Block(2,15,-1,LOG);
Block(2,15,0,LEAVES);
Block(2,15,1,LOG);
Block(2,15,2,LEAVES);
Block(2,16,-1,LEAVES);
Block(2,16,0,LOG);
Block(2,16,1,LEAVES);
Block(2,17,0,LEAVES);
Block(3,9,-1,LEAVES);
Block(3,10,-2,LEAVES);
Block(3,10,-1,LEAVES);
Block(3,10,0,LOG);
Block(3,10,1,LEAVES);
Block(3,11,0,LEAVES);
Block(3,14,0,LEAVES);
Block(3,15,-1,LEAVES);
Block(3,15,0,LOG);
Block(3,15,1,LEAVES);
Block(3,16,0,LEAVES);
Block(4,9,-2,LEAVES);
Block(4,9,-1,LOG);
Block(4,9,0,LEAVES);
Block(4,10,-1,LEAVES);
Block(4,10,0,LEAVES);
Block(4,15,0,LEAVES);
Block(5,9,-1,LEAVES);

//   wildnature mod 2019/07/30 20:47:58
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
