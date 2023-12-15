abstract class Car {

  public abstract void drive();

  public abstract void fly();

  public void playMusic() {
    System.out.println("play music");
  }
}

class WagonR extends Car {

  public void fly() {
    System.out.println("flying...");
  }

  public void drive() {
    System.out.println("driving...");
  }
}

class A {

  int age = 5;

  public void show() {
    System.err.println("in show");
  }

  class B {

    public void config() {
      System.err.println("in config");
    }
  }
}

public class Demo {

  public static void main(String[] args) {
    // Car obj = new WagonR();
    // obj.drive();
    // obj.playMusic();
    // obj.fly();

    A obj = new A();
    A.B obj1 = obj.new B();
    obj1.config();
  }
}
