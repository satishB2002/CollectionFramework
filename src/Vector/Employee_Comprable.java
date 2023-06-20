package Vector;

public class Employee_Comprable implements Comparable<Employee_Comprable>{
private Integer Id;
private String  Name;
private Double Sal;
public int compareTo(Employee_Comprable o) {
	// TODO Auto-generated method stub
	
	return this.getSal().compareTo(o.getSal());
	
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
public Employee_Comprable(Integer id, String name, Double sal) {
	super();
	Id = id;
	Name = name;
	Sal = sal;
}
@Override
public String toString() {
	return "Employee_Comprable [Id=" + Id + ", Name=" + Name + ", Sal=" + Sal + "]";
}



}
