package net.gitraft.xpolish;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class commandCitemlist implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players can use this command");
			return true;
		}
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("citemlist")) {
			player.sendMessage(ChatColor.GRAY + "o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
			player.sendMessage(ChatColor.GREEN + "Currently available CustomItems are:");
			player.sendMessage("HYPERION, WITHER_SWORD, NETHERITE_CHEST");
			player.sendMessage("NETHER_SWORD, MIDAS_CHEST, DRAGON_WING");
			player.sendMessage("GHAST_DAGGER");
			player.sendMessage("CURRENCY_GEME");
			player.sendMessage("");
			player.sendMessage(ChatColor.ITALIC + "List is manually filled");
			player.sendMessage("");
			player.sendMessage(ChatColor.GRAY + "o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		}
		return true;
		
	}
}
