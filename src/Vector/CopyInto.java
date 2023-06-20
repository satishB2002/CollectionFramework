package Vector;

import java.util.Vector;

public class CopyInto {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(100);
	vb.add(200);
	vb.add(300);
	
	Object []a=new Object[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	System.out.println("Orignal Array");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	vb.copyInto(a);
	System.out.println("copyInto Array");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	
}
}
