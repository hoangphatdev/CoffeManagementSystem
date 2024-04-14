package ite.computer_management.view;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JPanel; 

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import ite.computer_management.controller.ProductController;
import ite.computer_management.dao.ProductDAO;
import ite.computer_management.model.Product;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.print.PageFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProductView extends JPanel {
	public JLabel seeDetailLbl;
	public JLabel deleteLbl;
	public JLabel editLbl;
	public JLabel addLbl;
	public static DefaultTableModel model;
	private static final long serialVersionUID = 1L;
	public static JTable table;
	public JTextField searchTxt;
	public JButton excelBtn;
	
	

	/**
	 * Create the panel.
	 */
	
	public ProductView() {
		
		ProductController productController = new ProductController(this);
		
		this.setSize(1032,763);
		setLayout(null);
		
		addLbl = new JLabel("ADD ");
		addLbl.setBounds(39, 10, 86, 40);
		addLbl.setBackground(Color.blue);
		addLbl.setOpaque(true);
		addLbl.setForeground(Color.white);
		addLbl.setHorizontalAlignment(SwingConstants.CENTER);
		addLbl.addMouseListener(productController);
		add(addLbl);
		
		deleteLbl = new JLabel("DELETE");
		deleteLbl.setOpaque(true);
		deleteLbl.setHorizontalAlignment(SwingConstants.CENTER);
		deleteLbl.setForeground(Color.WHITE);
		deleteLbl.setBackground(Color.BLUE);
		deleteLbl.setBounds(169, 10, 86, 40);
		deleteLbl.addMouseListener(productController);
		add(deleteLbl);
		
		editLbl = new JLabel("EDIT");
		editLbl.setOpaque(true);
		editLbl.setHorizontalAlignment(SwingConstants.CENTER);
		editLbl.setForeground(Color.WHITE);
		editLbl.setBackground(Color.BLUE);
		editLbl.setBounds(298, 10, 86, 40);
		editLbl.addMouseListener(productController);
		add(editLbl);
		
		seeDetailLbl = new JLabel("SEE DETAIL");
		seeDetailLbl.setOpaque(true);
		seeDetailLbl.setHorizontalAlignment(SwingConstants.CENTER);
		seeDetailLbl.setForeground(Color.WHITE);
		seeDetailLbl.setBackground(Color.BLUE);
		seeDetailLbl.setBounds(426, 10, 86, 40);
		seeDetailLbl.addMouseListener(productController);
		add(seeDetailLbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 61, 912, 671);
		add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(productController);
		
		model = (DefaultTableModel) table.getModel();
		ProductDAO productDAO = new ProductDAO(this);
		productDAO.selectAll();
		scrollPane.setViewportView(table);
		
		searchTxt = new JTextField();
		searchTxt.addKeyListener(productController);
		searchTxt.setBounds(712, 11, 190, 39);
		add(searchTxt);
		searchTxt.setColumns(10);
		
		JLabel searchLbl = new JLabel("Search here:");
		searchLbl.setFont(new Font("Roboto", Font.BOLD, 12));
		searchLbl.setBounds(616, 10, 86, 40);
		add(searchLbl);
		
		excelBtn = new JButton("Excel");
		excelBtn.setBounds(958, 77, 64, 52);
		excelBtn.addMouseListener(productController);
		add(excelBtn);
		
	}
	public void clickDeleteLbl() {
		
		int selectedRow = table.getSelectedRow();
		String computerCode =  model.getValueAt(selectedRow, 1).toString(); // index cua gelValuAt bat dau tu 0
		Product deleteProduct = new Product();
		deleteProduct.setComputerCode(computerCode);
		int result = ProductDAO.getInstance().delete(deleteProduct);
		System.out.println(result);
		if(result == 1) {
			model.removeRow(selectedRow);
		}
	}
	public void clickSearchBtn() {
		DefaultTableModel demo = (DefaultTableModel) table.getModel();
		TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(demo);
		table.setRowSorter(trs);
		trs.setRowFilter(RowFilter.regexFilter(searchTxt.getText()));
	}
	public void openFile(String file) {
		try {
			File path = new File(file);
			Desktop.getDesktop().open(path);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Error: " + e);
		}
		
	}
	public void clickExportExcel() {
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.showSaveDialog(this);
		File saveFile = jFileChooser.getSelectedFile();
		
		if(saveFile != null) {
			saveFile = new File(saveFile.toString() + ".xlsx");
			Workbook wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet("product");
			
			Row rowCol = sheet.createRow(0);
			for(int i=0; i<table.getColumnCount(); i++) {
				Cell cell = rowCol.createCell(i);
				cell.setCellValue(table.getColumnName(i));
			}
			for(int j=0; j<table.getRowCount(); j++) {
				Row row = sheet.createRow(j);
				for(int k=0; k<table.getColumnCount(); k++) {
					Cell cell = row.createCell(k);
					if(table.getValueAt(j, k) != null) {
						cell.setCellValue(table.getValueAt(j, k).toString());
					}
				}
			}
			try {
				FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
				try {
					wb.write(out);
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null,"Error: " + e);
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
}
