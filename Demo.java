import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

  public static void main(String[] args) throws IOException {
    // System.out.println("Enter a number");

    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(in);
    // int num = Integer.parseInt(bf.readLine());

    // Scanner SC = new Scanner(System.in);
    // int num = SC.nextInt();

    // System.out.println(num);

    // bf.close();

    int j = 0;
    int i = 0;

    BufferedReader br = null;

    try {
      InputStreamReader in = new InputStreamReader(System.in);
      br = new BufferedReader(in);
      int num = Integer.parseInt(br.readLine());
      System.out.println(num);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("something went wrong");
    } finally {
      System.out.println("bye");
      br.close();
    }
  }
}
