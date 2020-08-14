package stylowy.creativecontrol;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CreativeControl extends JavaPlugin {

    private static CreativeControl plugin;
    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new CheckCreativeEvent(),this);
    }

    @Override
    public void onDisable() {
    }

    public static CreativeControl GetInstance(){return plugin;}
}
