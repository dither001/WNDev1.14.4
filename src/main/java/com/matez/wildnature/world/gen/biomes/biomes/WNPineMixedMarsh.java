package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.world.gen.biomes.biomes.surface.CustomSurfaceBuilder;
import com.matez.wildnature.world.gen.biomes.biomes.surface.WNSurfaceBuilders;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.feature.WNBlobConfig;
import com.matez.wildnature.world.gen.feature.WNBlobFeature;
import com.matez.wildnature.world.gen.structures.nature.SchemFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.beech.weeping_beech_1;
import com.matez.wildnature.world.gen.structures.nature.woods.beech.weeping_beech_2;
import com.matez.wildnature.world.gen.structures.nature.woods.beech.weeping_beech_3;
import com.matez.wildnature.world.gen.structures.nature.woods.beech.weeping_beech_4;
import com.matez.wildnature.world.gen.structures.nature.woods.birch.*;
import com.matez.wildnature.world.gen.structures.nature.woods.boreal.*;
import com.matez.wildnature.world.gen.structures.nature.woods.larch.*;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.oak1;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.oak2;
import com.matez.wildnature.world.gen.structures.nature.woods.pine.*;
import com.matez.wildnature.world.gen.structures.nature.woods.rowan.rowan3;
import com.matez.wildnature.world.gen.structures.nature.woods.shrubs.shrub1;
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
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNPineMixedMarsh extends WNBiome {
    public WNPineMixedMarsh(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(new CustomSurfaceBuilder(new CustomSurfaceBuilder.BlockCfg(WNSurfaceBuilders.BROWN_PODZOL_CONFIG,5),new CustomSurfaceBuilder.BlockCfg(WNSurfaceBuilders.BROWN_CONFIG,1)), SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.15F)
                .scale(0.03F)
                .temperature(0.25F)
                .downfall(0.7F)
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
        WNBiomeFeatures.addGrass(this,18);

        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);

        WNBiomeFeatures.addPlant(this,WNBlocks.BLUEBELL.getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        WNBiomeFeatures.addPlant(this,WNBlocks.HEATH_PINK.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.FORGET_ME_NOT_BLUE.getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.THUJA.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.THUJA_LARGE.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.PERENNIAL_BLUE.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,WNBlocks.PERENNIAL_VIOLET.getDefaultState(),1);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:yew_bush").getDefaultState(),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:clover").getDefaultState(),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:leaf_pile").getDefaultState(),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:grass_wheat").getDefaultState().with(FloweringBushBase.FLOWERING,true),4);
        WNBiomeFeatures.addPlant(this,WNBlocks.VIBURNUM_WHITE.getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:iris_purple").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);

        WNBiomeFeatures.addTree(this,new tree_pine1(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_pine2(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_pine3(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_pine4(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_pine5(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_pine6(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine1(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine2(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine3(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine4(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine5(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_bpine6(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),4);
        WNBiomeFeatures.addTree(this,new tree_larch1(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch2(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch3(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch4(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch5(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch6(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch7(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch8(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);
        WNBiomeFeatures.addTree(this,new tree_larch9(NoFeatureConfig::deserialize,true,Main.getBlockByID("wildnature:larch_log").getDefaultState(), SchemFeature.notDecayingLeaf(Main.getBlockByID("wildnature:larch_leaves"))),1);

        WNBiomeFeatures.addTree(this,new spiky_birch_1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spiky_birch_2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spiky_birch_3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new spiky_birch_4(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pointy_birch4(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new big_birch_1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new big_birch_2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new big_birch_3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oak1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oak2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new weeping_beech_1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new weeping_beech_2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new weeping_beech_3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new weeping_beech_4(NoFeatureConfig::deserialize,true),1);

        WNBiomeFeatures.addTree(this,new rowan3(NoFeatureConfig::deserialize,true),1);

        WNBiomeFeatures.addTree(this,new shrub1(NoFeatureConfig::deserialize,true),2);
        WNBiomeFeatures.addTree(this,new shrub1(NoFeatureConfig::deserialize,true, Blocks.SPRUCE_LOG.getDefaultState(), SchemFeature.notDecayingLeaf(WNBlocks.PINE_LEAVES)),2);

        this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Biome.createDecoratedFeature(new WNBlobFeature(WNBlobConfig::deserialize), new WNBlobConfig(Blocks.WATER.getDefaultState(),3,true,true,true), Placement.FOREST_ROCK, new FrequencyConfig(2)));


        this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Biome.createDecoratedFeature(new WNBlobFeature(WNBlobConfig::deserialize), new WNBlobConfig(WNBlocks.BROWN_GRASS_BLOCK.getDefaultState(),2,true,false), Placement.FOREST_ROCK, new FrequencyConfig(3)));

        plantRate=2;
        treeRate=14;

        applyPlants();
        applyTrees();

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
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
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.005D, (double)pos.getZ() * 0.005D);
        return customColor(noise,-0.1D,0xC4B162,0xB5C46E);
    }

    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor(BlockPos pos)
    {
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return customColor(noise,-0.1D,0x9AC170,0x8BC963);
    }



}