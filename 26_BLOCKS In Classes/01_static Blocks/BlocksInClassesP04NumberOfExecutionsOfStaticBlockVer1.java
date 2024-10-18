class A
{
    static   
    {
       System.out.println("static BLOCK Executed");
    } 	
}
class BlocksInClassesP04NumberOfExecutionsOfStaticBlockVer1
{
    public static void main(String[] args)
    {
	    A aObjRef1=new A(); // NOW only A.class is LOADED in JVM
	    A aObjRef2=new A();
	}
	
}
