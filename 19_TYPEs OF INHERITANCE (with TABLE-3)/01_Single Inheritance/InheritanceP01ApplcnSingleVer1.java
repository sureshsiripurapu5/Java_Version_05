class SuperClass                  // defined by some other
{
	 
	 
}
class subClass extends SuperClass // our class
{
  
	  	
}
class InheritanceP01ApplcnSingleVer1
{
	public static void main(String args[])
	{
		SuperClass supObj=new SuperClass();  // useless NOT recommended
		subClass   subObj=new subClass();    // recommended
	}
}