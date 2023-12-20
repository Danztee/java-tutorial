// abstract class Car {

//   public abstract void drive();

//   public abstract void fly();

//   public void playMusic() {
//     System.out.println("play music");
//   }
// }

// class WagonR extends Car {

//   public void fly() {
//     System.out.println("flying...");
//   }

//   public void drive() {
//     System.out.println("driving...");
//   }
// }

// class A {

//   int age = 5;

//   public void show() {
//     System.err.println("in show");
//   }

//   class B {

//     public void config() {
//       System.err.println("in config");
//     }
//   }
// }

// interface class A {

// void show() {};

// void config() {};
// }

// class B implements A {
//   public void show() {
//     System.err.println("show");
//   };
//    public void run() {
//     System.err.println("run...");
//   };

//    public void config() {
//     System.err.println("config");
//   };
// }

// interface X {}

// interface Y {}

// enum Status {
//   Running,
//   Failed,
//   Pending,
//   Success,
// }

// class A {

//   public void showTheDataWhichBelongsToThisClass() {
//     System.err.println("showing from A.....");
//   }
// }

// class B extends A {

//   @Override
//   public void showTheDataWhichBelongsToThisClass() {
//     System.err.println("showing from B.....");
//   }
// }

@FunctionalInterface
interface A {
  int add(int i, int j);
  // void run();
}

public class DemoTwo {

  public static void main(String[] args) {
    A obj = (int i, int j) -> i + j;

    int result = obj.add(1, 2);
    System.err.println(result);
    // A obj = i -> {
    //   System.out.println("in show" + " " + i);
    // };
    // obj.show(4);
    // A obj = new A() {
    //   public void show() {
    //     System.out.println("in show");
    //   }
    // };

    // B obj = new B();
    // obj.showTheDataWhichBelongsToThisClass();
    // Status s = Status.Pending;
    // if (s == Status.Running) {
    //   System.out.println("All Good");
    // } else if (s == Status.Pending) {
    //   System.out.println("Please Wait");
    // }

    // switch (s) {
    //   case Running:
    //     System.out.println("All Good");
    //     break;
    //   case Pending:
    //     System.out.println("Loading");
    //     break;
    //   default:
    //     break;
    // }
    // int a = 3;
    // Status[] ss = Status.values();

    // for (Status s : ss) {
    //   System.err.println(s + " : " + s.ordinal());
    // }
    // Car obj = new WagonR();
    // obj.drive();
    // obj.playMusic();
    // obj.fly();

    // A obj = new A();
    // A.B obj1 = obj.new B();
    // obj1.config();
  }
}
