package wild1;

public class Animals2 {

	private String name;
	 private int id;

	public Animals2(int id, String name) {
		this.id=id;
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id1) {
		this.id = id1;
	}

	@Override
	public String toString() {
		return "Animals2 [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
