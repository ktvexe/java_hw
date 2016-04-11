/*JAVA homework
 * 
 * inheritance practice
 * create a parent class Document and two child class Email and File with three mode
 * 
 * @author: Liang-Gu Liu
 * link:https://github.com/ktvexe/java_hw/tree/master/Hw5
 */
import java.util.Scanner;

public class Week5_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mode,type;	
		Scanner scan = new Scanner(System.in);
		mode = scan.nextLine();
		type = scan.nextLine();
		Document doc =new Document();
		Email mail =new Email();
		File file =new File();
		switch (type){
				case "Document":
						doc.setText(scan.nextLine());
						doc.setMode(mode,scan);
						break;
				case "Email":
						mail.setSender(scan.nextLine());
						mail.setRecipient(scan.nextLine());
						mail.setTitle(scan.nextLine());
						mail.setText(scan.nextLine());
						mail.setMode(mode,scan);
						break;
				case "File":
						file.setPathname(scan.nextLine());
						file.setText(scan.nextLine());
						file.setMode(mode,scan);
						break;
				default:
						System.out.println("error input");
		}
		
		
		scan.close();
		
	}
}
