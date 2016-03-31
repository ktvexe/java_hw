/*JAVA homework
 * 
 * decode and encode  of MORSE code
 * 
 * @author: Liang-Gu Liu
 * link:https://github.com/ktvexe/java_hw/tree/master/Hw4
 */
public class Week4_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorseCode mor1 =new MorseCode(args[0]);
		switch(args[1]){
			case "encode":
				System.out.println(mor1.encode(args[2]));
				break;
			case "decode":
				System.out.println(mor1.decode(args[2]));
				break;
		}
	}

}
