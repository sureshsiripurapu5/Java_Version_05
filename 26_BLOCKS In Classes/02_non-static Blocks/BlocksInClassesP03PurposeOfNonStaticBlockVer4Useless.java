// constructor or block which is first EXUCUTED?
class A
{
	      //instance variables
    int    i;
    double d; 
    boolean b; 
 
    {               // useless block bcz unnecessary CODING
      i=0;
	  d=0.0;
	  b=false;
    } 
    
}
class BlocksInClassesP03PurposeOfNonStaticBlockVer4Useless
{
    public static void main(String[] args)
    {
	  A aObj=new A();  
	}
	
}
