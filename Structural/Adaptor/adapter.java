package com.adapter;

public final class adapter
{
   public static void main(final String[] args)
   {
      var captain = new Captain(new FishingBoatAdapter());
      captain.row();
   }
}