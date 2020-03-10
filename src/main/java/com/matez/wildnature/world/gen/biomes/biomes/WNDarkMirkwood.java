package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.world.gen.biomes.biomes.surface.CustomSurfaceBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.structures.nature.woods.spooky.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNDarkMirkwood extends WNBiome {
    public WNDarkMirkwood(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(new CustomSurfaceBuilder(new CustomSurfaceBuilder.BlockCfg(SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG,10),new CustomSurfaceBuilder.BlockCfg(SurfaceBuilder.PODZOL_DIRT_GRAVEL_CONFIG,1)), SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.08F)
                .scale(0.1F)
                .temperature(0.2F)
                .downfall(0.15F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent(null));



        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addStructure(Feature.SWAMP_HUT, IFeatureConfig.NO_FEATURE_CONFIG);
        WNBiomeFeatures.addCarvers(this);
        WNBiomeFeatures.addStructures(this);
        WNBiomeFeatures.addLakes(this);
        WNBiomeFeatures.addMonsterRooms(this);
        WNBiomeFeatures.addDoubleFlowers(this);
        WNBiomeFeatures.addStoneVariants(this);
        WNBiomeFeatures.addOres(this);
        WNBiomeFeatures.addSedimentDisks(this);
        WNBiomeFeatures.addGrass(this);
        WNBiomeFeatures.addMushrooms(this);
        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);
        WNBiomeFeatures.addPlant(this, Main.getBlockByID("wildnature:radissium_red").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:radissium_blue").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:radissium_pink").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:yew_bush").getDefaultState(),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:pasque_white").getDefaultState().with(FloweringBushBase.FLOWERING,true),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:viburnum_white").getDefaultState().with(FloweringBushBase.FLOWERING,true),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:clover").getDefaultState(),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:leaf_pile").getDefaultState(),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:spidergrass").getDefaultState().with(FloweringBushBase.FLOWERING,true),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:lampgrass").getDefaultState().with(FloweringBushBase.FLOWERING,true),6);


        WNBiomeFeatures.addTree(this,new spooky_big1(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big2(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big3(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big4(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big5(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big6(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big7(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky_big8(NoFeatureConfig::deserialize,true),3);

        WNBiomeFeatures.addTree(this,new spooky1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky4(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky5(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky6(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky7(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky8(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky9(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky10(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky11(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky12(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky13(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spooky14(NoFeatureConfig::deserialize,true),3);
        WNBiomeFeatures.addTree(this,new spooky15(NoFeatureConfig::deserialize,true),3);

        treeRate=22;

        applyPlants();
        applyTrees();

        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 15, 8, 8));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 5, 4, 4));
        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 40, 8, 8));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 200, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CAVE_SPIDER, 200, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 65, 1, 2));

    }


    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(BlockPos pos)
    {
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return customColor(noise,-0.1D,0x406E28,0x276B27);
    }


}