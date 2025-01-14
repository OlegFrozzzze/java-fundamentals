package com.epam.courses.java.fundamentals.oop.practice.task5;


import com.epam.courses.java.fundamentals.oop.practice.task6.NuclearBoatAnnotation;

@NuclearBoatAnnotation(material = "iron")
public class NuclearBoat {
  public class EngineNuclearBoat  {
    public void start() {
      System.out.println("start");
    }

    public void stop() {
      System.out.println("stop");
    }
  }

  public static void main(String[] args) {
    NuclearBoat nuclearBoat = new NuclearBoat();
    EngineNuclearBoat e = nuclearBoat.new EngineNuclearBoat();
    e.start();
  }
}
