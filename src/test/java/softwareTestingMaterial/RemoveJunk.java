package softwareTestingMaterial;

public class RemoveJunk {
	public static void main(String[] args) {
		String s = "JiTHENDRA111111455095!###$#POI{$PO$I{";
		s = s.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(s);
	}

}
