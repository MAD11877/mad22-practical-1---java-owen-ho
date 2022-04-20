import java.util.Scanner;
import java.util.*;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    //get user input
    Scanner in = new Scanner(System.in);
    System.out.println("How many numbers will you be inputting?");
    int num = in.nextInt();
    int[] numList = new int[num];
    int i=0;
    while (i<num){
      numList[i] = in.nextInt();
      i++;
    }

    // find occurence of each integer
    HashMap<Integer, Integer> modeDict = new HashMap<Integer, Integer>();
    for (int j : numList){
      if (modeDict.containsKey(j)){
        modeDict.put(j,modeDict.get(j)+1);
      }
      else{
        modeDict.put(j,1);
      }
    }

    // find highest occurence of mode
    int mostOccurence = 0;
    for (int k : modeDict.values()){
      if (k>mostOccurence){
        mostOccurence = k;
      }
    }
    
    //find key of highest occurence(mode)
    for(int l : modeDict.keySet()){
      if(modeDict.get(l)==mostOccurence){
        System.out.println(l);
      }
    }
  }
}
