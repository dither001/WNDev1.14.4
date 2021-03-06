package com.matez.wildnature.world.gen.biomes.setup;

import com.matez.wildnature.Main;
import com.matez.wildnature.blocks.FloweringBushBase;
import com.matez.wildnature.blocks.RockBase;
import com.matez.wildnature.blocks.SaltOreBlock;
import com.matez.wildnature.customizable.CommonConfig;
import com.matez.wildnature.lists.WNBlocks;
import com.matez.wildnature.other.BlockWeighList;
import com.matez.wildnature.world.gen.feature.*;
import com.matez.wildnature.world.gen.feature.ScatteredPlantFeature;
import com.matez.wildnature.world.gen.feature.WaterlilyFeature;
import com.matez.wildnature.world.gen.structures.nature.rocks.*;
import com.matez.wildnature.world.gen.structures.nature.woods.glowing_cave_oak.GlowingCaveOakSpawner;
import com.matez.wildnature.world.gen.structures.nature.woods.glowshroom.GlowshroomSpawner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.EntityClassification;
import net.minecraft.fluid.Fluids;
import net.minecraft.world.biome.BeachBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.CaveWorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.BiomeDictionary;

import java.util.ArrayList;
import java.util.Arrays;

public class WNBiomeFeatures extends DefaultBiomeFeatures {

    public static ArrayList<Biome> defaultPlantBlacklist = new ArrayList<>();

    public static void removeAllDefaultFlowers(Biome biomeIn){
        defaultPlantBlacklist.add(biomeIn);
    }

