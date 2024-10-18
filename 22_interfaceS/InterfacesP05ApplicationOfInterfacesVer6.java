// application LIKE Multiple Inheritance MODEL
class Class
{
	int field;       // NO need of data
	void methodOfClass()
	{
	  System.out.println("Class->method() executed");
	  System.out.println("Class->field = " + field);
    }
}
interface Interface1
{
	int finalVar1=1; // Must assign data
	   Interface1();
	
}
interface Interface2
{
	int finalVar2=2; // Must assign data
	    Interface2(); 
}
	
class SubClass extends Class implements Interface1,Interface2 
{
	    void myMethodToShowAll()
	    {
	      methodOfClass();
          System.out.println("Interface1->finalVar1="+finalVar1);
          System.out.println("Interface2->finalVar2="+finalVar2);
		}
	public	void methodOfInterface1()
		    {
			
		    }
	public	void methodOfInterface2(){}
		
}
class InterfacesP05ApplicationOfInterfacesVer6
{
	static public void main(String[] args)
	{
		SubClass subObj=new SubClass();
		         subObj.myMethodToShowAll();
    }
}	