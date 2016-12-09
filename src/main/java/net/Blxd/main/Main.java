package net.Blxd.main;

import net.Blxd.main.utils.Utils;
import net.minecraft.server.v1_10_R1.EnumParticle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	Location loc = new Location(Bukkit.getWorld("world"), -573.5, 4, -595.5);
	Location loc1 = new Location(Bukkit.getWorld("world"), -573.5, 5, -595.5);
	Location loc2 = new Location(Bukkit.getWorld("world"), -573.5, 6, -595.5);
	Location loc3 = new Location(Bukkit.getWorld("world"), -573.5, 7, -595.5);
	Location loc4 = new Location(Bukkit.getWorld("world"), -573.5, 8, -595.5);
	
	ArmorStand npc = (ArmorStand) loc.getWorld().spawn(loc, ArmorStand.class);
	ArmorStand npc1 = (ArmorStand) loc1.getWorld().spawn(loc1, ArmorStand.class);
	ArmorStand npc2 = (ArmorStand) loc2.getWorld().spawn(loc2, ArmorStand.class);
	ArmorStand npc3 = (ArmorStand) loc3.getWorld().spawn(loc3, ArmorStand.class);
	ArmorStand npc4 = (ArmorStand) loc4.getWorld().spawn(loc4, ArmorStand.class);
	
	Pig pig = (Pig) loc.getWorld().spawn(loc, Pig.class);
	Pig pig1 = (Pig) loc1.getWorld().spawn(loc1, Pig.class);
	Pig pig2 = (Pig) loc2.getWorld().spawn(loc2, Pig.class);
	Pig pig3 = (Pig) loc3.getWorld().spawn(loc3, Pig.class);
	Pig pig4 = (Pig) loc4.getWorld().spawn(loc4, Pig.class);
	
	public void onEnable(){
		Listeners();
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage(Utils.color("&8[&eSID-AI&8] &aSID has been enabled!"));
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc1, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc2, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc3, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Utils.createParticleHelix(loc4, 1, 4, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		
		npc.setVisible(false);
		npc1.setVisible(false);
		npc2.setVisible(false);
		npc3.setVisible(false);
		npc4.setVisible(false);
		
		npc.setGravity(false);
		npc1.setGravity(false);
		npc2.setGravity(false);
		npc3.setGravity(false);
		npc4.setGravity(false);
		
		npc.setPassenger(pig);
		npc1.setPassenger(pig1);
		npc2.setPassenger(pig2);
		npc3.setPassenger(pig3);
		npc4.setPassenger(pig4);
		
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
		Utils.createEntityCircle(loc, 4, Utils.randomNum(1, 20), npc);
		Utils.createEntityCircle(loc1, 4, Utils.randomNum(1, 20), npc1);
		Utils.createEntityCircle(loc2, 4, Utils.randomNum(1, 20), npc2);
		Utils.createEntityCircle(loc3, 4, Utils.randomNum(1, 20), npc3);
		Utils.createEntityCircle(loc4, 4, Utils.randomNum(1, 20), npc4);
	}
	
	@EventHandler
	public void noDamage(EntityDamageEvent e){
		if(e.getCause() == DamageCause.FALL){
			e.setCancelled(true);
		}else{
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void join(PlayerJoinEvent e){
		Location locspawn = new Location(Bukkit.getWorld("world"), -573.5, 4, -607.5, 0, 0);
		e.getPlayer().teleport(locspawn);
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage(Utils.color("&8[&eSID-AI&8] &cSID has been disabled!"));
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Utils(this), this);
	}
	
}
