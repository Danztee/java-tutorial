// class Human {

//   public Human() {
//     System.err.println("in constructor");
//   }

//   private String name = "Daniel";
//   private int age = 20;

//   public int getAge() {
//     return age;
//   }

//   public String getName() {
//     return name;
//   }

//   public void setAge(int age) {
//     this.age = age;
//   }

//   public void setName(String name) {
//     this.name = name;
//   }
// }

class Calc {

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return n1 - n2;
  }
}

public class Demo {

  public static void main(String[] args) {
    // Human obj = new Human();
    // obj.name = "Daniel";
    // obj.age = 22;
    // System.out.println(obj.getName());
    // int nums[] = { 3, 7, 2, 4 };

    // int nums[] = new int[4];

    // nums[0] = 3;
    // nums[1] = 5;
    // nums[2] = 6;
    // nums[3] = 7;

    // for (int i = 0; i < 4; i++) {
    //   System.out.println(nums[i]);
    // }

    // int nums[][] = new int[3][4];

    // Math.random();
    // int random = 0;
    // (int) (Math.random() * 100);

    // for (int i = 0; i < 3; i++) {
    //   for (int j = 0; j < 4; j++) {
    //     nums[i][j] = (int) (Math.random() * 100);
    //   }
    // }

    // for (int i = 0; i < 3; i++) {
    //   for (int j = 0; j < 4; j++) {
    //     System.out.print(nums[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // for (int n[] : nums) {
    //   for (int m : n) {
    //     System.out.print(m + " ");
    //   }
    //   System.out.println();
    // }

    // JAGGED ARRAYS
    // int nums[][] = new int[3][];
    // nums[0] = new int[3];
    // nums[1] = new int[4];
    // nums[2] = new int[5];

    // for (int i = 0; i < nums.length; i++) {
    //   for (int j = 0; j < nums.length; j++) {
    //     nums[i][j] = (int) (Math.random() * 100);
    //   }
    // }

    // for (int n[] : nums) {
    //   for (int m : n) {
    //     System.out.print(m + " ");
    //   }
    //   System.out.println();
    // }

    // int nums[] = new int[6];
    // nums[0] = 1;
    // nums[1] = 4;
    // nums[2] = 7;
    // nums[3] = 12;

    // // for (int n : nums) {
    // //   System.out.println(n);
    // // }
    // Student s1 = new Student();
    // s1.rollNo = 1;
    // s1.name = "Daniel";
    // s1.marks = 88;

    // Student s2 = new Student();
    // s2.rollNo = 2;
    // s2.name = "Bolu";
    // s2.marks = 93;

    // Student s3 = new Student();
    // s3.rollNo = 3;
    // s3.name = "Kehinde";
    // s3.marks = 68;

    // // System.err.println(s1.name);

    // Student students[] = new Student[3];

    // students[0] = s1;
    // students[1] = s2;
    // students[2] = s3;

    // for (Student stu : students) {
    //   System.out.println(stu.name + " " + stu.marks);
    // }
    // for (int i = 0; i < students.length; i++) {
    //   System.err.println(students[i].name + " " + students[i].marks);
    // }

    // String name = "Daniel";
    // name = "Olowoniyi";

    // String name = new String("Daniel");
    // System.err.println("hello " + name);

    // StringBuffer sb = new StringBuffer("Daniel");
    // sb.append(" Olowoniyi");

    // sb.insert(7, "Segun ");

    // sb.deleteCharAt(3);

    // String s = sb.toString();

    // System.out.println(sb);

    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price = 1500;
    // Mobile.name = "Smartphone";

    // Mobile obj2 = new Mobile();
    // obj2.brand = "Samsung";
    // obj2.price = 500;
    // Mobile.name = "Smartphone";

    // Mobile.name = "phone";

    // obj1.show();
    // obj2.show();
  }
}
// class Mobile {
//   String brand;
//   int price;
//   String network;
//   static String name;
//   public void show() {
//     System.out.println(brand + " " + price + " " + name);
//   }
//   public static void show1() {
//     System.out.println("in static method");
//   }
// }
// class Student {
//   int rollNo;
//   String name;
//   int marks;
// }
