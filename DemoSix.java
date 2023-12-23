// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// class A implements Runnable {

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("hello");
//       try {
//         Thread.sleep(10);
//       } catch (Exception e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// class B implements Runnable {

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("hi");

//       try {
//         Thread.sleep(10);
//       } catch (Exception e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

class Counter {

  int count;

  public void increment() {
    count++
  }
}

public class Demo {

  public static void main(String[] args) {
    // Runnable obj1 = new A();
    // Runnable obj2 = new B();

    // Thread t1 = new Thread(obj1);
    // Thread t2 = new Thread(obj2);

    // t1.start();
    // t2.start();
    // obj2.setPriority(Thread.MAX_PRIORITY);

    // obj1.start();
    // // try {
    // //   Thread.sleep(5);
    // // } catch (Exception e) {
    // //   e.printStackTrace();
    // // }
    // obj2.start();
  }
  // public static void main(String[] args) throws IOException {
  // System.out.println("Enter a number");

  // InputStreamReader in = new InputStreamReader(System.in);
  // BufferedReader bf = new BufferedReader(in);
  // int num = Integer.parseInt(bf.readLine());

  // Scanner SC = new Scanner(System.in);
  // int num = SC.nextInt();

  // System.out.println(num);

  // bf.close();

  // int j = 0;
  // int i = 0;

  // BufferedReader br = null;

  // try {
  //   InputStreamReader in = new InputStreamReader(System.in);
  //   br = new BufferedReader(in);
  //   int num = Integer.parseInt(br.readLine());
  //   System.out.println(num);
  // } catch (Exception e) {
  //   // TODO: handle exception
  //   System.out.println("something went wrong");
  // } finally {
  //   System.out.println("bye");
  //   br.close();
  // }
  // }
}
