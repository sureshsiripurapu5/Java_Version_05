public class TestAnonymous1D
{
  public static void main (String[] args) {
    // declaring and initializing array 
    int myArray[] = {1,2,3,4,5};
    
    // clone myArray by using clone peroperty
    int cloneArray[] = myArray.clone();
    
    // checking weather both array is same or not
    System.out.println(myArray == cloneArray);
  }
}
