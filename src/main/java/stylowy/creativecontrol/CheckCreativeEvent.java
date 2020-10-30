package stylowy.creativecontrol;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckCreativeEvent implements Listener {
    @EventHandler
    public void CheckEQ(InventoryCreativeEvent e){
        Material item = e.getCursor().getType();
        int ilosc = e.getCursor().getAmount();
        String itemname = item.toString();
        String name = e.getWhoClicked().getName();
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        if(item != Material.AIR) {
            LogToFile log = new LogToFile();
            LogToFile_Builders log_build = new LogToFile_Builders();
            Player p = (Player)e.getWhoClicked();
            if(p.getName().equals("puqqe") || p.getName().equals("Kmuhi") || p.getName().equals("bvdzik")){
                String sum =  "[" + format.format(now) + "]" + name + " took " + itemname + " x "+ilosc+" from CREATIVE mode";
                log_build.logToFile(sum);
            }
            else{
                String sum =  "[" + format.format(now) + "]" + name + " took " + itemname + " x "+ilosc+" from CREATIVE mode";
                log.logToFile(sum);
            }

        }
    }
}

