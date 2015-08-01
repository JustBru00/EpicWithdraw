package com.gmail.justbru00.epic.withdraw;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.withdraw.command.executors.Withdraw;
import com.gmail.justbru00.epic.withdraw.utils.Chat;

public class Main extends JavaPlugin {
	
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	public static String Prefix = Chat.color("&8[&fEpic&bWithdraw&8] &f");		
	public FileConfiguration configfile = getConfig();

	@Override
	public void onDisable() {
		disablePlugin();
	}

	@Override
	public void onEnable() {
		enablePlugin();
	}

	/**
	 * 	Performs all enable operations
	 */
	public void enablePlugin() {
		this.saveDefaultConfig();
		if (configfile.getInt("config version") != 1) {
			console.sendMessage(Prefix + Chat.color("&4*-*-*-*-*-*-*WARNING*-*-*-*-*-*-*"));
			console.sendMessage(Prefix + Chat.color("&cConfig Verison is too old or too new for this version."));
			console.sendMessage(Prefix + Chat.color("&cPlease delete plugins/EpicWithdraw/config.yml then restart your server."));
			console.sendMessage(Prefix + Chat.color("&4*-*-*-*-*-*-*WARNING*-*-*-*-*-*-*"));
			Bukkit.getServer().getPluginManager().disablePlugin(this);
		}
		getCommand("withdraw").setExecutor(new Withdraw());		
		
		
		Prefix = getConfigString("basic config.message prefix");
		
		Chat.sendConsoleMessage(console, Prefix + "EpicWithdraw version" + getDescription().getVersion() + " has been enabled.");
	}
	
	/**
	 *  Performs all disable operations
	 */
	public void disablePlugin() {
		Chat.sendConsoleMessage(console, Prefix + "EpicWithdraw version" + getDescription().getVersion() + " has been disabled.");
	}
	
	public String getConfigString(String path) {
		return Chat.color(configfile.getString(path));
	}
}
