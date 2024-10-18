class A 
{
	 
}
class X extends A
{
	
}
class B extends X
{
	
}
class C extends X
{

}

class InheritanceP04ApplcnHybridVer1
{
	public static void main(String args[])
	{
				A aObj=new A();  // useless
				X xObj=new X();  // useless
	  
	  B bObj=new B();  // required
	  C cObj=new C();  // required
	  
	}
}