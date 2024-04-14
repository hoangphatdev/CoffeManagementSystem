package ite.computer_management.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ite.computer_management.controller.EditProductController;
import ite.computer_management.dao.ProductDAO;
import ite.computer_management.model.Product;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EditProductView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField computerNameTxt;
	public JTextField computerCodeTxt;
	public JTextField brandTxt;
	public JTextField priceTxt;
	public JTextField cpuTxt;
	public JTextField ramTxt;
	public JTextField vgaTxt;
	public JTextField screenSizeTxt;
	public JTextField weightTxt;
	public JTextField computerTypeTxt;
	public JTextField quantityTxt;
	public JTextField originTxt;
	public JButton cancelBtn;
	public JLabel originLbl ;
	public  JButton saveBtn;
	
	//-----
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EditProductView frame = new EditProductView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private ProductView productView;
	public EditProductView(ProductView productView) {
		this.productView = productView;
		EditProductController editProductController = new EditProductController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 987, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		computerNameTxt = new JTextField();
		computerNameTxt.setBounds(42, 37, 189, 41);
		contentPane.add(computerNameTxt);
		computerNameTxt.setColumns(10);
		
		computerCodeTxt = new JTextField();
		computerCodeTxt.setColumns(10);
		computerCodeTxt.setBounds(320, 37, 189, 41);
		contentPane.add(computerCodeTxt);
		
		brandTxt = new JTextField();
		brandTxt.setColumns(10);
		brandTxt.setBounds(633, 37, 189, 41);
		contentPane.add(brandTxt);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(42, 119, 189, 41);
		contentPane.add(priceTxt);
		
		cpuTxt = new JTextField();
		cpuTxt.setColumns(10);
		cpuTxt.setBounds(320, 119, 189, 41);
		contentPane.add(cpuTxt);
		
		ramTxt = new JTextField();
		ramTxt.setColumns(10);
		ramTxt.setBounds(633, 129, 189, 41);
		contentPane.add(ramTxt);
		
		vgaTxt = new JTextField();
		vgaTxt.setColumns(10);
		vgaTxt.setBounds(42, 213, 189, 41);
		contentPane.add(vgaTxt);
		
		screenSizeTxt = new JTextField();
		screenSizeTxt.setColumns(10);
		screenSizeTxt.setBounds(320, 213, 189, 41);
		contentPane.add(screenSizeTxt);
		
		weightTxt = new JTextField();
		weightTxt.setColumns(10);
		weightTxt.setBounds(633, 223, 189, 41);
		contentPane.add(weightTxt);
		
		computerTypeTxt = new JTextField();
		computerTypeTxt.setColumns(10);
		computerTypeTxt.setBounds(42, 304, 189, 41);
		contentPane.add(computerTypeTxt);
		
		quantityTxt = new JTextField();
		quantityTxt.setColumns(10);
		quantityTxt.setBounds(320, 304, 189, 41);
		contentPane.add(quantityTxt);
		
		originTxt = new JTextField();
		originTxt.setColumns(10);
		originTxt.setBounds(633, 304, 189, 41);
		contentPane.add(originTxt);
		
		JLabel computerNameLbl = new JLabel("Computer Name");
		computerNameLbl.setBounds(42, 11, 189, 22);
		contentPane.add(computerNameLbl);
		
		JLabel computerCodeLbl = new JLabel("Computer Code");
		computerCodeLbl.setBounds(320, 15, 189, 22);
		contentPane.add(computerCodeLbl);
		
		JLabel brandLbl = new JLabel("Brand");
		brandLbl.setBounds(633, 15, 189, 22);
		contentPane.add(brandLbl);
		
		JLabel priceLbl = new JLabel("Price");
		priceLbl.setBounds(42, 103, 189, 22);
		contentPane.add(priceLbl);
		
		JLabel cpuLbl = new JLabel("CPU");
		cpuLbl.setBounds(320, 103, 189, 22);
		contentPane.add(cpuLbl);
		
		JLabel ramLbl = new JLabel("RAM");
		ramLbl.setBounds(633, 107, 189, 22);
		contentPane.add(ramLbl);
		
		JLabel vgaLbl = new JLabel("VGA");
		vgaLbl.setBounds(42, 192, 189, 22);
		contentPane.add(vgaLbl);
		
		JLabel screenSizeLbl = new JLabel("Screen Size");
		screenSizeLbl.setBounds(320, 196, 189, 22);
		contentPane.add(screenSizeLbl);
		
		JLabel weightLbl = new JLabel("Weight");
		weightLbl.setBounds(633, 196, 189, 22);
		contentPane.add(weightLbl);
		
		JLabel computerTypeLbl = new JLabel("Computer Type");
		computerTypeLbl.setBounds(42, 279, 189, 22);
		contentPane.add(computerTypeLbl);
		
		JLabel quantityLbl = new JLabel("Quantity");
		quantityLbl.setBounds(320, 271, 189, 22);
		contentPane.add(quantityLbl);
		
		saveBtn = new JButton("Save");
		saveBtn.setBounds(291, 469, 115, 41);
		saveBtn.addMouseListener(editProductController);
		contentPane.add(saveBtn);
		
		cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(561, 469, 115, 41);
		cancelBtn.addMouseListener(editProductController);
		contentPane.add(cancelBtn);
		
		originLbl = new JLabel("Origin");
		originLbl.setBounds(633, 283, 189, 22);
		contentPane.add(originLbl);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void clickSaveBtn() {
		int selectedRowIndex = this.productView.table.getSelectedRow();
		String conditionComputerCode = (String) this.productView.table.getValueAt(selectedRowIndex, 1);
		
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
		
		
		ProductDAO.getInstance().update(com, conditionComputerCode);
		
		//front-end
		
	}
	public void clickCancelBtn() {
		this.dispose();
	}
	
	
}
