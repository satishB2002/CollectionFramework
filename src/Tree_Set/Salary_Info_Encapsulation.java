package Tree_Set;

public class Salary_Info_Encapsulation {
private Double Salary;

public Double getSalary() {
	return Salary;
}

public void setSalary(Double salary) {
	Salary = salary;
}

@Override
public String toString() {
	return "        " + Salary ;
}

public Salary_Info_Encapsulation(Double salary) {
	super();
	Salary = salary;
}


}
