
package LinkedList;



public class LinkedList {
	
	Node head=null;
	
	/*
	 * 增，建链表
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
	 * 删除节点
	 * 删除第index个节点
	 * 成功返回true,失败返回false
	 */
	public Boolean delete(int index) {
		//先判断节点位置是否合理
		if(index<1||index>length()) return false;
		//删除头节点
		if(index==1) {
			head=head.next;
			return true;
		}
		//其他情况 删除第6个节点，要找到第5个节点
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
	 * 返回链表长度
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
	 * 对链表进行排序
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
	 * 打印
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
		System.out.println("初始：");
		list.print();
		/*System.out.println("删除重复节点后：");
		list.deleteRepete();
		list.print();
		list.findK(0);
		list.findK(1);
		list.findK(4);
		list.findK(7);*/
		/*list.revese();
		System.out.println("链表反转后顺序为：");*/
		//list.printFormEnd();
		
		
	}
	
}
