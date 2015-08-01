package com.gmail.justbru00.epic.withdraw.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Chat {

	
	/** 
	 * @param uncoloredtext | Text to Color
	 * @return | Returns Text Colored
	 */
	public static String color(String uncoloredtext) {
		return ChatColor.translateAlternateColorCodes('&', uncoloredtext);
	}
	
	/**
	 * 
	 * @param p | Player to send the message to
	 * @param uncoloredmessage | Message to send
	 */
	public static void sendPlayerMessage(Player p, String uncoloredmessage) {
		p.sendMessage(color(uncoloredmessage));
	}
	
	/**
	 * 
	 * @param console | Console to send the message to
	 * @param uncoloredmessage | Message to send
	 */
	public static void sendConsoleMessage(ConsoleCommandSender console, String uncoloredmessage) {
		console.sendMessage(color(uncoloredmessage));
	}
}
