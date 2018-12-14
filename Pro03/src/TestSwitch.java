/**
 * 测试switch语句
 * 遇到多值判断的时候，使用switch，当然，switch完全可以使用ifelseifelse代替
 * @author Yunjie
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
	        char c = 'a';
	        int rand = (int) (26 * Math.random());
	        char c2 = (char) (c + rand);
	        //a为固定数值，加随机数（0~25），得到a~z中的一个
	        System.out.print(c2 + ": ");
	        switch (c2) {
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	            System.out.println("元音");
	            break;
	        case 'y':
	        case 'w':
	            System.out.println("半元音");
	            break;
	        default:
	            System.out.println("辅音");
	        }
	    }

}
