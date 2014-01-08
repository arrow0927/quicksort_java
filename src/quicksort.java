
public class quicksort
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    int len = 5;
    
    int [] myArray = new int[len];
    
    for (int i=0; i< len; i++)
    {
      myArray[i] = (int)(Math.random()*1000);
      System.out.println("i="+ i+ "value=" + myArray[i] + "    " );
      
    }
    
    int sorted[] = quicksort(myArray, 0, myArray.length-1);
    System.out.println("" );
    for (int i=0; i< sorted.length; i++)
    {
      
      System.out.println("i="+ i+ "value=" + sorted[i] + "    " );
      
    }

  }

  private static int[] quicksort(int[] myArray, int beginIndex, int endIndex)
  {
    if(myArray.length <= 1)
      return myArray;
    
    int pivot = myArray[myArray.length-1];
    int pivotIndex = myArray.length-1;
    int leftPtr = 0;
    int rightPtr = myArray.length-2;
    
    while (leftPtr < rightPtr)
    {
      while(myArray[leftPtr] <= pivot )
      {
        leftPtr++;
      }
      while (myArray[rightPtr] > pivot)
      {
        rightPtr--;
      }
      swap(myArray[leftPtr],myArray[rightPtr]);
      
    }
    
    
    return null;
  }

  private static void swap(int i, int j)
  {
    int temp = i;
    j=i;
    i=temp;
  }

}
