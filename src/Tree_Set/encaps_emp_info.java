package Tree_Set;

public class encaps_emp_info {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public encaps_emp_info(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "encaps_emp_info [name=" + name + "]";
	}
	
}
