class M 
{
	 
}
class P    extends  M
{
 	  	
}
class Q   extends  M
{
 	  	
}
class X   extends  P
{
 	  	
}
class Y   extends  X
{
 	  	
}
class A   extends  Q
{
 	  	
}
class B   extends  A
{
 	  	
}
class C   extends  B
{
 	  	
}
class INHRT01Type4HybridInheritanceVer2
{
	public static void main(String args[])
	{
	  Y   yObj=new Y();
	  C   cObj=new C();
	}
}