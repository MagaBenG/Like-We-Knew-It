package LikeWeKnewIt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game {

	public static void main(String args[]) {

		JFrame launcherFrame = new JFrame();
		String launcherTitle = "Like We Knew It";
		
		launcherFrame.setTitle(launcherTitle);
		launcherFrame.setSize(900, 500);
		launcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launcherFrame.setVisible(true);
		launcherFrame.getContentPane().setBackground(Color.WHITE);
		
	}
}