/**
 * 测试方法的基本使用
 * @author Yunjie
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c);
	}
	void printSxt() {
		System.out.println("高");
		System.out.println("富");
		System.out.println("帅");
	}	
	int add(int a,int b,int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum;	//return的两个作用：1.结束方法的运行 2.返回值
	}
	
}
