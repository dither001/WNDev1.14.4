package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.world.gen.biomes.biomes.surface.BialowiezaSurfaceBuilder;
import com.matez.wildnature.world.gen.biomes.biomes.surface.WNSurfaceBuilders;
import com.matez.wildnature.world.gen.feature.WNWaterFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.birch.tree_birch1;
import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.structures.nature.woods.bialowieza.*;
import com.matez.wildnature.world.gen.structures.nature.woods.willow.tree_willow10;
import com.matez.wildnature.world.gen.structures.nature.woods.willow.tree_willow9;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.CountConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNBialowiezaMarsh extends WNBiome {
    public WNBialowiezaMarsh(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(SurfaceBuilder.DEFAULT, WNSurfaceBuilders.BROWN_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.SWAMP)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_COOL)
                .depth(0.1F)
                .scale(0.0F)
                .temperature(0.4F)
                .downfall(0.9F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent("wildnature:bialowieza_forest"));



        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        WNBiomeFeatures.addCarvers(this);
        WNBiomeFeatures.addStructures(this);
        WNBiomeFeatures.addLakes(this);
        WNBiomeFeatures.addMonsterRooms(this);
        WNBiomeFeatures.addStoneVariants(this);
        WNBiomeFeatures.addOres(this);
        WNBiomeFeatures.addGrass(this);

        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);
        WNBiomeFeatures.addPlant(this, Blocks.BLUE_ORCHID.getDefaultState(),1);

        WNBiomeFeatures.addTree(this,new tree_willow9(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:willow_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:willow_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_willow10(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:willow_log").getDefaultState(),tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:willow_leaves"))),1);

        plantRate=1;
        treeRate=1;


        applyPlants();
        applyTrees();

        this.addFeature(GenerationStage.Decoration.TOP_LAYER_MODIFICATION, Biome.createDecoratedFeature(new WNWaterFeature(CountConfig::deserialize),new CountConfig(32), Placement.COUNT_BIASED_RANGE, new CountRangeConfig(50, 60, 0, 150)));

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 5, 1, 1));

    }
    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(BlockPos pos) {
        double d0 = INFO_NOISE.getValue((double)pos.getX() * 0.05D, (double)pos.getZ() * 0.05D);
        return d0 < -0.1D ? 0x518744 : 0x6F7E41;
    }

    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor(BlockPos pos) {
        return 6975545;
    }
}