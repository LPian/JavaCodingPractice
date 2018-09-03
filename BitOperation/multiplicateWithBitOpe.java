/** 
* @Author lupian
* @Time 2018年8月24日 上午10:39:07 
* <p>Description:</p>
*/
package BitOperation;

public class multiplicateWithBitOpe {
	public static void main(String[] args) {
		int a=3;
		
		System.out.println(yiweicheng(a, 4));
	}
	public static int yiweicheng(int x,int n) {
	/*	for(int i=1;i<=n;i++) {
			x=x<<1;
		}*/
		return x<<n;
	}
}
