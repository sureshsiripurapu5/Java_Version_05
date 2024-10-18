// constructor or block which is first EXUCUTED?
class A
{
  int a; //non-static variable/field/instance variable	
 
    {
      a=1; // non-static variable (Field/instance variable)
	  System.out.println("field of Class A from Block, a="+a);
    } 
    A()
	{
	  a=2;	
	  System.out.println("field of Class A from constructor, a="+a);
	}
	
}
class BlocksInClassesP03PurposeOfNonStaticBlockVer3
{
    public static void main(String[] args)
    {
	 
	  //System.out.println("field of Class A from main()="+aObj.a);
	  System.out.println("Executed: main()");
	  A aObj=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
