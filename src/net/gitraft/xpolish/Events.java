package net.gitraft.xpolish;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;




public class Events implements Listener {
	
	
	
	@EventHandler
	public static void onRC(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_AIR) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(itemManager.PARIS.getItemMeta())) {
					Player p = event.getPlayer();
					p.getWorld().createExplosion(p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), 2.0f, true, false);
				}
			} 
		}
		
		
	
		if (event.getAction() == Action.RIGHT_CLICK_AIR) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(itemManager.ARONDITE.getItemMeta())) {
					Player player = event.getPlayer();
					player.setVelocity(player.getLocation().getDirection().multiply(2).setY(1.6));
					player.setHealth(player.getMaxHealth());
					
				}
			}
			
		}
		
		if (event.getAction() == Action.RIGHT_CLICK_AIR) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(itemManager.AOTE.getItemMeta())) {
					Player player = event.getPlayer();
					player.setVelocity(player.getLocation().getDirection().multiply(20));
				
					
				} 
			}
			
		}
		
		
		
	
	
	}
}
	
//	public void onHold(ArmorEquipEvent e)) {  
//		Player player = e.getPlayer();
//		if (e.getPlayer().getInventory().getBoots().equals(itemManager.HBOOTS)) {
//			player.setMaxHealth(100);
//		} else {
//			player.setMaxHealth(20);
//		}
//	}

