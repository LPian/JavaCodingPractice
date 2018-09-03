/** 
* @Author lupian
* @Time 2018年8月24日 上午11:08:12 
* <p>Description:</p>
*/
package BitOperation;

public class count1 {
public static void main(String[] args) {
	int a=7;
	int b=8;
	System.out.println(a+" "+numOf1(a));
	System.out.println(b+" "+numOf1(b));
	
}
public static int numOf1(int x) {
	int count=0;
	while (x!=0) {
		if((x&1)==1) {
			count++;
		}
		x=x>>1;
	}
	return count;
}
}
