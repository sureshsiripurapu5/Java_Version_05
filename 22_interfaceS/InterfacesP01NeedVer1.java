class A
{
    int  a=1;
    void show1()
	{
		System.out.println("a="+a);
    }          
}
class B
{
    int b=2;
    void show2()
    {
		System.out.println("b="+b);
    }           
}
class C extends A,B
{
    int c=2;
    void show3()
    {
	    show1();
        show2();		
		System.out.println("c="+c);
    }  
}

class InterfacesP01NeedVer1
{
   public static void main(String[] args)
   {
      C cObj=new C();
        cObj.show3();
   }
}   