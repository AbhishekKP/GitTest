public class Person{
	private String empid;
	private String name;
	private String age ;

	public void setAge(int age){
		this.age = age;
	}

	public void setEmpID(String empid){
		this.empid = empid;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getEmpID(){
		return empid;
	}
}
