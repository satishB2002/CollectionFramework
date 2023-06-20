package Encapsulation_Program;

public class Linked_Enc_Class {

	private String nAme;
	private Integer Id; ;
	private Float sAlary;
	public String getnAme() {
		return nAme;
	}
	public void setnAme(String nAme) {
		this.nAme = nAme;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Float getsAlary() {
		return sAlary;
	}
	public void setsAlary(Float sAlary) {
		this.sAlary = sAlary;
	}
	public Linked_Enc_Class(String nAme, Integer id, Float sAlary) {
		super();
		this.nAme = nAme;
		Id = id;
		this.sAlary = sAlary;
	}
	
}
