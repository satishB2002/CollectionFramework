package Vector;
//7. Java program to remove an item from Vector collection at the specified index

import java.util.Vector;

public class Q7 {
public static void main(String[] args) {
Vector vb=new Vector();
vb.add(100);
vb.add(200);
vb.add(300);
vb.add(400);
vb.remove(2);
System.out.println(vb);
}
}
