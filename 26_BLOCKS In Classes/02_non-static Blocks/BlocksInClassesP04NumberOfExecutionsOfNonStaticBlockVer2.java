class A
{
    {
       System.out.println("static BLOCK-1 is Executed");
    } 
	{
       System.out.println("static BLOCK-2 is Executed");
    } 
}
class BlocksInClassesP04NumberOfExecutionsOfNonStaticBlockVer2
{
    public static void main(String[] args)
    {
		System.out.println("main() method EXECUTED");
	    A aObjRef1=new A();  
	    A aObjRef2=new A();
	}
	
}
