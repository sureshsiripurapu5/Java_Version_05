class A    
{
    void  wishFriend()       // overRIDDEN method
          { 
           System.out.println("Hi Dude ");
          }
}
class B  extends A
{
    void  wishFriend()      // overRIDING method
          {
            System.out.println("Hi Bro ");
          }
}
class SuperUsage1P01SolutionForMethodOverridingVer2 
{
    public static void main(String args[])
    {
        B bObj = new B();
          bObj.wishFriend();
		  super.wishFriend();
    }     
}
            



     





