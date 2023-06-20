package LinkedListAssignment25jan;

import java.util.LinkedList;

public class Q17 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add('A');
	lk.add('B');
	lk.add('C');
	lk.add('D');
	LinkedList lj=new LinkedList();
	lj.add('E');
	lj.add('F');
	lj.add('G');
	lj.add('H');
	lj.addAll(lk);
	System.out.println(lj);
}
}
