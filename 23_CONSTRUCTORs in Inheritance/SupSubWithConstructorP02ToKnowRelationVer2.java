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
		System.out.println("Sub class constructor executed...");
	  }
}
class SupSubWithConstructorP02ToKnowRelationVer2
{
    public static void main(String[ ] args)
    {
      SuperClass supObj = new  SuperClass();  
                  
    }
}   

      