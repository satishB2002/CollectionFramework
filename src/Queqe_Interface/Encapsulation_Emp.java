package Queqe_Interface;

public class Encapsulation_Emp {
	private String Name;
	private Integer Id;
private Double Sal;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public Double getSal() {
	return Sal;
}
public void setSal(Double sal) {
	Sal = sal;
}
public Encapsulation_Emp(Integer id, String name, Double sal) {
	super();
	Name = name;
	Id = id;
	Sal = sal;
}
@Override
public String toString() {
	return " " + Name + "  " + Id + "      " + Sal ;
}



}
