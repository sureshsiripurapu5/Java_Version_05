class SuperClass                        // Parent
{
	 

	 
}
class SubClass1 extends  SuperClass     // Child1
{
  
	  	
}
class SubClass2 extends  SuperClass     // Child2
{
  
	  	
}
class InheritanceP03ApplcnHierarchicalVer1
{
	public static void main(String args[])
	{
      SuperClass  supObj=new SuperClass(); // useless
	  SubClass1   sub1Obj=new SubClass1(); // obj for a subclass
	  SubClass2   sub2Obj=new SubClass2();  // obj for another subclass
	}
}