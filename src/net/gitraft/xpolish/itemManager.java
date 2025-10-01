package net.gitraft.xpolish;


import java.util.ArrayList;
import java.util.List;


import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;



public class itemManager {
	
	public static ItemStack AOTE;
	
	public static ItemStack HYPERION;
	
	public static ItemStack WITHER_SWORD;
	public static ItemStack strbuff_WITHER_SWORD;
	public static ItemStack refined_WITHER_SWORD;
	public static ItemStack MAX_WITHER_SWORD;
	
	public static ItemStack NETHERITE_CHEST;
	public static ItemStack NETHER_SWORD;
	public static ItemStack MIDAS_CHEST;
	public static ItemStack GHAST_DAGGER;
	public static ItemStack CURRENCY_GEME;
	public static ItemStack WITHER_HELMET;
	public static ItemStack ACHILLES;
	
	public static ItemStack PARIS;
	
	public static ItemStack ARONDITE;
	public static ItemStack HBOOTS;
	


	
	public static void init() {
		createAOTE();
		
		createHyperion();
		
		createWitherSword();
		createSTRBUFFEDwitherSword();
		createRefinedWitherSword();
		createMaxedWitherSword();
		
		createNetheriteChestplate();
		createNethersBlade();
		createMidasChestplate();
		createGhastDagger();
		createGoldenEmerald();
		createWitherHelmet();
		
		createAchilles();
		createParis();
		createArondite();
		createHealthBoots();
		
	}
	
	//SWORDS <
	
