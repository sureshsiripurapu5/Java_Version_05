class SuperClass
{	     
	   SuperClass()  // TEST with void
      {
		System.out.println("Super class constructor executed...");
	  }   
}
class SubClass  
{
      SubClass()
      {
		super.SuperClass();  
		System.out.println("Sub class constructor executed...");
	  }
}
class SupSubWithConstructorP01ToKnowRelationVer2
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                
    }
}   

      