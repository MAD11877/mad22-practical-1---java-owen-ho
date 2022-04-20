import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = x;
    for (int i=0;i<x;i++){
      for (int j=0;j<y;j++){
        System.out.print("*");
      }
      y--;
      System.out.println();
    }
  }
}
