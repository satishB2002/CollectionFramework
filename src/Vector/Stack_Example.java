package Vector;

import java.util.Stack;

public class Stack_Example {
public static void main(String[] args) {
	Stack st=new Stack();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.pop();
	System.out.println(st);
	System.out.println(st.peek());
	System.out.println(st.firstElement());
	
}
}
