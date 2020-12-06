import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
    this.current = start;
  }

  public void reset() {
    this.current = this.start;
  }

  public int length() {
    return (this.end - this.start) + 1;
  }

  public boolean hasNext() {
    return (this.current < end) 
  }
}
