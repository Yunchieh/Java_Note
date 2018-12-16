/**
 * 测试while循环
 * @author Yunjie
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+···+100的累加的和，5050
		//暴力！
		int i = 1;
		int sum = 0;
		
		while(i<=100){
			sum = i + sum;
			i++;
		}
		
		/**
		 * 1.执行初始化语句
		 * 2.判断i<=100为true
		 * 3.执行循环体
		 * 4.步进迭代i++
		 * 5.回到第二步继续判断
		 */
		
		System.out.println(sum);
	}

}
