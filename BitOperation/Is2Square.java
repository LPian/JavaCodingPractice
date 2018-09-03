/** 
* @Author lupian
* @Time 2018年8月24日 上午10:58:57 
* <p>Description:</p>
*/
package BitOperation;
/*
 * 判断一个数是否是2的n次方
 * 思路：只有一个1 8：1000  7：0111   
 * n和n-1的每一位都不一样
 */
public class Is2Square {
	public static void main(String[] args) {
		int a=9;
		int b=8;
		System.out.println(is(a));
		System.out.println(is(b));
	}
	public static boolean is(int n) {
		int m=n&(n-1);
		if(m==0) {
			return true;
		}else {
			return false;
		}
		
	}
}
