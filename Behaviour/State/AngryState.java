package com.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AngryState implements State
{

  private static final Logger LOGGER = LoggerFactory.getLogger(AngryState.class);

  private Mammoth mammoth;

  public AngryState(Mammoth mammoth)
 {
    this.mammoth = mammoth;
  }

  public void observe()
  {
    LOGGER.info("{} is furious!", mammoth);
  }

  public void onEnterState() 
  {
    LOGGER.info("{} gets angry!", mammoth);
  }

}
