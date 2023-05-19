package com.driver;

import java.util.*;
public class Main
{
public static void main(String args[])
{
RWOnly obj=new RWOnly();
//obj.name="Radhika";
//System.out.println(obj.name); this will give you error as we cannot access private members directly
obj.setName("Radhika Agrawal");
System.out.println(obj.getName());
}
}