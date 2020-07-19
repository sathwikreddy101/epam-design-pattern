package com.factory.method;

public class OrcWeapon implements Weapon
{

   private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) 
   {
      this.weaponType = weaponType;
   }

   public String toString() 
  {
      return "Orcish " + weaponType;
   }

    public WeaponType getWeaponType()
   {
      return weaponType;
   }
}