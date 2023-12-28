// class Alien {

//   private final int id;
//   private final String name;

//   public Alien(int id, String name) {
//     this.id = id;
//     this.name = name;
//   }

//   public int getId() {
//     return id;
//   }

//   public String getName() {
//     return name;
//   }
// }

record Alien(int id, String name) {}

public class Project {

  public static void main(String[] args) {
    Alien a1 = new Alien(1, "Daniel");

    System.out.println(a1);
  }
}
