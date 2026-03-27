package me.wenwen.jmj;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("jmj 已成功加载！");
    }

    @Override
    public void onDisable() {
        getLogger().info("jmj 已卸载。");
    }
}
