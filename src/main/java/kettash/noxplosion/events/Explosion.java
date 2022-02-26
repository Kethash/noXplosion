package kettash.noxplosion.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class Explosion implements Listener {

    // Preventing creeper's explosion damaging blocks
    @EventHandler
    public boolean mobexplodes(EntityExplodeEvent e){

        EntityType entity = e.getEntity().getType();
/*        if (entity.equals(EntityType.CREEPER) || entity.equals(EntityType.WITHER) || entity.equals(EntityType.WITHER_SKULL)) {
            // clear the targeted blocks list
            e.blockList().clear();
        }*/

        if (entity.equals(EntityType.CREEPER)) {
            // clear the targeted blocks list
            e.blockList().clear();
        }

        return true;
    }

    // Preventing endermen to move blocks
    @EventHandler
    public boolean endermanChangeBlock(EntityChangeBlockEvent e) {
        if(e.getEntityType().equals(EntityType.ENDERMAN)) {
            e.setCancelled(true);
        }

        return true;
    }
}
