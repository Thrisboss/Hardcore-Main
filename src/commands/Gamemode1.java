package commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode1 implements CommandExecutor {
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("gm1")){
            if(p.hasPermission("th.gm") || p.isOp()){    
            	p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(ChatColor.RED + "[RoyalCube] " + ChatColor.BLUE + "Votre gamemode à été mise à jour!"); 
            }                
            
		}
		return false;
	
  } 
}
