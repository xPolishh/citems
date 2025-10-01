package net.gitraft.xpolish;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;


public class commandCItem  implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players can use this command");
			return true;
		}
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("citem")) {
			if(args.length == 0 ) {
				sender.sendMessage(ChatColor.RED + "You need to enter item's ID");
			} else {
				if(args[0].contentEquals("HYPERION")) {
					player.getInventory().addItem(itemManager.HYPERION);
					player.sendMessage(ChatColor.GREEN + "Added HYPERION to your inventory!");
				} 
				
				
				
				if(args[0].contentEquals("WITHER_SWORD")) {
					player.getInventory().addItem(itemManager.WITHER_SWORD);
					player.sendMessage(ChatColor.GREEN + "Added WITHER_SWORD to your inventory!");
				}
				
				if(args[0].contentEquals("STRBUFFED_WITHER_SWORD")) {
					player.getInventory().addItem(itemManager.strbuff_WITHER_SWORD);
					player.sendMessage(ChatColor.GREEN + "Added WITHER_SWORD " + ChatColor.LIGHT_PURPLE + "Buffed " + ChatColor.GREEN + "to your inventory!");
				}
				
				if(args[0].contentEquals("REFINED_WITHER_SWORD")) {
					player.getInventory().addItem(itemManager.refined_WITHER_SWORD);
					player.sendMessage(ChatColor.GREEN + "Added REFINED_WITHER_SWORD to your inventory!");
				}
				
				if(args[0].contentEquals("MAX_WITHER_SWORD")) {
					player.getInventory().addItem(itemManager.MAX_WITHER_SWORD);
					player.sendMessage(ChatColor.GREEN + "Added " + ChatColor.RED + "WITHER_SWORD " + ChatColor.GREEN + "to your inventory!");
				}
				
				
				
				
				if(args[0].contentEquals("NETHERITE_CHEST")) {
					player.getInventory().addItem(itemManager.NETHERITE_CHEST);
					player.sendMessage(ChatColor.GREEN + "Added NETHERITE_CHEST to your inventory!");
				}
				
				if(args[0].contentEquals("NETHER_SWORD")) {
					player.getInventory().addItem(itemManager.NETHER_SWORD);
					player.sendMessage(ChatColor.GREEN + "Added NETHER_SWORD to your inventory!");
				}	
				if(args[0].contentEquals("MIDAS_CHEST")) {
					player.getInventory().addItem(itemManager.MIDAS_CHEST);
					player.sendMessage(ChatColor.GREEN + "Added MIDAS_CHEST to your inventory!");
				}
				
				if(args[0].contentEquals("CURRENCY_GEME")) {
					player.getInventory().addItem(itemManager.CURRENCY_GEME);
					player.sendMessage(ChatColor.GREEN + "Added CURRENCY_GEME to your inventory!");
				}
				
				if(args[0].contentEquals("WITHER_HELMET") ) {
					player.getInventory().addItem(itemManager.WITHER_HELMET);
					player.sendMessage(ChatColor.GREEN + "Added WITHER_HELMET to your inventory!");
				}
				
				if(args[0].contentEquals("ACHILLES") ) {
					player.getInventory().addItem(itemManager.ACHILLES);
					player.sendMessage(ChatColor.GREEN + "Added ACHILLES to your inventory!");
				}
				
				if(args[0].contentEquals("PARIS") ) {
					player.getInventory().addItem(itemManager.PARIS);
					player.sendMessage(ChatColor.GREEN + "Added PARIS to your inventory!");
				}
				
				if (args[0].contentEquals("ARONDITE") ) {
					player.getInventory().addItem(itemManager.ARONDITE);
					player.sendMessage(ChatColor.GREEN + "Added ARONDITE to your inventory!");
				}
				
				if (args[0].contentEquals("HBOOTS") ) {
					player.getInventory().addItem(itemManager.HBOOTS);
					player.sendMessage(ChatColor.GREEN + "Added HBOOTS to your inventory!");
				}
				
				if (args[0].contentEquals("AOTE") ) {
					player.getInventory().addItem(itemManager.AOTE);
					player.sendMessage(ChatColor.GREEN + "Added AOTE to your inventory!");
				}
			}
	}
		return true;
		
		}
	
}



