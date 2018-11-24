
/**
 * 测试字符类型
 * @author Yunjie
 *
 */
public class TestPrimitiveDataType3 {
	
	public static void main(String[] args) {
		char a = 'T';
		char b = '王';
		char c = '\u0061';
		System.out.println(c);
		
		//转义字符
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');  //a'b
		
		//String就是字符序列
		String d = "abc";
		
		boolean man = true;
		
		if(man){	//极端不推荐：man=true【因为经常会写错】
			System.out.println("男性");
		}
	}

}
