package com.templatemethod;

public class App 
{

  public static void main(String[] args) 
  {
    var thief = new Thief(new Run());
    thief.steal();
    thief.changeMethod(new Method());
    thief.steal();
  }
}