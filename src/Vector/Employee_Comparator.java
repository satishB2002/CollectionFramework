package Vector;

import java.util.Comparator;

public class Employee_Comparator implements Comparable<Employee_Comparator>{
private Integer Id;
private String Name;
private Double Sal;


public int compare(Employee_Comparator o1) {
	
	 return this.getId().compareTo(o1.getId());
	// return this.getName().compareTo(o1.getName());
	
	 
}
public String toString() {
	return "Employee_Comparator [Id=" + Id + ", Name=" + Name + ", Sal=" + Sal + "]";
}
public Employee_Comparator(Integer id, String name, Double sal) {
	super();
	Id = id;
	Name = name;
	Sal = sal;
}

public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Double getSal() {
	return Sal;
}
public void setSal(Double sal) {
	Sal = sal;
}
@Override

public int compareTo(Employee_Comparator o) {
	// TODO Auto-generated method stub
	return 0;
}



}
