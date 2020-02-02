package com.matez.wildnature.world.gen.structures.nature.woods.bialowieza;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class tree_bialowiezaTree4 extends SchemFeature {
    public tree_bialowiezaTree4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public tree_bialowiezaTree4(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

        
Block(-6,5,3,LEAVES);
Block(-5,4,-3,LEAVES);
Block(-5,4,-1,LEAVES);
Block(-5,5,2,LEAVES);
Block(-5,5,3,LOG);
Block(-5,5,5,LEAVES);
Block(-5,6,3,LEAVES);
Block(-5,6,4,LEAVES);
Block(-5,7,0,LEAVES);
Block(-5,9,-1,LEAVES);
Block(-5,12,2,LEAVES);
Block(-5,13,-2,LEAVES);
Block(-5,13,0,LEAVES);
Block(-4,4,-4,LEAVES);
Block(-4,4,-3,LOG);
Block(-4,4,-2,LEAVES);
Block(-4,4,-1,LOG);
Block(-4,4,0,LEAVES);
Block(-4,5,-3,LEAVES);
Block(-4,5,-1,LEAVES);
Block(-4,5,5,LOG);
Block(-4,6,2,LEAVES);
Block(-4,6,3,LOG);
Block(-4,6,4,LOG);
Block(-4,6,5,LEAVES);
Block(-4,7,0,LEAVES);
Block(-4,7,3,LEAVES);
Block(-4,7,4,LEAVES);
Block(-4,8,3,LEAVES);
Block(-4,9,-2,LEAVES);
Block(-4,9,-1,LOG);
Block(-4,9,0,LEAVES);
Block(-4,10,2,LEAVES);
Block(-4,12,-3,LEAVES);
Block(-4,12,1,LEAVES);
Block(-4,12,2,LOG);
Block(-4,12,3,LEAVES);
Block(-4,13,-3,LEAVES);
Block(-4,13,-2,LOG);
Block(-4,13,-1,LEAVES);
Block(-4,13,0,LOG);
Block(-4,13,1,LEAVES);
Block(-4,13,2,LEAVES);
Block(-4,14,-2,LEAVES);
Block(-4,14,0,LEAVES);
Block(-4,18,-3,LEAVES);
Block(-4,18,-2,LEAVES);
Block(-4,18,3,LEAVES);
Block(-4,19,-2,LEAVES);
Block(-4,21,0,LEAVES);
Block(-4,21,1,LEAVES);
Block(-4,25,-1,LEAVES);
Block(-4,26,0,LEAVES);
Block(-3,5,-4,LEAVES);
Block(-3,5,-3,LOG);
Block(-3,5,-2,LEAVES);
Block(-3,5,-1,LOG);
Block(-3,5,0,LEAVES);
Block(-3,6,-3,LEAVES);
Block(-3,6,-1,LEAVES);
Block(-3,6,1,LEAVES);
Block(-3,6,2,LOG);
Block(-3,6,3,LOG);
Block(-3,6,4,LOG);
Block(-3,6,5,LEAVES);
Block(-3,7,-2,LEAVES);
Block(-3,7,-1,LEAVES);
Block(-3,7,0,LOG);
Block(-3,7,2,LEAVES);
Block(-3,7,3,LEAVES);
Block(-3,7,4,LEAVES);
Block(-3,8,0,LEAVES);
Block(-3,8,2,LEAVES);
Block(-3,8,3,LOG);
Block(-3,8,4,LEAVES);
Block(-3,9,-1,LEAVES);
Block(-3,9,0,LOG);
Block(-3,9,1,LEAVES);
Block(-3,9,3,LEAVES);
Block(-3,10,0,LEAVES);
Block(-3,10,1,LEAVES);
Block(-3,10,2,LOG);
Block(-3,10,3,LEAVES);
Block(-3,12,-4,LEAVES);
Block(-3,12,-3,LOG);
Block(-3,12,1,LEAVES);
Block(-3,12,2,LOG);
Block(-3,12,3,LEAVES);
Block(-3,12,4,LEAVES);
Block(-3,12,5,LEAVES);
Block(-3,13,-3,LEAVES);
Block(-3,13,-1,LOG);
Block(-3,13,1,LEAVES);
Block(-3,13,2,LEAVES);
Block(-3,13,4,LEAVES);
Block(-3,14,-1,LEAVES);
Block(-3,14,0,LOG);
Block(-3,14,1,LEAVES);
Block(-3,15,0,LEAVES);
Block(-3,16,-1,LEAVES);
Block(-3,16,0,LOG);
Block(-3,18,-3,LEAVES);
Block(-3,18,-2,LOG);
Block(-3,18,-1,LEAVES);
Block(-3,18,1,LEAVES);
Block(-3,18,2,LEAVES);
Block(-3,18,3,LOG);
Block(-3,18,4,LEAVES);
Block(-3,19,-2,LEAVES);
Block(-3,19,2,LEAVES);
Block(-3,19,3,LEAVES);
Block(-3,21,-1,LEAVES);
Block(-3,21,0,LOG);
Block(-3,21,1,LOG);
Block(-3,21,2,LEAVES);
Block(-3,22,0,LEAVES);
Block(-3,22,1,LEAVES);
Block(-3,25,-2,LEAVES);
Block(-3,25,-1,LOG);
Block(-3,25,0,LEAVES);
Block(-3,26,-2,LEAVES);
Block(-3,26,-1,LEAVES);
Block(-3,26,0,LOG);
Block(-3,26,1,LEAVES);
Block(-3,28,0,LEAVES);
Block(-2,1,-2,LOG);
Block(-2,1,0,LOG);
Block(-2,5,-5,LEAVES);
Block(-2,5,-4,LOG);
Block(-2,5,-3,LEAVES);
Block(-2,5,-2,LOG);
Block(-2,5,-1,LOG);
Block(-2,5,0,LEAVES);
Block(-2,6,-4,LEAVES);
Block(-2,6,-2,LEAVES);
Block(-2,6,-1,LEAVES);
Block(-2,6,2,LOG);
Block(-2,6,3,LOG);
Block(-2,6,4,LEAVES);
Block(-2,7,-3,LEAVES);
Block(-2,7,-2,LOG);
Block(-2,7,-1,LOG);
Block(-2,7,0,LOG);
Block(-2,7,1,LEAVES);
Block(-2,7,3,LEAVES);
Block(-2,8,-1,LEAVES);
Block(-2,8,0,LEAVES);
Block(-2,8,1,LEAVES);
Block(-2,8,2,LOG);
Block(-2,8,3,LEAVES);
Block(-2,9,2,LEAVES);
Block(-2,10,-1,LEAVES);
Block(-2,10,0,LOG);
Block(-2,10,1,LOG);
Block(-2,10,2,LEAVES);
Block(-2,12,-5,LEAVES);
Block(-2,12,-4,LOG);
Block(-2,12,4,LOG);
Block(-2,12,5,LOG);
Block(-2,12,6,LEAVES);
Block(-2,13,-4,LEAVES);
Block(-2,13,-3,LOG);
Block(-2,13,1,LOG);
Block(-2,13,2,LOG);
Block(-2,13,3,LEAVES);
Block(-2,13,4,LOG);
Block(-2,13,5,LEAVES);
Block(-2,14,-3,LEAVES);
Block(-2,14,-1,LOG);
Block(-2,14,0,LOG);
Block(-2,14,1,LEAVES);
Block(-2,14,2,LEAVES);
Block(-2,14,3,LEAVES);
Block(-2,14,4,LEAVES);
Block(-2,15,-1,LEAVES);
Block(-2,15,0,LOG);
Block(-2,16,0,LEAVES);
Block(-2,18,-4,LEAVES);
Block(-2,18,-3,LOG);
Block(-2,18,-1,LOG);
Block(-2,18,0,LEAVES);
Block(-2,18,1,LOG);
Block(-2,18,2,LEAVES);
Block(-2,18,3,LEAVES);
Block(-2,18,4,LEAVES);
Block(-2,19,-3,LEAVES);
Block(-2,19,-2,LEAVES);
Block(-2,19,-1,LEAVES);
Block(-2,19,1,LEAVES);
Block(-2,19,2,LOG);
Block(-2,19,3,LEAVES);
Block(-2,21,-3,LEAVES);
Block(-2,21,-2,LEAVES);
Block(-2,21,-1,LOG);
Block(-2,21,0,LOG);
Block(-2,22,-2,LEAVES);
Block(-2,22,-1,LEAVES);
Block(-2,22,0,LEAVES);
Block(-2,22,1,LEAVES);
Block(-2,22,2,LOG);
Block(-2,22,3,LEAVES);
Block(-2,23,2,LEAVES);
Block(-2,25,-2,LEAVES);
Block(-2,25,-1,LEAVES);
Block(-2,26,-3,LEAVES);
Block(-2,26,-2,LOG);
Block(-2,26,-1,LOG);
Block(-2,26,0,LEAVES);
Block(-2,26,1,LEAVES);
Block(-2,26,2,LEAVES);
Block(-2,26,3,LEAVES);
Block(-2,27,-2,LEAVES);
Block(-2,27,-1,LEAVES);
Block(-2,27,0,LEAVES);
Block(-2,28,-2,LEAVES);
Block(-2,28,-1,LEAVES);
Block(-2,28,0,LOG);
Block(-2,28,1,LEAVES);
Block(-2,29,0,LEAVES);
Block(-2,31,-1,LEAVES);
Block(-2,31,0,LEAVES);
Block(-2,31,1,LEAVES);
Block(-2,34,0,LEAVES);
Block(-2,34,1,LEAVES);
Block(-1,1,-1,LOG);
Block(-1,1,0,LOG);
Block(-1,1,1,LOG);
Block(-1,2,0,LOG);
Block(-1,2,1,LOG);
Block(-1,3,0,LOG);
Block(-1,5,-4,LEAVES);
Block(-1,5,-2,LEAVES);
Block(-1,5,-1,LEAVES);
Block(-1,5,0,LOG);
Block(-1,6,0,LEAVES);
Block(-1,6,5,LEAVES);
Block(-1,7,-3,LEAVES);
Block(-1,7,-2,LEAVES);
Block(-1,7,-1,LOG);
Block(-1,7,0,LOG);
Block(-1,7,1,LOG);
Block(-1,7,2,LOG);
Block(-1,7,3,LEAVES);
Block(-1,8,-1,LEAVES);
Block(-1,8,0,LOG);
Block(-1,8,1,LOG);
Block(-1,8,2,LEAVES);
Block(-1,9,0,LEAVES);
Block(-1,9,1,LEAVES);
Block(-1,10,-1,LEAVES);
Block(-1,10,0,LOG);
Block(-1,10,1,LEAVES);
Block(-1,12,-4,LEAVES);
Block(-1,12,4,LEAVES);
Block(-1,12,5,LEAVES);
Block(-1,13,-3,LEAVES);
Block(-1,13,-2,LOG);
Block(-1,13,-1,LOG);
Block(-1,13,0,LEAVES);
Block(-1,13,3,LOG);
Block(-1,13,4,LEAVES);
Block(-1,14,-2,LEAVES);
Block(-1,14,-1,LOG);
Block(-1,14,0,LOG);
Block(-1,14,1,LEAVES);
Block(-1,14,2,LEAVES);
Block(-1,14,3,LOG);
Block(-1,14,4,LEAVES);
Block(-1,15,-1,LEAVES);
Block(-1,15,0,LEAVES);
Block(-1,15,1,LEAVES);
Block(-1,15,3,LEAVES);
Block(-1,16,-1,LEAVES);
Block(-1,16,0,LOG);
Block(-1,16,1,LEAVES);
Block(-1,18,-5,LEAVES);
Block(-1,18,-4,LOG);
Block(-1,18,-2,LEAVES);
Block(-1,18,-1,LOG);
Block(-1,18,0,LEAVES);
Block(-1,18,1,LEAVES);
Block(-1,18,3,LOG);
Block(-1,18,4,LOG);
Block(-1,18,5,LEAVES);
Block(-1,19,-4,LEAVES);
Block(-1,19,-3,LOG);
Block(-1,19,-2,LOG);
Block(-1,19,-1,LOG);
Block(-1,19,2,LOG);
Block(-1,19,3,LEAVES);
Block(-1,19,4,LEAVES);
Block(-1,20,-3,LEAVES);
Block(-1,20,-2,LEAVES);
Block(-1,20,-1,LEAVES);
Block(-1,21,-4,LEAVES);
Block(-1,21,-3,LOG);
Block(-1,21,-2,LOG);
Block(-1,21,-1,LEAVES);
Block(-1,21,0,LEAVES);
Block(-1,22,-3,LEAVES);
Block(-1,22,-2,LEAVES);
Block(-1,22,-1,LOG);
Block(-1,22,0,LOG);
Block(-1,22,1,LOG);
Block(-1,22,2,LEAVES);
Block(-1,22,3,LEAVES);
Block(-1,23,-3,LEAVES);
Block(-1,23,-1,LEAVES);
Block(-1,23,0,LEAVES);
Block(-1,23,1,LEAVES);
Block(-1,23,2,LEAVES);
Block(-1,24,0,LEAVES);
Block(-1,25,-1,LEAVES);
Block(-1,25,0,LEAVES);
Block(-1,26,-2,LEAVES);
Block(-1,26,-1,LEAVES);
Block(-1,26,0,LOG);
Block(-1,26,1,LEAVES);
Block(-1,26,2,LOG);
Block(-1,26,3,LOG);
Block(-1,26,4,LEAVES);
Block(-1,27,-1,LEAVES);
Block(-1,27,0,LEAVES);
Block(-1,27,1,LEAVES);
Block(-1,27,2,LEAVES);
Block(-1,28,-3,LEAVES);
Block(-1,28,-2,LOG);
Block(-1,28,-1,LEAVES);
Block(-1,28,0,LEAVES);
Block(-1,29,-2,LEAVES);
Block(-1,29,-1,LEAVES);
Block(-1,29,0,LOG);
Block(-1,29,1,LEAVES);
Block(-1,29,2,LEAVES);
Block(-1,30,0,LEAVES);
Block(-1,31,-2,LEAVES);
Block(-1,31,-1,LOG);
Block(-1,31,0,LEAVES);
Block(-1,31,1,LOG);
Block(-1,31,2,LEAVES);
Block(-1,32,-1,LEAVES);
Block(-1,32,0,LEAVES);
Block(-1,32,1,LEAVES);
Block(-1,33,0,LEAVES);
Block(-1,34,-1,LEAVES);
Block(-1,34,0,LOG);
Block(-1,34,1,LEAVES);
Block(-1,35,0,LEAVES);
Block(-1,36,0,LEAVES);
Block(0,0,0,DIRT);
Block(0,1,-2,LOG);
Block(0,1,-1,LOG);
Block(0,1,0,LOG);
Block(0,1,1,LOG);
Block(0,1,2,LOG);
Block(0,2,-1,LOG);
Block(0,2,0,LOG);
Block(0,2,1,LOG);
Block(0,3,-1,LOG);
Block(0,3,0,LOG);
Block(0,3,1,LOG);
Block(0,4,0,LOG);
Block(0,5,0,LOG);
Block(0,5,3,LEAVES);
Block(0,5,6,LEAVES);
Block(0,6,-1,LOG);
Block(0,6,0,LOG);
Block(0,6,1,LOG);
Block(0,6,3,LOG);
Block(0,6,4,LEAVES);
Block(0,6,5,LOG);
Block(0,6,6,LEAVES);
Block(0,7,-4,LEAVES);
Block(0,7,-3,LOG);
Block(0,7,-2,LOG);
Block(0,7,-1,LEAVES);
Block(0,7,0,LOG);
Block(0,7,1,LEAVES);
Block(0,7,2,LEAVES);
Block(0,7,3,LEAVES);
Block(0,7,5,LEAVES);
Block(0,8,-3,LEAVES);
Block(0,8,-2,LEAVES);
Block(0,8,-1,LOG);
Block(0,8,0,LOG);
Block(0,8,1,LOG);
Block(0,8,2,LEAVES);
Block(0,9,-1,LEAVES);
Block(0,9,0,LOG);
Block(0,9,1,LEAVES);
Block(0,10,-2,LEAVES);
Block(0,10,-1,LOG);
Block(0,10,0,LOG);
Block(0,10,1,LEAVES);
Block(0,11,0,LOG);
Block(0,12,0,LOG);
Block(0,13,-3,LEAVES);
Block(0,13,-1,LOG);
Block(0,13,0,LOG);
Block(0,13,4,LOG);
Block(0,13,5,LEAVES);
Block(0,14,-2,LEAVES);
Block(0,14,-1,LOG);
Block(0,14,0,LOG);
Block(0,14,1,LOG);
Block(0,14,2,LOG);
Block(0,14,3,LEAVES);
Block(0,14,4,LEAVES);
Block(0,15,-1,LEAVES);
Block(0,15,0,LOG);
Block(0,15,1,LEAVES);
Block(0,15,2,LEAVES);
Block(0,16,-2,LEAVES);
Block(0,16,-1,LOG);
Block(0,16,0,LOG);
Block(0,16,1,LOG);
Block(0,16,2,LEAVES);
Block(0,17,0,LOG);
Block(0,18,-4,LEAVES);
Block(0,18,0,LOG);
Block(0,18,1,LOG);
Block(0,18,2,LOG);
Block(0,18,3,LEAVES);
Block(0,18,4,LEAVES);
Block(0,19,-4,LEAVES);
Block(0,19,-3,LEAVES);
Block(0,19,-2,LOG);
Block(0,19,0,LOG);
Block(0,19,1,LOG);
Block(0,19,2,LEAVES);
Block(0,20,-2,LEAVES);
Block(0,20,0,LOG);
Block(0,21,-3,LEAVES);
Block(0,21,-2,LEAVES);
Block(0,21,0,LOG);
Block(0,22,-3,LEAVES);
Block(0,22,-2,LOG);
Block(0,22,-1,LEAVES);
Block(0,22,0,LOG);
Block(0,22,1,LOG);
Block(0,22,2,LEAVES);
Block(0,22,3,LOG);
Block(0,22,4,LEAVES);
Block(0,23,-2,LEAVES);
Block(0,23,0,LOG);
Block(0,23,1,LOG);
Block(0,23,2,LEAVES);
Block(0,23,3,LEAVES);
Block(0,24,0,LOG);
Block(0,24,1,LEAVES);
Block(0,25,-3,LEAVES);
Block(0,25,-2,LEAVES);
Block(0,25,-1,LOG);
Block(0,25,0,LOG);
Block(0,25,1,LEAVES);
Block(0,25,2,LEAVES);
Block(0,26,-3,LEAVES);
Block(0,26,-2,LOG);
Block(0,26,-1,LOG);
Block(0,26,0,LOG);
Block(0,26,1,LOG);
Block(0,26,2,LOG);
Block(0,26,3,LEAVES);
Block(0,27,-2,LEAVES);
Block(0,27,-1,LEAVES);
Block(0,27,0,LOG);
Block(0,27,1,LEAVES);
Block(0,27,2,LEAVES);
Block(0,28,-4,LEAVES);
Block(0,28,-3,LOG);
Block(0,28,-2,LEAVES);
Block(0,28,-1,LEAVES);
Block(0,28,0,LOG);
Block(0,28,1,LEAVES);
Block(0,29,-3,LEAVES);
Block(0,29,-2,LEAVES);
Block(0,29,-1,LOG);
Block(0,29,0,LOG);
Block(0,29,1,LOG);
Block(0,29,2,LOG);
Block(0,29,3,LEAVES);
Block(0,30,-1,LEAVES);
Block(0,30,0,LOG);
Block(0,30,1,LEAVES);
Block(0,30,2,LEAVES);
Block(0,31,-1,LEAVES);
Block(0,31,0,LOG);
Block(0,31,1,LEAVES);
Block(0,31,2,LEAVES);
Block(0,32,-2,LEAVES);
Block(0,32,-1,LOG);
Block(0,32,0,LOG);
Block(0,32,1,LOG);
Block(0,32,2,LEAVES);
Block(0,33,-1,LEAVES);
Block(0,33,0,LOG);
Block(0,33,1,LEAVES);
Block(0,34,-2,LEAVES);
Block(0,34,-1,LOG);
Block(0,34,0,LOG);
Block(0,34,1,LOG);
Block(0,34,2,LEAVES);
Block(0,35,-1,LEAVES);
Block(0,35,0,LOG);
Block(0,35,1,LEAVES);
Block(0,36,-1,LEAVES);
Block(0,36,0,LOG);
Block(0,37,0,LEAVES);
Block(1,1,-1,LOG);
Block(1,1,0,LOG);
Block(1,1,1,LOG);
Block(1,2,0,LOG);
Block(1,3,0,LOG);
Block(1,5,-1,LOG);
Block(1,5,6,LOG);
Block(1,5,7,LEAVES);
Block(1,6,-5,LEAVES);
Block(1,6,-4,LOG);
Block(1,6,-1,LOG);
Block(1,6,2,LOG);
Block(1,6,3,LEAVES);
Block(1,6,4,LOG);
Block(1,6,5,LOG);
Block(1,6,6,LEAVES);
Block(1,7,-4,LEAVES);
Block(1,7,-3,LEAVES);
Block(1,7,-2,LEAVES);
Block(1,7,-1,LEAVES);
Block(1,7,0,LEAVES);
Block(1,7,2,LEAVES);
Block(1,7,4,LEAVES);
Block(1,7,5,LEAVES);
Block(1,8,-1,LEAVES);
Block(1,8,0,LEAVES);
Block(1,8,1,LEAVES);
Block(1,8,2,LOG);
Block(1,8,3,LEAVES);
Block(1,9,-1,LEAVES);
Block(1,9,0,LOG);
Block(1,9,2,LEAVES);
Block(1,10,-1,LEAVES);
Block(1,10,0,LEAVES);
Block(1,11,0,LEAVES);
Block(1,11,1,LEAVES);
Block(1,13,-4,LEAVES);
Block(1,13,-3,LOG);
Block(1,13,2,LOG);
Block(1,13,4,LOG);
Block(1,13,5,LEAVES);
Block(1,14,-3,LEAVES);
Block(1,14,-2,LOG);
Block(1,14,-1,LEAVES);
Block(1,14,0,LOG);
Block(1,14,1,LOG);
Block(1,14,3,LOG);
Block(1,14,4,LEAVES);
Block(1,15,-3,LEAVES);
Block(1,15,-2,LOG);
Block(1,15,-1,LOG);
Block(1,15,0,LEAVES);
Block(1,15,1,LEAVES);
Block(1,15,2,LOG);
Block(1,15,3,LEAVES);
Block(1,16,-1,LEAVES);
Block(1,16,0,LEAVES);
Block(1,16,1,LOG);
Block(1,16,2,LOG);
Block(1,16,3,LEAVES);
Block(1,17,4,LEAVES);
Block(1,18,-5,LEAVES);
Block(1,18,-4,LOG);
Block(1,18,-3,LOG);
Block(1,18,0,LEAVES);
Block(1,18,1,LOG);
Block(1,18,3,LEAVES);
Block(1,19,-4,LEAVES);
Block(1,19,-3,LOG);
Block(1,19,-2,LEAVES);
Block(1,19,-1,LOG);
Block(1,19,0,LOG);
Block(1,19,2,LOG);
Block(1,19,3,LEAVES);
Block(1,20,-3,LEAVES);
Block(1,20,-1,LEAVES);
Block(1,20,0,LEAVES);
Block(1,20,2,LEAVES);
Block(1,21,-2,LEAVES);
Block(1,22,-2,LEAVES);
Block(1,22,-1,LOG);
Block(1,22,0,LEAVES);
Block(1,22,1,LOG);
Block(1,22,2,LOG);
Block(1,22,3,LOG);
Block(1,22,4,LEAVES);
Block(1,23,-2,LEAVES);
Block(1,23,-1,LEAVES);
Block(1,23,1,LEAVES);
Block(1,23,2,LEAVES);
Block(1,23,3,LEAVES);
Block(1,25,-4,LEAVES);
Block(1,25,-3,LOG);
Block(1,25,0,LEAVES);
Block(1,25,2,LOG);
Block(1,25,3,LEAVES);
Block(1,26,-3,LEAVES);
Block(1,26,-2,LEAVES);
Block(1,26,-1,LOG);
Block(1,26,0,LOG);
Block(1,26,1,LOG);
Block(1,26,2,LEAVES);
Block(1,26,3,LEAVES);
Block(1,27,-1,LEAVES);
Block(1,27,1,LEAVES);
Block(1,28,-3,LEAVES);
Block(1,28,-1,LEAVES);
Block(1,28,0,LOG);
Block(1,28,1,LEAVES);
Block(1,28,2,LEAVES);
Block(1,29,-2,LEAVES);
Block(1,29,-1,LEAVES);
Block(1,29,0,LEAVES);
Block(1,29,1,LOG);
Block(1,29,2,LEAVES);
Block(1,30,1,LEAVES);
Block(1,31,0,LEAVES);
Block(1,32,-2,LEAVES);
Block(1,32,-1,LOG);
Block(1,32,0,LEAVES);
Block(1,32,1,LEAVES);
Block(1,33,-2,LEAVES);
Block(1,33,-1,LEAVES);
Block(1,33,0,LEAVES);
Block(1,34,-2,LEAVES);
Block(1,34,-1,LEAVES);
Block(1,34,0,LOG);
Block(1,34,1,LEAVES);
Block(1,34,2,LEAVES);
Block(1,35,0,LEAVES);
Block(1,36,0,LEAVES);
Block(2,1,-2,LOG);
Block(2,1,-1,LOG);
Block(2,1,1,LOG);
Block(2,5,-6,LEAVES);
Block(2,5,-5,LOG);
Block(2,5,-4,LOG);
Block(2,5,-3,LOG);
Block(2,5,-2,LOG);
Block(2,5,-1,LEAVES);
Block(2,5,1,LOG);
Block(2,5,2,LOG);
Block(2,5,3,LEAVES);
Block(2,5,6,LEAVES);
Block(2,6,-5,LEAVES);
Block(2,6,-4,LEAVES);
Block(2,6,-3,LEAVES);
Block(2,6,-2,LEAVES);
Block(2,6,-1,LOG);
Block(2,6,1,LEAVES);
Block(2,6,2,LEAVES);
Block(2,6,4,LEAVES);
Block(2,6,5,LEAVES);
Block(2,7,-1,LEAVES);
Block(2,8,-1,LEAVES);
Block(2,8,0,LOG);
Block(2,8,1,LEAVES);
Block(2,8,2,LEAVES);
Block(2,8,3,LOG);
Block(2,8,4,LEAVES);
Block(2,9,0,LEAVES);
Block(2,9,3,LEAVES);
Block(2,13,-5,LEAVES);
Block(2,13,-4,LOG);
Block(2,13,-3,LEAVES);
Block(2,13,4,LEAVES);
Block(2,14,-4,LEAVES);
Block(2,14,-2,LEAVES);
Block(2,14,0,LEAVES);
Block(2,14,1,LOG);
Block(2,14,2,LOG);
Block(2,14,3,LEAVES);
Block(2,15,-3,LEAVES);
Block(2,15,-2,LEAVES);
Block(2,15,-1,LEAVES);
Block(2,15,1,LEAVES);
Block(2,15,2,LEAVES);
Block(2,16,1,LEAVES);
Block(2,16,2,LEAVES);
Block(2,17,-3,LEAVES);
Block(2,17,-1,LEAVES);
Block(2,17,2,LEAVES);
Block(2,17,4,LOG);
Block(2,17,5,LEAVES);
Block(2,18,-4,LEAVES);
Block(2,18,-3,LOG);
Block(2,18,-2,LEAVES);
Block(2,18,-1,LOG);
Block(2,18,0,LEAVES);
Block(2,18,1,LOG);
Block(2,18,2,LOG);
Block(2,18,3,LOG);
Block(2,18,4,LEAVES);
Block(2,19,-3,LEAVES);
Block(2,19,-1,LEAVES);
Block(2,19,0,LOG);
Block(2,19,1,LOG);
Block(2,19,2,LEAVES);
Block(2,19,3,LEAVES);
Block(2,20,0,LEAVES);
Block(2,20,1,LEAVES);
Block(2,21,-3,LEAVES);
Block(2,21,-2,LOG);
Block(2,21,-1,LOG);
Block(2,21,0,LEAVES);
Block(2,22,-2,LEAVES);
Block(2,22,-1,LOG);
Block(2,22,0,LEAVES);
Block(2,22,1,LOG);
Block(2,22,2,LEAVES);
Block(2,22,3,LEAVES);
Block(2,23,-1,LEAVES);
Block(2,23,1,LEAVES);
Block(2,25,-3,LEAVES);
Block(2,25,2,LEAVES);
Block(2,25,3,LEAVES);
Block(2,26,-2,LEAVES);
Block(2,26,-1,LOG);
Block(2,26,0,LEAVES);
Block(2,26,1,LOG);
Block(2,26,2,LEAVES);
Block(2,27,-1,LEAVES);
Block(2,28,0,LEAVES);
Block(2,28,1,LEAVES);
Block(2,28,2,LOG);
Block(2,28,3,LEAVES);
Block(2,29,-1,LEAVES);
Block(2,29,0,LOG);
Block(2,29,1,LEAVES);
Block(2,29,2,LEAVES);
Block(2,30,0,LEAVES);
Block(2,32,-1,LEAVES);
Block(2,34,0,LEAVES);
Block(3,5,-5,LEAVES);
Block(3,5,-4,LOG);
Block(3,5,-3,LOG);
Block(3,5,-2,LEAVES);
Block(3,5,1,LEAVES);
Block(3,5,2,LEAVES);
Block(3,6,-4,LEAVES);
Block(3,6,-3,LEAVES);
Block(3,6,-2,LEAVES);
Block(3,6,-1,LOG);
Block(3,6,0,LEAVES);
Block(3,6,2,LOG);
Block(3,6,3,LEAVES);
Block(3,7,-1,LEAVES);
Block(3,7,2,LEAVES);
Block(3,8,-1,LEAVES);
Block(3,8,0,LOG);
Block(3,8,1,LEAVES);
Block(3,8,3,LEAVES);
Block(3,9,0,LEAVES);
Block(3,12,3,LEAVES);
Block(3,13,-4,LEAVES);
Block(3,13,-3,LOG);
Block(3,13,-2,LEAVES);
Block(3,13,-1,LEAVES);
Block(3,13,0,LOG);
Block(3,13,3,LOG);
Block(3,13,4,LEAVES);
Block(3,14,-3,LEAVES);
Block(3,14,0,LEAVES);
Block(3,14,1,LOG);
Block(3,14,3,LEAVES);
Block(3,15,1,LEAVES);
Block(3,17,-1,LEAVES);
Block(3,17,0,LEAVES);
Block(3,17,2,LEAVES);
Block(3,17,4,LEAVES);
Block(3,18,-3,LEAVES);
Block(3,18,-2,LEAVES);
Block(3,18,-1,LOG);
Block(3,18,0,LEAVES);
Block(3,18,1,LEAVES);
Block(3,18,2,LOG);
Block(3,18,3,LOG);
Block(3,18,4,LEAVES);
Block(3,19,-1,LEAVES);
Block(3,19,0,LEAVES);
Block(3,19,1,LOG);
Block(3,19,2,LEAVES);
Block(3,19,3,LEAVES);
Block(3,20,1,LEAVES);
Block(3,20,2,LEAVES);
Block(3,21,-2,LEAVES);
Block(3,21,-1,LEAVES);
Block(3,21,0,LEAVES);
Block(3,21,1,LOG);
Block(3,21,2,LEAVES);
Block(3,22,-1,LEAVES);
Block(3,22,1,LEAVES);
Block(3,23,1,LEAVES);
Block(3,25,-2,LEAVES);
Block(3,25,-1,LOG);
Block(3,25,0,LEAVES);
Block(3,25,1,LEAVES);
Block(3,25,2,LEAVES);
Block(3,26,-1,LEAVES);
Block(3,26,0,LEAVES);
Block(3,26,1,LEAVES);
Block(3,28,0,LOG);
Block(3,28,1,LEAVES);
Block(3,28,2,LEAVES);
Block(3,29,-1,LEAVES);
Block(3,29,0,LEAVES);
Block(3,29,1,LEAVES);
Block(4,5,-4,LEAVES);
Block(4,5,-3,LOG);
Block(4,5,-2,LEAVES);
Block(4,5,-1,LEAVES);
Block(4,5,4,LEAVES);
Block(4,6,-3,LEAVES);
Block(4,6,-2,LEAVES);
Block(4,6,-1,LOG);
Block(4,6,0,LEAVES);
Block(4,6,2,LEAVES);
Block(4,6,3,LOG);
Block(4,6,4,LEAVES);
Block(4,7,-1,LEAVES);
Block(4,7,3,LEAVES);
Block(4,8,0,LEAVES);
Block(4,9,0,LEAVES);
Block(4,13,-3,LEAVES);
Block(4,13,0,LEAVES);
Block(4,13,1,LOG);
Block(4,13,2,LEAVES);
Block(4,13,3,LEAVES);
Block(4,14,1,LEAVES);
Block(4,17,-2,LEAVES);
Block(4,18,-3,LEAVES);
Block(4,18,-2,LOG);
Block(4,18,-1,LEAVES);
Block(4,18,2,LEAVES);
Block(4,18,3,LEAVES);
Block(4,19,-2,LEAVES);
Block(4,19,1,LEAVES);
Block(4,20,-2,LEAVES);
Block(4,21,1,LEAVES);
Block(4,25,-1,LEAVES);
Block(4,25,1,LEAVES);
Block(4,27,1,LEAVES);
Block(4,28,0,LEAVES);
Block(5,5,-3,LEAVES);
Block(5,5,-2,LEAVES);
Block(5,5,3,LEAVES);
Block(5,5,4,LOG);
Block(5,5,5,LEAVES);
Block(5,6,-1,LEAVES);
Block(5,6,2,LEAVES);
Block(5,6,3,LOG);
Block(5,6,4,LEAVES);
Block(5,7,3,LEAVES);
Block(5,13,1,LEAVES);
Block(5,18,-2,LEAVES);
Block(5,20,-3,LEAVES);
Block(6,5,4,LEAVES);
Block(6,6,3,LEAVES);

//   wildnature mod 2019/07/30 20:47:58
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
//
//     File generated automatically

        return super.setBlocks();
    }
}
