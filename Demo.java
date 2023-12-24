import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

  public static void main(String[] args) {
    // Set<Integer> nums = new HashSet<Integer>();
    // nums.add(6);
    // nums.add(5);
    // nums.add(4);

    // System.out.println(nums.get(2));

    // for (int n : nums) {
    //   System.out.println(n);
    // }

    Map<String, Integer> students = new HashMap<>();
    students.put("Daniel", 25);
    students.put("King", 15);
    students.put("Bolu", 30);
    students.put("kira", 70);

    for (String key : students.keySet()) {
      System.out.println(key + " " + students.get(key));
    }
  }
}
