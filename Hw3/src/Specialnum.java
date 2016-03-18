/*java homework
*
*create hashset to store lots of case,
*and use arraylist to find order or check existence.
*deal with integer multiply overflow
*
*@author: LG Liu
*@link:https://github.com/ktvexe/java_hw/tree/master/Hw3
*/
import java.util.*;
public class Specialnum {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private Set<Integer> hash= new HashSet<Integer>();
	
	public Specialnum(){
		for(int i=0;i<32;i++){
			for(int j=0;j<21;j++){
				for(int k=0;k<15;k++){
					hash.add(safeMultiply(safeMultiply((int)Math.pow(3,j),(int)Math.pow(5,k)),(int)Math.pow(2,i)));
				}
			}
		}
		arrayList.addAll(hash);
		Collections.sort(arrayList);

	}
	
	static final int safeMultiply(int left, int right) {
		  if (right > 0 ? left > Integer.MAX_VALUE/right
		                  || left < Integer.MIN_VALUE/right
		                : (right < -1 ? left > Integer.MIN_VALUE/right
		                                || left < Integer.MAX_VALUE/right
		                              : right == -1
		                                && left == Integer.MIN_VALUE) ) {
		    //throw new ArithmeticException("Integer overflow");
		    return 1;
		  }
		  return left * right;
		}
	
	public boolean checkSpecial(int x){
		return arrayList.contains(x);
	}
	
	public int findOrder(int y){
		return arrayList.get(y-1);	
	}
}