    public static void addBerryBushes(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new ScatteredPlantFeature(NoFeatureConfig::deserialize, Blocks.SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, Integer.valueOf(3))), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(1)));
    }

	public static void addGrass(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Blocks.GRASS.getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(9)));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Main.getBlockByID("wildnature:medium_grass").getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(3)));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Main.getBlockByID("wildnature:small_grass").getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(2)));
    }

    public static void addLotsOfGrass(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Blocks.GRASS.getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(14)));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Main.getBlockByID("wildnature:medium_grass").getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(6)));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Main.getBlockByID("wildnature:small_grass").getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(5)));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new DoubleGrassFeature(DoublePlantConfig::deserialize), new DoublePlantConfig(Blocks.TALL_GRASS.getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(5)));

    }


    public static void addMushrooms(Biome biomeIn) {
	    if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.FOREST)) {
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Blocks.BROWN_MUSHROOM.getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Blocks.RED_MUSHROOM.getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(4)));

            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom1").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom2").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom4").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(4)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom5").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(4)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom6").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom7").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom8").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom9").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:psilocybin_mushroom").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(1)));

        }
        if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.PLAINS)) {
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:mushroom3").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));

        }
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(Main.getBlockByID("wildnature:fuzzball").getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(1)));

    }

    public static ArrayList<Biome> lakeBiomes = new ArrayList<>();
    public static void addLakes(Biome biomeIn) {
	    lakeBiomes.add(biomeIn);
    }

    public static ArrayList<Biome> springBiomes = new ArrayList<>();
    public static void addSprings(Biome p_222337_0_) {
	    springBiomes.add(p_222337_0_);
    }



    public static void addGrass(Biome biomeIn, int rate) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Blocks.GRASS.getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(rate)));
    }

    public static void addGrass(Biome biomeIn, int rate, BlockState grass) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(grass), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(rate)));
    }

    public static void addGrass(Biome biomeIn, int rate, BlockState grass,boolean isDouble) {
        if (isDouble) {
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new DoubleGrassFeature(DoublePlantConfig::deserialize), new DoublePlantConfig(grass), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(rate)));
        }else{
            addGrass(biomeIn,rate,grass);
        }
    }

    public static void addPlant(Biome biomeIn, BlockState state, int frequency){
        //biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new PlantFeature(PlantFeature.PlantFeatureConfig::deserialize), new PlantFeature.PlantFeatureConfig(state), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(frequency)));
        if(biomeIn instanceof WNBiome){
            ((WNBiome) biomeIn).plants.add(state,frequency);
        }
    }

    public static void addDoublePlant(Biome biomeIn, BlockState state, int frequency){
        //biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new PlantFeature(PlantFeature.PlantFeatureConfig::deserialize), new PlantFeature.PlantFeatureConfig(state), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(frequency)));
        if(biomeIn instanceof WNBiome){
            ((WNBiome) biomeIn).plants.add(state,frequency);
        }
    }

    public static void addWaterlilies(Biome biome, Block waterlily, int count){
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new WaterlilyFeature(NoFeatureConfig::deserialize,waterlily), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(count)));

    }

    public static void addTree(Biome biomeIn, AbstractTreeFeature tree, int frequency){
        //biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new PlantFeature(PlantFeature.PlantFeatureConfig::deserialize), new PlantFeature.PlantFeatureConfig(state), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(frequency)));
        if(biomeIn instanceof WNBiome){
            ((WNBiome) biomeIn).trees.add(tree,frequency);
        }
    }

    public static void addNewStoneVariants(Biome biomeIn) {
        int seaLevel = 40;
        int worldHeight = 255;
        ArrayList<Block> rocks = new ArrayList<>(Arrays.asList(Main.RegistryEvents.rockRegistry.rocks));
        for(int i = 0; i < rocks.size(); i++){
            Block b = Main.getBlockByID(rocks.get(i).getRegistryName().toString());
            RockBase r = null;
            if(b instanceof RockBase){
                r = (RockBase)b;
            }else{
                continue;
            }



            if(b.getRegistryName().toString().equals("wildnature:hardened_sandstone")){

            }else if(b.getRegistryName().toString().equals("wildnature:red_hardened_sandstone")){

            }else if(b.getRegistryName().toString().equals("wildnature:frozen_stone")){
                if(biomeIn.getTempCategory()== Biome.TempCategory.COLD) {
                    //biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new WNOreFeatureConfig(WNOreFeatureConfig.FillerBlockType.NATURAL_STONE, b.getDefaultState(), r.getSize() * 2), Placement.COUNT_RANGE, new CountRangeConfig(r.getCount(), r.getMinYByType(seaLevel), 0, r.getMaxYByType(seaLevel, worldHeight))));
                }
            }else {
                if(CommonConfig.generateRocks.get()){
                    boolean gen = true;
                    if(!CommonConfig.genBasalt.get() && r.getRegistryName().getPath().equals("basalt")){
                        gen = false;
                    }
                    if(!CommonConfig.genConglomerate.get() && r.getRegistryName().getPath().equals("conglomerate")){
                        gen = false;
                    }
                    if(!CommonConfig.genGneiss.get() && r.getRegistryName().getPath().equals("gneiss")){
                        gen = false;
                    }
                    if(!CommonConfig.genLimestone.get() && r.getRegistryName().getPath().equals("limestone")){
                        gen = false;
                    }
                    if(!CommonConfig.genMarble.get() && r.getRegistryName().getPath().equals("marble")){
                        gen = false;
                    }
                    if(!CommonConfig.genPegmatite.get() && r.getRegistryName().getPath().equals("pegmatite")){
                        gen = false;
                    }
                    if(!CommonConfig.genSlate.get() && r.getRegistryName().getPath().equals("slate")){
                        gen = false;
                    }
                    if(gen) {
                        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, b.getDefaultState(), r.getSize()), Placement.COUNT_RANGE, new CountRangeConfig(r.getCount(), r.getMinYByType(seaLevel), 0, r.getMaxYByType(seaLevel, worldHeight))));
                    }
                }
                //System.out.println("Added " + r.getTranslationKey() + " with max height: " + r.getMaxYByType(seaLevel, worldHeight));
            }
        }

        if(biomeIn.getTempCategory()== Biome.TempCategory.COLD) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.PACKED_ICE.getDefaultState(), CommonConfig.rockSize.get() * 2), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.rockChance.get(), 25, 0, seaLevel-(seaLevel/4))));
        }

        rocks=null;
    }



    public static void addCarvers(Biome biomeIn) {
        biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new WNCaveCarver(ProbabilityConfig::deserialize, 256), new ProbabilityConfig(0.14285715F)));
    }

    public static void addCaveVines(Biome biomeIn) {
        if (biomeIn.getTempCategory() == Biome.TempCategory.WARM && BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.JUNGLE)) {
            if (biomeIn != WNBiomes.Polders) {
                biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveVineFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(3, 10, 0, 35)));
                biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new WNVinesFeature(BushConfig::deserialize), new BushConfig(Blocks.VINE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 10, 0, 35)));
            }
        }else if(biomeIn.getTempCategory() == Biome.TempCategory.WARM){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveVineFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(4, 10, 0, 35)));
        }else if(biomeIn.getTempCategory() == Biome.TempCategory.MEDIUM){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveVineFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(1, 10, 0, 35)));
        }
    }

    public static void addCrystals(Biome biomeIn) {
        if(biomeIn!= com.matez.wildnature.world.gen.biomes.setup.WNBiomes.Polders)
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CrystalFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(10, 10, 0, 35)));
    }

    public static void addCobweb(Biome biomeIn) {
        if(biomeIn!= com.matez.wildnature.world.gen.biomes.setup.WNBiomes.Polders)
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CobwebFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(30, 10, 0, 35)));
    }

    public static void addStalagmites(Biome biomeIn) {
        if(biomeIn!= com.matez.wildnature.world.gen.biomes.setup.WNBiomes.Polders)
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new StalagmiteFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(100, 10, 0, 50)));
    }

    public static void addPebbles(Biome biomeIn) {
        if(biomeIn!= com.matez.wildnature.world.gen.biomes.setup.WNBiomes.Polders)
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new PebbleFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(70, 10, 0, 50)));
    }

    public static void addNewOres(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.TIN_ORE.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.tinRarity.get(), 40, 0, 64)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.COPPER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.copperRarity.get(), 0, 0, 30)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.SALT_ORE.getDefaultState().with(SaltOreBlock.SALT_VARIANT,SaltOreBlock.SaltVariant.STONE), 5), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.saltStoneRarity.get(), 20, 0, 55)));

        if(biomeIn.getTempCategory()== Biome.TempCategory.COLD){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.AMETHYST_ORE.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.amethystRarity.get(), 10, 0, 28)));
        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.MEDIUM){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.SAPPHIRE_ORE.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.sapphireRarity.get(), 10, 0, 28)));
        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.WARM){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.MALACHITE_ORE.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.malachiteRarity.get(), 10, 0, 28)));
        }
        if(biomeIn instanceof BeachBiome){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new WNOreFeature(WNOreFeatureConfig::deserialize), new WNOreFeatureConfig(WNOreFeatureConfig.FillerBlockType.SAND, WNBlocks.AMBER_ORE.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.amberRarity.get(), 50, 0, 65)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new WNOreFeature(WNOreFeatureConfig::deserialize), new WNOreFeatureConfig(WNOreFeatureConfig.FillerBlockType.SAND, WNBlocks.SALT_ORE.getDefaultState().with(SaltOreBlock.SALT_VARIANT,SaltOreBlock.SaltVariant.SAND), 7), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.saltSandRarity.get(), 50, 0, 65)));

        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.OCEAN){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.RUBY_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.rubyRarity.get(), 0, 0, 15)));

        }


        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WNBlocks.SILVER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.silverRarity.get(), 20, 0, 36)));

    }

    public static void addRockFormations(Biome biomeIn){
        biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new basalt_rock(NoFeatureConfig::deserialize,true), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(1,64,0,80)));
        biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new conglomerate_rock(NoFeatureConfig::deserialize,true), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(1,64,0,80)));
        biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new gneiss_rock(NoFeatureConfig::deserialize,true), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(1,64,0,80)));
        biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new slate_rock(NoFeatureConfig::deserialize,true), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(1,64,0,80)));
    }

    public static void addRiverCane(Biome biomeIn) {
        if (biomeIn.isHighHumidity() || BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.RIVER) || biomeIn==WNBiomes.River || biomeIn==WNBiomes.AmazonRiver || biomeIn==WNBiomes.NileRiver || biomeIn==WNBiomes.TropicalLake || biomeIn==WNBiomes.WarmLake || biomeIn==WNBiomes.MangroveForest ) {
            biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new RiverCaneFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.riverCaneRarity.get(), 55, 0, 65)));
        }
    }

    public static void addRiverPlants(Biome biomeIn) {
        if (BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.RIVER) || biomeIn==WNBiomes.River || biomeIn==WNBiomes.AmazonRiver || biomeIn==WNBiomes.NileRiver || biomeIn==WNBiomes.TropicalLake || biomeIn==WNBiomes.WarmLake || biomeIn==WNBiomes.ColdLake ) {
            biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Biome.createDecoratedFeature(new ReedsFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.riverCaneRarity.get(), 55, 0, 65)));
        }
    }

    public static void addFruits(Biome biomeIn){
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new WNFruitFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.fruitBushRarity.get(),64,0,100)));

    }

    public static void addVeggies(Biome biomeIn){
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new WNVegeFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.vegeCropRarity.get(),64,0,100)));

    }

    public static void addPoisonIves(Biome biomeIn){
        BlockWeighList l = new BlockWeighList();

        if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.FOREST)){
            l.add(Main.getBlockByID("wildnature:poison_ivy").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
            l.add(Main.getBlockByID("wildnature:spidergrass").getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.WARM || biomeIn.getTempCategory()== Biome.TempCategory.MEDIUM){
            l.add(Main.getBlockByID("wildnature:grass_thistle").getDefaultState().with(FloweringBushBase.FLOWERING,true),1);
        }
        if(biomeIn.getTempCategory()!= Biome.TempCategory.COLD){
            l.add(Main.getBlockByID("wildnature:nettle").getDefaultState().with(FloweringBushBase.FLOWERING,true),2);
        }
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new SinglePlantFeature(NoFeatureConfig::deserialize,l,5), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(CommonConfig.poisonIvyRarity.get())));

    }

    public static void addSmallCacti(Biome biomeIn){
        if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.SANDY) && biomeIn.getTempCategory()== Biome.TempCategory.WARM && biomeIn!= Biomes.BEACH && biomeIn!=WNBiomes.TintedDesert && biomeIn!=WNBiomes.TintedDesertHills || biomeIn==WNBiomes.WhiteBeach || biomeIn==WNBiomes.Oasis){
            BlockWeighList l = new BlockWeighList();
            l.add(Main.getBlockByID("wildnature:small_cacti").getDefaultState(),1);
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new SinglePlantFeature(NoFeatureConfig::deserialize,l,0), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(CommonConfig.smallCactiRarity.get())));


        }
    }



    public static void addCavePlants(Biome biomeIn){
        if(biomeIn.getTempCategory()== Biome.TempCategory.COLD){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:icycle").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(10, 35, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:large_icycle").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(10, 40, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:ice_grass").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(35, 30, 0, 45)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:ice_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(5, 30, 0, 45)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 10, 0, 45)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:hanging_glowing_slimeshroom_blue").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:hanging_glowing_slimeshroom_green").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowing_slimeshroom_blue").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(4, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowing_slimeshroom_green").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:sunshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 10, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new LavalilyFeature(NoFeatureConfig::deserialize,WNBlocks.MAGMA_PAD), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(5, 2, 0, 20)));

            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveStarFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:cave_star").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(9, 15, 0, 23)));

        }else{
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(11, 10, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new DoubleCaveBushFeature(BushConfig::deserialize,false), new BushConfig(Main.getBlockByID("wildnature:large_glowshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(8, 10, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:hanging_glowing_slimeshroom_blue").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:hanging_glowing_slimeshroom_green").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowing_slimeshroom_blue").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new SlimeCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowing_slimeshroom_green").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 5, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:sunshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2, 10, 0, 20)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new LavalilyFeature(NoFeatureConfig::deserialize,WNBlocks.MAGMA_PAD), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(9, 2, 0, 20)));



        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.WARM){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:poison_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2, 10, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:sulfur_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2, 20, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:dragon_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 10, 0, 15)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:gravityshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 5, 0, 20)));

            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveStarFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:cave_star").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(4, 15, 0, 23)));

        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.OCEAN){
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:sulfur_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(4, 20, 0, 50)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:dragon_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 10, 0, 15)));
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new JellyshroomFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:jellyshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(3, 2, 0, 15)));

        }



        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:stone_grass").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(40, 10, 0, 50)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:stalagmite").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(6, 10, 0, 50)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:stalactite").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(6, 10, 0, 50)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new DoubleCaveBushFeature(BushConfig::deserialize,false), new BushConfig(Main.getBlockByID("wildnature:large_stalagmite").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(6, 10, 0, 50)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new DoubleCaveBushFeature(BushConfig::deserialize,true), new BushConfig(Main.getBlockByID("wildnature:large_stalactite").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(6, 10, 0, 50)));

        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:roots").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(10, 55, 0, 52)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new DoubleCaveBushFeature(BushConfig::deserialize,true), new BushConfig(Main.getBlockByID("wildnature:large_root").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(10, 55, 0, 52)));

        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:magma_shroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(4, 5, 0, 16)));

        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:glowing_shadowshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 3, 0, 10)));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new CaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:cave_lily").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 5, 0, 20)));

        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new UnderwaterCaveBushFeature(BushConfig::deserialize), new BushConfig(Main.getBlockByID("wildnature:tubeshroom").getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1, 2, 0, 12)));


    }


    public static void addGlowingCaveOaks(Biome biomeIn) {
        if (biomeIn.getTempCategory() == Biome.TempCategory.COLD) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new GlowingCaveOakSpawner(NoFeatureConfig::deserialize,false,true), new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(2, 5, 0, 35)));
        }else if (biomeIn.getTempCategory() == Biome.TempCategory.WARM && biomeIn.getCategory()!= Biome.Category.DESERT && biomeIn.getCategory()!= Biome.Category.MESA) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new GlowingCaveOakSpawner(NoFeatureConfig::deserialize,false,false), new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(2, 5, 0, 35)));
        }else if (biomeIn.getTempCategory() == Biome.TempCategory.OCEAN) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new GlowingCaveOakSpawner(NoFeatureConfig::deserialize,false,false), new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(2, 5, 0, 35)));
        }
    }

    public static void addGlowshrooms(Biome biomeIn) {
        if (biomeIn.getTempCategory() == Biome.TempCategory.WARM && biomeIn.getCategory()!= Biome.Category.DESERT && biomeIn.getCategory()!= Biome.Category.MESA) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new GlowshroomSpawner(NoFeatureConfig::deserialize,false), new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(7, 5, 0, 45)));
        }else if (biomeIn.getTempCategory() == Biome.TempCategory.OCEAN) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new GlowshroomSpawner(NoFeatureConfig::deserialize,false), new NoFeatureConfig(), Placement.COUNT_RANGE, new CountRangeConfig(10, 5, 0, 35)));
        }
    }

    public static void addShells(Biome biomeIn){
	    if(biomeIn==Biomes.BEACH || biomeIn==WNBiomes.WhiteBeach) {
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new ShellFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.shellRarity.get(), 50, 0, 69)));
        }
    }

    public static void addMoss(Biome biomeIn){
	    if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.DENSE)){
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new WNMossFeature(CountConfig::deserialize), new CountConfig(32), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.mossRarityDense.get(),64,0,180)));
        }else if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.FOREST)) {
            biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new WNMossFeature(CountConfig::deserialize), new CountConfig(12), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.mossRarity.get(), 64, 0, 180)));

        }
        if(biomeIn.getTempCategory()== Biome.TempCategory.WARM) {
            biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(new WNMossFeature(CountConfig::deserialize), new CountConfig(64), Placement.COUNT_RANGE, new CountRangeConfig(CommonConfig.mossRarityDense.get(), 10, 0, 40)));
        }
    }

    public static void addDefaultFlowersForBiome(Biome biomeIn){
        if(defaultPlantBlacklist.contains(biomeIn)){
            return;
        }
        Biome.TempCategory category = biomeIn.getTempCategory();

        if (BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.FOREST) && !BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.JUNGLE)&& !BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.PLAINS)) {
            if (BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.DENSE)) {
                if(category== Biome.TempCategory.COLD) {
                    addPlant(biomeIn, WNBlocks.HEPATICA_BLUE.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.HEPATICA_WHITE.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.HEPATICA_PINK.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.HEPATICA_PURPLE.getDefaultState(), 1);
                }else {
                    addPlant(biomeIn, WNBlocks.PASQUE_PINK.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.PASQUE_PURPLE.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.PASQUE_WHITE.getDefaultState(), 1);
                }

                addPlant(biomeIn,WNBlocks.ANEMONE.getDefaultState(),2);

                if(category== Biome.TempCategory.MEDIUM) {
                    addPlant(biomeIn, WNBlocks.PRIMROSE_WHITE.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.PRIMROSE_BLUE.getDefaultState(), 1);
                }

                addPlant(biomeIn,WNBlocks.FORGET_ME_NOT_BLUE.getDefaultState(),1);
                if(biomeIn.getTempCategory()== Biome.TempCategory.COLD){
                    addPlant(biomeIn,WNBlocks.SNOWDROP.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.BLUEBELL.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATH_PURPLE.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATH_PINK.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATH_WHITE.getDefaultState(),2);
                }

                addPlant(biomeIn,WNBlocks.GRASS_FERNSPROUT.getDefaultState(),3);

                addPlant(biomeIn,WNBlocks.SHRUB.getDefaultState(),4);
                addPlant(biomeIn,WNBlocks.SHRUB_TALL.getDefaultState(),4);
            }else{
                if(category== Biome.TempCategory.COLD) {
                    addPlant(biomeIn, WNBlocks.HEPATICA_PURPLE.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.HEPATICA_PINK.getDefaultState(), 2);
                    addPlant(biomeIn, WNBlocks.HEPATICA_VIOLET.getDefaultState(), 1);
                    addPlant(biomeIn, WNBlocks.VIOLET_PURPLE.getDefaultState(), 1);
                }else {
                    addPlant(biomeIn, WNBlocks.PASQUE_YELLOW.getDefaultState(), 2);
                    addPlant(biomeIn, WNBlocks.PASQUE_WHITE.getDefaultState(), 1);
                }


                addPlant(biomeIn,WNBlocks.ANEMONE.getDefaultState(),1);

                if(category== Biome.TempCategory.MEDIUM) {
                    addPlant(biomeIn, WNBlocks.PRIMROSE_PINK.getDefaultState(), 2);
                }

                addPlant(biomeIn,WNBlocks.FORGET_ME_NOT_PINK.getDefaultState(),1);

                addPlant(biomeIn,WNBlocks.GRASS_FERNSPROUT.getDefaultState(),3);

                if(biomeIn.getTempCategory()== Biome.TempCategory.COLD){
                    addPlant(biomeIn,WNBlocks.SNOWDROP.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.BLUEBELL.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATHER_PURPLE.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATHER_PINK.getDefaultState(),2);
                    addPlant(biomeIn,WNBlocks.HEATHER_WHITE.getDefaultState(),1);
                    addPlant(biomeIn,WNBlocks.HEATHER_YELLOW.getDefaultState(),1);
                    addPlant(biomeIn, WNBlocks.VIOLET_PURPLE.getDefaultState(), 1);
                }

                addPlant(biomeIn,WNBlocks.SHRUB.getDefaultState(),2);
                addPlant(biomeIn,WNBlocks.SHRUB_TALL.getDefaultState(),2);
            }

            addPlant(biomeIn,WNBlocks.WILD_ROSE.getDefaultState(),1);

        }
        if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.PLAINS)&& !BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.JUNGLE)){
            addPlant(biomeIn,WNBlocks.CHAMOMILE_WHITE.getDefaultState(),2);
            addPlant(biomeIn,WNBlocks.CHAMOMILE_DOUBLE_WHITE.getDefaultState(),1);
            addPlant(biomeIn,WNBlocks.GOLDENROD.getDefaultState(),3);
            addPlant(biomeIn,WNBlocks.TANSY.getDefaultState(),1);
            if(category== Biome.TempCategory.MEDIUM) {
                addPlant(biomeIn, WNBlocks.CATNIP.getDefaultState(), 2);
                addPlant(biomeIn, WNBlocks.BUTTERCUP_YELLOW.getDefaultState(), 1);
                addPlant(biomeIn, WNBlocks.FORGET_ME_NOT_WHITE.getDefaultState(), 1);
                addPlant(biomeIn, WNBlocks.GIANT_HOGWEED.getDefaultState(), 2);

            }

            if(category== Biome.TempCategory.COLD){
                addPlant(biomeIn, WNBlocks.VIOLET_PURPLE.getDefaultState(), 2);
            }

            addPlant(biomeIn, WNBlocks.BOXWOOD.getDefaultState(), 3);
            addPlant(biomeIn, WNBlocks.SHRUB.getDefaultState(), 1);


        }

        if(BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.PLAINS) && BiomeDictionary.getTypes(biomeIn).contains(BiomeDictionary.Type.WET)){
            addPlant(biomeIn, WNBlocks.MISCANTHUS_GRASS.getDefaultState(), 2);

        }
    }
}
