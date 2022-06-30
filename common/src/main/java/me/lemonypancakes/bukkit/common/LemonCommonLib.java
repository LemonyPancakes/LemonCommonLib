/*
 * LemonCommonLib - A collection of libraries.
 * Copyright (C) 2022 LemonyPancakes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
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

        ChatUtils.sendConsoleMessage("&3[LemonCommonLib] &4  _                                ____                                      _     _ _     ");
        ChatUtils.sendConsoleMessage("&3[LemonCommonLib] &c | |    ___ _ __ ___   ___  _ __  / ___|___  _ __ ___  _ __ ___   ___  _ __ | |   (_) |__  ");
        ChatUtils.sendConsoleMessage("&3[LemonCommonLib] &6 | |   / _ \\ '_ ` _ \\ / _ \\| '_ \\| |   / _ \\| '_ ` _ \\| '_ ` _ \\ / _ \\| '_ \\| |   | | '_ \\ ");
        ChatUtils.sendConsoleMessage("&3[LemonCommonLib] &e | |__|  __/ | | | | | (_) | | | | |__| (_) | | | | | | | | | | | (_) | | | | |___| | |_) |");
        ChatUtils.sendConsoleMessage("&3[LemonCommonLib] &a |_____\\___|_| |_| |_|\\___/|_| |_|\\____\\___/|_| |_| |_|_| |_| |_|\\___/|_| |_|_____|_|_.__/ ");
        ChatUtils.sendConsoleMessage("&3[LemonCommonLib]");
        ChatUtils.sendConsoleMessage("&a[LemonCommonLib] &bLibraries Loaded.");
    }

    @Override
    public void onDisable() {
        ChatUtils.sendConsoleMessage("&c[LemonCommonLib] Libraries Unloaded.");
    }
}
