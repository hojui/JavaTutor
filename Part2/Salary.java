package part2;

public class Salary {
	public static void main(String[] args) {
		String[] salaryMan = { "jui   410", "a     400", "b     280", "c     350", "d     380" };
		for (int i = 0; i < salaryMan.length; i++) {
			if(Integer.parseInt(salaryMan[i].substring(6))*30 < 12000) {
				System.out.println(salaryMan[i].substring(0, 6));
			}
		}
	}
}
