// BASICS JAVA
// class Hello {

//   public static void main(String args[]) {
//     // int num1 = 3;
//     // int num2 = 5;
//     // int result = num1 + num2;

//     // byte num = 8;
//     // System.out.println(result);

//     // byte by = 127;
//     // short sh = 558;
//     // long l = 5854l;

//     // float f = 5.8f;
//     // char c = 'k';
//     // boolean b = true;

//     // literals
//     // char num1 = 'b';
//     // System.out.println(num1);

//     // type conversion

//     // byte b = 127;
//     // int a = b;

//     // int a =257;
//     // byte k = (byte) a;

//     // float f = 5.6f;

//     // int t = (int) f;

//     // type emorsion
//     // byte a = 10;
//     // byte b = 20;

//     // int result = a * b;

//     // int num = 5;

//     // int result = num++;

//     // OPERATORS
//     // System.out.println(num);
//     // System.out.println(result);

//     // int x = 6;
//     // int y = 7;
//     // int a = 5;
//     // int b = 9;
//     // boolean result = x > y && a < b;

//     // int x = 15;
//     // int y = 20;
//     // int z = 11;

//     // if (x > y) {
//     //   System.out.println(x);
//     // } else if (y > z) {
//     //   System.out.println(y);
//     // } else {
//     //   System.out.println(z);
//     // }

//     // int n = 4;
//     // int result = 0;

//     // result = n % 2 == 0 ? 1 : 0;
//     // System.out.println(result);

//     // int n = 3;

//     // switch (n) {
//     //   case 1:
//     //     System.out.println("Monday");
//     //     break;
//     //   case 2:
//     //     System.out.println("Tuesday");
//     //     break;
//     //   case 3:
//     //     System.out.println("Wednesday");
//     //     break;
//     //   case 4:
//     //     System.out.println("Thursday");
//     //     break;
//     //   case 5:
//     //     System.out.println("Friday");
//     //     break;
//     // }

//     // String day = "Sunday";
//     // String result = "";

//     // result =
//     //   switch (day) {
//     //     case "Saturday", "Sunday" -> "6am";
//     //     case "Monday" -> "8am";
//     //     default -> "7am";
//     //   };

//     // System.out.println(result);

//     // int i = 1;

//     // while (i <= 4) {
//     //   System.out.println("Hi " + i);
//     //   int j = 1;
//     //   while (j < 3) {
//     //     System.out.println("Hello" + j);
//     //     j++;
//     //   }
//     //   i++;
//     // }
//     // System.out.println("Bye " + i);

//     // do {
//     //   System.out.println("Executing");
//     // } while (i > 5);

//     // for (int i = 1; i <= 7; i++) {
//     //   System.out.println("DAY " + i);

//     //   for (int j = 1; j <= 7; j++) {
//     //     System.out.println(i + 5);
//     //   }
//     // }
//   }
// }

// INTERMEDIATE JAVA

// class Calculator {

//   int a;

//   public int add(int n1, int n2) {
//     int r = n1 + n2;
//     return r;
//   }
// }

// class Computer {

//   public void playMusic() {
//     System.out.println("music playing");
//   }

//   public String getMeAPen(int cost) {
//     if (cost >= 10) return "pen"; else return "no enough money to buy";
//   }
// }

class Calculator {

  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public double add(double n1, int n2) {
    return n1 + n2;
  }
}

public class Hello {

  // public static void main(String a[]) {
  //   int num1 = 4;
  //   int num2 = 5;

  //   Calculator calc = new Calculator();
  //   int result = calc.add(num1, num2);
  //   // int result = num1 + num2;

  //   System.out.println(result);
  // }

  public static void main(String a[]) {
    // Computer obj = new Computer();
    // obj.playMusic();
    // String str = obj.getMeAPen(8);
    // System.out.println(str);

    Calculator obj = new Calculator();
    int r1 = obj.add(5, 30);
    System.out.println(r1);
  }
}
