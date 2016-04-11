import java.util.Scanner;

public class Email extends Document{
		private String sender;
		private String recipient;
		private String title;
		public Email(){}
		public String toString(){
				String str;
				str = "From: ";
				str+=getSender();
				str += "\nTo: ";
				str += getRecipient();
				str += "\nTitle: ";
				str += getTitle();
				str += "\n";
				str += text;
				return str;
		}
		public void setSender (String str){
				sender = str;
		}
		public String getSender(){
				return sender;
		}
		public void setRecipient (String str){
				recipient = str;
		}
		public String getRecipient(){
			return recipient;
		}
		public void setTitle (String str){
				title = str ;
		}
		public String getTitle(){
			return title;
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
							case "sender":
								sender =updateContent;
								break;
							case "recipient":
								recipient =updateContent;
								break;
							case "title":
								title =updateContent;
								break;
					}
					System.out.println(this.toString());
					break;
			default:	
			}

		}
}
