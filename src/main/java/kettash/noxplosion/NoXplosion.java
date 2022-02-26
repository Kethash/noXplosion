package kettash.noxplosion;

import kettash.noxplosion.events.Explosion;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoXplosion extends JavaPlugin {

    Server server = this.getServer();

    @Override
    public void onEnable() {
        // Plugin startup logic
        server.getPluginManager().registerEvents(new Explosion(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
