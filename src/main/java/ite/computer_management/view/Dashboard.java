package ite.computer_management.view;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ite.computer_management.controller.ProductController;

import java.awt.Color; 
import java.awt.EventQueue;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;



public class Dashboard extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 249, 763);
		contentPane.add(panel);
		panel.setBackground(Color.black);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(254, 0, 1032, 783);
		contentPane.add(tabbedPane);
		
		ProductView productView = new ProductView();
		tabbedPane.addTab("Product Management", productView);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}

