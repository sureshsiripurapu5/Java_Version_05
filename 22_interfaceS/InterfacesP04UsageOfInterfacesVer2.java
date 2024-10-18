interface A
{
	int a=1;
	
	void methodA(); // becomes public
}
interface B
{
	int b=2;
	
	void methodB(); // becomes public
}	
class C implements A,B
{
	public  void methodA()  
	        {
		      System.out.println("A->methodA() implemented and executed");
	          System.out.println("A->a = " + a);
			}
	public  void methodB()  
	        {
		      System.out.println("B->methodB() implemented and executed");
	           System.out.println("B->b = " + b);
			}		
}
class InterfacesP04UsageOfInterfacesVer2
{
	static public void main(String[] args)
	{
		C cObj=new C();
		  cObj.methodA();
		  cObj.methodB();
    }
}	