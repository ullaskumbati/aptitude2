class Hillstations2{
	public static void main (String [] hills){
		System.out.println("Hill stations near are");	
			int num =0;
				for(int index=0; index<hills.length; index = index+1){
					if(num==8){
					System.out.println();
					num=0;
					}
					hills[1]="nandhi hills";
					System.out.print(hills[index]+"\t");
					num=num +1;
				}
	        System.out.println("\nEnd of hill stations ");
	}


}