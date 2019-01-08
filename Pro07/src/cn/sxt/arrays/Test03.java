package cn.sxt.arrays;

public class Test03 {
	public static void main(String[] args) {
        int[] a = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    System.out.println("#################");
	
	//foreach数组循环用于读取数组元素的值，不能修改元素的值
	for(int m:a) {
		System.out.println(m);
	}

}
}
