import java.util.*;
public class SortingArray
{
 public static void main (String [] args)
 {
   Scanner keyboard = new Scanner (System.in);
   int [] data = new int[5]; 
   
   for (int i = 0; i < data.length; i++)
   {
     System.out.println("Enter number " + (i+1) + ": ");
     data[i] = keyboard.nextInt();
   }
   
   //print array Un-sorted
   for (int i = 0; i < data.length; i++)
   {
       System.out.print( data[i] + " ");
   }
   System.out.println();

   SelectionSort(data);
  
   
 }
 
    public static void SelectionSort (int [] A)
    {
        for (int last = A.length -1; last >= 1; last --)
        {
          //Move the largest entry in A[0…last] to A[last]
          //Determine position of largest in A[0..last] and store in maxIndex
          int maxIndex = 0;
          for (int index = 0; index <= last; index++)
          {
            if (A[index] > A[maxIndex])
              maxIndex = index;
          }
          // maxIndex is position of largest in A[0..last]
          // swap A[maxIndex] with A[last]
          int temp = A[maxIndex];
          A[maxIndex] = A[last];
          A[last] = temp;   
        }
        
        //print array sorted
           for (int i = 0; i < A.length; i++)
           {
             System.out.print( A[i] + " ");
           }
      
      
    }
  
}