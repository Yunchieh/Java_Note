/**
 * 测试for循环
 * @author Yunjie
 *
 */
public class TestFor {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);		
		/*
			int i = 1;
			int sum = 0;
			
			while(i<=100){
				sum = i + sum;
				i++;
			}
		*/
		
		/**
		 * 1.执行初始化语句
		 * 2.判断i<=100为true
		 * 3.执行循环体
		 * 4.步进迭代i++
		 * 5.回到第二步继续判断
		 */
		
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
	        System.out.println("i= " + i + " j= " + j); 
	       }

		for ( ; ; ) {    // 无限循环: 相当于 while(true)
            System.out.println("爱你一万年");
        }
		
		

	}

}
