package part3;

public class Test {
	public static void main(String[] args) {
		String s = "Siwa Boonpun"; //Bo.Siwa_st@tni.ac.th
		String email = "";
		int idx_space = s.indexOf(" ");
		email+= s.substring(idx_space+1,idx_space+3) +".";
		email+= s.substring(0,idx_space) + "_st@tni.ac.th";
		System.out.println(email);
		//indexOf can use to check that some word is in s or not.
		//if(s.contains("pun")) System.out.println("have");
	}
}
