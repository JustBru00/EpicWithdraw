/**
 *     EpicWithdraw, a spigot plugin.
    Copyright (C) 2015  Justin A. Brubaker

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

		Contact me at justbru00@gmail.com
 */
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
