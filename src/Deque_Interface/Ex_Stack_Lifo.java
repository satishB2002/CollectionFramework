package Deque_Interface;

import java.util.Stack;

public class Ex_Stack_Lifo {

	public static void main(String[] args) {
		Stack ad1=new Stack();
		ad1.push(147);
		ad1.add(947);
		ad1.push(347);
		ad1.add(17);
		System.out.println(ad1);
		System.out.println("Peek Method");
		System.out.println(ad1.peek());
		System.out.println("Peekfirst Method");
		System.out.println(ad1.push(22));
		System.out.println(ad1);

	}

}
