package Tree_Set;

public class Sorting_Practice implements Comparable<Sorting_Practice> {
private Integer Id;
private String name	;
private Double sal	;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Sorting_Practice [Id=" + Id + ", name=" + name + ", sal=" + sal + "]";
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public Sorting_Practice(Integer id, String name, Double sal) {
	super();
	Id = id;
	this.name = name;
	this.sal = sal;
}

public int compareTo(Sorting_Practice o) {
	
	return this.getSal().compareTo(o.getSal());
}



}
