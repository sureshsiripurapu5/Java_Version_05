class SuperClass
{	     
	  SuperClass()
      {
		System.out.println("Super class constructor executed...");
	  }   
}
class SubClass extends SuperClass
{
      SubClass()
      {
		      // how control invokes SuperClass() constructor???  
		System.out.println("Sub class constructor executed...");
	  }
}
class SupSubWithConstructorP02ToKnowRelationVer3
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                  
    }
}   

      