import javax.security.auth.login.LoginContext;

/**
 * 测试static关键字的用法
 * @author Yunjie
 *
 */
public class User2 {
	int id; //id
	String name; //账户名
	String pwd; //密码
	
	static String company = "呼和浩特"; //公司名称
	
	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("登录：" + name);
	}
	
	public static void printCompany() {
	//	Login(); //调用非静态成员，编译就会报错
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101, "Yunjie");
		User2.printCompany();
		User2.company = "Alibaba";
		User2.printCompany();
	}

}
