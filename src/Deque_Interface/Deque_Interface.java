package Deque_Interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Deque_Interface {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(147);
	ad.add(947);
	ad.add(347);
	ad.add(17);
	System.out.println(ad);
	System.out.println("Peek Method");
	System.out.println(ad.peek());
	System.out.println("Peekfirst Method");
	System.out.println(ad.peekFirst());
	System.out.println("PeekLast Method");
	System.out.println(ad.peekLast());
	System.out.println("Poll Method");
	System.out.println(ad.poll());
	System.out.println("PollFirst Method");
	System.out.println(ad.pollFirst());
	System.out.println("PollLast Method");
	System.out.println(ad.pollLast());


}
}