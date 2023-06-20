package StreamInterface;



public class Encapsulation_class {
private Integer Id;
private String Name	;
private Double Sal;
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
public Encapsulation_class(Integer id, String name, Double sal) {
	super();
	Id = id;
	Name = name;
	Sal = sal;
}
@Override
public String toString() {
	return "Encapsulation_class [Id=" + Id + ", Name=" + Name + ", Sal=" + Sal + "]";
}





}
