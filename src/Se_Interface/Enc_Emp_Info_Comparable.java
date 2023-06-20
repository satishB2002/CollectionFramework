package Se_Interface;
//WAP to store employee information in hashset like id,name,salary sort the employee by salary using comparable.*/
public class Enc_Emp_Info_Comparable implements Comparable<Enc_Emp_Info_Comparable>{
private Integer Id;
private String  Name;
private Double Salary;

public Enc_Emp_Info_Comparable(Integer id, String name, Double salary) {
	super();
	Id = id;
	Name = name;
	Salary = salary;
}
@Override
public String toString() {
	return   Id  +"  "+ Name +" "+ Salary;
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
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
@Override
public int compareTo(Enc_Emp_Info_Comparable o) {
	// TODO Auto-generated method stub
	return o.getSalary().compareTo(o.getSalary());
}


}
