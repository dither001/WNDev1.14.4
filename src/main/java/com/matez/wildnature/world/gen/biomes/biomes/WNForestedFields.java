package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.structures.nature.woods.birch.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNForestedFields extends WNBiome {
    public WNForestedFields(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.15F)
                .scale(0.03F)
                .temperature(0.35F)
                .downfall(0.8F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent(null));



        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.VILLAGE, new VillageConfig("village/plains/town_centers", 6));

        WNBiomeFeatures.addCarvers(this);
        WNBiomeFeatures.addStructures(this);
        WNBiomeFeatures.addLakes(this);
        WNBiomeFeatures.addMonsterRooms(this);
        WNBiomeFeatures.addDoubleFlowers(this);
        WNBiomeFeatures.addStoneVariants(this);
        WNBiomeFeatures.addOres(this);
        WNBiomeFeatures.addSedimentDisks(this);
        WNBiomeFeatures.addDefaultFlowers(this);
        WNBiomeFeatures.addGrass(this,80, Blocks.TALL_GRASS.getDefaultState(),true);
        WNBiomeFeatures.addGrass(this,10);

        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);

        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:pasque_white").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this, WNBlocks.PASQUE_YELLOW.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this, WNBlocks.CATNIP.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this, WNBlocks.VIOLET_PURPLE.getDefaultState().with(FloweringBushBase.FLOWERING,true),3);
        WNBiomeFeatures.addPlant(this,Blocks.POPPY.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,Blocks.CORNFLOWER.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:grass_flower").getDefaultState().with(FloweringBushBase.FLOWERING,true),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:wild_wheat").getDefaultState().with(FloweringBushBase.FLOWERING,true),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:grass_wheat").getDefaultState().with(FloweringBushBase.FLOWERING,true),4);

        WNBiomeFeatures.addTree(this,new pointy_birch1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch4(NoFeatureConfig::deserialize,true),1);

        WNBiomeFeatures.addTree(this,new thin_birch1(NoFeatureConfig::deserialize,true),4);
        WNBiomeFeatures.addTree(this,new thin_birch2(NoFeatureConfig::deserialize,true),4);
        WNBiomeFeatures.addTree(this,new thin_birch3(NoFeatureConfig::deserialize,true),4);
        WNBiomeFeatures.addTree(this,new thin_birch4(NoFeatureConfig::deserialize,true),4);
        //this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new StoneHenge(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(5,64,0,90)));
        //this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Biome.createDecoratedFeature(new StreamFeature(NoFeatureConfig :: deserialize),new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(1,65,0,75)));

        plantRate=2;
        treeRate=4;

        applyPlants();
        applyTrees();

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 3, 4, 4));
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
        return 0xA9D772;
    }


}