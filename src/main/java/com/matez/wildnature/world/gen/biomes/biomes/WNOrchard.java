package com.matez.wildnature.world.gen.biomes.biomes;

import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.world.gen.feature.CaveVineFeature;
import com.matez.wildnature.world.gen.feature.WNTreeVinesFeature;
import com.matez.wildnature.world.gen.feature.WNVinesFeature;
import com.matez.wildnature.world.gen.structures.nature.woods.birch.tree_birch1;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.oak1;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.oak2;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.oak3;
import com.matez.wildnature.world.gen.structures.nature.woods.oak.tree_oak5;
import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.world.gen.biomes.setup.WNBiome;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeBuilder;
import com.matez.wildnature.world.gen.biomes.setup.WNBiomeFeatures;
import com.matez.wildnature.world.gen.structures.nature.woods.orchard.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WNOrchard extends WNBiome {
    public WNOrchard(String name) {
        super(name,(new WNBiomeBuilder())
                .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .precipitation(RainType.RAIN)
                .category(Category.FOREST)
                .topography(WNBiomeBuilder.Topography.LOWLANDS)
                .climate(WNBiomeBuilder.Climate.CONTINENTAL_WARM)
                .depth(0.1F)
                .scale(0.01F)
                .temperature(0.6F)
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
        WNBiomeFeatures.addGrass(this,16);

        WNBiomeFeatures.addReedsAndPumpkins(this);
        WNBiomeFeatures.addSprings(this);

        //this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new VinesFeature(BushConfig::deserialize),new BushConfig(WNBlocks.GRAPE_VINE_PURPLE.getDefaultState()), Placement.COUNT_HEIGHT_64, new FrequencyConfig(10)));
        //this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new VinesFeature(BushConfig::deserialize),new BushConfig(WNBlocks.GRAPE_VINE_YELLOW.getDefaultState()), Placement.COUNT_HEIGHT_64, new FrequencyConfig(20)));

        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:heather_yellow").getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:heather_white").getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:heather_pink").getDefaultState().with(FloweringBushBase.FLOWERING,true),3);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:heather_purple").getDefaultState(),4);
        WNBiomeFeatures.addPlant(this,Main.getBlockByID("wildnature:pasque_yellow").getDefaultState().with(FloweringBushBase.FLOWERING,true),3);


        //WNBiomeFeatures.addTree(this,new BigTree(NoFeatureConfig::deserialize,true,Main.getBlockByID("minecraft:oak_log").getDefaultState(), tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:apple_leaves"))),2);
        //WNBiomeFeatures.addTree(this,new BigTree(NoFeatureConfig::deserialize,true,Main.getBlockByID("minecraft:oak_log").getDefaultState(),tree_birch1.notDecayingLeaf(Main.getBlockByID("wildnature:pear_leaves"))),2);
        WNBiomeFeatures.addTree(this,new oak1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oak2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new oak3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new tree_oak5(NoFeatureConfig::deserialize,true,Main.getBlockByID("minecraft:oak_log").getDefaultState(),tree_birch1.notDecayingLeaf(Main.getBlockByID("minecraft:oak_leaves"))),4);
        WNBiomeFeatures.addTree(this,new apple1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new apple2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new apple3(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pear1(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pear2(NoFeatureConfig::deserialize,true),1);
        WNBiomeFeatures.addTree(this,new pear3(NoFeatureConfig::deserialize,true),1);

        this.addFeature(GenerationStage.Decoration.TOP_LAYER_MODIFICATION, Biome.createDecoratedFeature(new WNTreeVinesFeature(BushConfig::deserialize), new BushConfig(WNBlocks.GRAPE_VINE_YELLOW.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 65, 0, 80)));


        /*
         WNBiomeFeatures.addTree(this,new tree_oak2(NoFeatureConfig::deserialize,true,Crack.getBlockByID("wildnature:apple_log").getDefaultState(),tree_birch1.notDecayingLeaf(Crack.getBlockByID("wildnature:apple_leaves"))),2);
        WNBiomeFeatures.addTree(this,new tree_oak5(NoFeatureConfig::deserialize,true,Crack.getBlockByID("wildnature:apple_log").getDefaultState(),tree_birch1.notDecayingLeaf(Crack.getBlockByID("wildnature:apple_leaves"))),2);
        WNBiomeFeatures.addTree(this,new tree_oak4(NoFeatureConfig::deserialize,true,Crack.getBlockByID("wildnature:pear_log").getDefaultState(),tree_birch1.notDecayingLeaf(Crack.getBlockByID("wildnature:pear_leaves"))),2);
        WNBiomeFeatures.addTree(this,new tree_oak5(NoFeatureConfig::deserialize,true,Crack.getBlockByID("minecraft:oak_log").getDefaultState(),tree_birch1.notDecayingLeaf(Crack.getBlockByID("minecraft:oak_leaves"))),1);

         */
        treeRate=5;

        //applyPlants();
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
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return customColor(noise,-0.1D,9039360,11721984);
    }

    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor(BlockPos pos)
    {
        double noise = INFO_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return customColor(noise,-0.1D,9039360, 11721984);
    }

}