package com.code;

public class Employee {
   int id;
   String name;
   float salary;
   Employee(){
	   System.out.println("user defined n0-argument" + "constructor executed");
	   }
   void display() {
	   System.out.println(id + " " + name + " " + salary);
   }
}
