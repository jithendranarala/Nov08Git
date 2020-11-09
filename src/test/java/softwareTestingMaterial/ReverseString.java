package softwareTestingMaterial;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		String Rev ="";
		int len = s.length();
		for(int i = len-1;i>=0;i--){
			Rev = Rev + s.charAt(i);
		}
		System.out.println(Rev);
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	
	
}
