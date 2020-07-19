package com.factory.method;

import org.Logger;
import org.LoggerFactory;

public class factory {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  private final Blacksmith blacksmith;

 public App(Blacksmith blacksmith)
 {
    this.blacksmith = blacksmith;
  }

public static void main(String[] args)
 {

var app = new App(new OrcBlacksmith());
    app.manufactureWeapons();
}

private void manufactureWeapons()
 {
    var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
    LOGGER.info(weapon.toString());
    weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
    LOGGER.info(weapon.toString());
  }
}