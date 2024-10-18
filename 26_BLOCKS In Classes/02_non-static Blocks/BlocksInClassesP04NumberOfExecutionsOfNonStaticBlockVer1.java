class A
{
    {
       System.out.println("static BLOCK is Executed");
    } 	
}
class BlocksInClassesP04NumberOfExecutionsOfNonStaticBlockVer1
{
    public static void main(String[] args)
    {
		System.out.println("main() method EXECUTED");
	    A aObjRef1=new A();  
	    A aObjRef2=new A();
	}
	
}
