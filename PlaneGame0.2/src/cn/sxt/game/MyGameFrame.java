package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author Yunjie
 *
 */
public class MyGameFrame extends JFrame {
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) { //自动被调用；g相当于一支画笔
		
		super.paint(g); //调用父类方法先绘制一个背景
		Color c = g.getColor();
		Font f = g.getFont();
		g.setColor(Color.BLUE);
		
		//从坐标点(100,50)到(400,400)画出直线
	    g.drawLine(100, 50, 400, 400); 
	    //画出矩形。矩形左上角顶点坐标(100,50)，宽度300，高度300
	    g.drawRect(100, 50, 300, 300);  
	    //矩形左上角顶点坐标(100,50)，宽度300，高度300
	    g.drawOval(100, 50, 300, 300);
	    //画出实心矩形。矩形左上角顶点坐标(100,50)，宽度40，高度40
	    g.fillRect(100, 50, 40, 40);
	    //设定线条颜色——红色
	    g.setColor(Color.red);
	    //设定字体——微软雅黑；加粗；50
	    g.setFont(new Font("微软雅黑",Font.BOLD,50));
	    //写下文本“喵喵喵”，坐标(200,200)
	    g.drawString("喵喵喵", 200, 200);
	    //显示图像“ball”，坐标(200,200)
	    g.drawImage(ball, 200, 200, null);
	    //恢复初始颜色及字体
	    g.setColor(c);
	    g.setFont(f);
	}
	
	
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("尚学堂学员_Yunjie作品");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(700, 300);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}  
}
