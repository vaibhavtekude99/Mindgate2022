package com.mindgate.pojo;

public class B extends A
{
  public B() {
      System.out.println("HELLO");
  }
  public B(int x)
  {
	  super(x);
	  System.out.println("hello" +x);
  }
  
}
