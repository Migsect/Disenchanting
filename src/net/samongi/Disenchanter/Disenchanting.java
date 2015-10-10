package net.samongi.Disenchanter;

import org.bukkit.plugin.java.JavaPlugin;

public class Disenchanting extends JavaPlugin
{
  static private Disenchanting manager;
  public static Disenchanting getManager(){return Disenchanting.manager;}
  
  static public void log(String message){Disenchanting.log("[RecipeManager] " + message);}
  static public void debugLog(String message){Disenchanting.debugLog("[RecipeManager] " + message);} 
  
  @Override
  public void onEnable()
  {
    
  }
  
  @Override
  public void onDisable()
  {
    
  }
}
