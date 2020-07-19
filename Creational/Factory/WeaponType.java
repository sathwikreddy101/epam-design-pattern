package com.factory.method;

public enum WeaponType
 {

  SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

  private String title;

  WeaponType(String title)
 {
    this.title = title;
  }

  public String toString()
 {
    return title;
  }
}