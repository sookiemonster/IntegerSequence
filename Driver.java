import java.util.NoSuchElementException;

public class Driver{
  public static void main(String[] args) {
    Range s = new Range(0, 2);
    test(s);

    IntegerSequence r = new Range(10,15);
    test(r);

    Range n = new Range(-10,10);
    test(n);
  }

  public static void test(IntegerSequence nums) {
    while(nums.hasNext()){
      System.out.print(nums.next());
      if( nums.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    try {
      System.out.println(nums.next());
    } catch (NoSuchElementException e){
      System.out.println("Correct error");
      nums.reset();
      System.out.println(nums.next());
    }
  }
}
