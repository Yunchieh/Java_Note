/**
 * 测试嵌套循环
 * @author Yunjie
 *
 */
public class TestWhileQiantao {
	public static void main(String[] args) {
		
		for(int i=1;i <= 5;i++) {
			for(int j=1;j <= 5;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println("#################");
		
		for(int n = 1;n<=9;n++){
			for(int i = 1;i<=n;i++){
				System.out.print(i + "*" + n + "=" + n*i + " ");
				}
			System.out.println();
		}
		
		System.out.println("#################");
		//用while循环分别计算100以内的奇数及偶数的和，并输出。
		int Sum1 = 0;
		int Sum2 = 0;
		for (int a = 0; a <= 100 ; a++) {
			if(a%2 != 0){
				Sum1 += a;
			}else {
				Sum2 += a;
			}
		}
		System.out.println("Sum1 = "+Sum1);
		System.out.println("Sum2 = "+Sum2);
		
	}
}
