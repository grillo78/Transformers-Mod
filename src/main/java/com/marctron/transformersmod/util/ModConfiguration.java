package com.marctron.transformersmod.util;

import com.marctron.transformersmod.Main;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;


public class ModConfiguration {
    public static Configuration config;

    public static int ENTITY_VEHICON_ID = 201;
    public static int ENTITY_SWINDLE_ID = 202;


    public static int DIMENSION_CYBERTRON_ID = 2;
    //spawnable in overworld
    public static boolean spawnCustomBiomesInOverworld = true;

    public static void init(File file) {
        config = new Configuration(file);

        String category;


        category = "Biomes";
        config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
        spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
        Main.config.mkdirs();
        init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
    }
} 