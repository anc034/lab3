import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int [] input = {1,2,3,4};
    int [] expected = {4,3,2,1};
    assertArrayEquals(expected, ArrayExamples.reversed(input));
  }

  @Test
  public void testReverseInPlace2(){
    int [] input = {1,2,3,4};
    int [] expected = {4,3,2,1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  
  }

  @Test
  public void AverageWithoutLowest(){
    double [] input = {1,2,3,4,5,6,1};
    boolean a = ((1+2+3+4+5+6)/6.0) == ArrayExamples.averageWithoutLowest(input);
    assertEquals(true, a);
  }
}
