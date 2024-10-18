import java.util.Scanner;
class India
{
  String stateName;
  String capitalCity;
  int stateNumber;
     void storeDetailOfState()
	        {
			System.out.println("Enter StateName capitalName and StateNumber");
			Scanner scobj=new Scanner(System.in);
			    stateName =scobj.nextLine();
				capitalCity=scobj.nextLine();
				stateNumber=scobj.nextInt();
			  
			}
     void showStateDetails()
	        {
			 System.out.println("State Name :"+stateName);
			 System.out.println("State Capital city :"+capitalCity);	
	    	 System.out.println("State Number :"+stateNumber);
			}
}
class State extends India
{
  String stateChiefMinister;
  int stateAssemblySeats;
  int numberOfDistricts;
      void storeLocalDetailsOfState(String cm ,int n, int nd)
	       {
		     stateChiefMinister=cm;
			 stateAssemblySeats=n;
			 numberOfDistricts=nd;
		      
		     showStateDetails();
		   }

		void showStateLocalDetails()
           {
		   
		   	 System.out.println("State cm :"+stateChiefMinister);
		   	 System.out.println("State Assembly Seats :"+stateAssemblySeats);
			 System.out.println("Number of Districts :"+numberOfDistricts);
		   }	
}
class InformationOfStateOfIndia extends State
 {
	int stateBoders;
    String stateLocalParty;			
		void storeBorderAndLocalParty(int sb ,String pty)
		  {
			  stateBoders=sb;
			  stateLocalParty=pty;	  
		  }	
         void showBorderAndParty()
		  {
			 //showStateLocalDetails(); 
             System.out.println("Number of Borders Of State:"+stateBoders);
             System.out.println("State Of LocalParty :"+stateLocalParty); 

        
		  }		 
			   
			   
 }			   
class MultiLevelInheritance
{
	public static void main(String[] args)
             	{
				InformationOfStateOfIndia obj=new InformationOfStateOfIndia();
				                           obj.storeDetailOfState();
										   obj.storeBorderAndLocalParty(4,"trs");
										   obj.showBorderAndParty();
					                       obj.storeLocalDetailsOfState("kcr" ,119 ,32);
					                       obj.showStateLocalDetails();
					
					
				}
	
	
}	
	
	
	



