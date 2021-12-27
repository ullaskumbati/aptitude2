class LeapYear{
	public static void main (String []args){
	int year=1964;
		if(year%4==0){
			System.out.println("Its a leap year");
		}
		else if(year%100==0){
			System.out.println("It is a leap year");
		}
		else if(year%400==0){
			System.out.println("This is a leap year");
		}
		else{
			System.out.println("Entered year is not a leap year");
		}
	
	}		
}