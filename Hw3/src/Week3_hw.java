/*java homework
*
*find prime factors only include 2,3,5 by memoization 
*
*@author: LG Liu
*@link:https://github.com/ktvexe/java_hw/tree/master/Hw3
*/
public class Week3_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str =args[0].split("=");
		int testValue =Integer.parseInt(str[1]);
		
		if(str[0].equals("X")){
			Specialnum calSpec = new Specialnum();
			System.out.println(calSpec.checkSpecial(testValue));
		}
		else{
			Specialnum calSpec = new Specialnum();
			System.out.println(calSpec.findOrder(testValue));
		}
	}

}
