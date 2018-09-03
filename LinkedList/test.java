/** 
* @Author lupian
* @Time 2018��8��23�� ����4:14:41 
* <p>Description:</p>
*/
package LinkedList;

import java.util.Hashtable;

public class test {
	/*
	 * ɾ���ظ�����
	 * ˼·��hashtable��¼�����Ƿ��ظ�
	 */
	public void deleteRepete(Node head) {
		Node temp=head;
		Hashtable<Integer, Integer> table =new Hashtable<>();
		/*while(temp.next!=null) {
			Node pre=temp;
			temp=temp.next;
			if(table.containsKey(temp.val)) {
				pre.next=temp.next;
			}else {
				table.put(temp.val, 1);
			}
		}*//*�÷������ܽ�ͷ�ڵ����table��*/
		Node pre=null;
		while (temp!=null) {
			if(table.containsKey(temp.val)) {
				pre.next=temp.next;
			}else {
				table.put(temp.val, 1);
				pre=temp;
			}
			temp=temp.next;
		}
	}
	
	/*
	 * �ҵ�������k���ڵ�
	 * ˼·�����ÿ���ָ�룬��ָ������k��
	 */
	public static Node findK(int index,Node head) {
		int k=index;
		
		if(index<1) {
			System.out.println("k���Ϸ�");
			return null;
		}
		Node fast=head;
		Node slow=head;
		while(index!=1&&fast!=null) {
			fast=fast.next;
			index--;
		}
		if(fast==null) {
			System.out.println("k���Ϸ�");
			return null;
		}
		while (fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		System.out.println("������"+k+"���ڵ��ǣ�"+slow.val);
		return slow;
	}
	
	/*
	 * ʵ��������ķ�ת
	 * ˼·������ָ�룬һ����ͷһ����β�����򽻻���������  //end������ǰ��������������
	 * ˼·2:�������ָ��
	 */
	public void revese(Node head) {
		Node pNode=head;  //Ӧ��ͷ�ڵ㶨Ϊ���ǵĵ�һ���ڵ�
		Node pre=null;  //ʹͷ�ڵ㷴ת��ָ��գ�  
		Node after=null;
		while (pNode!=null) {
				after=pNode.next;
				if(after==null) {head=pNode;}
				pNode.next=pre;
				pre=pNode;
				pNode=after;
		}
	}
	
	/*
	 * ��β��ͷ���������
	 * ˼·���ȷ�ת�������
	 * ˼·2�����������ڵ���ջ��Ȼ���ջ
	 * ˼·3������ջ���ݹ�
	 */
	public static void printFormEnd(Node p) {
		/*revese();
		print();*/	
		if(p.next!=null) {
			printFormEnd(p.next);
		}
		System.out.print(p.val+" ");
	}
	
	/*
	 * Ѱ�ҵ�������м�ڵ�
	 * ˼·������ָ��
	 */
	public static int findMid(Node head) {
		Node fast=head;
		Node slow=head;
		while (fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.val;
	}
	
	/*
	 * ���һ�������Ƿ��л�
	 * ˼·������ָ�룬�Ƿ�����
	 */
	public static boolean isCircle(Node head) {
		Node fast=head;
		Node slow=head;
		if (fast==null) {
			return false;
		}
		while (fast!=null&&fast.next!=null) {
			if(fast==slow) return true;
			fast=fast.next.next;
			slow=slow.next;
		}
		return false;
	}
	
	/*
	 * ��֪ͷָ��������ɾ��ָ���ڵ�
	 * ˼·�����ýڵ��һ���ڵ��ֵ����������ڵ�ͬ��������ֵ 
	 * ////���ð���������ֱ�ӵ����ýڵ����̽ڵ�����ˣ�����
	 */
	public static void deleteNode(Node p) {
		/*Node pre=p;
		Node nextNode=p.next;
		while (nextNode.next!=null) {
			pre.val=nextNode.val;
			pre=nextNode;
			nextNode=nextNode.next;
		}
		//ɾ�����һ���ڵ�
		pre.val=nextNode.val;
		pre.next=null;	*/
		
		if(p.next==null) {  //��β�ڵ�
			System.out.println("��β�ڵ㣬�޷�ɾ����");
			return;
		}else {
			p.val=p.next.val;
			p.next=p.next.next;
	    }
	}
	
	/*
	 * �ж����������Ƿ��ཻ
	 * ˼·��������������β�ڵ㣬�ж��Ƿ����
	 * 
	 */
	public static void name(Node head,Node head2) {
		  
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("��ʼ��");
		list.print();
		/*System.out.println("ɾ���ظ��ڵ��");
		list.deleteRepete();
		list.print();
		list.findK(0);
		list.findK(1);
		list.findK(4);
		list.findK(7);*/
		/*list.revese();
		System.out.println("����ת��˳��Ϊ��");*/
		//list.printFormEnd();
		//System.out.println("�м�ڵ��ǣ�"+findMid(list.head));
		Node pNode=findK(1, list.head);
		deleteNode(pNode);
		System.out.println("ɾ��ָ���ڵ��");
		list.print();
	}
}
