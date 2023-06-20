package Assignment_PAttern_Stream;

import java.util.ArrayList;
import java.util.List;

//Write a program to convert List to Array. class and object, return list
public class Q10 {
public static void main(String[] args) {
	List ls=new ArrayList<>(); 
		ls.add(111);
		ls.add(121);
		ls.add(131);
		ls.add(141);
		ls.add(151);
		Object []obj=ls.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
}
}
