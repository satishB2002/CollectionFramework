package Encapsulation_Operation;

public class Encapsulation_class_Data {
private String name;
private Integer id;
private Double sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public Encapsulation_class_Data(Integer id, String name, Double sal) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
}
@Override
public String toString() {
	return "Encapsulation_class_Data [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}



}
