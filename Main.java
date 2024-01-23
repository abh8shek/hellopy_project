import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("lastcommitmsg.txt");
			Scanner sc = new Scanner(file);
			String msg = sc.nextLine();
			System.out.println(msg);
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}
}
// Commit 7
