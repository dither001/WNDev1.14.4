package com.matez.wildnature.world.gen.structures.nature.woods.hornbeam;


import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_hornbeam7 extends SchemFeature {
    public tree_hornbeam7(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_hornbeam7(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-10,7,2,LEAVES);
Block(-9,5,3,LEAVES);
Block(-9,5,4,LEAVES);
Block(-9,6,2,LEAVES);
Block(-9,6,3,LEAVES);
Block(-9,6,5,LEAVES);
Block(-9,7,-2,LEAVES);
Block(-9,7,-1,LEAVES);
Block(-9,7,3,LEAVES);
Block(-9,9,1,LEAVES);
Block(-9,10,0,LEAVES);
Block(-8,4,4,LEAVES);
Block(-8,5,-4,LEAVES);
Block(-8,5,3,LEAVES);
Block(-8,5,4,LEAVES);
Block(-8,6,-5,LEAVES);
Block(-8,6,0,LEAVES);
Block(-8,6,6,LEAVES);
Block(-8,7,-6,LEAVES);
Block(-8,7,-5,LEAVES);
Block(-8,7,4,LEAVES);
Block(-8,7,5,LEAVES);
Block(-8,7,6,LEAVES);
Block(-8,8,-3,LEAVES);
Block(-8,8,-2,LEAVES);
Block(-8,8,-1,LEAVES);
Block(-8,8,1,LEAVES);
Block(-8,8,4,LEAVES);
Block(-8,8,5,LEAVES);
Block(-8,9,-4,LEAVES);
Block(-8,9,-1,LEAVES);
Block(-8,9,4,LEAVES);
Block(-8,10,-3,LEAVES);
Block(-8,10,-2,LEAVES);
Block(-8,10,-1,LEAVES);
Block(-7,4,-4,LEAVES);
Block(-7,4,1,LEAVES);
Block(-7,5,-6,LEAVES);
Block(-7,5,-4,LEAVES);
Block(-7,5,-3,LEAVES);
Block(-7,5,-2,LEAVES);
Block(-7,5,0,LEAVES);
Block(-7,6,-6,LEAVES);
Block(-7,6,-4,LEAVES);
Block(-7,6,-3,LEAVES);
Block(-7,6,0,LEAVES);
Block(-7,6,2,LEAVES);
Block(-7,6,6,LEAVES);
Block(-7,7,-5,LEAVES);
Block(-7,7,-2,LEAVES);
Block(-7,7,2,LEAVES);
Block(-7,8,-8,LEAVES);
Block(-7,8,-4,LEAVES);
Block(-7,8,-3,LEAVES);
Block(-7,8,-1,LEAVES);
Block(-7,8,0,LEAVES);
Block(-7,8,5,LEAVES);
Block(-7,9,-8,LEAVES);
Block(-7,9,-3,LEAVES);
Block(-7,9,2,LEAVES);
Block(-7,10,-5,LEAVES);
Block(-7,10,-4,LEAVES);
Block(-7,10,-3,LEAVES);
Block(-7,10,-2,LEAVES);
Block(-7,10,2,LEAVES);
Block(-7,10,3,LEAVES);
Block(-7,10,4,LEAVES);
Block(-7,11,-1,LEAVES);
Block(-7,11,1,LEAVES);
Block(-7,11,2,LEAVES);
Block(-7,12,0,LEAVES);
Block(-7,13,-1,LEAVES);
Block(-6,5,-1,LEAVES);
Block(-6,5,0,LEAVES);
Block(-6,5,1,LEAVES);
Block(-6,6,-8,LEAVES);
Block(-6,6,-7,LEAVES);
Block(-6,6,-6,LEAVES);
Block(-6,6,-2,LEAVES);
Block(-6,6,1,LEAVES);
Block(-6,6,2,LEAVES);
Block(-6,6,5,LEAVES);
Block(-6,7,-4,LEAVES);
Block(-6,7,-3,LEAVES);
Block(-6,7,-2,LEAVES);
Block(-6,7,-1,LEAVES);
Block(-6,7,0,LEAVES);
Block(-6,7,2,LEAVES);
Block(-6,7,4,LEAVES);
Block(-6,7,5,LEAVES);
Block(-6,7,7,LEAVES);
Block(-6,8,-5,LEAVES);
Block(-6,8,-3,LEAVES);
Block(-6,8,1,LEAVES);
Block(-6,8,6,LEAVES);
Block(-6,9,-7,LEAVES);
Block(-6,9,-5,LEAVES);
Block(-6,9,-3,LEAVES);
Block(-6,9,-1,LEAVES);
Block(-6,9,2,LEAVES);
Block(-6,9,7,LEAVES);
Block(-6,10,-7,LEAVES);
Block(-6,10,-6,LEAVES);
Block(-6,10,-3,LEAVES);
Block(-6,10,2,LEAVES);
Block(-6,10,4,LEAVES);
Block(-6,10,5,LEAVES);
Block(-6,11,-5,LEAVES);
Block(-6,11,-4,LEAVES);
Block(-6,11,1,LEAVES);
Block(-6,11,4,LEAVES);
Block(-6,12,-3,LEAVES);
Block(-6,12,-2,LEAVES);
Block(-6,12,0,LEAVES);
Block(-6,13,-3,LEAVES);
Block(-5,4,-6,LEAVES);
Block(-5,5,-7,LEAVES);
Block(-5,5,-5,LEAVES);
Block(-5,5,-3,LEAVES);
Block(-5,5,-2,LEAVES);
Block(-5,5,3,LEAVES);
Block(-5,5,4,LEAVES);
Block(-5,5,7,LEAVES);
Block(-5,6,-10,LEAVES);
Block(-5,6,-3,LEAVES);
Block(-5,6,-2,LEAVES);
Block(-5,6,0,LEAVES);
Block(-5,6,2,LEAVES);
Block(-5,6,5,LEAVES);
Block(-5,6,7,LEAVES);
Block(-5,7,-9,LEAVES);
Block(-5,7,-4,LEAVES);
Block(-5,7,-2,LEAVES);
Block(-5,7,-1,LEAVES);
Block(-5,7,0,LEAVES);
Block(-5,7,2,LEAVES);
Block(-5,7,6,LEAVES);
Block(-5,7,7,LEAVES);
Block(-5,8,-7,LEAVES);
Block(-5,8,-5,LEAVES);
Block(-5,8,-2,LEAVES);
Block(-5,8,1,LEAVES);
Block(-5,8,2,LEAVES);
Block(-5,8,4,LEAVES);
Block(-5,8,5,LEAVES);
Block(-5,8,6,LEAVES);
Block(-5,9,-6,LEAVES);
Block(-5,9,0,LEAVES);
Block(-5,9,1,LEAVES);
Block(-5,9,5,LEAVES);
Block(-5,9,6,LEAVES);
Block(-5,9,8,LEAVES);
Block(-5,10,-6,LEAVES);
Block(-5,10,-5,LEAVES);
Block(-5,10,-4,LEAVES);
Block(-5,10,-3,LEAVES);
Block(-5,10,-1,LEAVES);
Block(-5,10,2,LEAVES);
Block(-5,10,4,LEAVES);
Block(-5,10,5,LEAVES);
Block(-5,10,7,LEAVES);
Block(-5,11,-3,LEAVES);
Block(-5,11,1,LEAVES);
Block(-5,11,3,LEAVES);
Block(-5,11,5,LEAVES);
Block(-5,12,-2,LEAVES);
Block(-5,12,1,LEAVES);
Block(-5,12,2,LEAVES);
Block(-5,12,3,LEAVES);
Block(-5,13,-2,LEAVES);
Block(-5,13,-1,LEAVES);
Block(-5,13,1,LEAVES);
Block(-5,13,4,LEAVES);
Block(-4,4,6,LEAVES);
Block(-4,4,8,LEAVES);
Block(-4,5,-10,LEAVES);
Block(-4,5,-9,LEAVES);
Block(-4,5,-5,LEAVES);
Block(-4,5,-4,LEAVES);
Block(-4,5,1,LEAVES);
Block(-4,5,2,LEAVES);
Block(-4,5,9,LEAVES);
Block(-4,6,-10,LEAVES);
Block(-4,6,-7,LEAVES);
Block(-4,6,-6,LEAVES);
Block(-4,6,3,LEAVES);
Block(-4,6,6,LEAVES);
Block(-4,7,-5,LEAVES);
Block(-4,7,-2,LEAVES);
Block(-4,7,0,LEAVES);
Block(-4,7,1,LEAVES);
Block(-4,7,3,LEAVES);
Block(-4,7,6,LEAVES);
Block(-4,7,8,LEAVES);
Block(-4,7,9,LEAVES);
Block(-4,8,-8,LEAVES);
Block(-4,8,-6,LEAVES);
Block(-4,8,-2,LEAVES);
Block(-4,8,-1,LEAVES);
Block(-4,8,2,LEAVES);
Block(-4,8,3,LEAVES);
Block(-4,8,4,LEAVES);
Block(-4,8,6,LEAVES);
Block(-4,8,7,LEAVES);
Block(-4,9,-4,LEAVES);
Block(-4,9,2,LEAVES);
Block(-4,9,8,LEAVES);
Block(-4,10,-7,LEAVES);
Block(-4,10,-5,LEAVES);
Block(-4,10,0,LEAVES);
Block(-4,10,1,LEAVES);
Block(-4,10,5,LEAVES);
Block(-4,10,7,LEAVES);
Block(-4,11,-4,LEAVES);
Block(-4,11,-2,LEAVES);
Block(-4,11,-1,LEAVES);
Block(-4,11,6,LEAVES);
Block(-4,12,-4,LEAVES);
Block(-4,12,-2,LEAVES);
Block(-4,12,1,LEAVES);
Block(-4,12,2,LEAVES);
Block(-4,12,6,LEAVES);
Block(-4,13,-5,LEAVES);
Block(-4,13,-2,LEAVES);
Block(-4,13,-1,LEAVES);
Block(-4,13,1,LEAVES);
Block(-4,13,4,LEAVES);
Block(-4,13,5,LEAVES);
Block(-4,13,6,LEAVES);
Block(-4,14,-2,LEAVES);
Block(-4,14,4,LEAVES);
Block(-4,15,1,LEAVES);
Block(-3,4,6,LEAVES);
Block(-3,4,8,LEAVES);
Block(-3,5,-9,LEAVES);
Block(-3,5,7,LEAVES);
Block(-3,5,8,LEAVES);
Block(-3,6,-9,LEAVES);
Block(-3,6,-5,LEAVES);
Block(-3,6,5,LEAVES);
Block(-3,6,7,LEAVES);
Block(-3,6,8,LEAVES);
Block(-3,7,-9,LEAVES);
Block(-3,7,-6,LEAVES);
Block(-3,7,-4,LEAVES);
Block(-3,7,-3,LEAVES);
Block(-3,7,9,LEAVES);
Block(-3,8,-7,LEAVES);
Block(-3,8,-6,LEAVES);
Block(-3,8,-5,LEAVES);
Block(-3,8,-4,LEAVES);
Block(-3,8,-3,LEAVES);
Block(-3,8,-1,LEAVES);
Block(-3,8,5,LEAVES);
Block(-3,8,7,LEAVES);
Block(-3,8,9,LEAVES);
Block(-3,9,-8,LEAVES);
Block(-3,9,-7,LEAVES);
Block(-3,9,6,LEAVES);
Block(-3,9,7,LEAVES);
Block(-3,9,9,LEAVES);
Block(-3,9,10,LEAVES);
Block(-3,10,-8,LEAVES);
Block(-3,10,-7,LEAVES);
Block(-3,10,-6,LEAVES);
Block(-3,10,-5,LEAVES);
Block(-3,10,-4,LEAVES);
Block(-3,10,-3,LEAVES);
Block(-3,10,-2,LEAVES);
Block(-3,10,-1,LEAVES);
Block(-3,11,-8,LEAVES);
Block(-3,11,-6,LEAVES);
Block(-3,11,2,LEAVES);
Block(-3,11,6,LEAVES);
Block(-3,11,7,LEAVES);
Block(-3,12,-5,LEAVES);
Block(-3,12,-3,LEAVES);
Block(-3,12,-2,LEAVES);
Block(-3,12,-1,LEAVES);
Block(-3,12,0,LEAVES);
Block(-3,12,1,LEAVES);
Block(-3,12,2,LEAVES);
Block(-3,12,3,LEAVES);
Block(-3,12,4,LOG);
Block(-3,12,5,LEAVES);
Block(-3,12,6,LEAVES);
Block(-3,13,-6,LEAVES);
Block(-3,13,-5,LEAVES);
Block(-3,13,-4,LEAVES);
Block(-3,13,-3,LEAVES);
Block(-3,13,0,LEAVES);
Block(-3,13,5,LEAVES);
Block(-3,14,-4,LEAVES);
Block(-3,14,-3,LEAVES);
Block(-3,14,1,LEAVES);
Block(-3,15,-1,LEAVES);
Block(-3,15,0,LEAVES);
Block(-3,15,1,LEAVES);
Block(-3,16,-2,LEAVES);
Block(-3,16,-1,LEAVES);
Block(-3,16,1,LEAVES);
Block(-2,1,-2,LOG);
Block(-2,4,6,LEAVES);
Block(-2,4,8,LEAVES);
Block(-2,5,-9,LEAVES);
Block(-2,5,-8,LEAVES);
Block(-2,5,5,LEAVES);
Block(-2,5,6,LEAVES);
Block(-2,5,9,LEAVES);
Block(-2,6,-9,LEAVES);
Block(-2,6,-8,LEAVES);
Block(-2,6,-7,LEAVES);
Block(-2,6,-6,LEAVES);
Block(-2,6,9,LEAVES);
Block(-2,6,10,LEAVES);
Block(-2,7,-6,LEAVES);
Block(-2,7,7,LEAVES);
Block(-2,7,8,LEAVES);
Block(-2,7,9,LEAVES);
Block(-2,8,-7,LEAVES);
Block(-2,8,-5,LEAVES);
Block(-2,8,-4,LEAVES);
Block(-2,8,0,LEAVES);
Block(-2,8,6,LEAVES);
Block(-2,8,7,LEAVES);
Block(-2,8,9,LEAVES);
Block(-2,8,10,LEAVES);
Block(-2,9,-9,LEAVES);
Block(-2,9,-7,LEAVES);
Block(-2,9,-4,LEAVES);
Block(-2,9,-2,LEAVES);
Block(-2,9,0,LEAVES);
Block(-2,9,1,LEAVES);
Block(-2,9,4,LEAVES);
Block(-2,9,6,LEAVES);
Block(-2,9,7,LEAVES);
Block(-2,10,-8,LEAVES);
Block(-2,10,-3,LEAVES);
Block(-2,10,3,LEAVES);
Block(-2,10,4,LOG);
Block(-2,10,6,LEAVES);
Block(-2,10,7,LEAVES);
Block(-2,11,-3,LEAVES);
Block(-2,11,1,LEAVES);
Block(-2,11,2,LEAVES);
Block(-2,11,3,LEAVES);
Block(-2,11,4,LOG);
Block(-2,11,6,LEAVES);
Block(-2,11,7,LEAVES);
Block(-2,11,8,LEAVES);
Block(-2,12,-4,LEAVES);
Block(-2,12,1,LEAVES);
Block(-2,12,5,LEAVES);
Block(-2,12,6,LEAVES);
Block(-2,13,-6,LEAVES);
Block(-2,13,-3,LEAVES);
Block(-2,13,-1,LEAVES);
Block(-2,13,2,LEAVES);
Block(-2,13,3,LEAVES);
Block(-2,13,4,LEAVES);
Block(-2,13,5,LEAVES);
Block(-2,14,-1,LEAVES);
Block(-2,14,0,LEAVES);
Block(-2,14,2,LEAVES);
Block(-2,14,4,LEAVES);
Block(-2,14,5,LEAVES);
Block(-2,15,-3,LEAVES);
Block(-2,15,-1,LEAVES);
Block(-2,15,2,LEAVES);
Block(-2,16,-4,LEAVES);
Block(-2,16,0,LEAVES);
Block(-2,16,1,LEAVES);
Block(-1,1,-2,LOG);
Block(-1,1,-1,LOG);
Block(-1,1,0,LOG);
Block(-1,1,2,LOG);
Block(-1,2,-2,LOG);
Block(-1,2,-1,LOG);
Block(-1,3,-1,LOG);
Block(-1,5,9,LEAVES);
Block(-1,5,10,LEAVES);
Block(-1,6,6,LEAVES);
Block(-1,6,7,LEAVES);
Block(-1,7,-8,LEAVES);
Block(-1,7,-6,LEAVES);
Block(-1,7,2,LOG);
Block(-1,7,5,LEAVES);
Block(-1,7,6,LEAVES);
Block(-1,7,9,LEAVES);
Block(-1,8,-9,LEAVES);
Block(-1,8,-8,LEAVES);
Block(-1,8,-3,LEAVES);
Block(-1,8,-2,LEAVES);
Block(-1,8,3,LOG);
Block(-1,8,5,LEAVES);
Block(-1,8,6,LEAVES);
Block(-1,8,8,LEAVES);
Block(-1,8,9,LEAVES);
Block(-1,9,-2,LEAVES);
Block(-1,9,0,LEAVES);
Block(-1,9,3,LOG);
Block(-1,9,4,LEAVES);
Block(-1,9,5,LEAVES);
Block(-1,9,8,LEAVES);
Block(-1,9,9,LEAVES);
Block(-1,10,-9,LEAVES);
Block(-1,10,-8,LEAVES);
Block(-1,10,-7,LEAVES);
Block(-1,10,-4,LOG);
Block(-1,10,3,LEAVES);
Block(-1,10,5,LEAVES);
Block(-1,10,6,LEAVES);
Block(-1,10,10,LEAVES);
Block(-1,11,-9,LEAVES);
Block(-1,11,-8,LEAVES);
Block(-1,11,-6,LEAVES);
Block(-1,11,-5,LOG);
Block(-1,11,-4,LEAVES);
Block(-1,11,-1,LEAVES);
Block(-1,11,0,LEAVES);
Block(-1,11,1,LEAVES);
Block(-1,11,5,LEAVES);
Block(-1,11,7,LEAVES);
Block(-1,12,-8,LEAVES);
Block(-1,12,-7,LEAVES);
Block(-1,12,-6,LOG);
Block(-1,12,0,LEAVES);
Block(-1,12,1,LEAVES);
Block(-1,12,2,LEAVES);
Block(-1,12,4,LEAVES);
Block(-1,13,-6,LEAVES);
Block(-1,13,-4,LEAVES);
Block(-1,13,-3,LEAVES);
Block(-1,13,-2,LEAVES);
Block(-1,13,0,LEAVES);
Block(-1,13,1,LEAVES);
Block(-1,13,2,LEAVES);
Block(-1,14,-5,LEAVES);
Block(-1,14,5,LEAVES);
Block(-1,15,0,LEAVES);
Block(-1,16,-3,LEAVES);
Block(-1,16,-1,LEAVES);
Block(-1,16,0,LEAVES);
Block(-1,17,-3,LEAVES);
Block(-1,17,-2,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,-2,LOG);
Block(0,1,-1,LOG);
Block(0,1,0,LOG);
Block(0,1,1,LOG);
Block(0,2,-2,LOG);
Block(0,2,-1,LOG);
Block(0,2,0,LOG);
Block(0,2,1,LOG);
Block(0,3,-2,LOG);
Block(0,3,-1,LOG);
Block(0,3,0,LOG);
Block(0,4,-9,LEAVES);
Block(0,4,-8,LEAVES);
Block(0,4,-1,LOG);
Block(0,4,0,LOG);
Block(0,4,7,LEAVES);
Block(0,5,-10,LEAVES);
Block(0,5,-8,LEAVES);
Block(0,5,0,LOG);
Block(0,6,-10,LEAVES);
Block(0,6,-1,LOG);
Block(0,6,1,LOG);
Block(0,6,6,LEAVES);
Block(0,6,7,LEAVES);
Block(0,6,8,LEAVES);
Block(0,6,9,LEAVES);
Block(0,7,-10,LEAVES);
Block(0,7,-9,LEAVES);
Block(0,7,-7,LEAVES);
Block(0,7,-6,LEAVES);
Block(0,7,-2,LOG);
Block(0,7,-1,LOG);
Block(0,7,1,LOG);
Block(0,7,2,LOG);
Block(0,7,8,LEAVES);
Block(0,8,-8,LEAVES);
Block(0,8,-7,LEAVES);
Block(0,8,-5,LEAVES);
Block(0,8,-2,LOG);
Block(0,8,6,LEAVES);
Block(0,8,9,LEAVES);
Block(0,9,-10,LEAVES);
Block(0,9,-7,LEAVES);
Block(0,9,-6,LEAVES);
Block(0,9,-3,LOG);
Block(0,9,0,LEAVES);
Block(0,9,1,LEAVES);
Block(0,9,5,LEAVES);
Block(0,9,7,LEAVES);
Block(0,9,8,LEAVES);
Block(0,10,-6,LEAVES);
Block(0,10,-4,LEAVES);
Block(0,10,-1,LEAVES);
Block(0,10,0,LEAVES);
Block(0,10,1,LEAVES);
Block(0,10,5,LEAVES);
Block(0,10,6,LEAVES);
Block(0,10,7,LEAVES);
Block(0,10,9,LEAVES);
Block(0,11,-1,LEAVES);
Block(0,11,0,LEAVES);
Block(0,11,1,LEAVES);
Block(0,11,5,LEAVES);
Block(0,11,6,LEAVES);
Block(0,11,7,LEAVES);
Block(0,11,8,LEAVES);
Block(0,12,-9,LEAVES);
Block(0,12,-8,LEAVES);
Block(0,12,-4,LEAVES);
Block(0,12,-2,LEAVES);
Block(0,12,-1,LEAVES);
Block(0,12,1,LEAVES);
Block(0,12,2,LEAVES);
Block(0,12,4,LEAVES);
Block(0,12,5,LEAVES);
Block(0,12,6,LEAVES);
Block(0,12,7,LEAVES);
Block(0,13,-7,LEAVES);
Block(0,13,1,LEAVES);
Block(0,13,2,LEAVES);
Block(0,13,3,LEAVES);
Block(0,13,4,LEAVES);
Block(0,14,-5,LEAVES);
Block(0,14,-3,LEAVES);
Block(0,14,2,LEAVES);
Block(0,14,5,LEAVES);
Block(0,15,-3,LEAVES);
Block(0,15,1,LEAVES);
Block(0,15,2,LEAVES);
Block(0,16,1,LEAVES);
Block(0,17,-1,LEAVES);
Block(1,1,-1,LOG);
Block(1,1,0,LOG);
Block(1,2,-1,LOG);
Block(1,2,0,LOG);
Block(1,3,-1,LOG);
Block(1,3,0,LOG);
Block(1,4,-10,LEAVES);
Block(1,4,-9,LEAVES);
Block(1,4,-1,LOG);
Block(1,4,0,LOG);
Block(1,5,-10,LEAVES);
Block(1,5,-8,LEAVES);
Block(1,5,-1,LOG);
Block(1,5,0,LOG);
Block(1,5,1,LOG);
Block(1,5,8,LEAVES);
Block(1,5,9,LEAVES);
Block(1,6,-8,LEAVES);
Block(1,6,-7,LEAVES);
Block(1,6,-6,LEAVES);
Block(1,6,-1,LOG);
Block(1,6,0,LOG);
Block(1,6,1,LOG);
Block(1,6,5,LEAVES);
Block(1,6,7,LEAVES);
Block(1,6,8,LEAVES);
Block(1,7,-7,LEAVES);
Block(1,7,-6,LEAVES);
Block(1,7,4,LEAVES);
Block(1,7,6,LEAVES);
Block(1,7,9,LEAVES);
Block(1,8,-6,LEAVES);
Block(1,8,-5,LEAVES);
Block(1,8,9,LEAVES);
Block(1,8,10,LEAVES);
Block(1,9,-10,LEAVES);
Block(1,9,-8,LEAVES);
Block(1,9,-5,LEAVES);
Block(1,9,2,LEAVES);
Block(1,9,4,LEAVES);
Block(1,9,8,LEAVES);
Block(1,9,9,LEAVES);
Block(1,10,-4,LEAVES);
Block(1,10,1,LEAVES);
Block(1,10,2,LEAVES);
Block(1,10,6,LEAVES);
Block(1,10,8,LEAVES);
Block(1,10,10,LEAVES);
Block(1,11,-1,LEAVES);
Block(1,11,5,LEAVES);
Block(1,11,7,LEAVES);
Block(1,11,8,LEAVES);
Block(1,12,-8,LEAVES);
Block(1,12,-6,LEAVES);
Block(1,12,-3,LEAVES);
Block(1,12,3,LEAVES);
Block(1,12,4,LEAVES);
Block(1,12,7,LEAVES);
Block(1,13,-2,LEAVES);
Block(1,13,2,LEAVES);
Block(1,13,3,LEAVES);
Block(1,13,5,LEAVES);
Block(1,14,-5,LEAVES);
Block(1,14,-1,LEAVES);
Block(1,14,0,LEAVES);
Block(1,14,4,LEAVES);
Block(1,14,5,LEAVES);
Block(1,15,-5,LEAVES);
Block(1,15,1,LEAVES);
Block(1,15,3,LEAVES);
Block(1,15,4,LEAVES);
Block(1,16,-5,LEAVES);
Block(1,16,-4,LEAVES);
Block(1,16,1,LEAVES);
Block(1,16,2,LEAVES);
Block(1,17,-3,LEAVES);
Block(1,17,-2,LEAVES);
Block(1,17,-1,LEAVES);
Block(2,1,-1,LOG);
Block(2,2,-1,LOG);
Block(2,5,-9,LEAVES);
Block(2,5,-8,LEAVES);
Block(2,5,8,LEAVES);
Block(2,6,-9,LEAVES);
Block(2,6,0,LOG);
Block(2,6,1,LOG);
Block(2,6,8,LEAVES);
Block(2,7,-8,LEAVES);
Block(2,7,-6,LEAVES);
Block(2,7,6,LEAVES);
Block(2,7,8,LEAVES);
Block(2,7,9,LEAVES);
Block(2,8,-10,LEAVES);
Block(2,8,-9,LEAVES);
Block(2,8,3,LEAVES);
Block(2,8,10,LEAVES);
Block(2,9,-6,LEAVES);
Block(2,9,5,LEAVES);
Block(2,9,9,LEAVES);
Block(2,10,-8,LEAVES);
Block(2,10,-7,LEAVES);
Block(2,10,-5,LEAVES);
Block(2,10,-3,LEAVES);
Block(2,10,5,LEAVES);
Block(2,11,-6,LEAVES);
Block(2,11,0,LEAVES);
Block(2,11,2,LEAVES);
Block(2,11,6,LEAVES);
Block(2,11,8,LEAVES);
Block(2,12,-6,LEAVES);
Block(2,12,-4,LEAVES);
Block(2,12,-2,LEAVES);
Block(2,12,-1,LEAVES);
Block(2,12,3,LEAVES);
Block(2,12,4,LEAVES);
Block(2,12,5,LEAVES);
Block(2,12,6,LEAVES);
Block(2,12,7,LEAVES);
Block(2,13,-6,LEAVES);
Block(2,13,1,LEAVES);
Block(2,13,2,LEAVES);
Block(2,13,4,LEAVES);
Block(2,14,-2,LEAVES);
Block(2,14,-1,LEAVES);
Block(2,14,0,LEAVES);
Block(2,14,2,LEAVES);
Block(2,15,-3,LEAVES);
Block(2,15,-2,LEAVES);
Block(2,16,-5,LEAVES);
Block(2,16,-3,LEAVES);
Block(2,16,-2,LEAVES);
Block(2,17,-1,LEAVES);
Block(3,5,-5,LEAVES);
Block(3,6,-9,LEAVES);
Block(3,6,-6,LEAVES);
Block(3,6,-5,LEAVES);
Block(3,6,7,LEAVES);
Block(3,6,9,LEAVES);
Block(3,7,-10,LEAVES);
Block(3,7,1,LOG);
Block(3,7,3,LEAVES);
Block(3,7,4,LEAVES);
Block(3,7,5,LEAVES);
Block(3,7,6,LEAVES);
Block(3,7,7,LEAVES);
Block(3,7,8,LEAVES);
Block(3,8,-8,LEAVES);
Block(3,8,-7,LEAVES);
Block(3,8,-5,LEAVES);
Block(3,8,7,LEAVES);
Block(3,9,-10,LEAVES);
Block(3,9,-9,LEAVES);
Block(3,9,-7,LEAVES);
Block(3,9,-4,LEAVES);
Block(3,9,5,LEAVES);
Block(3,9,8,LEAVES);
Block(3,9,10,LEAVES);
Block(3,10,-9,LEAVES);
Block(3,10,-7,LEAVES);
Block(3,10,-5,LEAVES);
Block(3,10,-2,LEAVES);
Block(3,10,5,LEAVES);
Block(3,10,6,LEAVES);
Block(3,10,7,LEAVES);
Block(3,11,-9,LEAVES);
Block(3,11,-7,LEAVES);
Block(3,11,-5,LEAVES);
Block(3,11,-3,LEAVES);
Block(3,11,-2,LEAVES);
Block(3,11,-1,LEAVES);
Block(3,11,2,LEAVES);
Block(3,12,-4,LEAVES);
Block(3,12,-2,LEAVES);
Block(3,12,-1,LEAVES);
Block(3,12,3,LEAVES);
Block(3,12,5,LEAVES);
Block(3,12,7,LEAVES);
Block(3,13,-6,LEAVES);
Block(3,13,-1,LEAVES);
Block(3,14,-4,LEAVES);
Block(3,14,-2,LEAVES);
Block(3,14,0,LEAVES);
Block(3,14,2,LEAVES);
Block(3,14,3,LEAVES);
Block(3,15,-3,LEAVES);
Block(3,15,2,LEAVES);
Block(3,16,-4,LEAVES);
Block(3,16,-3,LEAVES);
Block(3,16,0,LEAVES);
Block(3,16,2,LEAVES);
Block(4,4,-5,LEAVES);
Block(4,4,7,LEAVES);
Block(4,6,-4,LEAVES);
Block(4,6,6,LEAVES);
Block(4,6,7,LEAVES);
Block(4,7,-8,LEAVES);
Block(4,7,-7,LEAVES);
Block(4,7,-4,LEAVES);
Block(4,7,2,LEAVES);
Block(4,7,8,LEAVES);
Block(4,7,9,LEAVES);
Block(4,7,10,LEAVES);
Block(4,8,-8,LEAVES);
Block(4,8,-6,LEAVES);
Block(4,8,-3,LEAVES);
Block(4,8,-1,LEAVES);
Block(4,8,1,LOG);
Block(4,8,2,LEAVES);
Block(4,8,3,LEAVES);
Block(4,8,5,LEAVES);
Block(4,9,-9,LEAVES);
Block(4,9,2,LOG);
Block(4,9,4,LEAVES);
Block(4,9,5,LEAVES);
Block(4,9,9,LEAVES);
Block(4,10,-9,LEAVES);
Block(4,10,-5,LEAVES);
Block(4,10,-3,LEAVES);
Block(4,10,-2,LEAVES);
Block(4,10,-1,LEAVES);
Block(4,10,1,LEAVES);
Block(4,10,2,LEAVES);
Block(4,10,3,LEAVES);
Block(4,10,5,LEAVES);
Block(4,10,6,LEAVES);
Block(4,10,9,LEAVES);
Block(4,11,-5,LEAVES);
Block(4,11,0,LEAVES);
Block(4,11,5,LEAVES);
Block(4,12,-5,LEAVES);
Block(4,12,1,LEAVES);
Block(4,12,3,LEAVES);
Block(4,13,1,LEAVES);
Block(4,13,2,LEAVES);
Block(4,13,4,LEAVES);
Block(4,14,-3,LEAVES);
Block(4,14,-2,LEAVES);
Block(4,14,-1,LEAVES);
Block(4,14,0,LEAVES);
Block(4,14,1,LEAVES);
Block(4,15,-2,LEAVES);
Block(4,15,-1,LEAVES);
Block(5,5,-8,LEAVES);
Block(5,5,-7,LEAVES);
Block(5,5,-4,LEAVES);
Block(5,5,-3,LEAVES);
Block(5,5,4,LEAVES);
Block(5,5,5,LEAVES);
Block(5,5,7,LEAVES);
Block(5,5,9,LEAVES);
Block(5,6,-5,LEAVES);
Block(5,6,-3,LEAVES);
Block(5,6,1,LEAVES);
Block(5,6,2,LEAVES);
Block(5,6,4,LEAVES);
Block(5,6,7,LEAVES);
Block(5,6,9,LEAVES);
Block(5,6,10,LEAVES);
Block(5,7,-6,LEAVES);
Block(5,7,-1,LEAVES);
Block(5,7,1,LEAVES);
Block(5,7,2,LEAVES);
Block(5,7,7,LEAVES);
Block(5,7,8,LEAVES);
Block(5,7,9,LEAVES);
Block(5,7,10,LEAVES);
Block(5,8,-9,LEAVES);
Block(5,8,-5,LEAVES);
Block(5,8,-3,LEAVES);
Block(5,8,-2,LEAVES);
Block(5,8,2,LEAVES);
Block(5,8,3,LEAVES);
Block(5,8,4,LEAVES);
Block(5,8,5,LEAVES);
Block(5,8,7,LEAVES);
Block(5,8,9,LEAVES);
Block(5,9,-8,LEAVES);
Block(5,9,-7,LEAVES);
Block(5,9,-5,LEAVES);
Block(5,9,-2,LEAVES);
Block(5,9,3,LEAVES);
Block(5,9,4,LEAVES);
Block(5,10,-7,LEAVES);
Block(5,10,-5,LEAVES);
Block(5,10,-4,LEAVES);
Block(5,10,-3,LEAVES);
Block(5,10,-1,LEAVES);
Block(5,10,2,LOG);
Block(5,10,5,LEAVES);
Block(5,10,8,LEAVES);
Block(5,11,-6,LEAVES);
Block(5,11,-2,LEAVES);
Block(5,11,0,LEAVES);
Block(5,11,2,LEAVES);
Block(5,11,3,LEAVES);
Block(5,11,4,LEAVES);
Block(5,11,7,LEAVES);
Block(5,12,-4,LEAVES);
Block(5,12,4,LEAVES);
Block(5,12,6,LEAVES);
Block(5,13,-4,LEAVES);
Block(5,13,-1,LEAVES);
Block(5,13,2,LEAVES);
Block(5,14,-4,LEAVES);
Block(5,14,-3,LEAVES);
Block(5,14,1,LEAVES);
Block(5,14,2,LEAVES);
Block(5,15,-2,LEAVES);
Block(5,16,0,LEAVES);
Block(6,4,-6,LEAVES);
Block(6,4,-5,LEAVES);
Block(6,5,-4,LEAVES);
Block(6,5,-3,LEAVES);
Block(6,5,-2,LEAVES);
Block(6,5,6,LEAVES);
Block(6,6,-7,LEAVES);
Block(6,6,-5,LEAVES);
Block(6,6,-4,LEAVES);
Block(6,6,-1,LEAVES);
Block(6,6,0,LEAVES);
Block(6,7,-8,LEAVES);
Block(6,7,-6,LEAVES);
Block(6,7,-5,LEAVES);
Block(6,7,-4,LEAVES);
Block(6,7,-3,LEAVES);
Block(6,7,-2,LEAVES);
Block(6,7,1,LEAVES);
Block(6,7,4,LEAVES);
Block(6,8,-8,LEAVES);
Block(6,8,-5,LEAVES);
Block(6,8,-1,LEAVES);
Block(6,8,0,LEAVES);
Block(6,8,5,LEAVES);
Block(6,8,6,LEAVES);
Block(6,8,8,LEAVES);
Block(6,9,-7,LEAVES);
Block(6,9,-4,LEAVES);
Block(6,9,-3,LEAVES);
Block(6,9,1,LEAVES);
Block(6,9,7,LEAVES);
Block(6,9,8,LEAVES);
Block(6,9,9,LEAVES);
Block(6,10,-7,LEAVES);
Block(6,10,-6,LEAVES);
Block(6,10,-5,LEAVES);
Block(6,10,-3,LEAVES);
Block(6,10,2,LOG);
Block(6,10,7,LEAVES);
Block(6,11,-5,LEAVES);
Block(6,11,-4,LEAVES);
Block(6,11,-2,LEAVES);
Block(6,11,0,LEAVES);
Block(6,11,1,LEAVES);
Block(6,11,5,LEAVES);
Block(6,11,7,LEAVES);
Block(6,12,-3,LEAVES);
Block(6,12,4,LEAVES);
Block(6,12,5,LEAVES);
Block(6,13,1,LEAVES);
Block(6,13,2,LEAVES);
Block(6,14,-2,LEAVES);
Block(6,14,1,LEAVES);
Block(6,15,-1,LEAVES);
Block(6,15,0,LEAVES);
Block(6,15,1,LEAVES);
Block(7,4,-3,LEAVES);
Block(7,5,-6,LEAVES);
Block(7,5,0,LEAVES);
Block(7,5,3,LEAVES);
Block(7,5,6,LEAVES);
Block(7,5,7,LEAVES);
Block(7,6,-7,LEAVES);
Block(7,6,0,LEAVES);
Block(7,6,2,LEAVES);
Block(7,6,3,LEAVES);
Block(7,6,8,LEAVES);
Block(7,7,2,LEAVES);
Block(7,7,6,LEAVES);
Block(7,7,8,LEAVES);
Block(7,8,-5,LEAVES);
Block(7,8,-2,LEAVES);
Block(7,8,3,LEAVES);
Block(7,8,4,LEAVES);
Block(7,8,5,LEAVES);
Block(7,8,6,LEAVES);
Block(7,8,8,LEAVES);
Block(7,9,-7,LEAVES);
Block(7,9,-6,LEAVES);
Block(7,9,-3,LEAVES);
Block(7,9,-2,LEAVES);
Block(7,9,-1,LEAVES);
Block(7,9,3,LEAVES);
Block(7,9,4,LEAVES);
Block(7,9,6,LEAVES);
Block(7,10,0,LEAVES);
Block(7,10,2,LEAVES);
Block(7,10,4,LEAVES);
Block(7,10,5,LEAVES);
Block(7,11,-3,LEAVES);
Block(7,11,-1,LEAVES);
Block(7,11,1,LEAVES);
Block(7,11,2,LOG);
Block(7,11,4,LEAVES);
Block(7,12,-4,LEAVES);
Block(7,12,2,LOG);
Block(7,12,3,LEAVES);
Block(7,13,2,LEAVES);
Block(7,13,3,LEAVES);
Block(8,4,-4,LEAVES);
Block(8,5,-5,LEAVES);
Block(8,5,-2,LEAVES);
Block(8,5,-1,LEAVES);
Block(8,7,-1,LEAVES);
Block(8,7,2,LEAVES);
Block(8,7,3,LEAVES);
Block(8,7,6,LEAVES);
Block(8,8,-6,LEAVES);
Block(8,8,-2,LEAVES);
Block(8,8,5,LEAVES);
Block(8,9,-4,LEAVES);
Block(8,9,-3,LEAVES);
Block(8,9,-1,LEAVES);
Block(8,9,0,LEAVES);
Block(8,9,2,LEAVES);
Block(8,9,4,LEAVES);
Block(8,10,-6,LEAVES);
Block(8,10,-3,LEAVES);
Block(8,10,-2,LEAVES);
Block(8,10,-1,LEAVES);
Block(8,10,1,LEAVES);
Block(8,10,3,LEAVES);
Block(8,10,5,LEAVES);
Block(8,11,0,LEAVES);
Block(8,11,3,LEAVES);
Block(8,11,4,LEAVES);
Block(8,12,-1,LEAVES);
Block(8,12,0,LEAVES);
Block(8,12,2,LEAVES);
Block(9,4,1,LEAVES);
Block(9,5,-1,LEAVES);
Block(9,6,0,LEAVES);
Block(9,7,-4,LEAVES);
Block(9,7,-3,LEAVES);
Block(9,7,-2,LEAVES);
Block(9,7,4,LEAVES);
Block(9,8,2,LEAVES);
Block(9,8,3,LEAVES);
Block(9,8,4,LEAVES);
Block(9,8,5,LEAVES);
Block(9,9,-3,LEAVES);
Block(9,9,-1,LEAVES);
Block(9,9,1,LEAVES);
Block(9,9,3,LEAVES);
Block(9,10,0,LEAVES);
Block(9,10,1,LEAVES);
Block(9,10,3,LEAVES);
Block(10,5,1,LEAVES);
Block(10,6,-2,LEAVES);
Block(10,6,-1,LEAVES);
Block(10,6,2,LEAVES);
Block(10,7,1,LEAVES);
Block(10,8,0,LEAVES);
Block(10,8,1,LEAVES);
Block(10,9,2,LEAVES);
Block(10,9,3,LEAVES);

//   wildnature mod 2019/07/30 20:55:02
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
