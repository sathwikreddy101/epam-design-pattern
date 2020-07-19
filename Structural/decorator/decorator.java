package com.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class decorator {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args)
 {

    LOGGER.info("A simple looking troll approaches.");
    var troll = new SimpleTroll();
    troll.attack();
    troll.fleeBattle();
    LOGGER.info("Simple troll power {}.\n", troll.getAttackPower());
  }
}