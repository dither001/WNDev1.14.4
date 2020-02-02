package com.matez.wildnature.world.gen.structures.nature.woods.willow;


import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_willow6 extends SchemFeature {
    public tree_willow6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_willow6(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-9,12,-3,LEAVES);
Block(-9,13,4,LEAVES);
Block(-9,14,0,LEAVES);
Block(-9,15,1,LEAVES);
Block(-8,4,-2,LEAVES);
Block(-8,5,-2,LEAVES);
Block(-8,6,-2,LEAVES);
Block(-8,7,-2,LEAVES);
Block(-8,8,-2,LEAVES);
Block(-8,9,-2,LEAVES);
Block(-8,10,-4,LEAVES);
Block(-8,10,-3,LEAVES);
Block(-8,10,-2,LEAVES);
Block(-8,11,-5,LEAVES);
Block(-8,12,-4,LEAVES);
Block(-8,13,-5,LEAVES);
Block(-8,13,-4,LEAVES);
Block(-8,13,-2,LEAVES);
Block(-8,14,-3,LEAVES);
Block(-8,14,-2,LEAVES);
Block(-8,14,-1,LEAVES);
Block(-8,14,0,LEAVES);
Block(-8,14,3,LEAVES);
Block(-8,15,0,LEAVES);
Block(-8,16,1,LEAVES);
Block(-8,16,4,LEAVES);
Block(-8,17,-1,LEAVES);
Block(-7,6,3,LEAVES);
Block(-7,6,4,LEAVES);
Block(-7,7,1,LEAVES);
Block(-7,7,2,LEAVES);
Block(-7,7,6,LEAVES);
Block(-7,9,-2,LEAVES);
Block(-7,9,-1,LEAVES);
Block(-7,10,-3,LEAVES);
Block(-7,10,-2,LEAVES);
Block(-7,11,-7,LEAVES);
Block(-7,11,-6,LEAVES);
Block(-7,11,-3,LEAVES);
Block(-7,11,6,LEAVES);
Block(-7,12,-5,LOG);
Block(-7,12,-2,LEAVES);
Block(-7,12,-1,LEAVES);
Block(-7,12,4,LEAVES);
Block(-7,12,6,LEAVES);
Block(-7,13,-3,LEAVES);
Block(-7,13,-2,LEAVES);
Block(-7,14,-4,LEAVES);
Block(-7,14,-2,LEAVES);
Block(-7,14,1,LEAVES);
Block(-7,14,5,LEAVES);
Block(-7,15,0,LEAVES);
Block(-7,15,1,LEAVES);
Block(-7,15,2,LEAVES);
Block(-7,16,-4,LEAVES);
Block(-7,17,-2,LEAVES);
Block(-6,6,2,LEAVES);
Block(-6,6,3,LEAVES);
Block(-6,6,4,LEAVES);
Block(-6,6,5,LEAVES);
Block(-6,7,0,LEAVES);
Block(-6,7,1,LEAVES);
Block(-6,7,2,LEAVES);
Block(-6,7,4,LEAVES);
Block(-6,7,5,LEAVES);
Block(-6,7,6,LEAVES);
Block(-6,8,-1,LEAVES);
Block(-6,8,0,LEAVES);
Block(-6,8,1,LEAVES);
Block(-6,8,7,LEAVES);
Block(-6,8,8,LEAVES);
Block(-6,9,-4,LEAVES);
Block(-6,9,-2,LEAVES);
Block(-6,9,-1,LEAVES);
Block(-6,10,-4,LEAVES);
Block(-6,10,-3,LEAVES);
Block(-6,10,-2,LEAVES);
Block(-6,10,9,LEAVES);
Block(-6,11,-4,LEAVES);
Block(-6,11,-3,LEAVES);
Block(-6,11,-2,LEAVES);
Block(-6,11,8,LEAVES);
Block(-6,12,-6,LEAVES);
Block(-6,12,-5,LOG);
Block(-6,12,-4,LOG);
Block(-6,12,-3,LEAVES);
Block(-6,12,-1,LEAVES);
Block(-6,12,0,LEAVES);
Block(-6,12,5,LEAVES);
Block(-6,12,7,LEAVES);
Block(-6,12,9,LEAVES);
Block(-6,13,-6,LEAVES);
Block(-6,13,-5,LEAVES);
Block(-6,13,0,LEAVES);
Block(-6,13,2,LEAVES);
Block(-6,13,5,LEAVES);
Block(-6,14,-6,LEAVES);
Block(-6,14,-5,LEAVES);
Block(-6,14,-4,LEAVES);
Block(-6,14,-3,LEAVES);
Block(-6,14,-2,LEAVES);
Block(-6,14,0,LEAVES);
Block(-6,14,2,LEAVES);
Block(-6,14,3,LOG);
Block(-6,14,4,LEAVES);
Block(-6,14,7,LEAVES);
Block(-6,15,-6,LEAVES);
Block(-6,15,-5,LEAVES);
Block(-6,15,-4,LEAVES);
Block(-6,15,-2,LEAVES);
Block(-6,15,0,LEAVES);
Block(-6,15,1,LEAVES);
Block(-6,15,3,LEAVES);
Block(-6,16,-5,LEAVES);
Block(-6,16,-4,LEAVES);
Block(-6,16,-2,LEAVES);
Block(-6,16,4,LEAVES);
Block(-6,17,-2,LEAVES);
Block(-6,17,-1,LEAVES);
Block(-6,17,1,LEAVES);
Block(-5,7,6,LEAVES);
Block(-5,8,5,LEAVES);
Block(-5,8,6,LEAVES);
Block(-5,8,7,LEAVES);
Block(-5,9,-5,LEAVES);
Block(-5,9,-4,LEAVES);
Block(-5,9,6,LEAVES);
Block(-5,9,7,LEAVES);
Block(-5,10,6,LEAVES);
Block(-5,10,8,LEAVES);
Block(-5,10,9,LEAVES);
Block(-5,11,-2,LEAVES);
Block(-5,11,2,LEAVES);
Block(-5,11,3,LEAVES);
Block(-5,11,5,LEAVES);
Block(-5,11,7,LEAVES);
Block(-5,11,9,LEAVES);
Block(-5,12,-4,LOG);
Block(-5,12,-3,LEAVES);
Block(-5,12,-1,LEAVES);
Block(-5,12,5,LEAVES);
Block(-5,12,6,LEAVES);
Block(-5,12,7,LEAVES);
Block(-5,12,8,LEAVES);
Block(-5,13,-7,LEAVES);
Block(-5,13,-6,LEAVES);
Block(-5,13,-4,LOG);
Block(-5,13,-2,LEAVES);
Block(-5,13,1,LEAVES);
Block(-5,13,2,LEAVES);
Block(-5,13,3,LOG);
Block(-5,13,4,LOG);
Block(-5,13,6,LEAVES);
Block(-5,13,8,LEAVES);
Block(-5,14,-7,LEAVES);
Block(-5,14,-5,LEAVES);
Block(-5,14,-4,LEAVES);
Block(-5,14,-2,LEAVES);
Block(-5,14,1,LEAVES);
Block(-5,14,3,LEAVES);
Block(-5,14,4,LEAVES);
Block(-5,14,5,LEAVES);
Block(-5,14,6,LEAVES);
Block(-5,14,7,LEAVES);
Block(-5,14,8,LEAVES);
Block(-5,15,-6,LEAVES);
Block(-5,15,-4,LEAVES);
Block(-5,15,-3,LEAVES);
Block(-5,15,-2,LEAVES);
Block(-5,15,0,LEAVES);
Block(-5,15,3,LEAVES);
Block(-5,15,4,LEAVES);
Block(-5,16,-6,LEAVES);
Block(-5,16,3,LEAVES);
Block(-5,17,-5,LEAVES);
Block(-5,17,-4,LEAVES);
Block(-5,17,-2,LEAVES);
Block(-4,2,8,LEAVES);
Block(-4,3,8,LEAVES);
Block(-4,4,8,LEAVES);
Block(-4,5,8,LEAVES);
Block(-4,6,7,LEAVES);
Block(-4,6,8,LEAVES);
Block(-4,7,7,LEAVES);
Block(-4,7,8,LEAVES);
Block(-4,7,9,LEAVES);
Block(-4,8,10,LEAVES);
Block(-4,9,4,LEAVES);
Block(-4,9,5,LEAVES);
Block(-4,9,7,LOG);
Block(-4,9,8,LEAVES);
Block(-4,9,9,LEAVES);
Block(-4,9,10,LEAVES);
Block(-4,10,6,LEAVES);
Block(-4,10,7,LEAVES);
Block(-4,10,8,LEAVES);
Block(-4,11,3,LOG);
Block(-4,11,4,LOG);
Block(-4,11,5,LEAVES);
Block(-4,11,6,LEAVES);
Block(-4,11,7,LEAVES);
Block(-4,11,8,LEAVES);
Block(-4,11,9,LEAVES);
Block(-4,12,1,LEAVES);
Block(-4,12,2,LEAVES);
Block(-4,12,4,LOG);
Block(-4,12,5,LOG);
Block(-4,12,6,LOG);
Block(-4,12,7,LOG);
Block(-4,13,-6,LEAVES);
Block(-4,13,-5,LEAVES);
Block(-4,13,-4,LOG);
Block(-4,13,-3,LOG);
Block(-4,13,-2,LOG);
Block(-4,13,2,LEAVES);
Block(-4,13,7,LEAVES);
Block(-4,13,9,LEAVES);
Block(-4,13,10,LEAVES);
Block(-4,14,-7,LEAVES);
Block(-4,14,-5,LEAVES);
Block(-4,14,-4,LEAVES);
Block(-4,14,-2,LEAVES);
Block(-4,14,5,LEAVES);
Block(-4,14,8,LEAVES);
Block(-4,14,9,LEAVES);
Block(-4,15,-4,LEAVES);
Block(-4,15,-1,LEAVES);
Block(-4,15,4,LEAVES);
Block(-4,15,5,LEAVES);
Block(-4,15,8,LEAVES);
Block(-4,16,-5,LEAVES);
Block(-4,17,-7,LEAVES);
Block(-4,17,-6,LEAVES);
Block(-4,17,-5,LEAVES);
Block(-4,17,-3,LEAVES);
Block(-4,17,0,LEAVES);
Block(-4,17,2,LEAVES);
Block(-3,6,7,LEAVES);
Block(-3,6,8,LEAVES);
Block(-3,7,5,LEAVES);
Block(-3,7,6,LEAVES);
Block(-3,7,7,LEAVES);
Block(-3,8,5,LEAVES);
Block(-3,8,7,LEAVES);
Block(-3,9,4,LEAVES);
Block(-3,9,5,LEAVES);
Block(-3,9,6,LEAVES);
Block(-3,9,7,LOG);
Block(-3,9,8,LEAVES);
Block(-3,9,10,LEAVES);
Block(-3,10,1,LOG);
Block(-3,10,5,LOG);
Block(-3,10,6,LOG);
Block(-3,10,7,LEAVES);
Block(-3,10,9,LEAVES);
Block(-3,11,-4,LEAVES);
Block(-3,11,2,LOG);
Block(-3,11,3,LOG);
Block(-3,11,4,LOG);
Block(-3,11,5,LEAVES);
Block(-3,11,9,LEAVES);
Block(-3,12,-3,LEAVES);
Block(-3,12,-2,LOG);
Block(-3,12,4,LEAVES);
Block(-3,12,5,LEAVES);
Block(-3,12,7,LEAVES);
Block(-3,13,-5,LEAVES);
Block(-3,13,-2,LOG);
Block(-3,13,5,LEAVES);
Block(-3,13,6,LEAVES);
Block(-3,14,-7,LEAVES);
Block(-3,14,0,LEAVES);
Block(-3,14,8,LEAVES);
Block(-3,15,-6,LEAVES);
Block(-3,15,1,LEAVES);
Block(-3,15,2,LEAVES);
Block(-3,15,3,LEAVES);
Block(-3,15,7,LEAVES);
Block(-3,16,-9,LEAVES);
Block(-3,16,-8,LEAVES);
Block(-3,16,-7,LEAVES);
Block(-3,16,-5,LEAVES);
Block(-3,16,6,LEAVES);
Block(-3,17,-4,LEAVES);
Block(-3,18,-8,LEAVES);
Block(-3,18,-6,LEAVES);
Block(-3,18,-5,LEAVES);
Block(-2,1,-1,LOG);
Block(-2,6,7,LEAVES);
Block(-2,6,8,LEAVES);
Block(-2,7,7,LEAVES);
Block(-2,8,4,LEAVES);
Block(-2,8,6,LEAVES);
Block(-2,8,7,LEAVES);
Block(-2,8,8,LEAVES);
Block(-2,9,5,LEAVES);
Block(-2,9,10,LEAVES);
Block(-2,10,1,LOG);
Block(-2,10,2,LOG);
Block(-2,10,8,LEAVES);
Block(-2,11,2,LOG);
Block(-2,11,3,LOG);
Block(-2,11,7,LEAVES);
Block(-2,12,-4,LEAVES);
Block(-2,12,-2,LOG);
Block(-2,12,3,LEAVES);
Block(-2,12,6,LEAVES);
Block(-2,12,7,LEAVES);
Block(-2,13,-5,LEAVES);
Block(-2,13,-4,LOG);
Block(-2,13,-3,LOG);
Block(-2,13,-2,LEAVES);
Block(-2,13,6,LEAVES);
Block(-2,13,8,LEAVES);
Block(-2,14,-4,LOG);
Block(-2,14,-2,LEAVES);
Block(-2,14,3,LEAVES);
Block(-2,14,4,LEAVES);
Block(-2,14,6,LEAVES);
Block(-2,15,-8,LEAVES);
Block(-2,15,-6,LEAVES);
Block(-2,15,-5,LEAVES);
Block(-2,15,-4,LEAVES);
Block(-2,15,-3,LEAVES);
Block(-2,15,3,LEAVES);
Block(-2,15,4,LEAVES);
Block(-2,16,-10,LEAVES);
Block(-2,16,-9,LEAVES);
Block(-2,16,-8,LEAVES);
Block(-2,16,-7,LEAVES);
Block(-2,16,-6,LEAVES);
Block(-2,16,3,LEAVES);
Block(-2,17,-7,LEAVES);
Block(-2,18,-7,LEAVES);
Block(-2,18,-6,LEAVES);
Block(-1,1,-1,LOG);
Block(-1,1,0,LOG);
Block(-1,1,4,LOG);
Block(-1,2,-1,LOG);
Block(-1,2,0,LOG);
Block(-1,3,0,LOG);
Block(-1,4,0,LOG);
Block(-1,8,1,LOG);
Block(-1,8,6,LEAVES);
Block(-1,9,0,LOG);
Block(-1,9,6,LEAVES);
Block(-1,9,8,LEAVES);
Block(-1,10,1,LOG);
Block(-1,10,2,LOG);
Block(-1,11,-2,LOG);
Block(-1,11,6,LEAVES);
Block(-1,12,-2,LOG);
Block(-1,12,2,LOG);
Block(-1,12,3,LEAVES);
Block(-1,12,4,LEAVES);
Block(-1,12,7,LEAVES);
Block(-1,13,-7,LEAVES);
Block(-1,13,4,LEAVES);
Block(-1,13,5,LEAVES);
Block(-1,14,-7,LEAVES);
Block(-1,14,-6,LOG);
Block(-1,14,-5,LOG);
Block(-1,14,-3,LEAVES);
Block(-1,14,1,LEAVES);
Block(-1,14,5,LEAVES);
Block(-1,15,-9,LEAVES);
Block(-1,15,-8,LEAVES);
Block(-1,15,-7,LOG);
Block(-1,15,-6,LOG);
Block(-1,15,-5,LEAVES);
Block(-1,15,-4,LEAVES);
Block(-1,15,1,LEAVES);
Block(-1,15,4,LOG);
Block(-1,16,-10,LEAVES);
Block(-1,16,-9,LEAVES);
Block(-1,16,-8,LEAVES);
Block(-1,16,-7,LOG);
Block(-1,16,-6,LEAVES);
Block(-1,16,-5,LEAVES);
Block(-1,16,-4,LEAVES);
Block(-1,16,7,LEAVES);
Block(-1,17,-7,LEAVES);
Block(-1,17,-6,LEAVES);
Block(-1,17,-5,LEAVES);
Block(-1,17,3,LEAVES);
Block(-1,17,6,LEAVES);
Block(-1,18,-9,LEAVES);
Block(-1,18,-8,LEAVES);
Block(0,1,0,LOG);
Block(0,1,1,LOG);
Block(0,1,3,LOG);
Block(0,1,4,LOG);
Block(0,2,0,LOG);
Block(0,2,3,LOG);
Block(0,2,4,LOG);
Block(0,3,0,LOG);
Block(0,3,1,LOG);
Block(0,4,0,LOG);
Block(0,5,0,LOG);
Block(0,6,1,LOG);
Block(0,7,1,LOG);
Block(0,8,0,LOG);
Block(0,8,1,LOG);
Block(0,8,8,LEAVES);
Block(0,9,-8,LEAVES);
Block(0,9,0,LOG);
Block(0,9,1,LOG);
Block(0,9,7,LEAVES);
Block(0,10,-7,LEAVES);
Block(0,10,-2,LOG);
Block(0,10,-1,LOG);
Block(0,10,0,LOG);
Block(0,10,1,LOG);
Block(0,10,6,LEAVES);
Block(0,10,7,LEAVES);
Block(0,11,-6,LEAVES);
Block(0,11,-2,LOG);
Block(0,11,-1,LOG);
Block(0,12,-7,LEAVES);
Block(0,12,2,LOG);
Block(0,12,4,LEAVES);
Block(0,13,-9,LEAVES);
Block(0,13,-7,LEAVES);
Block(0,13,2,LOG);
Block(0,13,3,LOG);
Block(0,13,5,LEAVES);
Block(0,14,-10,LEAVES);
Block(0,14,-9,LEAVES);
Block(0,14,-7,LEAVES);
Block(0,14,-6,LEAVES);
Block(0,14,3,LOG);
Block(0,14,4,LEAVES);
Block(0,15,-8,LEAVES);
Block(0,15,-6,LEAVES);
Block(0,15,-5,LEAVES);
Block(0,15,-4,LEAVES);
Block(0,15,5,LEAVES);
Block(0,15,6,LEAVES);
Block(0,16,-11,LEAVES);
Block(0,16,-10,LEAVES);
Block(0,16,-8,LOG);
Block(0,16,-7,LOG);
Block(0,16,-6,LEAVES);
Block(0,16,-5,LEAVES);
Block(0,16,-4,LEAVES);
Block(0,16,-3,LEAVES);
Block(0,16,4,LEAVES);
Block(0,17,-10,LEAVES);
Block(0,17,-8,LEAVES);
Block(0,17,-4,LEAVES);
Block(0,17,2,LEAVES);
Block(0,18,-7,LEAVES);
Block(0,19,-8,LEAVES);
Block(0,19,-6,LEAVES);
Block(1,1,1,LOG);
Block(1,1,2,LOG);
Block(1,2,1,LOG);
Block(1,2,2,LOG);
Block(1,2,3,LOG);
Block(1,3,1,LOG);
Block(1,3,2,LOG);
Block(1,3,3,LOG);
Block(1,4,1,LOG);
Block(1,4,2,LOG);
Block(1,5,0,LOG);
Block(1,5,1,LOG);
Block(1,5,2,LOG);
Block(1,6,0,LOG);
Block(1,6,1,LOG);
Block(1,6,2,LOG);
Block(1,7,-7,LEAVES);
Block(1,7,-6,LEAVES);
Block(1,7,0,LOG);
Block(1,7,1,LOG);
Block(1,7,2,LOG);
Block(1,8,-7,LEAVES);
Block(1,8,0,LOG);
Block(1,8,1,LOG);
Block(1,8,2,LOG);
Block(1,9,-9,LEAVES);
Block(1,9,-8,LEAVES);
Block(1,9,1,LOG);
Block(1,10,-7,LEAVES);
Block(1,10,-2,LOG);
Block(1,10,-1,LOG);
Block(1,11,-7,LEAVES);
Block(1,11,-3,LOG);
Block(1,11,-2,LOG);
Block(1,12,-7,LEAVES);
Block(1,12,3,LEAVES);
Block(1,13,3,LOG);
Block(1,13,4,LEAVES);
Block(1,14,-5,LEAVES);
Block(1,14,3,LEAVES);
Block(1,14,4,LEAVES);
Block(1,15,-6,LEAVES);
Block(1,15,-5,LEAVES);
Block(1,15,3,LEAVES);
Block(1,15,4,LEAVES);
Block(1,15,5,LEAVES);
Block(1,16,-11,LEAVES);
Block(1,16,-6,LEAVES);
Block(1,16,-5,LEAVES);
Block(1,16,1,LEAVES);
Block(1,16,2,LEAVES);
Block(1,16,4,LEAVES);
Block(1,17,-7,LEAVES);
Block(1,17,2,LEAVES);
Block(1,17,3,LEAVES);
Block(1,18,-9,LEAVES);
Block(1,19,-9,LEAVES);
Block(2,1,2,LOG);
Block(2,2,-8,LEAVES);
Block(2,2,2,LOG);
Block(2,3,-8,LEAVES);
Block(2,3,1,LOG);
Block(2,3,2,LOG);
Block(2,4,-8,LEAVES);
Block(2,4,0,LOG);
Block(2,4,1,LOG);
Block(2,4,2,LOG);
Block(2,5,-9,LEAVES);
Block(2,5,-8,LEAVES);
Block(2,5,1,LOG);
Block(2,5,2,LOG);
Block(2,6,-9,LEAVES);
Block(2,6,-8,LEAVES);
Block(2,6,1,LOG);
Block(2,7,-8,LEAVES);
Block(2,7,1,LOG);
Block(2,8,-9,LEAVES);
Block(2,8,-8,LEAVES);
Block(2,8,-7,LEAVES);
Block(2,8,-5,LEAVES);
Block(2,9,-8,LEAVES);
Block(2,9,-7,LEAVES);
Block(2,10,-6,LOG);
Block(2,10,-5,LOG);
Block(2,11,-6,LEAVES);
Block(2,11,-5,LOG);
Block(2,11,-4,LOG);
Block(2,11,-3,LOG);
Block(2,11,-2,LOG);
Block(2,12,-8,LEAVES);
Block(2,12,-6,LEAVES);
Block(2,12,-5,LEAVES);
Block(2,12,-4,LEAVES);
Block(2,12,3,LEAVES);
Block(2,13,-10,LEAVES);
Block(2,13,-6,LEAVES);
Block(2,13,-4,LEAVES);
Block(2,13,3,LOG);
Block(2,14,-6,LEAVES);
Block(2,14,-4,LEAVES);
Block(2,14,-2,LEAVES);
Block(2,14,1,LEAVES);
Block(2,14,2,LOG);
Block(2,14,3,LOG);
Block(2,14,4,LEAVES);
Block(2,14,6,LEAVES);
Block(2,15,-9,LEAVES);
Block(2,15,-8,LEAVES);
Block(2,15,1,LEAVES);
Block(2,15,2,LEAVES);
Block(2,15,3,LEAVES);
Block(2,16,-9,LEAVES);
Block(2,16,-7,LEAVES);
Block(2,16,-6,LEAVES);
Block(2,16,1,LEAVES);
Block(2,16,2,LEAVES);
Block(2,16,6,LEAVES);
Block(2,17,-9,LEAVES);
Block(2,17,-6,LEAVES);
Block(2,17,3,LEAVES);
Block(2,17,4,LEAVES);
Block(2,17,5,LEAVES);
Block(3,1,2,LOG);
Block(3,2,1,LOG);
Block(3,2,2,LOG);
Block(3,3,1,LOG);
Block(3,4,1,LOG);
Block(3,5,1,LOG);
Block(3,8,-7,LEAVES);
Block(3,9,-9,LEAVES);
Block(3,9,-8,LOG);
Block(3,9,-7,LOG);
Block(3,10,-9,LEAVES);
Block(3,10,-7,LEAVES);
Block(3,10,-5,LEAVES);
Block(3,11,-5,LEAVES);
Block(3,11,-4,LOG);
Block(3,11,-3,LOG);
Block(3,11,-2,LEAVES);
Block(3,12,-8,LEAVES);
Block(3,12,-7,LEAVES);
Block(3,12,-6,LEAVES);
Block(3,12,-4,LOG);
Block(3,12,-3,LEAVES);
Block(3,12,-2,LEAVES);
Block(3,12,3,LEAVES);
Block(3,13,-10,LEAVES);
Block(3,13,-5,LEAVES);
Block(3,13,-3,LEAVES);
Block(3,13,-1,LEAVES);
Block(3,13,0,LEAVES);
Block(3,14,-7,LEAVES);
Block(3,14,-4,LEAVES);
Block(3,14,-2,LEAVES);
Block(3,14,0,LEAVES);
Block(3,14,1,LEAVES);
Block(3,14,2,LOG);
Block(3,14,3,LEAVES);
Block(3,14,4,LEAVES);
Block(3,15,-6,LEAVES);
Block(3,15,0,LEAVES);
Block(3,15,1,LEAVES);
Block(3,16,-9,LEAVES);
Block(3,16,-7,LEAVES);
Block(3,16,1,LEAVES);
Block(3,16,2,LEAVES);
Block(3,16,3,LEAVES);
Block(3,16,4,LEAVES);
Block(3,17,1,LEAVES);
Block(3,18,3,LEAVES);
Block(4,1,2,LOG);
Block(4,2,1,LOG);
Block(4,2,2,LOG);
Block(4,3,1,LOG);
Block(4,8,-7,LEAVES);
Block(4,9,-8,LEAVES);
Block(4,9,-7,LEAVES);
Block(4,10,-4,LEAVES);
Block(4,10,-3,LEAVES);
Block(4,10,0,LEAVES);
Block(4,11,-8,LEAVES);
Block(4,11,-6,LEAVES);
Block(4,11,-5,LEAVES);
Block(4,11,-4,LEAVES);
Block(4,11,-3,LEAVES);
Block(4,11,-2,LEAVES);
Block(4,11,-1,LEAVES);
Block(4,11,0,LEAVES);
Block(4,12,-7,LEAVES);
Block(4,12,-5,LEAVES);
Block(4,12,-4,LOG);
Block(4,12,-3,LEAVES);
Block(4,12,-2,LEAVES);
Block(4,12,1,LEAVES);
Block(4,12,2,LEAVES);
Block(4,13,-7,LEAVES);
Block(4,13,-6,LEAVES);
Block(4,13,-5,LOG);
Block(4,13,-4,LOG);
Block(4,14,-3,LEAVES);
Block(4,14,-2,LEAVES);
Block(4,14,-1,LEAVES);
Block(4,14,0,LEAVES);
Block(4,14,2,LOG);
Block(4,14,3,LEAVES);
Block(4,14,5,LEAVES);
Block(4,15,-7,LEAVES);
Block(4,15,-2,LEAVES);
Block(4,15,2,LOG);
Block(4,15,3,LEAVES);
Block(4,15,4,LEAVES);
Block(4,16,-7,LEAVES);
Block(4,16,2,LEAVES);
Block(4,17,2,LEAVES);
Block(4,17,5,LEAVES);
Block(4,18,1,LEAVES);
Block(4,18,2,LEAVES);
Block(5,1,2,LOG);
Block(5,2,2,LOG);
Block(5,9,-3,LEAVES);
Block(5,10,-6,LEAVES);
Block(5,10,-1,LEAVES);
Block(5,11,-8,LEAVES);
Block(5,11,-7,LEAVES);
Block(5,11,-6,LEAVES);
Block(5,11,-4,LOG);
Block(5,11,-3,LEAVES);
Block(5,11,-1,LEAVES);
Block(5,12,-9,LEAVES);
Block(5,12,-7,LEAVES);
Block(5,12,-6,LEAVES);
Block(5,12,2,LEAVES);
Block(5,13,-6,LOG);
Block(5,13,-5,LOG);
Block(5,13,-4,LEAVES);
Block(5,13,-3,LEAVES);
Block(5,14,-8,LEAVES);
Block(5,14,-6,LEAVES);
Block(5,14,-4,LEAVES);
Block(5,14,2,LEAVES);
Block(5,14,4,LEAVES);
Block(5,14,5,LEAVES);
Block(5,15,-6,LEAVES);
Block(5,15,-1,LEAVES);
Block(5,15,1,LEAVES);
Block(5,15,2,LOG);
Block(5,16,-6,LEAVES);
Block(5,16,-5,LEAVES);
Block(5,16,-1,LEAVES);
Block(5,16,0,LEAVES);
Block(5,16,1,LEAVES);
Block(5,16,3,LEAVES);
Block(5,17,3,LEAVES);
Block(5,18,1,LEAVES);
Block(5,18,3,LEAVES);
Block(6,1,2,LOG);
Block(6,10,-3,LOG);
Block(6,10,-2,LEAVES);
Block(6,10,0,LEAVES);
Block(6,11,-4,LEAVES);
Block(6,11,-2,LEAVES);
Block(6,11,-1,LEAVES);
Block(6,12,-6,LEAVES);
Block(6,12,-5,LEAVES);
Block(6,12,-4,LEAVES);
Block(6,12,-3,LEAVES);
Block(6,13,-7,LEAVES);
Block(6,13,-6,LEAVES);
Block(6,13,-3,LEAVES);
Block(6,13,-2,LEAVES);
Block(6,13,0,LEAVES);
Block(6,14,-6,LEAVES);
Block(6,14,-5,LEAVES);
Block(6,14,-3,LEAVES);
Block(6,14,5,LEAVES);
Block(6,15,-7,LEAVES);
Block(6,15,-5,LEAVES);
Block(6,15,3,LEAVES);
Block(6,15,5,LEAVES);
Block(6,16,4,LEAVES);
Block(6,16,5,LEAVES);
Block(6,18,2,LEAVES);
Block(7,8,-2,LEAVES);
Block(7,9,-2,LEAVES);
Block(7,10,-4,LEAVES);
Block(7,10,-3,LEAVES);
Block(7,10,-2,LEAVES);
Block(7,10,-1,LEAVES);
Block(7,11,-6,LEAVES);
Block(7,11,-4,LEAVES);
Block(7,11,-3,LOG);
Block(7,11,-1,LEAVES);
Block(7,11,0,LEAVES);
Block(7,12,-5,LEAVES);
Block(7,12,-3,LEAVES);
Block(7,12,-1,LEAVES);
Block(7,12,0,LEAVES);
Block(7,13,-8,LEAVES);
Block(7,13,-6,LEAVES);
Block(7,13,-3,LEAVES);
Block(7,13,-1,LEAVES);
Block(7,13,0,LEAVES);
Block(7,13,1,LEAVES);
Block(7,13,2,LEAVES);
Block(7,14,-4,LEAVES);
Block(7,14,1,LEAVES);
Block(7,14,2,LEAVES);
Block(7,15,-6,LEAVES);
Block(7,15,0,LEAVES);
Block(7,15,2,LEAVES);
Block(7,16,0,LEAVES);
Block(7,16,1,LEAVES);
Block(7,16,2,LEAVES);
Block(7,16,3,LEAVES);
Block(7,17,2,LEAVES);
Block(7,17,3,LEAVES);
Block(8,3,-2,LEAVES);
Block(8,4,-2,LEAVES);
Block(8,5,-2,LEAVES);
Block(8,6,-2,LEAVES);
Block(8,7,-2,LEAVES);
Block(8,8,-3,LEAVES);
Block(8,8,-2,LEAVES);
Block(8,9,-2,LEAVES);
Block(8,10,-3,LEAVES);
Block(8,11,-6,LEAVES);
Block(8,11,-1,LEAVES);
Block(8,12,-4,LEAVES);
Block(8,12,-3,LEAVES);
Block(8,13,-6,LEAVES);
Block(8,13,-3,LEAVES);
Block(8,14,1,LEAVES);
Block(8,15,1,LEAVES);
Block(8,16,1,LEAVES);
Block(9,9,-2,LEAVES);
Block(9,10,-5,LEAVES);
Block(9,11,-3,LEAVES);
Block(9,11,-2,LEAVES);
Block(9,13,-3,LEAVES);
Block(10,10,-3,LEAVES);

//   wildnature mod 2019/07/30 20:48:20
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
