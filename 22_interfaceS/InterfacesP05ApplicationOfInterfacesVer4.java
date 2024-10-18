class Class
{
	
	void methodOfClass()
	{
	  System.out.println("Class->method() executed");
    }
}
interface Interface1
{
	void methodOfInterface1();
	
}
interface Interface2
{
	void methodOfInterface2(); 
}
	
class SubClass extends Class implements Interface1,Interface2 
{
	


}
class InterfacesP05ApplicationOfInterfacesVer4
{
	static public void main(String[] args)
	{
		SubClass subObj=new SubClass();
		  
    }
}	