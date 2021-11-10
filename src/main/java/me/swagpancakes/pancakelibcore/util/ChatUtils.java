package me.swagpancakes.pancakelibcore.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * The type Chat utils.
 */
public class ChatUtils {

    /**
     * Format string.
     *
     * @param format the format
     *
     * @return the string
     */
    public static String format(String format) {
        return ChatColor.translateAlternateColorCodes('&', format);
    }

    /**
     * Send console message.
     *
     * @param message the message
     */
    public static void sendConsoleMessage(String message) {
        Bukkit.getConsoleSender().sendMessage(format(message));
    }
}