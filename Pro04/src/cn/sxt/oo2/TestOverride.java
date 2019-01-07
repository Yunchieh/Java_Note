package cn.sxt.oo2;

/**
 * 测试重写
 * @author Yunjie
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Horse();
		Vehicle v3 = new Plane();
		v1.run();
		v2.run();
		v2.stop();
		v3.run();
		v3.stop();
	}
}


class Vehicle{ //交通工具类
	public void run() {
		System.out.println("跑···");
	}
	public void stop() {
		System.out.println("停止！");
	}
}

class Horse extends Vehicle{//马也是交通工具
	public void run() {//重写父类方法
		System.out.println("四蹄翻飞，嘚嘚嘚···");
	}
}	
class Plane extends Vehicle{
	public void run() {
		System.out.println("飞机起飞呜呜呜");
	}
	public void stop() {
		System.out.println("天上不能停·扑通掉下来");
	}
}


