package net.gitraft.xpolish;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		itemManager.init();
		getServer().getPluginManager().registerEvents(new Events(), this);
		
		getCommand("citem").setExecutor(new commandCItem());
		
		getCommand("citemlist").setExecutor(new commandCitemlist());
		
		getCommand("mylocation").setExecutor(new commandMylocation());
		
		getCommand("limbo").setExecutor(new commandLimbo());
		
	}

}
