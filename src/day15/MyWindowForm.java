package day15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 匿名內部類別在 JFrame(視窗) 上的應用
public class MyWindowForm {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("我的小小視窗");
		JButton button = new JButton("請點我");
		
		// 使用匿名內部類別來建立按鈕的點擊事件
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 使用 JOptionPane 來顯示對話框
				JOptionPane.showMessageDialog(frame, "按鈕被點擊了");
			}
		});
		
		frame.add(button); // 視窗內加入按鈕
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 按下視窗上的叉叉可以結束程式
		frame.setVisible(true); // 將視窗顯示

	}

}
