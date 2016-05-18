package com.feed_the_beast.ftbu.config;

import com.feed_the_beast.ftbl.api.config.ConfigFile;
import com.feed_the_beast.ftbl.api.config.ConfigRegistry;
import com.feed_the_beast.ftbl.util.FTBLib;

import java.io.File;

public class FTBUConfig // FTBU
{
    public static final ConfigFile configFile = new ConfigFile("ftbu");
    
    public static void load()
    {
        configFile.setFile(new File(FTBLib.folderLocal, "ftbu/config.json"));
        configFile.setDisplayName("FTBUtilities");
        configFile.addGroup("backups", FTBUConfigBackups.class);
        configFile.addGroup("commands", FTBUConfigCmd.class);
        configFile.addGroup("general", FTBUConfigGeneral.class);
        configFile.addGroup("login", FTBUConfigLogin.class);
        configFile.addGroup("modules", FTBUConfigModules.class);
        //Ranks.instance().reload();
        
        ConfigRegistry.add(configFile);
        configFile.load();
    }
}