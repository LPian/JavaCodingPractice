/** 
* @Author lupian
* @Time 2018��8��24�� ����10:58:57 
* <p>Description:</p>
*/
package BitOperation;
/*
 * �ж�һ�����Ƿ���2��n�η�
 * ˼·��ֻ��һ��1 8��1000  7��0111   
 * n��n-1��ÿһλ����һ��
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
