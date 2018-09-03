/** 
* @Author lupian
* @Time 2018年8月23日 下午4:14:41 
* <p>Description:</p>
*/
package LinkedList;

import java.util.Hashtable;

public class test {
	/*
	 * 删除重复数据
	 * 思路：hashtable记录数据是否重复
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
		}*//*该方法不能将头节点存入table中*/
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
	 * 找到倒数第k个节点
	 * 思路：设置快慢指针，快指针先走k步
	 */
	public static Node findK(int index,Node head) {
		int k=index;
		
		if(index<1) {
			System.out.println("k不合法");
			return null;
		}
		Node fast=head;
		Node slow=head;
		while(index!=1&&fast!=null) {
			fast=fast.next;
			index--;
		}
		if(fast==null) {
			System.out.println("k不合法");
			return null;
		}
		while (fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		System.out.println("倒数第"+k+"个节点是："+slow.val);
		return slow;
	}
	
	/*
	 * 实现了链表的反转
	 * 思路：两个指针，一个在头一个在尾，相向交换链表数据  //end不能向前遍历！！！！！
	 * 思路2:逐个交换指向
	 */
	public void revese(Node head) {
		Node pNode=head;  //应将头节点定为考虑的第一个节点
		Node pre=null;  //使头节点反转后指向空，  
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
	 * 从尾到头输出单链表
	 * 思路：先反转，后输出
	 * 思路2：遍历链表，节点入栈，然后出栈
	 * 思路3：利用栈，递归
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
	 * 寻找单链表的中间节点
	 * 思路：快慢指针
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
	 * 检测一个链表是否有环
	 * 思路：快慢指针，是否相遇
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
	 * 不知头指针的情况下删除指定节点
	 * 思路：将该节点后一个节点的值给它，往后节点同样仅传递值 
	 * ////不用挨个调整，直接调整该节点与后继节点就行了！！！
	 */
	public static void deleteNode(Node p) {
		/*Node pre=p;
		Node nextNode=p.next;
		while (nextNode.next!=null) {
			pre.val=nextNode.val;
			pre=nextNode;
			nextNode=nextNode.next;
		}
		//删除最后一个节点
		pre.val=nextNode.val;
		pre.next=null;	*/
		
		if(p.next==null) {  //是尾节点
			System.out.println("是尾节点，无法删除！");
			return;
		}else {
			p.val=p.next.val;
			p.next=p.next.next;
	    }
	}
	
	/*
	 * 判断两个链表是否相交
	 * 思路：两个都遍历到尾节点，判断是否相等
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
		//System.out.println("中间节点是："+findMid(list.head));
		Node pNode=findK(1, list.head);
		deleteNode(pNode);
		System.out.println("删除指定节点后：");
		list.print();
	}
}
