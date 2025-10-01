package net.gitraft.xpolish;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class commandMylocation implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("CONSOLE doesn't have a location!");
			return true;
		}
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("mylocation")) {
				player.sendMessage(ChatColor.GOLD + "Your current location is server " + ChatColor.AQUA + player.getWorld().getName() + ChatColor.GOLD + " at block: " + ChatColor.RED + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " + player.getLocation().getBlockZ()); 
			}
			
		return true;
		
	}
}


