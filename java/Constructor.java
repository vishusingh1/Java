public class Constructor{
  int x;

  // Create a class constructor for the Main class
  public void Main() {
    x = 5;
  }

  public static void main(String[] args) {
    Constructor myObj = new Constructor();
    System.out.println(myObj.x);
  }
}