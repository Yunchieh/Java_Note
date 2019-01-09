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
	
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	int planeX = 250,planeY = 250;
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) { //自动被调用；g相当于一支画笔
		
	    g.drawImage(bg, 0, 0, null);
	    g.drawImage(plane, planeX, planeY, null);
	    planeX++;
	    
	}
	
	//帮助我们反复的重画窗口
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			while(true) {
				System.out.println("窗口重画一次！");
				repaint(); //重画
				
				try {
					Thread.sleep(40); //1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
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
		
		new PaintThread().start();
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}  
}
