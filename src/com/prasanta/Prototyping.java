package com.prasanta;

import java.util.ArrayList;

public class Prototyping {
   public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<>();
      cars.add("BMW");
      cars.add("Volkswagen");
      cars.add("Mercedes-Benz");

      System.out.println("cars size before calling the method: "+cars.size());
      replaceWithEmptyList(cars);
      System.out.println("cars size after calling the method: "+cars.size());

   }

   public static void replaceWithEmptyList(ArrayList<String> list) {
      list = new ArrayList<String>();
   }
}