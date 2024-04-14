package ite.computer_management.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ite.computer_management.controller.AddProductController;
import ite.computer_management.controller.ProductController;
import ite.computer_management.dao.ProductDAO;
import ite.computer_management.model.Product;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class AddProductView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField computerNameTxt;
	private JTextField computerCodeTxt;
	private JTextField brandTxt;
	private JTextField cpuTxt;
	private JTextField ramTxt;
	private JTextField vgaTxt;
	private JTextField screenSizeTxt;
	private JTextField priceTxt;
	private JTextField quantityTxt;
	private JLabel computerTypeLbl;
	private JTextField computerTypeTxt;
	private JLabel weightLbl;
	private JTextField weightTxt;
	private JLabel originLbl;
	private JTextField originTxt;
	public JLabel addLbl;
	public JLabel cancelLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductView frame = new AddProductView();
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
	public AddProductView() {
		AddProductController addProductController = new AddProductController(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLbl = new JLabel("ADD COMPUTER");
		titleLbl.setFont(new Font("Tahoma", Font.PLAIN, 21));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setBounds(0, 0, 1010, 139);
		titleLbl.setBackground(Color.gray);
		titleLbl.setOpaque(true);
		contentPane.add(titleLbl);
		
		JLabel computerNameLbl = new JLabel("Computer Name");
		computerNameLbl.setBackground(Color.gray);
		computerNameLbl.setOpaque(true);
		computerNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		computerNameLbl.setBounds(27, 159, 217, 41);
		contentPane.add(computerNameLbl);
		
		JLabel computerCodeLbl = new JLabel("Computer Code");
		computerCodeLbl.setOpaque(true);
		computerCodeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		computerCodeLbl.setBackground(Color.gray);
		computerCodeLbl.setBounds(409, 159, 217, 41);
		contentPane.add(computerCodeLbl);
		
		JLabel brandLbl = new JLabel("Brand");
		brandLbl.setOpaque(true);
		brandLbl.setHorizontalAlignment(SwingConstants.CENTER);
		brandLbl.setBackground(Color.gray);
		brandLbl.setBounds(761, 159, 217, 41);
		contentPane.add(brandLbl);
		
		JLabel cpuLbl = new JLabel("CPU");
		cpuLbl.setOpaque(true);
		cpuLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cpuLbl.setBackground(Color.gray);
		cpuLbl.setBounds(27, 262, 217, 41);
		contentPane.add(cpuLbl);
		
		JLabel ramLbl = new JLabel("RAM");
		ramLbl.setOpaque(true);
		ramLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ramLbl.setBackground(Color.gray);
		ramLbl.setBounds(409, 262, 217, 41);
		contentPane.add(ramLbl);
		
		JLabel vgaLbl = new JLabel("VGA");
		vgaLbl.setOpaque(true);
		vgaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		vgaLbl.setBackground(Color.gray);
		vgaLbl.setBounds(761, 262, 217, 41);
		contentPane.add(vgaLbl);
		
		JLabel screenSizeLbl = new JLabel("Screen Size");
		screenSizeLbl.setOpaque(true);
		screenSizeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		screenSizeLbl.setBackground(Color.gray);
		screenSizeLbl.setBounds(27, 362, 217, 41);
		contentPane.add(screenSizeLbl);
		
		JLabel priceLbl = new JLabel("Price");
		priceLbl.setOpaque(true);
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBackground(Color.gray);
		priceLbl.setBounds(409, 362, 217, 41);
		contentPane.add(priceLbl);
		
		JLabel quantityLbl = new JLabel("Quantity");
		quantityLbl.setOpaque(true);
		quantityLbl.setHorizontalAlignment(SwingConstants.CENTER);
		quantityLbl.setBackground(Color.gray);
		quantityLbl.setBounds(761, 362, 217, 41);
		contentPane.add(quantityLbl);
		
		computerNameTxt = new JTextField();
		computerNameTxt.setBounds(27, 201, 217, 41);
		contentPane.add(computerNameTxt);
		computerNameTxt.setColumns(10);
		
		computerCodeTxt = new JTextField();
		computerCodeTxt.setColumns(10);
		computerCodeTxt.setBounds(409, 201, 217, 41);
		contentPane.add(computerCodeTxt);
		
		brandTxt = new JTextField();
		brandTxt.setColumns(10);
		brandTxt.setBounds(761, 201, 217, 41);
		contentPane.add(brandTxt);
		
		cpuTxt = new JTextField();
		cpuTxt.setColumns(10);
		cpuTxt.setBounds(27, 299, 217, 41);
		contentPane.add(cpuTxt);
		
		ramTxt = new JTextField();
		ramTxt.setColumns(10);
		ramTxt.setBounds(409, 299, 217, 41);
		contentPane.add(ramTxt);
		
		vgaTxt = new JTextField();
		vgaTxt.setColumns(10);
		vgaTxt.setBounds(761, 299, 217, 41);
		contentPane.add(vgaTxt);
		
		screenSizeTxt = new JTextField();
		screenSizeTxt.setColumns(10);
		screenSizeTxt.setBounds(27, 400, 217, 41);
		contentPane.add(screenSizeTxt);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(409, 400, 217, 41);
		contentPane.add(priceTxt);
		
		quantityTxt = new JTextField();
		quantityTxt.setColumns(10);
		quantityTxt.setBounds(761, 400, 217, 41);
		contentPane.add(quantityTxt);
		
		computerTypeLbl = new JLabel("Computer Type");
		computerTypeLbl.setOpaque(true);
		computerTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		computerTypeLbl.setBackground(Color.GRAY);
		computerTypeLbl.setBounds(27, 467, 217, 41);
		contentPane.add(computerTypeLbl);
		
		computerTypeTxt = new JTextField();
		computerTypeTxt.setColumns(10);
		computerTypeTxt.setBounds(27, 508, 217, 41);
		contentPane.add(computerTypeTxt);
		
		weightLbl = new JLabel("Weight");
		weightLbl.setOpaque(true);
		weightLbl.setHorizontalAlignment(SwingConstants.CENTER);
		weightLbl.setBackground(Color.GRAY);
		weightLbl.setBounds(409, 467, 217, 41);
		contentPane.add(weightLbl);
		
		weightTxt = new JTextField();
		weightTxt.setColumns(10);
		weightTxt.setBounds(409, 508, 217, 41);
		contentPane.add(weightTxt);
		
		originLbl = new JLabel("Origin");
		originLbl.setOpaque(true);
		originLbl.setHorizontalAlignment(SwingConstants.CENTER);
		originLbl.setBackground(Color.GRAY);
		originLbl.setBounds(761, 467, 217, 41);
		contentPane.add(originLbl);
		
		originTxt = new JTextField();
		originTxt.setColumns(10);
		originTxt.setBounds(761, 508, 217, 41);
		contentPane.add(originTxt);
		
		addLbl = new JLabel("ADD PRODUCT");
		addLbl.setBackground(Color.GREEN);
		addLbl.setOpaque(true);
		addLbl.setForeground(Color.white);
		addLbl.setHorizontalAlignment(SwingConstants.CENTER);
		addLbl.setBounds(281, 569, 141, 41);
		addLbl.addMouseListener(addProductController);
		contentPane.add(addLbl);
		
		cancelLbl = new JLabel("Cancel");
		cancelLbl.setBackground(Color.red);
		cancelLbl.setOpaque(true);
		cancelLbl.setForeground(Color.white);
		cancelLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cancelLbl.setBounds(557, 569, 141, 41);
		cancelLbl.addMouseListener(addProductController);
		contentPane.add(cancelLbl);
		
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		setVisible(true);
	}
	
	public void clickAddLbl() {
		String computerName = computerNameTxt.getText();
		String computerCode = computerCodeTxt.getText();
		String brand = brandTxt.getText();
		String cpu = cpuTxt.getText();
		int ram = Integer.parseInt(ramTxt.getText());
		String vga = vgaTxt.getText();
		Double price = Double.parseDouble( priceTxt.getText());
		int quantity = Integer.parseInt(quantityTxt.getText());
		String computerType = computerTypeTxt.getText();
		Double weight = Double.parseDouble(weightTxt.getText());
		String origin = originTxt.getText();
		Double screenSize = Double.parseDouble(screenSizeTxt.getText());
		
		Product com = new Product(computerName, computerCode, brand, price, cpu, ram, vga,
				screenSize,weight , computerType, origin, quantity);
		
		ProductDAO productdao = new ProductDAO();
		productdao.insert(com);
		
		//front-end
		String[] rowData = {computerName, computerCode, brand, String.valueOf(price), cpu, String.valueOf(ram), vga, String.valueOf(screenSize), String.valueOf(weight), computerType, origin, String.valueOf(quantity)};
		ProductView.model.addRow(rowData);
	}
	public void clickCancelLbl() {
		this.dispose();
	}
	
}


