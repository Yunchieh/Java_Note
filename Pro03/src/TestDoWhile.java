/**
 * 测试do-while循环结构
 * @author Yunjie
 *
 */
public class TestDoWhile {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i; // sum = sum + i
			i++;
		}while(i<=100);//此处的分号不能省略
		System.out.println("Sum=" + sum);
		
		 //while循环：先判断再执行
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }
        System.out.println("-----");
        //do-while循环：先执行再判断
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 0);
	}

}
