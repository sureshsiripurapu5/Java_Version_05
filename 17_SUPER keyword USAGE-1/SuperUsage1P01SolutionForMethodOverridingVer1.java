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
            super.wishFriend();   
            System.out.println("Hi Bro ");
            //super.wishFriend();    // can we write here???
          }
}
class SuperUsage1P01SolutionForMethodOverridingVer1 
{
    public static void main(String args[])
    {
        B bObj = new B();
          bObj.wishFriend();
    }     
}
            



     





