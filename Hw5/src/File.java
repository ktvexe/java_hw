import java.util.Scanner;

public class File extends Document{
		private String pathname;
		public File(){}
		public String toString(){
			String str;
			str = "Path: "+getPathname();
			str += "\n"+text;
			return str;
		}
		public void setPathname(String str){
			pathname = str;
		}
		public String getPathname(){
			return pathname;
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
							case "pathname":
								pathname =updateContent;
								break;
							default:
					}
					System.out.println(this.toString());
					break;
			default:	
			}

		}
}
