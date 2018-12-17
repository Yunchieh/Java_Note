
//用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。

public class Test {
	public static void main(String[] args) {
		 // 1.for
        for (int i = 1; i <= 1000; i++) { // 初始化变量 条件判断 改变变量
            // 循环操作
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                if (i % 15 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n===============================");

        // 2.while
        int j = 1; // 初始化变量
        while (j <= 1000) { // 条件判断
            // 循环操作
            if (j % 5 == 0) {
                System.out.print(j + "\t");
                if (j % 15 == 0) {
                    System.out.println();
                }
            }
            j++; // 改变变量
        }
        System.out.println("\n===============================");

        // 3.do0-while
        int k = 1; // 初始化变量
        do {
            // 循环操作
            if (k % 5 == 0) {
                System.out.print(k + "\t");
                if (k % 15 == 0) {
                    System.out.println();
                }
            }
            k++; // 改变变量
        } while (k <= 1000); // 条件判断
	}
}