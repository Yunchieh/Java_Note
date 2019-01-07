package cn.sxt.oo2;

/**
 * 继承树追溯
 * @author Yunjie
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象···");
		new ChildClass02();
	}
}
class FatherClass02{
	public FatherClass02() {
//		super();
		System.out.println("创建FatherClass");
	}
}
class ChildClass02 extends FatherClass02{
	public ChildClass02() {
//		super();
		System.out.println("创建ChildClass");
	}
}

