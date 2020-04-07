public class Max
  {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
    T max = x; 
    if (y.compareTo(max) > 0)
      max = y; 
    if (z.compareTo(max) > 0)
      max = z; 
    return max; 
       }
  public static void main(String args[]) 
 {
    System.out.println("Maximum of 3 ,4 and 5 is " + maximum(3, 4, 5));
    System.out.println("Maximum of 6.6,7.7 and 8.8 is " + maximum(6.6, 8.8, 7.7));
    System.out.println("Maximum of  pear,apple.and orange is "+ maximum( "pear", "apple", "orange"));
  }
} 