	private static void createAOTE() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§dAspect of the End");
		item.setItemMeta(meta);
		AOTE = item;
	}
	
	private static void createHyperion() {
		ItemStack item = new ItemStack(Material.IRON_SWORD, 1); 
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Withered Hyperion ");
		List<String> lore = new ArrayList<>();
		lore.add("§7Gear score: §d1098 §7(3790)");
		lore.add("§7Damage: §c+368 §e(30");
		lore.add("");
		lore.add("§c YOOOOOOO");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
		item.setItemMeta(meta);
		HYPERION = item;
	}
	
	//                                                    WITHER SWORD STUFF
	private static void createWitherSword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1); 
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§dWither Sword");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("§0.");
		lore.add("§6Deals §c5♥ §6and applies §8Wither §6effect");
		lore.add("§6on your enemy");
		lore.add("§0.");
		lore.add("§7Weapon unrefined");
		lore.add("§7Sword not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		item.setItemMeta(meta);
		WITHER_SWORD = item;
	}
	
	private static void createSTRBUFFEDwitherSword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1); 
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§dWither Sword");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("§0.");
		lore.add("§6Deals §c17.5♥ §6and applies §8Wither §6effect");
		lore.add("§6on your enemy");
		lore.add("§0.");
		lore.add("§d§lBuff:");
		lore.add("§cStrength Buff");
		lore.add("§9+250% damage");
		lore.add("");
		lore.add("§7Weapon unrefined");
		lore.add("§7Sword not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 24, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		strbuff_WITHER_SWORD = item;
	}
	
	private static void createRefinedWitherSword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1); 
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Refined §dWither Sword");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("§0.");
		lore.add("§6Deals §c7.5♥ §6and applies §8Wither §6effect");
		lore.add("§6on your enemy");
		lore.add("§0.");
		lore.add("§2§lRefined:");
		lore.add("§9+50% on all stats:");
		lore.add("§c+50% damage");
		lore.add("");
		lore.add("§7Sword not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		item.setItemMeta(meta);
		refined_WITHER_SWORD = item;
	}
	
	private static void createMaxedWitherSword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1); 
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Refined §dWither Sword");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("§0.");
		lore.add("§6Deals §c20♥ §6and applies §8Wither §6effect");
		lore.add("§6on your enemy");
		lore.add("§0.");
		lore.add("§8+300% damage");
		lore.add("§d§lBuff:");
		lore.add("§cStrength Buff");
		lore.add("§9+250% damage");
		lore.add("");
		lore.add("§2§lRefined:");
		lore.add("§9+50% on all stats:");
		lore.add("§c+50% damage");
		lore.add("");
		lore.add("§7Sword not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 28, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		item.setItemMeta(meta);
		MAX_WITHER_SWORD = item;
	}
	
	
	//                                                    NETHERS BLADE STUFF
	
	private static void createNethersBlade() {
		ItemStack item = new ItemStack(Material.GOLD_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§cNether's Blade");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior§6§l/§3§lMage §a§lWeapon");
		lore.add("§dRarity: §6Legendary");
		lore.add("§0.");
		lore.add("§6Deals §c15♥, §6sets your enemy on fire");
		lore.add("§6creates flame wave that deals");
		lore.add("§c7♥ §6to everything in range of 5 blocks");
		lore.add("§0.");
		lore.add("§d§lSpecial Abilities:");
		lore.add("");
		lore.add("§cNether's Heart");
		lore.add("§bExplodes when you §dright click");
		lore.add("§bdealing up to §c40♥ §bto nerby entities");
		lore.add("");
		lore.add("§2§lCost:");
		lore.add("§e500xp §d for §4§lWarriors");
		lore.add("§e100xp §d for §3§lMages");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		NETHER_SWORD = item;
		
	}
	
	private static void createGhastDagger() {
		ItemStack item = new ItemStack(Material.GHAST_TEAR, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§bGhast Dagger");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("");
		lore.add("");
		
		meta.setLore(lore);
		item.setItemMeta(meta);
		GHAST_DAGGER = item;
	}
	
	private static void createAchilles() {
		ItemStack item = new ItemStack(Material.BOW, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Achilles");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §cSupergendary");
		lore.add("");
		lore.add("§6Deals §c50❤ §6set your enemy on");
		lore.add("§cfire §6and explodes on every hit");
		lore.add("§6Provides you with infinite arrows,");
		lore.add("§6as long as you have at least 1");
		lore.add("");
		lore.add("§d§lSpecial Abilities:");
		lore.add("");
		lore.add("§cAchilles");
		lore.add("§bGives you §c+10❤ §b but removes");
		lore.add("§c10❤ §b if attacked from the back");
		lore.add("");
		lore.add("§7Armor unrefined");
		lore.add("§7Armor not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 78, true);
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 50, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addEnchant(Enchantment.ARROW_FIRE, 2, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		ACHILLES = item;
	}
	
	private static void createParis() {
		ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§cParis");
		List<String> lore = new ArrayList<>();
		lore.add("§8Trojan prince Paris");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior§6§l/§5§lArcher §a§lWeapon");
		lore.add("§dRarity: §3Mythic");
		lore.add("");
		lore.add("§6Deals §c250❤ §6melee, throws a strong");
		lore.add("§6fire aspect when attacking the enemy");
		lore.add("§6Summons §eTNT §6on left click");
		lore.add("");
		lore.add("§7Weapon unrefined");
		lore.add("§7Weapon not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 77, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		PARIS = item;
		
	}
	
	private static void createArondite() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§bArondite");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§fNeutral Weapon");
		lore.add("§dRarity: §1Epic");
		lore.add("");
		lore.add("§eHeals §6your entire health, and");
		lore.add("§dlaunches §6you §c10 §6blocks up");
		lore.add("§cRecommended with feather falling boots!");
		lore.add("");
		lore.add("§7Weapon unrefined");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 30000, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		ARONDITE = item;
		
	}
	//>>>>>> ARMORS <<<<<<<<<<
	
	private static void createWitherHelmet() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§dWither Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add("§cOops! It seems that this feature is been worked on!");
		meta.setLore(lore);
		SkullMeta  meta1 = (SkullMeta) Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
		meta1.setOwner("Username");
		item.setItemMeta(meta);
		WITHER_HELMET = item;
	}
	
	private static void createNetheriteChestplate() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§4Netherite Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Weapon");
		lore.add("§dRarity: §aBasic");
		lore.add("§0.");
		lore.add("§7Armor unrefined");
		lore.add("§7Armor not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		((LeatherArmorMeta) meta).setColor(Color.GRAY);
		item.setItemMeta(meta);
		NETHERITE_CHEST = item;
	}
	
	private static void createMidasChestplate() {
		ItemStack item = new ItemStack(Material.GOLD_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Midas' Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§4§lWarrior Armor");
		lore.add("§dRarity: §6Legendary");
		lore.add("");
		lore.add("§6You grant §a+5 defense §6for every");
		lore.add("§6Midas' Soldier you kill");
		lore.add("§7(Default: 50, max 200)");
		lore.add("§cYou need to wear the full set");
		lore.add("");
		lore.add("§7Weapon unrefined");
		lore.add("§7Armor not upgraded");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		item.setItemMeta(meta);
		MIDAS_CHEST = item;
	}
	
	private static void createHealthBoots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§cHealth Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("");
		lore.add("§6Its just a health test!");
		lore.add("");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		((LeatherArmorMeta) meta).setColor(Color.RED);
		meta.setLore(lore);
		item.setItemMeta(meta);
		HBOOTS = item;
		
		
	}

	//JUST ITEMS NON WEAPONRY/GEAR
	
	private static void createGoldenEmerald() {
		ItemStack item = new ItemStack(Material.EMERALD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Golden §aEmerald");
		List<String> lore = new ArrayList<>();
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		lore.add("§6This item is standard currency in");
		lore.add("§6in the lands of §2Gitr");
		lore.add("");
		lore.add("§dThis currency is worth §61 Standard Coin");
		lore.add("§dor §a2048 Emeralds");
		lore.add("");
		lore.add("§7This item is unupgradable in any way!");
		lore.add("§8o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
		meta.setLore(lore);
		item.setItemMeta(meta);
		CURRENCY_GEME = item;
		
	}
	
	
}
