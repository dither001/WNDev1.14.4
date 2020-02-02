package com.matez.wildnature.world.gen.structures.nature.woods.oak;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_oak28 extends SchemFeature {
    public tree_oak28(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_oak28(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-9,11,6,LEAVES);
Block(-9,12,2,LEAVES);
Block(-9,12,3,LEAVES);
Block(-9,12,6,LEAVES);
Block(-9,14,-1,LEAVES);
Block(-9,14,0,LEAVES);
Block(-9,16,0,LEAVES);
Block(-8,10,1,LEAVES);
Block(-8,10,6,LEAVES);
Block(-8,11,1,LEAVES);
Block(-8,11,2,LEAVES);
Block(-8,11,5,LEAVES);
Block(-8,11,6,LEAVES);
Block(-8,12,1,LEAVES);
Block(-8,12,3,LEAVES);
Block(-8,12,4,LEAVES);
Block(-8,12,5,LEAVES);
Block(-8,13,-3,LEAVES);
Block(-8,13,1,LEAVES);
Block(-8,14,-1,LEAVES);
Block(-8,14,0,LEAVES);
Block(-8,14,1,LEAVES);
Block(-8,14,3,LEAVES);
Block(-8,15,3,LEAVES);
Block(-8,16,-4,LEAVES);
Block(-8,16,-3,LEAVES);
Block(-8,16,-2,LEAVES);
Block(-8,16,-1,LEAVES);
Block(-8,16,0,LEAVES);
Block(-8,17,-2,LEAVES);
Block(-8,17,-1,LEAVES);
Block(-8,17,0,LEAVES);
Block(-8,18,-2,LEAVES);
Block(-8,19,-3,LEAVES);
Block(-8,19,-2,LEAVES);
Block(-8,19,1,LEAVES);
Block(-8,19,2,LEAVES);
Block(-8,19,3,LEAVES);
Block(-7,8,-3,LEAVES);
Block(-7,9,-3,LEAVES);
Block(-7,10,-2,LEAVES);
Block(-7,10,0,LEAVES);
Block(-7,10,1,LEAVES);
Block(-7,10,4,LEAVES);
Block(-7,10,5,LEAVES);
Block(-7,10,6,LEAVES);
Block(-7,11,0,LEAVES);
Block(-7,11,1,LEAVES);
Block(-7,11,2,LEAVES);
Block(-7,11,4,LEAVES);
Block(-7,11,5,LEAVES);
Block(-7,11,6,LEAVES);
Block(-7,12,-3,LEAVES);
Block(-7,12,0,LEAVES);
Block(-7,12,1,LEAVES);
Block(-7,12,2,LEAVES);
Block(-7,12,3,LEAVES);
Block(-7,12,4,LEAVES);
Block(-7,12,5,LEAVES);
Block(-7,13,-4,LEAVES);
Block(-7,13,-3,LEAVES);
Block(-7,13,-1,LEAVES);
Block(-7,13,0,LEAVES);
Block(-7,13,1,LEAVES);
Block(-7,13,2,LEAVES);
Block(-7,13,3,LEAVES);
Block(-7,13,4,LEAVES);
Block(-7,13,5,LEAVES);
Block(-7,14,0,LEAVES);
Block(-7,14,1,LEAVES);
Block(-7,14,3,LEAVES);
Block(-7,15,-1,LEAVES);
Block(-7,15,0,LEAVES);
Block(-7,15,1,LEAVES);
Block(-7,15,2,LEAVES);
Block(-7,15,3,LEAVES);
Block(-7,15,5,LEAVES);
Block(-7,16,-2,LEAVES);
Block(-7,16,-1,LEAVES);
Block(-7,16,0,LEAVES);
Block(-7,16,1,LEAVES);
Block(-7,16,2,LEAVES);
Block(-7,17,-3,LEAVES);
Block(-7,17,-2,LEAVES);
Block(-7,17,-1,LEAVES);
Block(-7,17,0,LEAVES);
Block(-7,17,1,LEAVES);
Block(-7,17,2,LEAVES);
Block(-7,18,-5,LEAVES);
Block(-7,18,-4,LEAVES);
Block(-7,18,-3,LEAVES);
Block(-7,18,-2,LEAVES);
Block(-7,18,2,LEAVES);
Block(-7,19,2,LEAVES);
Block(-7,20,2,LEAVES);
Block(-7,20,3,LEAVES);
Block(-7,21,2,LEAVES);
Block(-6,9,-3,LEAVES);
Block(-6,9,-2,LEAVES);
Block(-6,9,0,LEAVES);
Block(-6,10,-3,LEAVES);
Block(-6,10,-2,LEAVES);
Block(-6,10,-1,LEAVES);
Block(-6,10,0,LEAVES);
Block(-6,10,6,LEAVES);
Block(-6,10,7,LEAVES);
Block(-6,11,-3,LEAVES);
Block(-6,11,-2,LEAVES);
Block(-6,11,-1,LEAVES);
Block(-6,11,0,LEAVES);
Block(-6,11,1,LEAVES);
Block(-6,11,2,LEAVES);
Block(-6,11,3,LEAVES);
Block(-6,11,4,LEAVES);
Block(-6,11,5,LEAVES);
Block(-6,11,6,LEAVES);
Block(-6,12,-3,LEAVES);
Block(-6,12,-2,LEAVES);
Block(-6,12,-1,LEAVES);
Block(-6,12,0,LEAVES);
Block(-6,12,1,LEAVES);
Block(-6,12,2,LEAVES);
Block(-6,12,4,LEAVES);
Block(-6,12,5,LEAVES);
Block(-6,12,6,LEAVES);
Block(-6,12,8,LEAVES);
Block(-6,13,-4,LEAVES);
Block(-6,13,-3,LEAVES);
Block(-6,13,-2,LEAVES);
Block(-6,13,-1,LEAVES);
Block(-6,13,0,LEAVES);
Block(-6,13,1,LEAVES);
Block(-6,13,2,LEAVES);
Block(-6,13,3,LEAVES);
Block(-6,13,4,LEAVES);
Block(-6,13,5,LEAVES);
Block(-6,13,6,LEAVES);
Block(-6,13,7,LEAVES);
Block(-6,13,8,LEAVES);
Block(-6,13,9,LEAVES);
Block(-6,14,-3,LEAVES);
Block(-6,14,-2,LEAVES);
Block(-6,14,-1,LEAVES);
Block(-6,14,0,LEAVES);
Block(-6,14,1,LEAVES);
Block(-6,14,2,LEAVES);
Block(-6,14,3,LEAVES);
Block(-6,14,4,LEAVES);
Block(-6,14,6,LEAVES);
Block(-6,15,-3,LEAVES);
Block(-6,15,-1,LEAVES);
Block(-6,15,0,LEAVES);
Block(-6,15,1,LEAVES);
Block(-6,15,2,LEAVES);
Block(-6,15,3,LEAVES);
Block(-6,15,4,LEAVES);
Block(-6,15,5,LEAVES);
Block(-6,15,6,LEAVES);
Block(-6,16,-3,LEAVES);
Block(-6,16,-2,LEAVES);
Block(-6,16,-1,LEAVES);
Block(-6,16,0,LEAVES);
Block(-6,16,1,LEAVES);
Block(-6,16,3,LEAVES);
Block(-6,16,4,LEAVES);
Block(-6,16,5,LEAVES);
Block(-6,17,-2,LEAVES);
Block(-6,17,-1,LEAVES);
Block(-6,17,0,LEAVES);
Block(-6,17,1,LEAVES);
Block(-6,17,2,LEAVES);
Block(-6,17,4,LEAVES);
Block(-6,18,-4,LEAVES);
Block(-6,18,-2,LEAVES);
Block(-6,18,-1,LEAVES);
Block(-6,18,0,LEAVES);
Block(-6,18,1,LEAVES);
Block(-6,18,2,LEAVES);
Block(-6,19,-1,LEAVES);
Block(-6,19,1,LEAVES);
Block(-6,20,0,LEAVES);
Block(-6,20,1,LEAVES);
Block(-6,21,2,LEAVES);
Block(-6,21,3,LEAVES);
Block(-6,22,2,LEAVES);
Block(-5,9,-3,LEAVES);
Block(-5,9,-2,LEAVES);
Block(-5,9,0,LEAVES);
Block(-5,10,-4,LEAVES);
Block(-5,10,0,LEAVES);
Block(-5,10,2,LEAVES);
Block(-5,10,4,LEAVES);
Block(-5,11,-5,LEAVES);
Block(-5,11,-4,LEAVES);
Block(-5,11,-3,LEAVES);
Block(-5,11,-2,LEAVES);
Block(-5,11,-1,LEAVES);
Block(-5,11,0,LEAVES);
Block(-5,11,1,LEAVES);
Block(-5,11,2,LEAVES);
Block(-5,11,4,LEAVES);
Block(-5,11,5,LEAVES);
Block(-5,11,6,LEAVES);
Block(-5,12,-6,LEAVES);
Block(-5,12,-4,LEAVES);
Block(-5,12,-3,LEAVES);
Block(-5,12,-2,LEAVES);
Block(-5,12,-1,LEAVES);
Block(-5,12,0,LEAVES);
Block(-5,12,1,LEAVES);
Block(-5,12,2,LEAVES);
Block(-5,12,3,LEAVES);
Block(-5,12,4,LEAVES);
Block(-5,12,5,LEAVES);
Block(-5,13,-6,LEAVES);
Block(-5,13,-5,LEAVES);
Block(-5,13,-4,LEAVES);
Block(-5,13,-3,LEAVES);
Block(-5,13,-2,LEAVES);
Block(-5,13,-1,LEAVES);
Block(-5,13,0,LEAVES);
Block(-5,13,1,LEAVES);
Block(-5,13,2,LEAVES);
Block(-5,13,3,LEAVES);
Block(-5,13,4,LEAVES);
Block(-5,13,5,LEAVES);
Block(-5,13,6,LEAVES);
Block(-5,14,-5,LEAVES);
Block(-5,14,-4,LEAVES);
Block(-5,14,-3,LEAVES);
Block(-5,14,-2,LEAVES);
Block(-5,14,-1,LEAVES);
Block(-5,14,0,LEAVES);
Block(-5,14,1,LEAVES);
Block(-5,14,2,LEAVES);
Block(-5,14,3,LEAVES);
Block(-5,14,4,LEAVES);
Block(-5,14,5,LEAVES);
Block(-5,14,6,LEAVES);
Block(-5,15,-3,LEAVES);
Block(-5,15,-2,LEAVES);
Block(-5,15,-1,LEAVES);
Block(-5,15,0,LEAVES);
Block(-5,15,1,LEAVES);
Block(-5,15,2,LEAVES);
Block(-5,15,3,LEAVES);
Block(-5,15,4,LEAVES);
Block(-5,15,5,LEAVES);
Block(-5,15,6,LEAVES);
Block(-5,16,-4,LEAVES);
Block(-5,16,-3,LEAVES);
Block(-5,16,-2,LEAVES);
Block(-5,16,-1,LEAVES);
Block(-5,16,0,LEAVES);
Block(-5,16,1,LEAVES);
Block(-5,16,2,LEAVES);
Block(-5,16,3,LEAVES);
Block(-5,16,4,LEAVES);
Block(-5,16,5,LEAVES);
Block(-5,16,6,LEAVES);
Block(-5,16,7,LEAVES);
Block(-5,16,8,LEAVES);
Block(-5,17,-3,LEAVES);
Block(-5,17,-2,LEAVES);
Block(-5,17,-1,LEAVES);
Block(-5,17,0,LEAVES);
Block(-5,17,1,LEAVES);
Block(-5,17,2,LEAVES);
Block(-5,17,3,LEAVES);
Block(-5,17,6,LEAVES);
Block(-5,18,-4,LEAVES);
Block(-5,18,-3,LEAVES);
Block(-5,18,-1,LEAVES);
Block(-5,18,0,LEAVES);
Block(-5,18,1,LEAVES);
Block(-5,18,2,LEAVES);
Block(-5,18,3,LEAVES);
Block(-5,18,4,LEAVES);
Block(-5,19,-4,LEAVES);
Block(-5,19,-3,LEAVES);
Block(-5,19,-1,LEAVES);
Block(-5,19,0,LEAVES);
Block(-5,19,1,LEAVES);
Block(-5,19,2,LEAVES);
Block(-5,19,4,LEAVES);
Block(-5,20,0,LEAVES);
Block(-5,20,1,LEAVES);
Block(-5,20,2,LEAVES);
Block(-5,20,4,LEAVES);
Block(-5,21,1,LEAVES);
Block(-5,21,2,LEAVES);
Block(-5,21,3,LEAVES);
Block(-5,22,-1,LEAVES);
Block(-5,22,2,LEAVES);
Block(-4,8,-3,LEAVES);
Block(-4,8,-2,LEAVES);
Block(-4,9,-4,LEAVES);
Block(-4,9,-3,LEAVES);
Block(-4,9,-2,LEAVES);
Block(-4,9,-1,LEAVES);
Block(-4,9,0,LEAVES);
Block(-4,9,1,LEAVES);
Block(-4,9,3,LOG);
Block(-4,10,-5,LEAVES);
Block(-4,10,-4,LEAVES);
Block(-4,10,-3,LEAVES);
Block(-4,10,-1,LEAVES);
Block(-4,10,1,LEAVES);
Block(-4,10,2,LEAVES);
Block(-4,10,3,LOG);
Block(-4,10,4,LOG);
Block(-4,11,-6,LEAVES);
Block(-4,11,-5,LEAVES);
Block(-4,11,-4,LEAVES);
Block(-4,11,-2,LEAVES);
Block(-4,11,-1,LEAVES);
Block(-4,11,0,LEAVES);
Block(-4,11,1,LEAVES);
Block(-4,11,2,LEAVES);
Block(-4,11,3,LOG);
Block(-4,11,4,LOG);
Block(-4,11,5,LEAVES);
Block(-4,12,-5,LEAVES);
Block(-4,12,-4,LEAVES);
Block(-4,12,-3,LEAVES);
Block(-4,12,-2,LEAVES);
Block(-4,12,-1,LEAVES);
Block(-4,12,0,LEAVES);
Block(-4,12,1,LEAVES);
Block(-4,12,2,LEAVES);
Block(-4,12,3,LEAVES);
Block(-4,12,4,LOG);
Block(-4,12,5,LEAVES);
Block(-4,12,6,LEAVES);
Block(-4,12,7,LEAVES);
Block(-4,13,-5,LEAVES);
Block(-4,13,-4,LEAVES);
Block(-4,13,-3,LEAVES);
Block(-4,13,-2,LEAVES);
Block(-4,13,-1,LEAVES);
Block(-4,13,0,LEAVES);
Block(-4,13,1,LEAVES);
Block(-4,13,2,LEAVES);
Block(-4,13,3,LEAVES);
Block(-4,13,4,LOG);
Block(-4,13,5,LEAVES);
Block(-4,13,6,LEAVES);
Block(-4,14,-5,LEAVES);
Block(-4,14,-4,LEAVES);
Block(-4,14,-3,LEAVES);
Block(-4,14,-2,LEAVES);
Block(-4,14,0,LEAVES);
Block(-4,14,1,LEAVES);
Block(-4,14,2,LEAVES);
Block(-4,14,3,LEAVES);
Block(-4,14,4,LEAVES);
Block(-4,14,5,LEAVES);
Block(-4,14,6,LEAVES);
Block(-4,14,7,LEAVES);
Block(-4,15,-4,LEAVES);
Block(-4,15,-3,LEAVES);
Block(-4,15,-2,LEAVES);
Block(-4,15,-1,LEAVES);
Block(-4,15,0,LEAVES);
Block(-4,15,1,LEAVES);
Block(-4,15,2,LEAVES);
Block(-4,15,3,LEAVES);
Block(-4,15,4,LEAVES);
Block(-4,15,5,LEAVES);
Block(-4,15,6,LEAVES);
Block(-4,15,7,LEAVES);
Block(-4,16,-3,LEAVES);
Block(-4,16,-2,LEAVES);
Block(-4,16,-1,LEAVES);
Block(-4,16,0,LEAVES);
Block(-4,16,1,LEAVES);
Block(-4,16,2,LEAVES);
Block(-4,16,3,LEAVES);
Block(-4,16,4,LEAVES);
Block(-4,16,5,LEAVES);
Block(-4,16,6,LEAVES);
Block(-4,16,7,LEAVES);
Block(-4,17,-4,LEAVES);
Block(-4,17,-3,LEAVES);
Block(-4,17,-2,LEAVES);
Block(-4,17,-1,LEAVES);
Block(-4,17,0,LEAVES);
Block(-4,17,1,LEAVES);
Block(-4,17,2,LEAVES);
Block(-4,17,3,LEAVES);
Block(-4,17,4,LEAVES);
Block(-4,17,5,LEAVES);
Block(-4,17,6,LEAVES);
Block(-4,17,7,LEAVES);
Block(-4,17,8,LEAVES);
Block(-4,18,-4,LEAVES);
Block(-4,18,-3,LEAVES);
Block(-4,18,-2,LEAVES);
Block(-4,18,-1,LEAVES);
Block(-4,18,0,LEAVES);
Block(-4,18,1,LEAVES);
Block(-4,18,2,LEAVES);
Block(-4,18,3,LEAVES);
Block(-4,18,4,LEAVES);
Block(-4,18,5,LEAVES);
Block(-4,18,7,LEAVES);
Block(-4,18,8,LEAVES);
Block(-4,19,-3,LEAVES);
Block(-4,19,-2,LEAVES);
Block(-4,19,-1,LEAVES);
Block(-4,19,0,LEAVES);
Block(-4,19,1,LEAVES);
Block(-4,19,2,LEAVES);
Block(-4,19,3,LEAVES);
Block(-4,19,4,LEAVES);
Block(-4,19,7,LEAVES);
Block(-4,20,-2,LEAVES);
Block(-4,20,-1,LEAVES);
Block(-4,20,0,LEAVES);
Block(-4,20,1,LEAVES);
Block(-4,20,2,LEAVES);
Block(-4,20,3,LEAVES);
Block(-4,21,-3,LEAVES);
Block(-4,21,0,LEAVES);
Block(-4,21,1,LEAVES);
Block(-4,21,2,LEAVES);
Block(-4,22,-2,LEAVES);
Block(-4,22,-1,LEAVES);
Block(-4,22,2,LEAVES);
Block(-4,22,3,LEAVES);
Block(-3,1,1,LOG);
Block(-3,1,2,LOG);
Block(-3,1,3,LOG);
Block(-3,7,3,LOG);
Block(-3,8,-5,LEAVES);
Block(-3,8,-4,LEAVES);
Block(-3,8,-3,LEAVES);
Block(-3,8,2,LOG);
Block(-3,8,3,LOG);
Block(-3,9,-5,LEAVES);
Block(-3,9,-3,LEAVES);
Block(-3,9,-2,LEAVES);
Block(-3,9,3,LOG);
Block(-3,10,-5,LEAVES);
Block(-3,10,-4,LEAVES);
Block(-3,10,-3,LEAVES);
Block(-3,10,-1,LEAVES);
Block(-3,10,1,LEAVES);
Block(-3,10,2,LEAVES);
Block(-3,10,3,LEAVES);
Block(-3,10,5,LEAVES);
Block(-3,10,6,LEAVES);
Block(-3,11,-6,LEAVES);
Block(-3,11,-5,LEAVES);
Block(-3,11,-4,LEAVES);
Block(-3,11,-3,LOG);
Block(-3,11,-2,LEAVES);
Block(-3,11,-1,LEAVES);
Block(-3,11,0,LEAVES);
Block(-3,11,1,LEAVES);
Block(-3,11,2,LEAVES);
Block(-3,11,3,LEAVES);
Block(-3,11,4,LEAVES);
Block(-3,11,5,LEAVES);
Block(-3,11,6,LEAVES);
Block(-3,12,-5,LEAVES);
Block(-3,12,-4,LEAVES);
Block(-3,12,-3,LOG);
Block(-3,12,-2,LEAVES);
Block(-3,12,-1,LEAVES);
Block(-3,12,0,LEAVES);
Block(-3,12,1,LEAVES);
Block(-3,12,2,LEAVES);
Block(-3,12,3,LEAVES);
Block(-3,12,4,LEAVES);
Block(-3,12,5,LEAVES);
Block(-3,12,6,LEAVES);
Block(-3,13,-5,LEAVES);
Block(-3,13,-4,LEAVES);
Block(-3,13,-3,LEAVES);
Block(-3,13,-2,LEAVES);
Block(-3,13,-1,LEAVES);
Block(-3,13,0,LEAVES);
Block(-3,13,1,LEAVES);
Block(-3,13,2,LEAVES);
Block(-3,13,3,LEAVES);
Block(-3,13,4,LEAVES);
Block(-3,13,5,LEAVES);
Block(-3,13,6,LEAVES);
Block(-3,14,-5,LEAVES);
Block(-3,14,-4,LEAVES);
Block(-3,14,-3,LEAVES);
Block(-3,14,-2,LEAVES);
Block(-3,14,-1,LEAVES);
Block(-3,14,0,LEAVES);
Block(-3,14,1,LEAVES);
Block(-3,14,2,LEAVES);
Block(-3,14,3,LEAVES);
Block(-3,14,4,LEAVES);
Block(-3,14,5,LEAVES);
Block(-3,14,7,LEAVES);
Block(-3,15,-4,LEAVES);
Block(-3,15,-3,LEAVES);
Block(-3,15,-2,LEAVES);
Block(-3,15,-1,LEAVES);
Block(-3,15,0,LEAVES);
Block(-3,15,1,LEAVES);
Block(-3,15,2,LEAVES);
Block(-3,15,3,LEAVES);
Block(-3,15,4,LEAVES);
Block(-3,15,5,LEAVES);
Block(-3,15,6,LEAVES);
Block(-3,15,7,LEAVES);
Block(-3,15,8,LEAVES);
Block(-3,16,-3,LEAVES);
Block(-3,16,-2,LEAVES);
Block(-3,16,-1,LEAVES);
Block(-3,16,0,LEAVES);
Block(-3,16,1,LEAVES);
Block(-3,16,2,LEAVES);
Block(-3,16,4,LEAVES);
Block(-3,16,5,LEAVES);
Block(-3,16,6,LEAVES);
Block(-3,17,-3,LEAVES);
Block(-3,17,-2,LEAVES);
Block(-3,17,-1,LEAVES);
Block(-3,17,0,LEAVES);
Block(-3,17,1,LEAVES);
Block(-3,17,2,LEAVES);
Block(-3,17,3,LEAVES);
Block(-3,17,4,LEAVES);
Block(-3,17,5,LEAVES);
Block(-3,17,7,LEAVES);
Block(-3,18,-3,LEAVES);
Block(-3,18,-2,LEAVES);
Block(-3,18,-1,LEAVES);
Block(-3,18,0,LEAVES);
Block(-3,18,1,LEAVES);
Block(-3,18,2,LEAVES);
Block(-3,18,3,LEAVES);
Block(-3,18,4,LEAVES);
Block(-3,19,-4,LEAVES);
Block(-3,19,-3,LEAVES);
Block(-3,19,-2,LEAVES);
Block(-3,19,-1,LEAVES);
Block(-3,19,0,LEAVES);
Block(-3,19,1,LEAVES);
Block(-3,19,2,LEAVES);
Block(-3,19,3,LEAVES);
Block(-3,19,4,LEAVES);
Block(-3,19,5,LEAVES);
Block(-3,20,-2,LEAVES);
Block(-3,20,0,LEAVES);
Block(-3,20,1,LEAVES);
Block(-3,20,2,LEAVES);
Block(-3,20,3,LEAVES);
Block(-3,20,4,LEAVES);
Block(-3,21,-4,LEAVES);
Block(-3,21,-3,LEAVES);
Block(-3,21,-2,LEAVES);
Block(-3,21,-1,LEAVES);
Block(-3,21,0,LEAVES);
Block(-3,21,2,LEAVES);
Block(-3,21,4,LEAVES);
Block(-3,22,-2,LEAVES);
Block(-3,22,-1,LEAVES);
Block(-3,22,0,LEAVES);
Block(-3,24,-1,LEAVES);
Block(-2,1,0,LOG);
Block(-2,1,1,LOG);
Block(-2,1,2,LOG);
Block(-2,1,3,LOG);
Block(-2,1,4,LOG);
Block(-2,2,1,LOG);
Block(-2,2,2,LOG);
Block(-2,2,3,LOG);
Block(-2,2,4,LOG);
Block(-2,3,1,LOG);
Block(-2,3,2,LOG);
Block(-2,5,2,LOG);
Block(-2,6,2,LOG);
Block(-2,7,2,LOG);
Block(-2,7,3,LOG);
Block(-2,8,-4,LEAVES);
Block(-2,8,-2,LOG);
Block(-2,8,-1,LOG);
Block(-2,8,2,LOG);
Block(-2,9,-4,LEAVES);
Block(-2,9,-3,LEAVES);
Block(-2,9,-2,LOG);
Block(-2,9,5,LEAVES);
Block(-2,10,-6,LEAVES);
Block(-2,10,-5,LEAVES);
Block(-2,10,-3,LOG);
Block(-2,10,-2,LOG);
Block(-2,10,1,LEAVES);
Block(-2,10,3,LEAVES);
Block(-2,10,5,LEAVES);
Block(-2,10,6,LEAVES);
Block(-2,11,-6,LEAVES);
Block(-2,11,-5,LEAVES);
Block(-2,11,-4,LEAVES);
Block(-2,11,-3,LOG);
Block(-2,11,-2,LOG);
Block(-2,11,1,LEAVES);
Block(-2,11,5,LEAVES);
Block(-2,12,-2,LEAVES);
Block(-2,12,-1,LEAVES);
Block(-2,12,0,LEAVES);
Block(-2,12,3,LEAVES);
Block(-2,12,4,LEAVES);
Block(-2,12,5,LEAVES);
Block(-2,13,-5,LEAVES);
Block(-2,13,-4,LEAVES);
Block(-2,13,-3,LEAVES);
Block(-2,13,-2,LEAVES);
Block(-2,13,-1,LEAVES);
Block(-2,13,0,LEAVES);
Block(-2,13,2,LEAVES);
Block(-2,13,3,LEAVES);
Block(-2,13,4,LEAVES);
Block(-2,13,5,LEAVES);
Block(-2,13,6,LEAVES);
Block(-2,14,-4,LEAVES);
Block(-2,14,-3,LEAVES);
Block(-2,14,-2,LEAVES);
Block(-2,14,2,LEAVES);
Block(-2,14,3,LEAVES);
Block(-2,14,4,LEAVES);
Block(-2,14,5,LEAVES);
Block(-2,14,6,LEAVES);
Block(-2,15,-3,LEAVES);
Block(-2,15,-2,LEAVES);
Block(-2,15,-1,LEAVES);
Block(-2,15,0,LEAVES);
Block(-2,15,1,LEAVES);
Block(-2,15,2,LEAVES);
Block(-2,15,3,LEAVES);
Block(-2,15,4,LEAVES);
Block(-2,15,5,LEAVES);
Block(-2,15,7,LEAVES);
Block(-2,16,-4,LEAVES);
Block(-2,16,-3,LEAVES);
Block(-2,16,-2,LEAVES);
Block(-2,16,-1,LEAVES);
Block(-2,16,0,LEAVES);
Block(-2,16,2,LEAVES);
Block(-2,16,3,LEAVES);
Block(-2,16,4,LEAVES);
Block(-2,16,5,LEAVES);
Block(-2,16,6,LEAVES);
Block(-2,16,7,LEAVES);
Block(-2,17,-5,LEAVES);
Block(-2,17,-4,LEAVES);
Block(-2,17,-3,LEAVES);
Block(-2,17,-2,LEAVES);
Block(-2,17,-1,LEAVES);
Block(-2,17,0,LEAVES);
Block(-2,17,1,LEAVES);
Block(-2,17,2,LEAVES);
Block(-2,17,3,LEAVES);
Block(-2,17,4,LEAVES);
Block(-2,17,5,LEAVES);
Block(-2,18,-3,LEAVES);
Block(-2,18,-2,LEAVES);
Block(-2,18,-1,LEAVES);
Block(-2,18,0,LEAVES);
Block(-2,18,1,LEAVES);
Block(-2,18,2,LEAVES);
Block(-2,18,3,LEAVES);
Block(-2,18,4,LEAVES);
Block(-2,19,-4,LEAVES);
Block(-2,19,-3,LEAVES);
Block(-2,19,-2,LEAVES);
Block(-2,19,-1,LEAVES);
Block(-2,19,0,LEAVES);
Block(-2,19,1,LEAVES);
Block(-2,19,2,LEAVES);
Block(-2,19,3,LEAVES);
Block(-2,19,4,LEAVES);
Block(-2,19,5,LEAVES);
Block(-2,20,-4,LEAVES);
Block(-2,20,-3,LEAVES);
Block(-2,20,-2,LEAVES);
Block(-2,20,1,LEAVES);
Block(-2,20,2,LEAVES);
Block(-2,20,3,LEAVES);
Block(-2,20,4,LEAVES);
Block(-2,20,5,LEAVES);
Block(-2,21,-2,LEAVES);
Block(-2,21,1,LEAVES);
Block(-2,21,5,LEAVES);
Block(-2,22,-2,LEAVES);
Block(-2,22,0,LEAVES);
Block(-2,23,-2,LEAVES);
Block(-2,23,-1,LEAVES);
Block(-2,24,-1,LEAVES);
Block(-2,24,0,LEAVES);
Block(-1,1,0,LOG);
Block(-1,1,1,LOG);
Block(-1,1,2,LOG);
Block(-1,1,3,LOG);
Block(-1,1,4,LOG);
Block(-1,2,0,LOG);
Block(-1,2,1,LOG);
Block(-1,2,2,LOG);
Block(-1,2,3,LOG);
Block(-1,3,0,LOG);
Block(-1,3,1,LOG);
Block(-1,3,2,LOG);
Block(-1,4,1,LOG);
Block(-1,4,2,LOG);
Block(-1,4,3,LOG);
Block(-1,5,1,LOG);
Block(-1,5,2,LOG);
Block(-1,6,0,LOG);
Block(-1,6,1,LOG);
Block(-1,6,2,LOG);
Block(-1,7,-1,LOG);
Block(-1,7,0,LOG);
Block(-1,8,-1,LOG);
Block(-1,9,-4,LEAVES);
Block(-1,10,-5,LEAVES);
Block(-1,10,-4,LEAVES);
Block(-1,10,-2,LEAVES);
Block(-1,10,3,LEAVES);
Block(-1,11,-4,LEAVES);
Block(-1,11,-3,LEAVES);
Block(-1,11,-2,LEAVES);
Block(-1,11,5,LEAVES);
Block(-1,12,-5,LEAVES);
Block(-1,12,-4,LEAVES);
Block(-1,12,-3,LEAVES);
Block(-1,12,-2,LEAVES);
Block(-1,12,4,LEAVES);
Block(-1,12,5,LEAVES);
Block(-1,13,-5,LEAVES);
Block(-1,13,-4,LEAVES);
Block(-1,13,-3,LEAVES);
Block(-1,13,-2,LEAVES);
Block(-1,13,-1,LEAVES);
Block(-1,13,2,LEAVES);
Block(-1,13,3,LEAVES);
Block(-1,13,4,LEAVES);
Block(-1,13,5,LEAVES);
Block(-1,14,-5,LEAVES);
Block(-1,14,-4,LEAVES);
Block(-1,14,-3,LEAVES);
Block(-1,14,-2,LEAVES);
Block(-1,14,3,LEAVES);
Block(-1,14,4,LEAVES);
Block(-1,14,5,LEAVES);
Block(-1,15,-3,LEAVES);
Block(-1,15,-2,LEAVES);
Block(-1,15,-1,LEAVES);
Block(-1,15,0,LEAVES);
Block(-1,15,1,LEAVES);
Block(-1,15,2,LEAVES);
Block(-1,15,3,LEAVES);
Block(-1,15,4,LEAVES);
Block(-1,15,5,LEAVES);
Block(-1,16,-4,LEAVES);
Block(-1,16,-3,LEAVES);
Block(-1,16,-2,LEAVES);
Block(-1,16,-1,LEAVES);
Block(-1,16,0,LEAVES);
Block(-1,16,1,LEAVES);
Block(-1,16,2,LEAVES);
Block(-1,16,3,LEAVES);
Block(-1,16,4,LEAVES);
Block(-1,16,5,LEAVES);
Block(-1,17,-4,LEAVES);
Block(-1,17,-3,LEAVES);
Block(-1,17,-2,LEAVES);
Block(-1,17,-1,LEAVES);
Block(-1,17,0,LEAVES);
Block(-1,17,1,LEAVES);
Block(-1,17,3,LEAVES);
Block(-1,17,4,LEAVES);
Block(-1,17,5,LEAVES);
Block(-1,17,6,LEAVES);
Block(-1,18,-5,LEAVES);
Block(-1,18,-4,LEAVES);
Block(-1,18,-3,LEAVES);
Block(-1,18,-2,LEAVES);
Block(-1,18,-1,LEAVES);
Block(-1,18,0,LEAVES);
Block(-1,18,1,LEAVES);
Block(-1,18,2,LEAVES);
Block(-1,18,3,LEAVES);
Block(-1,18,4,LEAVES);
Block(-1,18,5,LEAVES);
Block(-1,19,-5,LEAVES);
Block(-1,19,-4,LEAVES);
Block(-1,19,-3,LEAVES);
Block(-1,19,-2,LEAVES);
Block(-1,19,-1,LEAVES);
Block(-1,19,0,LEAVES);
Block(-1,19,1,LEAVES);
Block(-1,19,2,LEAVES);
Block(-1,19,3,LEAVES);
Block(-1,19,4,LEAVES);
Block(-1,19,5,LEAVES);
Block(-1,20,-3,LEAVES);
Block(-1,20,-1,LEAVES);
Block(-1,20,0,LEAVES);
Block(-1,20,1,LEAVES);
Block(-1,20,2,LEAVES);
Block(-1,20,4,LEAVES);
Block(-1,21,-4,LEAVES);
Block(-1,21,-3,LEAVES);
Block(-1,21,-2,LEAVES);
Block(-1,21,-1,LEAVES);
Block(-1,21,1,LEAVES);
Block(-1,21,2,LEAVES);
Block(-1,21,4,LEAVES);
Block(-1,22,-3,LEAVES);
Block(-1,22,-2,LEAVES);
Block(-1,22,-1,LEAVES);
Block(-1,22,0,LEAVES);
Block(-1,22,1,LEAVES);
Block(-1,22,4,LEAVES);
Block(-1,23,-3,LEAVES);
Block(-1,23,-2,LEAVES);
Block(-1,23,-1,LEAVES);
Block(-1,23,1,LEAVES);
Block(-1,24,0,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,-1,LOG);
Block(0,1,0,LOG);
Block(0,1,1,LOG);
Block(0,1,2,LOG);
Block(0,1,3,LOG);
Block(0,2,-1,LOG);
Block(0,2,0,LOG);
Block(0,2,1,LOG);
Block(0,2,2,LOG);
Block(0,2,3,LOG);
Block(0,3,0,LOG);
Block(0,3,1,LOG);
Block(0,3,2,LOG);
Block(0,3,3,LOG);
Block(0,4,0,LOG);
Block(0,4,1,LOG);
Block(0,4,2,LOG);
Block(0,5,0,LOG);
Block(0,5,1,LOG);
Block(0,5,2,LOG);
Block(0,6,1,LOG);
Block(0,9,-3,LEAVES);
Block(0,10,-3,LEAVES);
Block(0,10,-2,LEAVES);
Block(0,10,3,LEAVES);
Block(0,11,-3,LEAVES);
Block(0,11,-2,LEAVES);
Block(0,11,-1,LEAVES);
Block(0,11,5,LEAVES);
Block(0,11,7,LEAVES);
Block(0,12,-7,LEAVES);
Block(0,12,-4,LEAVES);
Block(0,12,-3,LEAVES);
Block(0,12,-2,LEAVES);
Block(0,12,-1,LEAVES);
Block(0,12,2,LEAVES);
Block(0,12,3,LEAVES);
Block(0,12,4,LEAVES);
Block(0,12,5,LEAVES);
Block(0,12,6,LEAVES);
Block(0,12,7,LEAVES);
Block(0,12,8,LEAVES);
Block(0,13,-4,LEAVES);
Block(0,13,-3,LEAVES);
Block(0,13,-2,LEAVES);
Block(0,13,-1,LEAVES);
Block(0,13,0,LEAVES);
Block(0,13,2,LEAVES);
Block(0,13,3,LEAVES);
Block(0,13,4,LEAVES);
Block(0,13,5,LEAVES);
Block(0,13,8,LEAVES);
Block(0,13,9,LEAVES);
Block(0,14,-5,LEAVES);
Block(0,14,-4,LEAVES);
Block(0,14,-3,LEAVES);
Block(0,14,-2,LEAVES);
Block(0,14,-1,LEAVES);
Block(0,14,1,LEAVES);
Block(0,14,2,LEAVES);
Block(0,14,3,LEAVES);
Block(0,14,4,LEAVES);
Block(0,14,5,LEAVES);
Block(0,14,7,LEAVES);
Block(0,15,-5,LEAVES);
Block(0,15,-4,LEAVES);
Block(0,15,-3,LEAVES);
Block(0,15,-2,LEAVES);
Block(0,15,-1,LEAVES);
Block(0,15,2,LEAVES);
Block(0,15,3,LEAVES);
Block(0,15,4,LEAVES);
Block(0,15,5,LEAVES);
Block(0,16,-4,LEAVES);
Block(0,16,-3,LEAVES);
Block(0,16,-2,LEAVES);
Block(0,16,0,LEAVES);
Block(0,16,1,LEAVES);
Block(0,16,2,LEAVES);
Block(0,16,3,LEAVES);
Block(0,16,4,LEAVES);
Block(0,16,5,LEAVES);
Block(0,17,-5,LEAVES);
Block(0,17,-4,LEAVES);
Block(0,17,-3,LEAVES);
Block(0,17,-1,LEAVES);
Block(0,17,0,LEAVES);
Block(0,17,1,LEAVES);
Block(0,17,2,LEAVES);
Block(0,17,3,LEAVES);
Block(0,17,4,LEAVES);
Block(0,17,5,LEAVES);
Block(0,17,6,LEAVES);
Block(0,17,7,LEAVES);
Block(0,18,-5,LEAVES);
Block(0,18,-2,LEAVES);
Block(0,18,-1,LEAVES);
Block(0,18,0,LEAVES);
Block(0,18,1,LEAVES);
Block(0,18,2,LEAVES);
Block(0,18,3,LEAVES);
Block(0,18,4,LEAVES);
Block(0,18,5,LEAVES);
Block(0,19,-2,LEAVES);
Block(0,19,-1,LEAVES);
Block(0,19,0,LEAVES);
Block(0,19,2,LEAVES);
Block(0,19,3,LEAVES);
Block(0,20,-3,LEAVES);
Block(0,20,-2,LEAVES);
Block(0,20,-1,LEAVES);
Block(0,20,0,LEAVES);
Block(0,20,1,LEAVES);
Block(0,20,2,LEAVES);
Block(0,20,3,LEAVES);
Block(0,20,4,LEAVES);
Block(0,20,5,LEAVES);
Block(0,21,-3,LEAVES);
Block(0,21,-2,LEAVES);
Block(0,21,-1,LEAVES);
Block(0,21,0,LEAVES);
Block(0,21,1,LEAVES);
Block(0,21,3,LEAVES);
Block(0,22,-3,LEAVES);
Block(0,22,0,LEAVES);
Block(0,22,1,LEAVES);
Block(0,22,3,LEAVES);
Block(0,23,-2,LEAVES);
Block(0,23,-1,LEAVES);
Block(1,1,-2,LOG);
Block(1,1,-1,LOG);
Block(1,1,0,LOG);
Block(1,1,1,LOG);
Block(1,1,2,LOG);
Block(1,2,-1,LOG);
Block(1,2,0,LOG);
Block(1,2,1,LOG);
Block(1,3,-1,LOG);
Block(1,3,0,LOG);
Block(1,3,1,LOG);
Block(1,3,2,LOG);
Block(1,4,0,LOG);
Block(1,4,1,LOG);
Block(1,5,0,LOG);
Block(1,5,1,LOG);
Block(1,6,0,LOG);
Block(1,6,1,LOG);
Block(1,6,2,LOG);
Block(1,7,2,LOG);
Block(1,8,2,LOG);
Block(1,8,3,LOG);
Block(1,10,2,LEAVES);
Block(1,11,-3,LEAVES);
Block(1,11,3,LEAVES);
Block(1,11,4,LEAVES);
Block(1,11,5,LEAVES);
Block(1,11,6,LEAVES);
Block(1,12,-7,LEAVES);
Block(1,12,-6,LEAVES);
Block(1,12,-3,LEAVES);
Block(1,12,-2,LEAVES);
Block(1,12,0,LEAVES);
Block(1,12,4,LEAVES);
Block(1,12,5,LEAVES);
Block(1,12,6,LEAVES);
Block(1,12,7,LEAVES);
Block(1,12,8,LEAVES);
Block(1,13,-7,LEAVES);
Block(1,13,-6,LEAVES);
Block(1,13,-3,LEAVES);
Block(1,13,-2,LEAVES);
Block(1,13,-1,LEAVES);
Block(1,13,0,LEAVES);
Block(1,13,1,LEAVES);
Block(1,13,2,LEAVES);
Block(1,13,3,LEAVES);
Block(1,13,4,LEAVES);
Block(1,13,5,LEAVES);
Block(1,13,6,LEAVES);
Block(1,13,7,LEAVES);
Block(1,13,8,LEAVES);
Block(1,14,-4,LEAVES);
Block(1,14,-3,LEAVES);
Block(1,14,-2,LEAVES);
Block(1,14,-1,LEAVES);
Block(1,14,0,LEAVES);
Block(1,14,1,LEAVES);
Block(1,14,2,LEAVES);
Block(1,14,3,LEAVES);
Block(1,14,4,LEAVES);
Block(1,14,5,LEAVES);
Block(1,14,7,LEAVES);
Block(1,15,-5,LEAVES);
Block(1,15,-4,LEAVES);
Block(1,15,-3,LEAVES);
Block(1,15,-2,LEAVES);
Block(1,15,-1,LEAVES);
Block(1,15,0,LEAVES);
Block(1,15,1,LEAVES);
Block(1,15,2,LEAVES);
Block(1,15,3,LEAVES);
Block(1,15,4,LEAVES);
Block(1,15,5,LEAVES);
Block(1,15,6,LEAVES);
Block(1,15,7,LEAVES);
Block(1,16,-4,LEAVES);
Block(1,16,-3,LEAVES);
Block(1,16,-1,LEAVES);
Block(1,16,0,LEAVES);
Block(1,16,1,LEAVES);
Block(1,16,2,LEAVES);
Block(1,16,3,LEAVES);
Block(1,16,5,LEAVES);
Block(1,16,6,LEAVES);
Block(1,17,-4,LEAVES);
Block(1,17,-3,LEAVES);
Block(1,17,0,LEAVES);
Block(1,17,1,LEAVES);
Block(1,17,3,LEAVES);
Block(1,17,4,LEAVES);
Block(1,18,-3,LEAVES);
Block(1,18,-2,LEAVES);
Block(1,18,-1,LEAVES);
Block(1,18,0,LEAVES);
Block(1,18,1,LEAVES);
Block(1,18,2,LEAVES);
Block(1,18,3,LEAVES);
Block(1,18,5,LEAVES);
Block(1,19,-5,LEAVES);
Block(1,19,-2,LEAVES);
Block(1,19,-1,LEAVES);
Block(1,19,0,LEAVES);
Block(1,19,1,LEAVES);
Block(1,19,2,LEAVES);
Block(1,19,3,LEAVES);
Block(1,19,4,LEAVES);
Block(1,19,5,LEAVES);
Block(1,20,-3,LEAVES);
Block(1,20,-2,LEAVES);
Block(1,20,-1,LEAVES);
Block(1,20,0,LEAVES);
Block(1,20,1,LEAVES);
Block(1,20,2,LEAVES);
Block(1,20,3,LEAVES);
Block(1,20,4,LEAVES);
Block(1,21,-3,LEAVES);
Block(1,21,-2,LEAVES);
Block(1,21,0,LEAVES);
Block(1,21,1,LEAVES);
Block(1,22,-2,LEAVES);
Block(1,22,1,LEAVES);
Block(1,23,-1,LEAVES);
Block(2,1,-2,LOG);
Block(2,1,-1,LOG);
Block(2,1,0,LOG);
Block(2,1,1,LOG);
Block(2,1,2,LOG);
Block(2,2,-1,LOG);
Block(2,2,0,LOG);
Block(2,2,1,LOG);
Block(2,5,0,LOG);
Block(2,6,0,LOG);
Block(2,6,1,LOG);
Block(2,7,-1,LOG);
Block(2,7,0,LOG);
Block(2,8,-1,LOG);
Block(2,8,3,LOG);
Block(2,9,2,LEAVES);
Block(2,9,3,LOG);
Block(2,9,4,LOG);
Block(2,10,2,LEAVES);
Block(2,10,4,LOG);
Block(2,11,3,LEAVES);
Block(2,11,4,LOG);
Block(2,11,5,LEAVES);
Block(2,11,6,LEAVES);
Block(2,11,7,LEAVES);
Block(2,12,-5,LEAVES);
Block(2,12,-4,LEAVES);
Block(2,12,-3,LEAVES);
Block(2,12,1,LEAVES);
Block(2,12,3,LEAVES);
Block(2,12,4,LEAVES);
Block(2,12,5,LEAVES);
Block(2,12,6,LEAVES);
Block(2,12,7,LEAVES);
Block(2,13,-6,LEAVES);
Block(2,13,-5,LEAVES);
Block(2,13,-4,LEAVES);
Block(2,13,-3,LEAVES);
Block(2,13,-2,LEAVES);
Block(2,13,-1,LEAVES);
Block(2,13,0,LEAVES);
Block(2,13,1,LEAVES);
Block(2,13,2,LEAVES);
Block(2,13,3,LEAVES);
Block(2,13,4,LEAVES);
Block(2,13,5,LEAVES);
Block(2,13,6,LEAVES);
Block(2,13,7,LEAVES);
Block(2,13,8,LEAVES);
Block(2,14,-5,LEAVES);
Block(2,14,-4,LEAVES);
Block(2,14,-3,LEAVES);
Block(2,14,-2,LEAVES);
Block(2,14,-1,LEAVES);
Block(2,14,1,LEAVES);
Block(2,14,2,LEAVES);
Block(2,14,3,LEAVES);
Block(2,14,4,LEAVES);
Block(2,14,6,LEAVES);
Block(2,14,7,LEAVES);
Block(2,15,-4,LEAVES);
Block(2,15,-3,LEAVES);
Block(2,15,-2,LEAVES);
Block(2,15,-1,LEAVES);
Block(2,15,0,LEAVES);
Block(2,15,1,LEAVES);
Block(2,15,2,LEAVES);
Block(2,15,3,LEAVES);
Block(2,15,4,LEAVES);
Block(2,15,5,LEAVES);
Block(2,15,8,LEAVES);
Block(2,16,-4,LEAVES);
Block(2,16,-3,LEAVES);
Block(2,16,-2,LEAVES);
Block(2,16,-1,LEAVES);
Block(2,16,0,LEAVES);
Block(2,16,1,LEAVES);
Block(2,16,2,LEAVES);
Block(2,16,3,LEAVES);
Block(2,16,5,LEAVES);
Block(2,17,-4,LEAVES);
Block(2,17,-2,LEAVES);
Block(2,17,-1,LEAVES);
Block(2,17,0,LEAVES);
Block(2,17,1,LEAVES);
Block(2,17,2,LEAVES);
Block(2,17,3,LEAVES);
Block(2,18,-4,LEAVES);
Block(2,18,-3,LEAVES);
Block(2,18,-2,LEAVES);
Block(2,18,-1,LEAVES);
Block(2,18,0,LEAVES);
Block(2,18,1,LEAVES);
Block(2,18,2,LEAVES);
Block(2,18,3,LEAVES);
Block(2,18,4,LEAVES);
Block(2,18,5,LEAVES);
Block(2,19,-5,LEAVES);
Block(2,19,-4,LEAVES);
Block(2,19,-3,LEAVES);
Block(2,19,-2,LEAVES);
Block(2,19,-1,LEAVES);
Block(2,19,0,LEAVES);
Block(2,19,1,LEAVES);
Block(2,19,2,LEAVES);
Block(2,19,3,LEAVES);
Block(2,19,4,LEAVES);
Block(2,20,-3,LEAVES);
Block(2,20,-1,LEAVES);
Block(2,20,0,LEAVES);
Block(2,20,1,LEAVES);
Block(2,20,3,LEAVES);
Block(2,21,-4,LEAVES);
Block(2,21,-3,LEAVES);
Block(2,21,-2,LEAVES);
Block(2,21,-1,LEAVES);
Block(2,21,3,LEAVES);
Block(2,22,-2,LEAVES);
Block(2,22,1,LEAVES);
Block(2,23,-2,LEAVES);
Block(2,23,-1,LEAVES);
Block(3,1,-1,LOG);
Block(3,1,0,LOG);
Block(3,1,1,LOG);
Block(3,6,0,LOG);
Block(3,7,0,LOG);
Block(3,8,-1,LOG);
Block(3,8,0,LOG);
Block(3,9,-1,LOG);
Block(3,9,0,LOG);
Block(3,9,2,LEAVES);
Block(3,9,3,LEAVES);
Block(3,10,-5,LEAVES);
Block(3,10,-3,LEAVES);
Block(3,10,-2,LEAVES);
Block(3,10,-1,LOG);
Block(3,10,1,LEAVES);
Block(3,10,2,LEAVES);
Block(3,10,3,LEAVES);
Block(3,10,4,LEAVES);
Block(3,11,-6,LEAVES);
Block(3,11,-5,LEAVES);
Block(3,11,-2,LOG);
Block(3,11,2,LEAVES);
Block(3,11,3,LEAVES);
Block(3,11,4,LOG);
Block(3,11,5,LOG);
Block(3,11,6,LEAVES);
Block(3,12,-5,LEAVES);
Block(3,12,-4,LEAVES);
Block(3,12,-3,LEAVES);
Block(3,12,-2,LEAVES);
Block(3,12,-1,LEAVES);
Block(3,12,2,LEAVES);
Block(3,12,3,LEAVES);
Block(3,12,5,LOG);
Block(3,12,6,LEAVES);
Block(3,12,7,LEAVES);
Block(3,13,-5,LEAVES);
Block(3,13,-3,LEAVES);
Block(3,13,-2,LEAVES);
Block(3,13,-1,LEAVES);
Block(3,13,0,LEAVES);
Block(3,13,3,LEAVES);
Block(3,13,4,LEAVES);
Block(3,13,5,LOG);
Block(3,13,6,LEAVES);
Block(3,13,7,LEAVES);
Block(3,13,8,LEAVES);
Block(3,13,9,LEAVES);
Block(3,13,10,LEAVES);
Block(3,14,-4,LEAVES);
Block(3,14,-2,LEAVES);
Block(3,14,-1,LEAVES);
Block(3,14,0,LEAVES);
Block(3,14,1,LEAVES);
Block(3,14,2,LEAVES);
Block(3,14,3,LEAVES);
Block(3,14,4,LEAVES);
Block(3,14,5,LOG);
Block(3,14,6,LEAVES);
Block(3,14,7,LEAVES);
Block(3,15,-3,LEAVES);
Block(3,15,-2,LEAVES);
Block(3,15,-1,LEAVES);
Block(3,15,0,LEAVES);
Block(3,15,1,LEAVES);
Block(3,15,2,LEAVES);
Block(3,15,3,LEAVES);
Block(3,15,4,LEAVES);
Block(3,15,5,LEAVES);
Block(3,15,6,LEAVES);
Block(3,15,7,LEAVES);
Block(3,15,8,LEAVES);
Block(3,16,-6,LEAVES);
Block(3,16,-5,LEAVES);
Block(3,16,-4,LEAVES);
Block(3,16,-3,LEAVES);
Block(3,16,-2,LEAVES);
Block(3,16,-1,LEAVES);
Block(3,16,0,LEAVES);
Block(3,16,1,LEAVES);
Block(3,16,2,LEAVES);
Block(3,16,3,LEAVES);
Block(3,16,4,LEAVES);
Block(3,16,5,LEAVES);
Block(3,16,8,LEAVES);
Block(3,16,9,LEAVES);
Block(3,17,-5,LEAVES);
Block(3,17,-4,LEAVES);
Block(3,17,-3,LEAVES);
Block(3,17,-2,LEAVES);
Block(3,17,-1,LEAVES);
Block(3,17,0,LEAVES);
Block(3,17,1,LEAVES);
Block(3,17,2,LEAVES);
Block(3,17,3,LEAVES);
Block(3,17,4,LEAVES);
Block(3,17,7,LEAVES);
Block(3,18,-4,LEAVES);
Block(3,18,-2,LEAVES);
Block(3,18,-1,LEAVES);
Block(3,18,0,LEAVES);
Block(3,18,1,LEAVES);
Block(3,18,3,LEAVES);
Block(3,18,4,LEAVES);
Block(3,18,5,LEAVES);
Block(3,18,7,LEAVES);
Block(3,19,-6,LEAVES);
Block(3,19,-4,LEAVES);
Block(3,19,-3,LEAVES);
Block(3,19,-2,LEAVES);
Block(3,19,-1,LEAVES);
Block(3,19,0,LEAVES);
Block(3,19,1,LEAVES);
Block(3,19,3,LEAVES);
Block(3,19,4,LEAVES);
Block(3,20,-6,LEAVES);
Block(3,20,-4,LEAVES);
Block(3,20,-3,LEAVES);
Block(3,20,-2,LEAVES);
Block(3,20,-1,LEAVES);
Block(3,20,0,LEAVES);
Block(3,20,1,LEAVES);
Block(3,20,3,LEAVES);
Block(3,21,-4,LEAVES);
Block(3,21,-2,LEAVES);
Block(3,21,0,LEAVES);
Block(3,22,-2,LEAVES);
Block(3,22,1,LEAVES);
Block(4,9,0,LOG);
Block(4,9,3,LEAVES);
Block(4,10,-2,LOG);
Block(4,10,-1,LOG);
Block(4,10,0,LOG);
Block(4,10,2,LEAVES);
Block(4,11,-2,LOG);
Block(4,11,2,LEAVES);
Block(4,11,3,LEAVES);
Block(4,11,4,LEAVES);
Block(4,12,-5,LEAVES);
Block(4,12,-2,LOG);
Block(4,12,-1,LEAVES);
Block(4,12,0,LEAVES);
Block(4,12,1,LEAVES);
Block(4,12,3,LEAVES);
Block(4,12,5,LEAVES);
Block(4,13,-5,LEAVES);
Block(4,13,-4,LEAVES);
Block(4,13,-3,LEAVES);
Block(4,13,-2,LOG);
Block(4,13,-1,LEAVES);
Block(4,13,0,LEAVES);
Block(4,13,1,LEAVES);
Block(4,13,3,LEAVES);
Block(4,13,4,LEAVES);
Block(4,13,5,LEAVES);
Block(4,13,6,LEAVES);
Block(4,14,-5,LEAVES);
Block(4,14,-4,LEAVES);
Block(4,14,-3,LEAVES);
Block(4,14,-2,LOG);
Block(4,14,-1,LEAVES);
Block(4,14,1,LEAVES);
Block(4,14,2,LEAVES);
Block(4,14,3,LEAVES);
Block(4,14,4,LEAVES);
Block(4,14,5,LEAVES);
Block(4,15,-3,LEAVES);
Block(4,15,-2,LEAVES);
Block(4,15,-1,LEAVES);
Block(4,15,0,LEAVES);
Block(4,15,1,LEAVES);
Block(4,15,2,LEAVES);
Block(4,15,3,LEAVES);
Block(4,15,5,LEAVES);
Block(4,15,6,LEAVES);
Block(4,15,8,LEAVES);
Block(4,16,-5,LEAVES);
Block(4,16,-4,LEAVES);
Block(4,16,-3,LEAVES);
Block(4,16,-2,LEAVES);
Block(4,16,0,LEAVES);
Block(4,16,1,LEAVES);
Block(4,16,2,LEAVES);
Block(4,16,3,LEAVES);
Block(4,16,4,LEAVES);
Block(4,16,5,LEAVES);
Block(4,16,6,LEAVES);
Block(4,16,7,LEAVES);
Block(4,17,-7,LEAVES);
Block(4,17,-6,LEAVES);
Block(4,17,-5,LEAVES);
Block(4,17,-4,LEAVES);
Block(4,17,-3,LEAVES);
Block(4,17,-2,LEAVES);
Block(4,17,-1,LEAVES);
Block(4,17,0,LEAVES);
Block(4,17,1,LEAVES);
Block(4,17,2,LEAVES);
Block(4,17,3,LEAVES);
Block(4,17,7,LEAVES);
Block(4,18,-6,LEAVES);
Block(4,18,-5,LEAVES);
Block(4,18,-4,LEAVES);
Block(4,18,-3,LEAVES);
Block(4,18,-2,LEAVES);
Block(4,18,-1,LEAVES);
Block(4,18,0,LEAVES);
Block(4,18,1,LEAVES);
Block(4,18,2,LEAVES);
Block(4,18,3,LEAVES);
Block(4,18,6,LEAVES);
Block(4,18,7,LEAVES);
Block(4,19,-6,LEAVES);
Block(4,19,-5,LEAVES);
Block(4,19,-4,LEAVES);
Block(4,19,-2,LEAVES);
Block(4,19,-1,LEAVES);
Block(4,19,0,LEAVES);
Block(4,19,1,LEAVES);
Block(4,19,2,LEAVES);
Block(4,19,3,LEAVES);
Block(4,19,4,LEAVES);
Block(4,20,-6,LEAVES);
Block(4,20,-2,LEAVES);
Block(4,20,-1,LEAVES);
Block(4,20,0,LEAVES);
Block(4,20,1,LEAVES);
Block(4,20,2,LEAVES);
Block(4,21,-6,LEAVES);
Block(4,21,-4,LEAVES);
Block(4,21,-3,LEAVES);
Block(4,21,-2,LEAVES);
Block(4,21,1,LEAVES);
Block(4,21,2,LEAVES);
Block(4,22,-4,LEAVES);
Block(4,22,-2,LEAVES);
Block(5,9,0,LEAVES);
Block(5,10,0,LEAVES);
Block(5,11,0,LEAVES);
Block(5,11,2,LEAVES);
Block(5,11,5,LEAVES);
Block(5,12,-3,LEAVES);
Block(5,12,-2,LEAVES);
Block(5,12,-1,LEAVES);
Block(5,12,0,LEAVES);
Block(5,12,1,LEAVES);
Block(5,12,2,LEAVES);
Block(5,12,3,LEAVES);
Block(5,12,4,LEAVES);
Block(5,12,5,LEAVES);
Block(5,12,6,LEAVES);
Block(5,13,-4,LEAVES);
Block(5,13,-3,LEAVES);
Block(5,13,-2,LEAVES);
Block(5,13,-1,LEAVES);
Block(5,13,0,LEAVES);
Block(5,13,2,LEAVES);
Block(5,13,3,LEAVES);
Block(5,13,5,LEAVES);
Block(5,13,6,LEAVES);
Block(5,14,-3,LEAVES);
Block(5,14,-2,LEAVES);
Block(5,14,-1,LEAVES);
Block(5,14,0,LEAVES);
Block(5,14,2,LEAVES);
Block(5,14,3,LEAVES);
Block(5,14,4,LEAVES);
Block(5,14,5,LEAVES);
Block(5,14,6,LEAVES);
Block(5,15,-4,LEAVES);
Block(5,15,-3,LEAVES);
Block(5,15,-2,LEAVES);
Block(5,15,-1,LEAVES);
Block(5,15,0,LEAVES);
Block(5,15,1,LEAVES);
Block(5,15,2,LEAVES);
Block(5,15,3,LEAVES);
Block(5,15,5,LEAVES);
Block(5,15,8,LEAVES);
Block(5,16,-3,LEAVES);
Block(5,16,-2,LEAVES);
Block(5,16,-1,LEAVES);
Block(5,16,0,LEAVES);
Block(5,16,1,LEAVES);
Block(5,16,2,LEAVES);
Block(5,16,3,LEAVES);
Block(5,16,4,LEAVES);
Block(5,16,7,LEAVES);
Block(5,17,-7,LEAVES);
Block(5,17,-2,LEAVES);
Block(5,17,-1,LEAVES);
Block(5,17,0,LEAVES);
Block(5,17,1,LEAVES);
Block(5,17,2,LEAVES);
Block(5,17,3,LEAVES);
Block(5,17,4,LEAVES);
Block(5,18,-7,LEAVES);
Block(5,18,-5,LEAVES);
Block(5,18,-4,LEAVES);
Block(5,18,-3,LEAVES);
Block(5,18,-2,LEAVES);
Block(5,18,-1,LEAVES);
Block(5,18,1,LEAVES);
Block(5,18,2,LEAVES);
Block(5,18,3,LEAVES);
Block(5,18,4,LEAVES);
Block(5,19,-7,LEAVES);
Block(5,19,-6,LEAVES);
Block(5,19,-5,LEAVES);
Block(5,19,-4,LEAVES);
Block(5,19,-1,LEAVES);
Block(5,19,0,LEAVES);
Block(5,19,1,LEAVES);
Block(5,20,-4,LEAVES);
Block(5,20,0,LEAVES);
Block(5,20,1,LEAVES);
Block(6,11,0,LEAVES);
Block(6,12,-2,LEAVES);
Block(6,12,0,LEAVES);
Block(6,12,2,LEAVES);
Block(6,12,3,LEAVES);
Block(6,12,4,LEAVES);
Block(6,13,-4,LEAVES);
Block(6,13,-3,LEAVES);
Block(6,13,-2,LEAVES);
Block(6,13,-1,LEAVES);
Block(6,13,0,LEAVES);
Block(6,13,1,LEAVES);
Block(6,13,2,LEAVES);
Block(6,13,5,LEAVES);
Block(6,13,6,LEAVES);
Block(6,14,-4,LEAVES);
Block(6,14,-2,LEAVES);
Block(6,14,-1,LEAVES);
Block(6,14,0,LEAVES);
Block(6,14,1,LEAVES);
Block(6,14,2,LEAVES);
Block(6,15,-4,LEAVES);
Block(6,15,-3,LEAVES);
Block(6,15,-2,LEAVES);
Block(6,15,2,LEAVES);
Block(6,15,3,LEAVES);
Block(6,15,5,LEAVES);
Block(6,16,-4,LEAVES);
Block(6,16,-2,LEAVES);
Block(6,16,-1,LEAVES);
Block(6,16,0,LEAVES);
Block(6,16,1,LEAVES);
Block(6,16,2,LEAVES);
Block(6,17,-6,LEAVES);
Block(6,17,-5,LEAVES);
Block(6,17,-4,LEAVES);
Block(6,17,-2,LEAVES);
Block(6,17,-1,LEAVES);
Block(6,17,1,LEAVES);
Block(6,17,2,LEAVES);
Block(6,18,-4,LEAVES);
Block(6,18,-1,LEAVES);
Block(6,18,0,LEAVES);
Block(6,18,1,LEAVES);
Block(6,18,2,LEAVES);
Block(6,18,3,LEAVES);
Block(6,19,-1,LEAVES);
Block(6,19,1,LEAVES);
Block(6,19,3,LEAVES);
Block(6,19,4,LEAVES);
Block(6,20,0,LEAVES);
Block(7,10,0,LEAVES);
Block(7,11,0,LEAVES);
Block(7,12,1,LEAVES);
Block(7,13,-2,LEAVES);
Block(7,13,1,LEAVES);
Block(7,13,2,LEAVES);
Block(7,14,-3,LEAVES);
Block(7,14,-2,LEAVES);
Block(7,14,0,LEAVES);
Block(7,14,1,LEAVES);
Block(7,15,-5,LEAVES);
Block(7,15,-4,LEAVES);
Block(7,15,-2,LEAVES);
Block(7,15,-1,LEAVES);
Block(7,16,-3,LEAVES);
Block(7,16,-2,LEAVES);
Block(7,16,-1,LEAVES);
Block(7,16,0,LEAVES);
Block(7,16,1,LEAVES);
Block(7,17,-3,LEAVES);
Block(7,17,-1,LEAVES);
Block(7,17,1,LEAVES);
Block(7,17,2,LEAVES);
Block(7,17,3,LEAVES);
Block(7,17,4,LEAVES);
Block(7,18,0,LEAVES);
Block(7,18,2,LEAVES);
Block(7,19,-1,LEAVES);
Block(7,19,0,LEAVES);
Block(7,19,1,LEAVES);
Block(7,19,2,LEAVES);
Block(7,19,3,LEAVES);
Block(7,20,0,LEAVES);
Block(8,14,-4,LEAVES);
Block(8,14,-3,LEAVES);
Block(8,14,-2,LEAVES);
Block(8,15,-5,LEAVES);
Block(8,15,-3,LEAVES);
Block(8,15,-1,LEAVES);
Block(8,16,-2,LEAVES);
Block(8,16,1,LEAVES);
Block(8,17,-1,LEAVES);
Block(8,18,0,LEAVES);
Block(8,18,2,LEAVES);
Block(9,14,-3,LEAVES);
Block(9,14,-2,LEAVES);

//   wildnature mod 2019/07/30 20:42:32
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
