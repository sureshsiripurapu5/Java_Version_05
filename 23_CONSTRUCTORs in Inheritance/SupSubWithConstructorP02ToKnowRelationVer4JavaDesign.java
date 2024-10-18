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
		      //super(); // James Gosling design
		System.out.println("Sub class constructor executed...");
		super(); // James Gosling design
	  }
}
class SupSubWithConstructorP02ToKnowRelationVer4JavaDesign
{
    public static void main(String[ ] args)
    {
      SubClass subObj = new  SubClass();  
                  
    }
}   

      