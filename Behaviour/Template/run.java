package com.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Run extends StealingMethod {

  private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

  protected String pickTarget()
 {
    return "old goblin woman";
  }

  protected void confuseTarget(String target)
 {
    LOGGER.info("Approach the {} from behind.", target);
  }

  protected void stealTheItem(String target) 
{
    LOGGER.info("Grab the handbag and run away fast!");
  }
}