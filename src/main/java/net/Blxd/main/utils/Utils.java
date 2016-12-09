package net.Blxd.main.utils;

import java.util.Random;

import net.Blxd.main.Main;
import net.minecraft.server.v1_10_R1.EnumParticle;
import net.minecraft.server.v1_10_R1.PacketPlayOutWorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Utils implements Listener{
	
	private static Main plugin;

	public Utils(Main hub) {
		Utils.plugin = hub;
	}

	public static String color(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	public static int randomNum(int Low, int High){
		Random r = new Random();
		int R = r.nextInt(High-Low) + Low;
		return R;
	}
	
	public static void createParticleHelix(final Location loc, final Integer MaxHeight, final Integer radius, final Integer rotation, final EnumParticle particletype) {
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
			double y = 0;
			double rotSpeed;
    		public void run() {
		if(rotSpeed > 20){
			rotSpeed=0;
		}
			rotSpeed = rotSpeed + 0.07;
	        double x = radius * Math.cos(rotSpeed + rotation);
	        double z = radius * Math.sin(rotSpeed + rotation);
	        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(particletype, true, (float) (loc.getX() + x), (float) (loc.getY() + y), (float) (loc.getZ() + z), 0, 0, 0, 0, 1, null);
	        for(Player online : Bukkit.getOnlinePlayers()) {
	            ((CraftPlayer)online).getHandle().playerConnection.sendPacket(packet);
	        }
    		}
		}, 0, 1);
	}
	
	public static void createEntityCircle(final Location loc, final Integer radius, final Integer rotation, final Entity type) {
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
			double y = 0;
			double rotSpeed;
    		public void run() {
		if(rotSpeed > 20){
			rotSpeed=0;
		}
			rotSpeed = rotSpeed + 0.07;
	        double x = radius * Math.cos(rotSpeed + rotation);
	        double z = radius * Math.sin(rotSpeed + rotation);
	        /*PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(particletype, true, (float) (loc.getX() + x), (float) (loc.getY() + y), (float) (loc.getZ() + z), 0, 0, 0, 0, 1, null);
	        for(Player online : Bukkit.getOnlinePlayers()) {
	            ((CraftPlayer)online).getHandle().playerConnection.sendPacket(packet);
	        }*/
	        
	        type.teleport(new Location(Bukkit.getWorld("world"), loc.getX() + x, loc.getY() + y, loc.getZ() + z));
	        
    		}
		}, 0, 1);
	}
	
}
