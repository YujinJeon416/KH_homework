package ncs.test8;

public class User {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public User() {}
	
	
	@Override
	public boolean equals(Object obj) {
		User other = (User)obj;
		if(id.equals(other.getId()) &&
		   password.equals(other.getPassword()) &&
		   name.equals(other.getName()) &&
		   age == other.getAge() &&
		   gender == other.getGender() &&
		   phone.equals(other.getPhone())) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	protected Object clone() {
		User u = new User(id,password,name,age,gender,phone);
		return u;
	}
	@Override
	public String toString() {
		return id+" "+password+" "+name+" "+age+" "+gender+" "+phone;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
