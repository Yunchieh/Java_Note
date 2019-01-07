/**
 * 测试递归
 * @author Yunjie
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
	a();	
	
	//递归：计算n!
	 long d1 = System.currentTimeMillis();  
     System.out.printf("%d阶乘的结果:%s%n", 10, factorial(10));
     long d2 = System.currentTimeMillis();
     System.out.printf("递归费时：%s%n", d2-d1);  //耗时：32ms
 }
 /** 求阶乘的方法*/
 static long  factorial(int n){
     if(n==1){//递归头
         return 1;
     }else{//递归体
         return n*factorial(n-1);//n! = n * (n-1)!
     }
     
     //使用循环求n!　
     long d3 = System.currentTimeMillis();
     int a = 10;
     int result = 1;
     while (a > 1) {
         result *= a * (a - 1);
         a -= 2;
     }
     long d4 = System.currentTimeMillis();
     System.out.println(result);
     System.out.printf("普通循环费时：%s%n", d4 - d3);
     }
	
 	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if(count<10) {
			a();
		}else {
			return;
		}
	}
	static void b() {
		System.out.println("b");
	}
}