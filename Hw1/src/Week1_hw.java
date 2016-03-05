
public class Week1_hw {

	public static void main(String[] args) {
		String[] str =args[0].split("<tag>");
		str  = str[1].split("</tag>");
		str = str[1].split("<"+str[0]);
		str =str[1].split("/>");
		if(str[0].compareTo(">")==0){
			System.out.println(" ");
			return;
		}
		else{
			str =str[0].split(">");
			System.out.println(str[0]);
		}
	}

}
