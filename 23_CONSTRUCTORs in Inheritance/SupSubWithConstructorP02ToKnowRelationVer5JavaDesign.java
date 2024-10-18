class SuperMostClass
{
	  SuperMostClass()
      {
		System.out.println("SuperMost class constructor executed...");
	  }
	
}	
class SuperClass extends SuperMostClass
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
class SupSubWithConstructorP02ToKnowRelationVer5JavaDesign
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                  
    }
}   

      