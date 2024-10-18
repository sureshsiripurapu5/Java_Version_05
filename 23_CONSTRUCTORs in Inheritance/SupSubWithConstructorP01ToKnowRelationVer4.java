class SuperClass
{	     
	void  SuperClass()   
          {
		    System.out.println("Super class METHOD not constructor executed...");
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
class SupSubWithConstructorP01ToKnowRelationVer4
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                
    }
}   

      