interface A
{
	void methodA();
}
interface B
{
	void methodB();
}	
class C implements A,B // can write comma(,) HERE
{
	// no code for methods	
}
class InterfacesP04UsageOfInterfacesVer1
{
	static public void main(String[] args)
	{
		C cObj=new C();
		  cObj.methodA();
		  cObj.methodB();
    }
}	