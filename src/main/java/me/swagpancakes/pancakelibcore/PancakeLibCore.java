package me.swagpancakes.pancakelibcore;

import me.swagpancakes.pancakelibcore.util.ChatUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class PancakeLibCore extends JavaPlugin {

    private PancakeLibCore plugin;

    public PancakeLibCore getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        ChatUtils.sendConsoleMessage("&3[PancakeLibCore] &4   ____                       _        _     _ _      ____               ");
        ChatUtils.sendConsoleMessage("&3[PancakeLibCore] &c  |  _ \\ __ _ _ __   ___ __ _| | _____| |   (_) |__  / ___|___  _ __ ___ ");
        ChatUtils.sendConsoleMessage("&3[PancakeLibCore] &6  | |_) / _` | '_ \\ / __/ _` | |/ / _ \\ |   | | '_ \\| |   / _ \\| '__/ _ \\");
        ChatUtils.sendConsoleMessage("&3[PancakeLibCore] &e  |  __/ (_| | | | | (_| (_| |   <  __/ |___| | |_) | |__| (_) | | |  __/");
        ChatUtils.sendConsoleMessage("&3[PancakeLibCore] &a  |_|   \\__,_|_| |_|\\___\\__,_|_|\\_\\___|_____|_|_.__/ \\____\\___/|_|  \\___|");
        ChatUtils.sendConsoleMessage("&3[PancakeLibCore]                                                                         ");
        ChatUtils.sendConsoleMessage("&a[PancakeLibCore] &bLibraries Loaded.");
    }

    @Override
    public void onDisable() {
        ChatUtils.sendConsoleMessage("&c[PancakeLibCore] Libraries Unloaded.");
    }
}
