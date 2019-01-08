package cn.sxt.arrays;

/**
 * 测试数组的三种初始化方式
 * @author Yunjie
 *
 */

public class Test02 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {2,4,65};
		User[] b = {
				new User(1001, "张三"),
				new User(1002, "李四"),
				new User(1003, "王五"),
		};
		
		//默认初始化
		int[] b = new int[3];	//默认给数组的元素进行赋值，赋值的规则和成员变量默认赋值规则一样
	}
	
		//动态初始化
		int[] a1 = new int[2];//动态初始化数组，先分配空间；
		a1[0]=1;//给数组元素赋值；
		a1[1]=2;//给数组元素赋值；

}
