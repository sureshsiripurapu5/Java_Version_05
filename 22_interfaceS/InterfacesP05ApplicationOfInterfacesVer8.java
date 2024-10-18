// application LIKE Multiple Inheritance MODEL
class Class
{
	int field;       // NO need of data
	void methodOfClass()
	{
	  System.out.println("Class->field = " + field);
    }
}
interface Interface1
{
	int  finalVar1=1; // Must assign data
	void methodOfInterface1();
	
}
interface Interface2
{
	int finalVar2=2; // Must assign data
	void methodOfInterface2(); 
}
	
class SubClass extends Class implements Interface1,Interface2 
{
	SubClass()
	{
	   methodOfClass();
       methodOfInterface1();
	   methodOfInterface2();	
		
	}
	
	
	public	void methodOfInterface1()
		    {
			 System.out.println("Interface1->finalVar1="+finalVar1);
		    }
	public	void methodOfInterface2(){System.out.println("Interface2->finalVar2="+finalVar2);}
		
}
class InterfacesP05ApplicationOfInterfacesVer8
{
	static public void main(String[] args)
	{
		SubClass subObj=new SubClass();
		         
    }
}	