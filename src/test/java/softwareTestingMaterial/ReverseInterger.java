package softwareTestingMaterial;

public class ReverseInterger {

	public static void main(String[] args) {
		long num = 24236;
		long rev = 0;	
		while (num!=0) {
			rev = rev*10 + num%10;
			num = num/10;	
		}	
		System.out.println(rev);
		long num1 = 12458;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
				
				


	}

}
