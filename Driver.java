import java.util.NoSuchElementException;

public class Driver{
  public static void main(String[] args) {
    Range s = new Range(0, 2);
    test(s);

    IntegerSequence r = new Range(10,15);
    test(r);

    Range n = new Range(-10,10);
    test(n);

    System.out.println();
    System.out.println("ArraySequence Testing");
    System.out.println();
    int[] a = {0,1,2};
    ArraySequence t = new ArraySequence(a);
    test(t);

    int[] b = {-2, 0, 123, 9000};
    ArraySequence t2 = new ArraySequence(b);
    b[0] = 535;
    test(t2);

    System.out.println();
    System.out.println("ArraySequence Second Constructor");
    System.out.println();

    IntegerSequence rr = new Range(10,20);
    IntegerSequence as = new ArraySequence(rr);
    test(as);
  }

  public static void test(IntegerSequence nums) {
    while(nums.hasNext()){
      System.out.print(nums.next());
      if( nums.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    System.out.println("Sequence length: " + nums.length());
    try {
      System.out.println("Has Next Element (should be false): " + nums.hasNext());
      System.out.println(nums.next());
    } catch (NoSuchElementException e){
      System.out.println("Correct error");
      nums.reset();
      System.out.println("First element: " + nums.next());
    }
    System.out.println();
  }
}
