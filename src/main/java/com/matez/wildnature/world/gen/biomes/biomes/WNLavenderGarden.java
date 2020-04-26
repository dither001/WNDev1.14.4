package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.Main;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.structures.nature.woods.birch.tree_birch1;
import com.matez.wildnature.world.gen.feature.LavenderFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.jacaranda.jacaranda1;
import com.matez.wildnature.world.gen.structures.nature.woods.jacaranda.jacaranda2;
import com.matez.wildnature.world.gen.structures.nature.woods.jacaranda.jacaranda3;
import com.matez.wildnature.world.gen.structures.nature.woods.jacaranda.jacaranda4;
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
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNLavenderGarden extends WNBiome {
    public WNLavenderGarden(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.1F)
                .scale(0.00F)
                .temperature(0.6F)
                .downfall(0.8F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent(null));



        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        //this.addStructure(Feature.VILLAGE, new VillageConfig("village/plains/town_centers", 6));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new LavenderFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(77)));

        WNBiomeFeatures.addCarvers(this);
        WNBiomeFeatures.addStructures(this);
        WNBiomeFeatures.addLakes(this);
        WNBiomeFeatures.addMonsterRooms(this);
        WNBiomeFeatures.addDoubleFlowers(this);
        WNBiomeFeatures.addStoneVariants(this);
        WNBiomeFeatures.addOres(this);
        WNBiomeFeatures.addSedimentDisks(this);
        WNBiomeFeatures.addGrass(this,5);

        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);


        WNBiomeFeatures.addTree(this,new jacaranda1(NoFeatureConfig::deserialize,true, Main.getBlockByID("wildnature:jacaranda_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:jacaranda_leaves"))),1);
        WNBiomeFeatures.addTree(this,new jacaranda2(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:jacaranda_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:jacaranda_leaves"))),1);
        WNBiomeFeatures.addTree(this,new jacaranda3(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:jacaranda_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:jacaranda_leaves"))),1);
        WNBiomeFeatures.addTree(this,new jacaranda4(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:jacaranda_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:jacaranda_leaves"))),1);


        plantRate=4;
        treeRate=1;

        applyPlants();
        applyTrees();

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 5, 4, 4));
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
    public int getGrassColor(BlockPos pos)
    {
        return 0x76D51A;
    }


}