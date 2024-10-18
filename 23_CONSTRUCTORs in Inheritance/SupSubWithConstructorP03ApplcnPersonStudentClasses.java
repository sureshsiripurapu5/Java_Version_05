class Person
{
	String name;
    char   gender;   
    
	       Person()
		   {
			 System.out.println("Super class constructor executed...");
		     System.out.println("NAME   :"+name);
			 System.out.println("GENDER :"+gender);
		   }   
}
class  Student extends Person
{
    int     myAge;
                 
    void    showStudentDetails()
            {
              myAge=49;  
              System.out.println("my age : " + myAge);
              name="PVR" ;  
              gender='M' ;   
			  System.out.println("inherited FIELDS:-");
              System.out.println("NAME   :"+name);
			  System.out.println("GENDER :"+gender);
            }
}
class SupSubWithConstructorP03ApplcnPersonStudentClasses
{
    public static void main(String[ ] args)
    {
      Student s1Obj = new  Student();  
              s1Obj . showStudentDetails();
    }
}   

      