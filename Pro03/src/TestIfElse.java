import java.awt.geom.PathIterator;

/**
 * 测试IfElse双选择结构
 * @author Yunjie               
 *
 */
public class TestIfElse {
	public static void main(String[] args) {
		//随机产生一个[0.0,4.0)区间的半径，并根据半径求圆的面积和周长
		double r = 4 * Math.random();
		//Math.pow(r,2)求半径r的平方
		double area = Math.PI * Math.pow(r, 2);
		double circle = 2 * Math.PI * r;
		System.out.println("半径为："+ r);
		System.out.println("面积为： "+ area);
		System.out.println("周长为："+ circle);
		//如果面积>=周长，则输出“面积大于等于周长”，否则，“周长大于面积”
		if(area >= circle){
			System.out.println("面积大于等于周长");
		}else {
			System.out.println("周长大于面积");
		}
		
		//条件运算符与if-else语句的互换
		
		//if-else语句版本
		int a = 1;
		int b = 2;
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//条件运算符版本
		int c = 1;
		int d = 2;
		System.out.println((c>d)?c:d);
	}

}
