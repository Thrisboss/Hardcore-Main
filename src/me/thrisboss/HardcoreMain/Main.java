package me.thrisboss.HardcoreMain;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import commands.Gamemode0;
import commands.Gamemode1;
import commands.Spawn;
import listeners.OnJoin;


public class Main extends JavaPlugin implements Listener{

	
	// PLUGIN.YML à faire! 
	
	

    	
    
    public void onEnable() {
		registerEvents();
		registerCommands();
	    instance = this;
	}

	
	public void onDisable(){
		getLogger().info("Plugin Disabled");
	}
	public void registerEvents(){
    org.bukkit.plugin.PluginManager pm = Bukkit.getPluginManager();
	pm.registerEvents(new OnJoin(), this);

	
	
	}
	public void registerCommands(){
		getCommand("spawn").setExecutor(new Spawn());
		getCommand("gm1").setExecutor(new Gamemode1());
		getCommand("gm0").setExecutor(new Gamemode0());
		//getCommand("array").setExecutor(new array());
		//getCommand("menuadmin").setExecutor(new menuadmin());
		//getCommand("menu").setExecutor(new menu());
		
		
	}
	public static Main instance;
	

}
	