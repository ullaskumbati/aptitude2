class Fibonocci{
	public static void main (String [] args){
		int first=0,second=1,third=2;
		long number=100;
			for(int i=2;i<number;i++){
				first=second;
				second=third;
				third=first+second;
					System.out.println(first);
			}
	}
}