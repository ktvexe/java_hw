import java.util.ArrayList;
import java.util.Arrays;
public class MorseCode {
		/*table: store morse code
		 * code:store decoded alphabet
		 *tmp  :temporary store morse code of alphabet
		 */
		String[] table = new String[28];
		ArrayList<String> code = new ArrayList<String	>() 	;
		String tmp = "";
		
		public MorseCode(String  arg){
			for(int i=0;i<26;i++){
				table[i]="";
			}
			//initialize
			table[26]="000";
			table[27]="0000000";
			String[] str =arg.split("=");
			
			for(int i =0;i<26;i++){
				String[] strTable = str[i+1].split(";");
				for(int j=0;j< strTable[0].length();j++){
					//last code
					if(j==strTable[0].length()-1){
						switch(strTable[0].charAt(j)){
						case '-':
							table[i]+="111";
							break;
						case '.':
							table[i]+="1";
							break;
						
						}
					}
					//normal code
					else{
						switch(strTable[0].charAt(j)){
							case '-':
								table[i]+="1110";
								break;
							case '.':
								table[i]+="10";
								break;
							
						}
					}
				}
			}
			
		}
		
		public String encode(String arg){
			arg=arg.toUpperCase();
			String ans="";
			for(int i=0;i< arg.length();i++){
				//space
				if(arg.charAt(i)==' '){
					ans+=table[27];
				}
				//normal character
				else{
					ans+=table[arg.charAt(i)-'A'];
				
					if(i != arg.length()-1 &&arg.charAt(i+1)!=' '){
						ans+=table[26];
					}
				}
			}
			return ans;
		}
		
		public String decode(String arg){
			int check=0;
			String ans="";
			for(int i =0;i<arg.length();i++){
				//find 0
				if((arg.charAt(i)-'0') == 0){
							check++;
						
							if(check ==2){
										int indexOfTable=0;
										tmp = tmp.substring(0, tmp.length() - 1);
										while(true){
											if(tmp.equals(table[indexOfTable])){
												code.add(Character.toString((char) ('A'+indexOfTable)));
												break;
											}
											else if(indexOfTable >26){
												return "*INVALID*";
											}
											indexOfTable++;
										}
										tmp ="00";
							}
							else if(check>7){
										return "*INVALID*"; 
							}
							tmp+=arg.charAt(i);
				}
				//find 1
				else{
					if(check ==3 ){
						//decode
						tmp="";
					}
					else if(check ==7){
						code.add(" ");
						tmp="";
					}
					tmp+=arg.charAt(i);
					check = 0 ;
					if(i ==arg.length()-1){
						int indexOfTable=0;
						while(true){
							if(tmp.equals(table[indexOfTable])){
								code.add(Character.toString((char) ('A'+indexOfTable)));
								break;
							}
							else if(indexOfTable >26){
								return "*INVALID*";
							}
							indexOfTable++;
						}
					}
				}
			}
			for(int i = 0; i < code.size(); i++) {   
				ans+=code.get(i);
			}  
			return ans;
		}
}
