package cn.sxt.gao;

import cn.sxt.oo.User;//表示导入了User类

import java.util.Date;
import java.sql.*;

import static java.lang.Math.*;

public class Test {
	public static void main(String[] args) {
//		cn.sxt.oo.User user = new cn.sxt.oo.User();
		User user = new User();
		String string;
		
		java.util.Date date = new Date();//遇到多个同名类，直接指出类名
		
		System.out.println(Math.PI);
		System.out.println(PI);
	}

}
