package UIKit.tests;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import AppKit.NSResponder;
import UIKit.UILabel;
import UIKit.UIView;
import UIKit.UIWindow;

import javax.swing.JLabel;

public class UIViewTest extends UIWindow {

	private static final long serialVersionUID = 1L;
	private UIView contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIViewTest frame = new UIViewTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIViewTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new UIView();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.BLACK);
		contentPane.alpha(0.8);
		setContentPane(contentPane);
		addKeyListener(new NSResponder() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				if(e.getKeyChar() == 'p')
					System.out.println("p");
			}
		});
		
		addMouseListener(new NSResponder() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				System.out.println("pr");
			}
		});
		
		JLabel lblHola = new UILabel("hola");
		contentPane.add(lblHola);
	}

}