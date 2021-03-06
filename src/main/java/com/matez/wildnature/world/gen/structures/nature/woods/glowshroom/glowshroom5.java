package com.matez.wildnature.world.gen.structures.nature.woods.glowshroom;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;

public class glowshroom5 extends SchemFeature {
    public glowshroom5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public glowshroom5(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-1,5,-3,"wildnature:glowshroom_block[down=true,east=false,north=true,south=true,up=false,west=true]");
Block(0,5,-3,"wildnature:glowshroom_block[down=true,east=false,north=true,south=true,up=false,west=false]");
Block(1,5,-3,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=false]");
Block(-1,6,-3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=false,west=true]");
Block(0,6,-3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=false,west=false]");
Block(1,6,-3,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=false]");
Block(-1,7,-3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=true,west=true]");
Block(0,7,-3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=true,west=false]");
Block(1,7,-3,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=false]");
Block(-2,5,-2,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=true]");
Block(2,5,-2,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=true]");
Block(-2,6,-2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(2,6,-2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(-2,7,-2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=true]");
Block(2,7,-2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=true]");
Block(-1,8,-2,"wildnature:glowshroom_block[down=true,east=false,north=true,south=false,up=true,west=true]");
Block(0,8,-2,"wildnature:glowshroom_block[down=true,east=false,north=true,south=false,up=true,west=false]");
Block(1,8,-2,"wildnature:glowshroom_block[down=true,east=true,north=true,south=false,up=true,west=false]");
Block(0,1,-1,"wildnature:glowshroom_stem[down=true,east=true,north=true,south=false,up=false,west=true]");
Block(0,2,-1,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=false,up=false,west=true]");
Block(0,3,-1,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=false,up=false,west=true]");
Block(-3,5,-1,"wildnature:glowshroom_block[down=true,east=true,north=true,south=false,up=false,west=true]");
Block(3,5,-1,"wildnature:glowshroom_block[down=true,east=true,north=true,south=false,up=false,west=true]");
Block(-3,6,-1,"wildnature:glowshroom_block[down=false,east=true,north=true,south=false,up=false,west=true]");
Block(3,6,-1,"wildnature:glowshroom_block[down=false,east=true,north=true,south=false,up=false,west=true]");
Block(-3,7,-1,"wildnature:glowshroom_block[down=false,east=true,north=true,south=false,up=true,west=true]");
Block(3,7,-1,"wildnature:glowshroom_block[down=false,east=true,north=true,south=false,up=true,west=true]");
Block(-2,8,-1,"wildnature:glowshroom_block[down=true,east=false,north=true,south=false,up=true,west=true]");
Block(-1,8,-1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(0,8,-1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(1,8,-1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(2,8,-1,"wildnature:glowshroom_block[down=true,east=true,north=true,south=false,up=true,west=false]");
Block(-1,1,0,"wildnature:glowshroom_stem[down=true,east=false,north=true,south=true,up=true,west=true]");
Block(0,1,0,"wildnature:glowshroom_stem[down=true,east=false,north=false,south=false,up=false,west=false]");
Block(1,1,0,"wildnature:glowshroom_stem[down=true,east=true,north=true,south=true,up=false,west=false]");
Block(0,2,0,"wildnature:glowshroom_stem[down=false,east=false,north=false,south=false,up=false,west=true]");
Block(1,2,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=false,west=false]");
Block(0,3,0,"wildnature:glowshroom_stem[down=false,east=false,north=false,south=true,up=false,west=true]");
Block(1,3,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=true,west=false]");
Block(0,4,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(-3,5,0,"wildnature:glowshroom_block[down=true,east=true,north=false,south=false,up=false,west=true]");
Block(0,5,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(3,5,0,"wildnature:glowshroom_block[down=true,east=true,north=false,south=false,up=false,west=true]");
Block(-3,6,0,"wildnature:glowshroom_block[down=false,east=true,north=false,south=false,up=false,west=true]");
Block(0,6,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(3,6,0,"wildnature:glowshroom_block[down=false,east=true,north=false,south=false,up=false,west=true]");
Block(-3,7,0,"wildnature:glowshroom_block[down=false,east=true,north=false,south=false,up=true,west=true]");
Block(0,7,0,"wildnature:glowshroom_stem[down=false,east=true,north=true,south=true,up=true,west=true]");
Block(3,7,0,"wildnature:glowshroom_block[down=false,east=true,north=false,south=false,up=true,west=true]");
Block(-2,8,0,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=true]");
Block(-1,8,0,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(0,8,0,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(1,8,0,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(2,8,0,"wildnature:glowshroom_block[down=true,east=true,north=false,south=false,up=true,west=false]");
Block(0,1,1,"wildnature:glowshroom_stem[down=true,east=true,north=false,south=true,up=false,west=true]");
Block(0,2,1,"wildnature:glowshroom_stem[down=false,east=true,north=false,south=true,up=true,west=true]");
Block(-3,5,1,"wildnature:glowshroom_block[down=true,east=true,north=false,south=true,up=false,west=true]");
Block(3,5,1,"wildnature:glowshroom_block[down=true,east=true,north=false,south=true,up=false,west=true]");
Block(-3,6,1,"wildnature:glowshroom_block[down=false,east=true,north=false,south=true,up=false,west=true]");
Block(3,6,1,"wildnature:glowshroom_block[down=false,east=true,north=false,south=true,up=false,west=true]");
Block(-3,7,1,"wildnature:glowshroom_block[down=false,east=true,north=false,south=true,up=true,west=true]");
Block(3,7,1,"wildnature:glowshroom_block[down=false,east=true,north=false,south=true,up=true,west=true]");
Block(-2,8,1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=true,up=true,west=true]");
Block(-1,8,1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(0,8,1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(1,8,1,"wildnature:glowshroom_block[down=true,east=false,north=false,south=false,up=true,west=false]");
Block(2,8,1,"wildnature:glowshroom_block[down=true,east=true,north=false,south=true,up=true,west=false]");
Block(-2,5,2,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=true]");
Block(2,5,2,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=true]");
Block(-2,6,2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(2,6,2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=true]");
Block(-2,7,2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=true]");
Block(2,7,2,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=true]");
Block(-1,8,2,"wildnature:glowshroom_block[down=true,east=false,north=false,south=true,up=true,west=true]");
Block(0,8,2,"wildnature:glowshroom_block[down=true,east=false,north=false,south=true,up=true,west=false]");
Block(1,8,2,"wildnature:glowshroom_block[down=true,east=true,north=false,south=true,up=true,west=false]");
Block(-1,5,3,"wildnature:glowshroom_block[down=true,east=false,north=true,south=true,up=false,west=true]");
Block(0,5,3,"wildnature:glowshroom_block[down=true,east=false,north=true,south=true,up=false,west=false]");
Block(1,5,3,"wildnature:glowshroom_block[down=true,east=true,north=true,south=true,up=false,west=false]");
Block(-1,6,3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=false,west=true]");
Block(0,6,3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=false,west=false]");
Block(1,6,3,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=false,west=false]");
Block(-1,7,3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=true,west=true]");
Block(0,7,3,"wildnature:glowshroom_block[down=false,east=false,north=true,south=true,up=true,west=false]");
Block(1,7,3,"wildnature:glowshroom_block[down=false,east=true,north=true,south=true,up=true,west=false]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     https://wildnaturemod.com
return super.setBlocks();
    }
}