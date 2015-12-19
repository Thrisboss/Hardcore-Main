package listeners;



import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import com.connorlinfoot.titleapi.TitleAPI;

public class OnJoin implements Listener{

	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
	    Player pla = event.getPlayer();  		
	    	  String player = event.getPlayer().getDisplayName();
	          event.setJoinMessage(ChatColor.GREEN + "+ " + "Le joueur " + player + " " + "à rejoint la partie!");
	          TitleAPI.sendTitle(pla, 5, 10, 5, ChatColor.GOLD + "--- Salut! ---", " Sava?!");
	          pla.sendMessage(ChatColor.GOLD + "fait </");
	}
	    	
}


