
package LinkedList;



public class LinkedList {
	
	Node head=null;
	
	/*
	 * ����������
	 */
	public void add(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	/*
	 * ɾ���ڵ�
	 * ɾ����index���ڵ�
	 * �ɹ�����true,ʧ�ܷ���false
	 */
	public Boolean delete(int index) {
		//���жϽڵ�λ���Ƿ����
		if(index<1||index>length()) return false;
		//ɾ��ͷ�ڵ�
		if(index==1) {
			head=head.next;
			return true;
		}
		//������� ɾ����6���ڵ㣬Ҫ�ҵ���5���ڵ�
		int i=2;
		Node preNode=head;
		Node curNode=preNode.next;
		while(curNode!=null) {
			if(i==index) {
				preNode.next=curNode.next;
				return true;
			}
			preNode=curNode;
			curNode=curNode.next;
			i++;
	 }
	 return true;
	 }
		
	/*
	 * ����������
	 */
	public int length() {
		
		Node temp=head;
		int x=0;
		while(temp!=null) {
			x++;
			temp=temp.next;
			
		}
		return x;
	}
	
	/*
	 * �������������
	 */
	public void sort() {
		Node cur=head;
		int temp;
		Node nextnode;
		while (cur.next!=null) {
			nextnode=cur.next;
			while (nextnode.next!=null) {
				if(cur.val>nextnode.val) {
					temp=cur.val;
					cur.val=nextnode.val;
					nextnode.val=temp;
				}
				nextnode=nextnode.next;
			}
			cur=cur.next;
		}
	}
	
	/*
	 * ��ӡ
	 */
	public void print() {
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
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
		
		
	}
	
}
