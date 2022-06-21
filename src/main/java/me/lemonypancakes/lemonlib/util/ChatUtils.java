package me.lemonypancakes.lemonlib.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ChatUtils {

    public static String format(String format) {
        return ChatColor.translateAlternateColorCodes('&', format);
    }

    public static void sendConsoleMessage(String message) {
        Bukkit.getConsoleSender().sendMessage(format(message));
    }
}