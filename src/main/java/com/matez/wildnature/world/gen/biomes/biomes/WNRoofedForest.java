package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.world.gen.biomes.biomes.surface.CustomSurfaceBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.feature.WNBlobConfig;
import com.matez.wildnature.world.gen.feature.WNBlobFeature;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.deco.forsythia1;
import com.matez.wildnature.world.gen.structures.nature.woods.greenwood.greenwood1;
import com.matez.wildnature.world.gen.structures.nature.woods.greenwood.greenwood2;
import com.matez.wildnature.world.gen.structures.nature.woods.greenwood.greenwood3;
import com.matez.wildnature.world.gen.structures.nature.woods.greenwood.greenwood4;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.dark_high_oak_1;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.dark_high_oak_2;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.dark_high_oak_3;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.dark_high_oak_4;
import com.matez.wildnature.world.gen.structures.nature.woods.oaklands.*;
import com.matez.wildnature.world.gen.structures.nature.woods.rowan.rowan1;
import com.matez.wildnature.world.gen.structures.nature.woods.rowan.rowan4;
import com.matez.wildnature.world.gen.structures.nature.woods.shrubs.shrub1;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNRoofedForest extends WNBiome {
    public WNRoofedForest(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(new CustomSurfaceBuilder(new CustomSurfaceBuilder.BlockCfg(SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG,4),new CustomSurfaceBuilder.BlockCfg(SurfaceBuilder.PODZOL_DIRT_GRAVEL_CONFIG,1)), SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.5F)
                .scale(0.3F)
                .temperature(0.4F)
                .downfall(0.8F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent(null));



        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        WNBiomeFeatures.addCarvers(this);
        WNBiomeFeatures.addStructures(this);
        WNBiomeFeatures.addLakes(this);
        WNBiomeFeatures.addMonsterRooms(this);
        WNBiomeFeatures.addDoubleFlowers(this);
        WNBiomeFeatures.addStoneVariants(this);
        WNBiomeFeatures.addOres(this);
        WNBiomeFeatures.addSedimentDisks(this);
        WNBiomeFeatures.addDefaultFlowers(this);
        WNBiomeFeatures.addGrass(this,10);
        WNBiomeFeatures.addGrass(this,5,Blocks.FERN.getDefaultState());


        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_BOOLEAN_SELECTOR, new TwoFeatureChoiceConfig(Feature.HUGE_RED_MUSHROOM, new BigMushroomFeatureConfig(false), Feature.HUGE_BROWN_MUSHROOM, new BigMushroomFeatureConfig(false)), Placement.COUNT_HEIGHTMAP, new FrequencyConfig(1)));

        WNBiomeFeatures.addPlant(this,WNBlocks.HYACINTH_DARK_BLUE.getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        WNBiomeFeatures.addPlant(this,WNBlocks.HYACINTH_PINK.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.HYACINTH_RED.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.MARIGOLD_RED.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.VIBURNUM_PINK.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.VIBURNUM_WHITE.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.GERANIUM_RED.getDefaultState().with(FloweringBushBase.FLOWERING,true),2);

        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:yew_bush").getDefaultState(),5);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:clover").getDefaultState(),5);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:leaf_pile").getDefaultState(),5);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:grass_wheat").getDefaultState().with(FloweringBushBase.FLOWERING,true),6);

        WNBiomeFeatures.addTree(this,new greenwood1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new greenwood2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new greenwood3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new greenwood4(NoFeatureConfig::deserialize,true),1);

        WNBiomeFeatures.addTree(this,new dark_high_oak_1(NoFeatureConfig::deserialize,true),7);
        WNBiomeFeatures.addTree(this,new dark_high_oak_2(NoFeatureConfig::deserialize,true),7);
        WNBiomeFeatures.addTree(this,new dark_high_oak_3(NoFeatureConfig::deserialize,true),7);
        WNBiomeFeatures.addTree(this,new dark_high_oak_4(NoFeatureConfig::deserialize,true),7);

        WNBiomeFeatures.addTree(this,new forsythia1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new rowan4(NoFeatureConfig::deserialize,true),1);


        WNBiomeFeatures.addTree(this,new oaklands_smallshrub1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oaklands_smallshrub2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oaklands_smallshrub3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oaklands_shrub1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oaklands_shrub2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oaklands_shrub5(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new shrub1(NoFeatureConfig::deserialize,true,Blocks.DARK_OAK_LOG.getDefaultState(),SchemFeature.notDecayingLeaf(Blocks.DARK_OAK_LEAVES)),20);

        this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Biome.createDecoratedFeature(new WNBlobFeature(WNBlobConfig::deserialize), new WNBlobConfig(Blocks.PODZOL.getDefaultState(),2,true,false), Placement.FOREST_ROCK, new FrequencyConfig(3)));

        plantRate=3;
        treeRate=35;

        applyPlants();
        applyTrees();

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 2, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 2, 1, 3));
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
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.007D, (double)pos.getZ() * 0.007D);
        return customColor(noise,-0.1D,0x6AC855,0x7DD05E);
    }

    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor(BlockPos pos)
    {
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return customColor(noise,-0.1D,0x53B33B,0x5AB43E);
    }



}