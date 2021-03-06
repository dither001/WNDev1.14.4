package com.matez.wildnature.world.gen.structures.nature.woods.rowan;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Set;
import java.util.function.Function;
public class rowan2 extends SchemFeature {
    public rowan2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
    }

    public rowan2(Function<Dynamic<?>, ? extends NoFeatureConfig> config, boolean doBlockNofityOnPlace, BlockState log, BlockState leaves) {
        super(config, doBlockNofityOnPlace);
        Main.treesList.add(this);
        LOG = log;
        LEAVES =leaves;
    }

    @Override
    public Set<BlockPos> setBlocks() {

Block(-2,4,-3,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-1,4,-3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(0,4,-3,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(1,4,-3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,5,-3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(0,5,-3,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(1,5,-3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,2,-2,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-1,3,-2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-2,4,-2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,4,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(0,4,-2,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=4]");
Block(1,4,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(2,4,-2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-3,5,-2,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-2,5,-2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,5,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=4]");
Block(0,5,-2,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=4]");
Block(1,5,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(2,5,-2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=4]");
Block(-1,6,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(0,6,-2,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(1,6,-2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(2,2,-1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-2,3,-1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(0,3,-1,"wildnature:oak_branch[down=false,east=true,north=false,south=true,up=true,waterlogged=false,west=false]");
Block(1,3,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(2,3,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-2,4,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,4,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=2]");
Block(0,4,-1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(1,4,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(2,4,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(3,4,-1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-3,5,-1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-2,5,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,5,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,5,-1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(1,5,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=4]");
Block(2,5,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-2,6,-1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,6,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,6,-1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(1,6,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=5]");
Block(0,7,-1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,1,0,"minecraft:oak_log[axis=y]");
Block(0,2,0,"minecraft:oak_log[axis=y]");
Block(-3,3,0,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-2,3,0,"wildnature:oak_branch[down=false,east=true,north=true,south=false,up=true,waterlogged=false,west=true]");
Block(-1,3,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(0,3,0,"minecraft:oak_log[axis=y]");
Block(1,3,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(2,3,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(-4,4,0,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-3,4,0,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-2,4,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(-1,4,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(0,4,0,"minecraft:oak_log[axis=y]");
Block(1,4,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(2,4,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(3,4,0,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-3,5,0,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-2,5,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(-1,5,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(0,5,0,"minecraft:oak_log[axis=y]");
Block(1,5,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(2,5,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(-2,6,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(-1,6,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=6]");
Block(0,6,0,"minecraft:oak_log[axis=y]");
Block(1,6,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(-1,7,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,7,0,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(1,7,0,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=6]");
Block(-3,2,1,"wildnature:rowan_leaves_red[distance=6,persistent=true,stage=0]");
Block(-3,3,1,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=6]");
Block(-1,3,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(1,3,1,"wildnature:oak_branch[down=false,east=true,north=true,south=true,up=true,waterlogged=false,west=false]");
Block(2,3,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-3,4,1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=5]");
Block(-2,4,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=4]");
Block(-1,4,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,4,1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=0]");
Block(1,4,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(2,4,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(3,4,1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-3,5,1,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-2,5,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,5,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,5,1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=4]");
Block(1,5,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(2,5,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-2,6,1,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,6,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,6,1,"wildnature:rowan_leaves_red[distance=1,persistent=true,stage=2]");
Block(1,6,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(0,7,1,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(1,2,2,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=5]");
Block(1,3,2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-3,4,2,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-2,4,2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,4,2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(0,4,2,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(1,4,2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=6]");
Block(2,4,2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(3,4,2,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-2,5,2,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(-1,5,2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(0,5,2,"wildnature:rowan_leaves_red[distance=2,persistent=true,stage=0]");
Block(1,5,2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,6,2,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(-1,2,3,"wildnature:rowan_leaves_red[distance=6,persistent=true,stage=0]");
Block(-1,3,3,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=0]");
Block(-1,4,3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(0,4,3,"wildnature:rowan_leaves_red[distance=3,persistent=true,stage=0]");
Block(1,4,3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");
Block(2,4,3,"wildnature:rowan_leaves_red[distance=5,persistent=true,stage=2]");
Block(-1,5,3,"wildnature:rowan_leaves_red[distance=4,persistent=true,stage=0]");

//   wildnature mod
//           created by matez 
//         all rights reserved   
//     http://bit.ly/wildnature-mod
return super.setBlocks();
    }
}