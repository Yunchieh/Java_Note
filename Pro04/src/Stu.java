class Computer{
	String brand;
}

public class Stu {
	
	//属性field
	int id;
	String sname;
	int age;
	
	Computer comp;//计算机
	
	//方法
	void study() {
		System.out.println("我在认真学习！"+ "电脑是" + comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏！王者农药！");
	}
	//构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创建
	Stu(){
		
	}
	
	//程序执行入口，必须要有
	public static void main(String[] args) {
		Stu stu = new Stu();//创建一个对象
		stu.id = 9527;
		stu.sname = "Yunjie";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
	}
	

}
