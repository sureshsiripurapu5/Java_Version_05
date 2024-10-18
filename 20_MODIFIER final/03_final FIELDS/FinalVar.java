class Student
{
  
                  double   fee1;
          final   double   fee3=1.1; // if not assign ERROR
             void show()
                  {
                    System.out.println("final:"+fee3);
                    //fee3=3.3;   // this is ERROR bcz can't modify
                  }
 
}

class FinalVar
{

  public static void main(String args[])
  {
      
         
     Student stObj=new Student();
           System.out.println(stObj.fee1);
          
              
           stObj.show();


            final int a=5;
                 // a++; // ERROR cant modified final variable
            System.out.println(a);

    
      
   
  }
}
            



     





