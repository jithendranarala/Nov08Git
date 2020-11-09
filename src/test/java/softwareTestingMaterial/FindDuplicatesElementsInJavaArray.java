package softwareTestingMaterial;

public class FindDuplicatesElementsInJavaArray {

	public static void main(String[] args) {
		String names[] = {"jk","Java", "Selenium", "TestNG","Maven","AutoIT","Sikuli","Java"};
		
		for(int i=0;i<names.length;i++) {
			for (int j=i+1;j<names.length;j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate item is " + names[i]);
				}
			}
			
		}

	}

}
