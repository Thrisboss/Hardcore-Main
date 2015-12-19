package commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.thrisboss.HardcoreMain.Main;

public class Spawn implements CommandExecutor {
	
	ArrayList<String> cooldown = new ArrayList<String>();
	
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		final Player p = (Player) sender;
		Location Spawn = new Location(Bukkit.getWorld("world"), -475, 70, 120);

		 
		 
		// SPAWN COMMAND //
		if(cmd.getName().equalsIgnoreCase("spawn")){
           if(p.hasPermission("th.spawn") || p.isOp()){    
			
               
		 
		if(!cooldown.contains(p.getName())){ 
           	   p.teleport(Spawn);
               p.sendMessage(ChatColor.RED + "[RoyalCube] " + ChatColor.BLUE + "Vous avez été téléportez au spawn du serveur"); 
		cooldown.add(p.getName());
		 
		  Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, 
				  new Runnable() {

		 
		                @Override
		                public void run() {
		                cooldown.remove(p.getName());
		              }
		                }, (long) 20 * 10); 
		                // 10 = 10 secondes // 20 ticks = 1 secondes );                    
		}else{
		    p.sendMessage(ChatColor.RED + "Vous devez encore attendre!");
		}
		
		
		}
		
		
		}// FINISH SPAWN COMMAND //
		return false;
  } 
}