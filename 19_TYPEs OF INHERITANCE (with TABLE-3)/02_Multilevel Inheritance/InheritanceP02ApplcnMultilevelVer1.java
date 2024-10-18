class SuperMost                             // GrandParent
{


	
}
class IntermediateClass extends SuperMost       // Parent
{
	 

	 
}
class SubClass extends IntermediateClass        // Child
{
  
	  	
}
class InheritanceP02ApplcnMultilevelVer1
{
	public static void main(String args[])
	{
		SuperMost          sMObj=new SuperMost();           // useless
		IntermediateClass  iClass=new IntermediateClass();  //useless
	    SubClass           subObj=new SubClass() ;  // RECOMMENDED
	
	}
}