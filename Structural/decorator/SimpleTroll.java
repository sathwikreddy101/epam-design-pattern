package com.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleTroll implements Troll
{

  private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTroll.class);

  
  public void attack()
 {
    LOGGER.info("The troll tries to grab you!");
  }

  public int getAttackPower()
 {
    return 10;
  }

  public void fleeBattle()
 {
    LOGGER.info("The troll shrieks in horror and runs away!");
  }
}