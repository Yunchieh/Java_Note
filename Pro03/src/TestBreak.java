/**
 * 测试循环语句中的break
 * @author Yunjie
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total = 0;//定义计数器
		System.out.println("Begin");
		while(true) {
			total++;
			int i = (int)Math.round(100 * Math.random());
			//当i = 88时退出循环
			if(i==88) {
				break;
			}
		}
		//输出循环的次数
		System.out.println("Game Over,used "+ total +" times");
	}

}
