package me.lemonypancakes.bukkit.common;

import me.lemonypancakes.bukkit.common.util.ChatUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class LemonCommonLib extends JavaPlugin {

    private LemonCommonLib plugin;

    public LemonCommonLib getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        ChatUtils.sendConsoleMessage("&3[LemonLib] &4   _                       _    _ _    ");
        ChatUtils.sendConsoleMessage("&3[LemonLib] &c  | |   ___ _ __  ___ _ _ | |  (_) |__ ");
        ChatUtils.sendConsoleMessage("&3[LemonLib] &6  | |__/ -_) '  \\/ _ \\ ' \\| |__| | '_ \\");
        ChatUtils.sendConsoleMessage("&3[LemonLib] &e  |____\\___|_|_|_\\___/_||_|____|_|_.__/");
        ChatUtils.sendConsoleMessage("&3[LemonLib]");
        ChatUtils.sendConsoleMessage("&a[LemonLib] &bLibraries Loaded.");
    }

    @Override
    public void onDisable() {
        ChatUtils.sendConsoleMessage("&c[LemonLib] Libraries Unloaded.");
    }
}
