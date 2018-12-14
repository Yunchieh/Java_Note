import java.util.*;
/**
 * if-else if-else多选择结构
 * @author Yunjie
 *
 */
public class TestIfElseIfElse {
	public static void main(String[] args) {
		int age = (int)(Math.random() * 100);
        System.out.print("年龄是" + age + "，属于");
		if (age < 15) {
            System.out.println("儿童， 喜欢玩！");
        } else if (age < 25) {
            System.out.println("青年， 要学习！");
        } else if (age < 45) {
            System.out.println("中年， 要工作！");
        } else if (age < 65) {
            System.out.println("中老年， 要补钙！");
        } else if (age < 85) {
            System.out.println("老年， 多运动！");
        } else {
            System.out.println("老寿星， 古来稀！");
        }
		
		int score = (int)(Math.random() * 100);
		System.out.print("分数是" + score + "，评分");
		if (score < 60) {
			System.out.println("D，要奋起直追了！");
		}else if (score < 70) {
			System.out.println("C，再加把劲！");
		}else if (score < 85) {
			System.out.println("B，离最高分不远了~");
		}else {
			System.out.println("A，戒骄戒躁继续努力！");
		}		
	}

}
