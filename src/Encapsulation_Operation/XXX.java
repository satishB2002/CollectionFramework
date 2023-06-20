package Encapsulation_Operation;

import java.util.Set;

import Weekly_test_14_feb.newthread;

public class XXX {
private int id;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
private String name;
private double sal;
public static void main(String[] args) {
	XXX s= new XXX( );
	s.setId(11);
	s.setName("bdhkb");
	s.setSal(1212.00);
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.sal);
}

}
