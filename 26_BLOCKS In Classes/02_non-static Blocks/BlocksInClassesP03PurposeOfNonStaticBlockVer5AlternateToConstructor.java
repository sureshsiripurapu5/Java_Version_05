// constructor or block which is first EXUCUTED?
class A
{
	      //instance variables
    int    i;
    double d; 
    boolean b; 
 
    {               
      i=1;
	  d=1.2;
	  b=true;
    } 
	A(int li, double ld, boolean lb) // useless block bcz unnecessary CODING
	{
		i=li;
		d=ld;
		b=lb;
	}
    
}
class BlocksInClassesP03PurposeOfNonStaticBlockVer5AlternateToConstructor
{
    public static void main(String[] args)
    {
	  A aObj=new A(1,1.2,true);  
	}
	
}
