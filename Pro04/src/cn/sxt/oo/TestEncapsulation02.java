package cn.sxt.oo;

import cn.sxt.oo2.Human;

public class TestEncapsulation02 {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
//		h.name = "Yunjie";//name为default属性，不能被不同包的类访问
		
		h.sayAge();
	}
}

class Girl extends Human {
	void SayGood(){
		System.out.println(height);
	}
}