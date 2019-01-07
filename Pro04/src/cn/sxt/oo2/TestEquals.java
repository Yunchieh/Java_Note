package cn.sxt.oo2;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User u1 = new User(1000, "Yunjie", "123456");
		User u2 = new User(1000, "LaoR", "123456");
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		
		String str1 = new String("Hhht");
		String str2 = new String("Hhht");
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//True
	}

}
class User{
	int id;
	String name;
	String pwd;
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override//提供散列码，加与不加均可
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}