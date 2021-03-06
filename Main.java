package LikeWeKnewIt;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Main {
	public static void main(String args[]) {
		
		ImageIcon Image_One = new ImageIcon("/Red.png");
		ImageIcon Image_Two = new ImageIcon("/Blue.png");
		
		final JFrame launcherFrame = new JFrame();
		String launcherTitle = "Like We Knew It";
	
		JLabel launcherLabel = new JLabel("Like We Knew It");
		launcherLabel.setFont(new Font("Serif",Font.ITALIC,36));
		launcherLabel.setForeground(Color.WHITE);
		
		JButton Start = new JButton("Start");
		Start.setSize(new Dimension(250,50));
		Start.setLocation(320,150);
		
		JButton Options = new JButton("Options");
		Options.setSize(new Dimension(250,50));
		Options.setLocation(320,200);
		
		JButton Exit = new JButton("Exit");
		Exit.setSize(new Dimension(250,50));
		Exit.setLocation(320,250);
		
		final JTextField UserName = new JTextField("UserName");
		UserName.setSize(250,50);
		UserName.setLocation(320,300);
		
		launcherFrame.setTitle(launcherTitle);
		launcherFrame.setSize(900, 500);
		launcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launcherFrame.setVisible(true);
		launcherFrame.getContentPane().setBackground(Color.DARK_GRAY);
		launcherFrame.getContentPane().add(launcherLabel);
		
		launcherLabel.setSize(300,36);
		launcherLabel.setLocation(325,20);
		launcherLabel.setVisible(true);
		
		launcherFrame.getContentPane().add(Start);
		Start.setVisible(true);
		
		final JFrame gameFrame = new JFrame();
		String gameTitle = "Like We Knew It";
		
		gameFrame.setTitle(gameTitle);
		gameFrame.setSize(900, 500);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(false);
		gameFrame.getContentPane().setBackground(Color.WHITE);

		final int Score = 0;
		
		final JLabel ScoreNumber = new JLabel("" + Score);
		ScoreNumber.setFont(new Font("Serif",Font.ITALIC,36));
		ScoreNumber.setForeground(Color.WHITE);
		
		final JButton Button_One = new JButton("FIVE");
		Button_One.setPreferredSize(new Dimension(100,100));
		Button_One.setLocation(100,200);
		Button_One.setVisible(true);
		
		final JButton Button_Two = new JButton("TEN");
		Button_Two.setPreferredSize(new Dimension(100,100));
		Button_Two.setLocation(100, 300);
		
		final JButton Button_Three = new JButton("FIFTY");
		Button_Three.setPreferredSize(new Dimension(100,100));
		Button_Three.setLocation(100,500);
		Button_Three.setVisible(true);
	
		final JPanel MainPanel = new JPanel();
		 MainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	     MainPanel.add(Button_One);
	     MainPanel.add(Button_Two);
	     MainPanel.add(Button_Three);
	     MainPanel.add(ScoreNumber);
	     
	     Button_One.addActionListener(new ActionListener() {
			  
	            public void actionPerformed(ActionEvent e)
	            {
	            MainPanel.setBackground(Color.MAGENTA);
	            }      
	        });      
	     
	     Button_Two.addActionListener(new ActionListener() {
			  
	            public void actionPerformed(ActionEvent e)
	            {
	            MainPanel.setBackground(Color.BLUE);
	            }      
	        });    
	     
	     Button_Three.addActionListener(new ActionListener() {
			  
	            public void actionPerformed(ActionEvent e)
	            {
	            MainPanel.setBackground(Color.CYAN);
	            }      
	        }); 
	     
	     MainPanel.getInputMap().put(KeyStroke.getKeyStroke("G"),
                 "Change");
	     
	     
		 Start.addActionListener(new ActionListener() {
			  
	            public void actionPerformed(ActionEvent e)
	            {
	              launcherFrame.setVisible(false);
	              
	              gameFrame.setVisible(true);
	            }      
	        });      
		
		launcherFrame.getContentPane().add(Options);
		Options.setVisible(true);
		
		launcherFrame.getContentPane().add(Exit);
		Exit.setVisible(true);
		
		  Exit.addActionListener(new ActionListener() {
			  
	            public void actionPerformed(ActionEvent e)
	            {
	               System.exit(0);
	            }
	        });      
		
		launcherFrame.getContentPane().add(UserName);
		UserName.setVisible(true);
		UserName.setHorizontalAlignment(JTextField.CENTER);	
		
		gameFrame.getContentPane().add(MainPanel);
		MainPanel.setBackground(Color.DARK_GRAY);	
	}  
}
	

	
