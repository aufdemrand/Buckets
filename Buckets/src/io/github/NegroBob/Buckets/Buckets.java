package io.github.NegroBob.Buckets;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;


public class Buckets extends JavaPlugin {
	
	
	@Override
	public void onEnable(){
		
		
	}
	
	@Override
	public void onDisable(){
		
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("Buckets")) {
			
			if(!(sender instanceof Player)) {
				sender.sendMessage("This command cnannot be run from the console");
				
			} else {
				Player player = (Player) sender;
				
				sender.sendMessage("This is Helpful to you");
				
			}
			return true;
			
		}
			return false;
			
	}
	
	public class Buckets implements Listener {

		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent evt) {
			Player player = evt.getPlayer();
			PlayerInventory inventory = player.getInventory();
			ItemStack emptybuckets = new ItemStack(Material.BUCKET, 16);
			ItemStack fullbuckets = new ItemStack(Material.WATER_BUCKET, 16);
			
			if (inventory.contains(emptybuckets)) {
				inventory.removeItem(emptybuckets);
				inventory.addItem(fullbuckets);
				player.sendMessage("I have filled your buckets with water!");
				
			}else{
				
			player.sendMessage("You have no buckets to fill!");
			
				}
			
			}
		}
	
}
