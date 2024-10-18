// constructor or block which is first EXUCUTED?
class A
{
  int a; //non-static variable/field/instance variable	
 
    {
      a=1; // non-static variable (Field/instance variable)
	  System.out.println("field of Class A from Block="+a);
    } 	
}
class BlocksInClassesP03PurposeOfNonStaticBlockVer1
{
    public static void main(String[] args)
    {
	  A aObj=new A(); // NOW only A.class is LOADED in JVM
	  System.out.println("field of Class A from main()="+aObj.a);
	}
	
}
