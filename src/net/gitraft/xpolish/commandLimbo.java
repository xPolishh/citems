package net.gitraft.xpolish;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class commandLimbo implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("CONSOLE doesn't have a location!");
			return true;
		}
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("limbo")) {
		if (args.length == 0) {
		player.sendMessage("You've been teleported to limbo!");
		player.sendMessage(ChatColor.RED + "Reason:" + ChatColor.WHITE + " notgiven.disconnected");
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		String command1 = "warp limbo " + sender.getName();
		return Bukkit.dispatchCommand(console, command1);
		
		} else {
		//Player typed something more
		Player target = Bukkit.getPlayerExact(args[0]);
		if (target == null) {
		//Target is not online
		player.sendMessage(ChatColor.RED + "Player " + args[0] + " is not online!");
		} else {
		//Targets online
		player.sendMessage(ChatColor.GOLD + "You've send " + args[0] + "to limbo!");
		player.sendMessage(ChatColor.RED + "Reason: " + args[1]);
		target.sendMessage(sender.getName() + ChatColor.RED + " Has sent you to the limbo!");
		target.sendMessage("You've been teleported to limbo!");
		target.sendMessage(ChatColor.RED + "Reason: " + ChatColor.WHITE + args[1]);
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		String command1 = "warp limbo " + args[0];
		return Bukkit.dispatchCommand(console, command1);
		
		}
		}
		}
		return true;
		}

}
