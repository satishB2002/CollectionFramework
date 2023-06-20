package Tree_Set;

public class Employee_Encapsulated_Class {
private Integer Id;
private String Str;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getStr() {
	return Str;
}
public void setStr(String str) {
	Str = str;
}
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
private Double Salary;
public Employee_Encapsulated_Class(Integer id, String str, Double salary) {
	super();
	Id = id;
	Str = str;
	Salary = salary;
}
@Override
public String toString() {
	return Id+"         "+"           "+ Str + "             " + Salary ;
}

}
