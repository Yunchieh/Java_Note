package cn.sxt.oo2;

/**
 * 测试继承
 * @author Yunjie
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student("Yunjie",185,"Java");
		stu.rest();
		stu.study();
		
		Student stu2 = new Student("张三", 160,"挖掘机专业");
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person /*extend Object*/{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会儿！");
	}
}

class Student extends Person{

	String major;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
}