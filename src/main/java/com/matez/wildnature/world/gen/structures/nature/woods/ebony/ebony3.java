package com.matez.wildnature.world.gen.structures.nature.woods.ebony;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class ebony3 extends SchemFeature {
    public ebony3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public ebony3(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(1,9,-7,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,10,-7,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,7,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,9,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,9,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,10,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,11,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,11,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,12,-6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,8,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,-5,"wildnature:ebony_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(2,9,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,10,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,-5,"wildnature:ebony_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(2,10,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,11,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,11,-5,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(2,11,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,12,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,-5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,6,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,7,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,7,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,8,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,-4,"wildnature:ebony_branch[down=false,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-4,8,-4,"wildnature:ebony_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-3,8,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,8,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,8,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,9,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,9,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,10,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,-4,"wildnature:ebony_wood");
Block(1,11,-4,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,11,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,12,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,12,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,12,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,12,-4,"wildnature:ebony_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(4,12,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,13,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,13,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,13,-4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,6,-3,"wildnature:ebony_branch[down=false,east=false,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(5,6,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,7,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,7,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,7,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,7,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,7,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,-3,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-3,8,-3,"wildnature:ebony_wood");
Block(-1,8,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,8,-3,"wildnature:ebony_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(3,8,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,8,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,8,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,9,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,-3,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(-4,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,10,-3,"wildnature:ebony_wood");
Block(1,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,11,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,-3,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(-4,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,12,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,13,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,13,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,13,-3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,6,-2,"wildnature:ebony_branch[down=false,east=false,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(-2,7,-2,"wildnature:ebony_wood");
Block(0,7,-2,"wildnature:ebony_wood");
Block(3,7,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,7,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,8,-2,"wildnature:ebony_branch[down=true,east=false,north=true,south=false,up=false,waterlogged=false,west=true]");
Block(3,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,8,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,9,-2,"wildnature:ebony_wood");
Block(2,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,9,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,-2,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(-4,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,11,-2,"wildnature:ebony_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-4,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,11,-2,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(5,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,11,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,12,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,-2,"wildnature:ebony_branch[down=true,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(2,12,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,12,-2,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(5,12,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,13,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,14,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,14,-2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,1,-1,"wildnature:ebony_branch[down=false,east=false,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(0,2,-1,"wildnature:ebony_branch[down=true,east=false,north=false,south=true,up=false,waterlogged=false,west=false]");
Block(0,6,-1,"wildnature:ebony_wood");
Block(6,6,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,7,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,7,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,8,-1,"wildnature:ebony_wood");
Block(4,8,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,8,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,8,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,9,-1,"wildnature:ebony_wood");
Block(2,9,-1,"wildnature:ebony_wood");
Block(4,9,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-7,10,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(-4,10,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(-3,10,-1,"wildnature:ebony_wood");
Block(2,10,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,-1,"wildnature:ebony_wood");
Block(4,10,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,11,-1,"wildnature:ebony_branch[down=true,east=false,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(3,11,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(4,11,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(5,11,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(6,11,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,12,-1,"wildnature:ebony_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-2,12,-1,"wildnature:ebony_branch[down=false,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-1,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,-1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(4,12,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,13,-1,"wildnature:ebony_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(4,13,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,14,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,14,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,14,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,14,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,15,-1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,1,0,"wildnature:ebony_log[axis=y]");
Block(0,1,0,"wildnature:ebony_log[axis=y]");
Block(1,1,0,"wildnature:ebony_branch[down=false,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-1,2,0,"wildnature:ebony_log[axis=y]");
Block(0,2,0,"wildnature:ebony_log[axis=y]");
Block(1,2,0,"wildnature:ebony_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-1,3,0,"wildnature:ebony_log[axis=y]");
Block(0,3,0,"wildnature:ebony_log[axis=y]");
Block(1,3,0,"wildnature:ebony_branch[down=true,east=false,north=false,south=false,up=false,waterlogged=false,west=true]");
Block(-1,4,0,"wildnature:ebony_log[axis=y]");
Block(0,4,0,"wildnature:ebony_log[axis=y]");
Block(-1,5,0,"wildnature:ebony_wood");
Block(0,5,0,"wildnature:ebony_log[axis=y]");
Block(0,6,0,"wildnature:ebony_log[axis=y]");
Block(2,6,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,7,0,"wildnature:ebony_wood");
Block(2,7,0,"wildnature:ebony_wood");
Block(3,7,0,"wildnature:ebony_wood");
Block(6,7,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,0,"wildnature:ebony_wood");
Block(3,8,0,"wildnature:ebony_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(4,8,0,"wildnature:ebony_branch[down=false,east=false,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(3,9,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,9,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,10,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,11,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,11,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,11,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,11,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,12,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,12,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,13,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,13,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,13,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,13,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,13,0,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(4,13,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,14,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,14,0,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,1,1,"wildnature:ebony_log[axis=y]");
Block(0,2,1,"wildnature:ebony_log[axis=y]");
Block(0,3,1,"wildnature:ebony_log[axis=y]");
Block(0,4,1,"wildnature:ebony_wood");
Block(3,5,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,6,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,7,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,7,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,7,1,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=false,waterlogged=false,west=false]");
Block(3,7,1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(4,7,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,8,1,"wildnature:ebony_wood");
Block(4,8,1,"wildnature:ebony_branch[down=true,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(5,8,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,1,"wildnature:ebony_wood");
Block(4,9,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,1,"wildnature:ebony_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(2,10,1,"wildnature:ebony_wood");
Block(5,10,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,1,"wildnature:ebony_branch[down=false,east=true,north=false,south=false,up=true,waterlogged=false,west=false]");
Block(1,11,1,"wildnature:ebony_branch[down=true,east=false,north=false,south=false,up=false,waterlogged=false,west=true]");
Block(3,11,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,12,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,12,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,12,1,"wildnature:ebony_branch[down=true,east=false,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(-1,13,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,13,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,13,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,14,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,14,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,15,1,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,1,2,"wildnature:ebony_branch[down=false,east=false,north=true,south=false,up=false,waterlogged=false,west=false]");
Block(-4,5,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,5,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,6,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,6,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,7,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,7,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,7,2,"wildnature:ebony_wood");
Block(-2,7,2,"wildnature:ebony_wood");
Block(1,7,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,7,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,7,2,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=false,waterlogged=false,west=true]");
Block(4,7,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,8,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,9,2,"wildnature:ebony_wood");
Block(0,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,9,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,10,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,10,2,"wildnature:ebony_branch[down=true,east=false,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(4,10,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,10,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,11,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,11,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,11,2,"wildnature:ebony_branch[down=true,east=true,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(-3,11,2,"wildnature:ebony_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-2,11,2,"wildnature:ebony_branch[down=true,east=false,north=false,south=true,up=false,waterlogged=false,west=true]");
Block(2,11,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,2,"wildnature:ebony_wood");
Block(4,11,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,11,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,12,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,12,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,12,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,12,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,13,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,13,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,13,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,13,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,13,2,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,5,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,5,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,6,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,6,3,"wildnature:ebony_branch[down=false,east=true,north=false,south=true,up=false,waterlogged=false,west=true]");
Block(-4,6,3,"wildnature:ebony_branch[down=true,east=false,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(-2,6,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,6,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,7,3,"wildnature:ebony_branch[down=true,east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(-2,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,7,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,3,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(-4,8,3,"wildnature:ebony_wood");
Block(-3,8,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,8,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,3,"wildnature:ebony_branch[down=true,east=true,north=false,south=true,up=true,waterlogged=false,west=true]");
Block(-4,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,9,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,10,3,"wildnature:ebony_wood");
Block(1,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,10,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,3,"wildnature:ebony_branch[down=false,east=false,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(5,11,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(6,12,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,13,3,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,5,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,6,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,6,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,6,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,6,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,7,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,4,"wildnature:ebony_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=true]");
Block(-3,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-1,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,8,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,9,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,10,4,"wildnature:ebony_branch[down=true,east=true,north=false,south=false,up=true,waterlogged=false,west=true]");
Block(3,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,10,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,11,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,11,4,"wildnature:ebony_branch[down=true,east=false,north=true,south=false,up=true,waterlogged=false,west=false]");
Block(4,11,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,12,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,12,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,13,4,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,6,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,6,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,7,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,7,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,7,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,7,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(5,7,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,8,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,8,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,8,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-2,8,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,8,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-6,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-4,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,9,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-5,10,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,10,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(3,11,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,11,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(2,12,5,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(4,7,6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(-3,8,6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(0,10,6,"wildnature:ebony_leaves[distance=7,persistent=true]");
Block(1,10,6,"wildnature:ebony_leaves[distance=7,persistent=true]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}