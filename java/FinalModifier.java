public class FinalModifier{
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    FinalModifier myObj = new FinalModifier();
    
    System.out.println(myObj.x); 
    System.out.println(myObj.PI);
  }
}