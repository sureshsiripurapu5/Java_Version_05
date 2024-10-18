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
		super.SuperClass();  
		System.out.println("Sub class constructor executed...");
	  }
}
class SupSubWithConstructorP01ToKnowRelationVer3
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                
    }
}   

      