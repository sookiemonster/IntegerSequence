import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    this.currentIndex = 0;
    this.data = other;
  }

  public void reset() {
    this.currentIndex = 0;
  }

  public int length() {
    return this.data.length;
  }

  public boolean hasNext() {
    return (this.currentIndex <= this.length());
  }
}
