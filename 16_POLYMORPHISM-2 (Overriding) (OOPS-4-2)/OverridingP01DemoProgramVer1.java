class A   // Not Encapsulated
{
   // No Field(s)
  void  wishFaculty()  
        {
          System.out.println("Good Morning Sir");
        }

  void  wishFaculty()   
        {
             System.out.println("Hi Sir");
        }
}      
class OverridingP01DemoProgramVer1
{
     public static void main(String args[])
     {
        A  aObj = new A();
           aObj.wishFaculty() ;
     }
}
            


/*
 // same signature (methodname+Argument) 
*/


     





