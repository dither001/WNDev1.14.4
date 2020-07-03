package com.matez.wildnature.world.gen.structures.nature.woods.glowshroom;

import com.matez.wildnature.Main;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.other.Utilities;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.glowing_cave_oak.glowing_cave_oak_1;
import com.matez.wildnature.world.gen.structures.nature.woods.glowing_cave_oak.glowing_cave_oak_2;
import com.matez.wildnature.world.gen.structures.nature.woods.glowing_cave_oak.glowing_cave_oak_3;
import com.matez.wildnature.world.gen.structures.nature.woods.glowing_cave_oak.glowing_cave_oak_4;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class GlowshroomSpawner extends AbstractTreeFeature<NoFeatureConfig> {
    private ArrayList<SchemFeature> glowshrooms = new ArrayList<SchemFeature>();

    public GlowshroomSpawner(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49920_1_, boolean doBlockNofityOnPlace) {
        super(p_i49920_1_, doBlockNofityOnPlace);
        glowshrooms.add(new glowshroom1(NoFeatureConfig::deserialize, false));
        glowshrooms.add(new glowshroom2(NoFeatureConfig::deserialize, false));
        glowshrooms.add(new glowshroom3(NoFeatureConfig::deserialize, false));
        glowshrooms.add(new glowshroom4(NoFeatureConfig::deserialize, false));
        glowshrooms.add(new glowshroom5(NoFeatureConfig::deserialize, false));
    }

    @Override
    protected boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox mutable) {
        for(int i = position.getY(); i < position.getY()+15; i++){
            if(!worldIn.hasBlockState(position, new Predicate<BlockState>() {
                @Override
                public boolean test(BlockState state) {
                    return state.isAir();
                }
            })){
                return false;
            }
        }

        int index = Utilities.rint(0, glowshrooms.size() - 1, rand);
        return glowshrooms.get(index).place((IWorld)worldIn,((IWorld) worldIn).getChunkProvider().getChunkGenerator(),rand, position,new NoFeatureConfig());

    }
}
