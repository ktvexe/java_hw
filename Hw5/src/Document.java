import java.util.Scanner;

public class Document {
	protected String text;
	public Document(){}
	public String toString(){
		return text;
	}
	
	public void setText(String str){
		text = str;
	}
	public void setMode(String mode,Scanner scanin){
		
		switch (mode){
		case "A":
				System.out.println(this.toString());
				break;
		case "B":
				String compStr=scanin.nextLine();
				System.out.println(this.toString().contains(compStr));
				break;
		case "C":
				String updateVar=scanin.nextLine();
				String updateContent=scanin.nextLine();
				switch(updateVar){
						case "text":
							text =updateContent;
							break;
						default:
				}
				System.out.println(this.toString());
				break;
		default:	
		}

	}
}
