interface A
{
	int x=1;
	
	void method(); // becomes public
}	
class B implements A
{
	public  void method()  
	        {
		     System.out.println("method() implemented and executed");
	        }
}
class InterfacesP03UsageOfAnInterfaceVer5
{
	static public void main(String[] args)
	{
		B bObj=new B();
		  bObj.method();
    }
}	