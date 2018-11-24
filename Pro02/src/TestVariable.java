
/**
 *	测试变量
 * @author Yunjie
 *   
 */
public class TestVariable {
	
	int a;	//成员变量，会自动被初始化，属于对象
	static int size;	//静态变量，从属于类
	public static void main(String[] args) {
		
		{	
		int age;	//局部变量，从属于语句块；
		age = 18;
		}
		
		int salary = 3000;	//局部变量，从属于方法
		
		//变量必须赋值后使用,否则会编译报错"未初始化"
		int gao = 13;
		System.out.println(gao);
		
	}
}
