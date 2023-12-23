import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    Set<Integer> nums = new HashSet<Integer>();
    nums.add(6);
    nums.add(5);
    nums.add(4);

    System.out.println(nums.get(2));

    for (int n : nums) {
      System.out.println(n);
    }
  }
}
