class DanielException extends Exception {

  public DanielException(String string) {
    super(string);
  }
}

public class DemoFive {

  public static void main(String[] args) {
    int i = 20;
    int j = 0;

    // int nums = new int[5];

    try {
      j = 18 / i;
      // System.out.println(nums[1]);
      // System.out.println(nums[5]);

      if (j == 0) throw new DanielException("HEy from daniel exception");
    } catch (DanielException e) {
      // TODO: handle exception
      System.out.println("something went wrong" + e);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("something went wrong");
    }

    System.out.println(j);
  }
}
