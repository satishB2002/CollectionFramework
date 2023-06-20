package HashSet_pac;

public class Enc_Emp_Class implements Comparable<Enc_Emp_Class > {
private Integer id;
private String name;

private Double salary;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public Enc_Emp_Class(Integer id, String name, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

@Override
public int compareTo(Enc_Emp_Class o) {
	// TODO Auto-generated method stub
	return this.getId().compareTo(o.getId());
}

@Override
public String toString() {
	return "            " + id + "          " + name + "             "+salary;
}


}
