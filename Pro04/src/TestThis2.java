/**
 * this代表“当前对象”示例
 * @author Yunjie
 *
 */
public class TestThis2 {
	int id;        //id
    String name;   //账户名
    String pwd;   //密码
 
    public TestThis2() {
    }
    public TestThis2(int id, String name) {
        System.out.println("正在初始化已经创建好的对象："+this);
        this.id = id;   //不写this，无法区分局部变量id和成员变量id
        this.name = name;
    }
    public void login(){
        System.out.println(this.name+",要登录！");  //不写this效果一样
    }  
     
    public static void main(String[] args) {
    	TestThis2 u3 = new TestThis2(101,"高小七");
        System.out.println("打印高小七对象："+u3);
        u3.login();
    }
}
