public class Demo {

  public static void main(String[] args) {
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
    int nums[][] = new int[3][];
    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[5];

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        nums[i][j] = (int) (Math.random() * 100);
      }
    }

    for (int n[] : nums) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}
