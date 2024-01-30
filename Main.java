import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {	
	private static String getModuleName() {
		ArrayList<String> msgArr = new ArrayList<String>();
		try {
			File file = new File("lastcommitmsg.txt");
			Scanner sc = new Scanner(file);
			String msg = sc.nextLine();
			String[] msgarr = msg.split("[., ()]");
			//System.out.println(Arrays.toString(msgarr));
			sc.close();
			ArrayList<String> msgarr_upd = new ArrayList<String>();
			for (String e : msgarr) {
				if (e != "" ) {
					msgarr_upd.add(e.toLowerCase());
				}
			}
			msgArr = msgarr_upd;
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
		//System.out.println(msgArr);
		int i1 = msgArr.indexOf("module");
		String modName = msgArr.get(i1+1);
		return modName;
	}
	
	public static void main(String[] args) {
		String modName = getModuleName();
		if (modName.contains("equity")) {
			System.out.println("RUN EQUITY TEST SUITE");
			System.out.println("EQIUTY TEST 1\n");
			System.out.println("EQUITY TEST 2\n");
			System.out.println("EQUITY TEST 3\n");
		}
		else if (modName.contains("onboarding")) {
			System.out.println("RUN ONBOARDING TEST SUITE");
			System.out.println("ONBOARDING TEST 1\n");
			System.out.println("ONBOARDING TEST 2\n");
			System.out.println("ONBOARDING TEST 3\n");
		}
		else if (modName.contains("mf") || modName.contains("mutual") || modName.contains("mutualfund")) {
			System.out.println("MUTUAL FUND TEST 1\n");
			System.out.println("MUTUAL FUND TEST 2\n");
			System.out.println("MUTUAL FUND TEST 3\n");
		}
		else if (modName.contains("charts")) {
			System.out.println("RUN CHARTS TEST SUITE");
			System.out.println("MUTUAL FUND TEST 1\n");
			System.out.println("MUTUAL FUND TEST 2\n");
			System.out.println("MUTUAL FUND TEST 3\n");
		}
	}
}
// Commit 12
