package com.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Method extends StealingMethod 
{

  private static final Logger LOGGER = LoggerFactory.getLogger(Method.class);

  
  protected String pickTarget() 
  {
    return "shop keeper";
  }


  protected void confuseTarget(String target) 
 {
    LOGGER.info("Approach the {} with tears running and hug him!", target);
  }

  protected void stealTheItem(String target) 
  {
    LOGGER.info("While in close contact grab the {}'s wallet.", target);
  }
}