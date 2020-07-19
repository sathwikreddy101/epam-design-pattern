package com.singleton;

import org.Logger;
import org.LoggerFactory;
 
public class singleton
{

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
   public static void main(String[] args) 
   {
      var ivoryTower1 = IvoryTower.getInstance();
      var ivoryTower2 = IvoryTower.getInstance();
      LOGGER.info("ivoryTower1={}", ivoryTower1);
      LOGGER.info("ivoryTower2={}", ivoryTower2);
    }
}