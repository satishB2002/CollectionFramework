package Assignment_PAttern_Stream;
//Student name , course , class
public class Q_11_Enc {
private String name;
private String course;
private Integer standard;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Integer getStandard() {
	return standard;
}
public void setStandard(Integer standard) {
	this.standard = standard;
}
public Q_11_Enc(String name, String course, Integer standard) {
	super();
	this.name = name;
	this.course = course;
	this.standard = standard;
}
@Override
public String toString() {
	
	return  name +"       " + course +"        "+ standard ;
}

}
