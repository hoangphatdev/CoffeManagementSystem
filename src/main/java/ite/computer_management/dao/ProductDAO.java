package ite.computer_management.dao;

import java.sql.Statement; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ite.computer_management.database.ConnectDatabase;
import ite.computer_management.model.Product;
import ite.computer_management.view.ProductView;



public class ProductDAO implements DAOInterface<Product> {
	private ProductView productView;
	public ProductDAO() {};
	public ProductDAO(ProductView productView) {
		this.productView = productView;
	}
	public static ProductDAO getInstance() {
		return new ProductDAO();
	}

	@Override
	public int insert(Product t) {
		int check = 0;
		Connection connect = ConnectDatabase.getInstance().getConnection();
		try {
			String sql = "INSERT INTO computer_management.product(computer_name, computer_code, brand, price, cpu, ram, vga, screen_size, weight, computer_type,origin, quantity) VALUE"
					+ "(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, t.getComputerName());
			ps.setString(2, t.getComputerCode());
			ps.setString(3, t.getBrand());
			ps.setDouble(4, t.getPrice());
			ps.setString(5, t.getCpu());
			ps.setInt(6, t.getRam());
			ps.setString(7, t.getVga());
			ps.setDouble(8, t.getScreenSize());
			ps.setDouble(9, t.getWeight());
			ps.setString(10, t.getComputerType());
			ps.setString(11, t.getOrigin());
			ps.setInt(12, t.getQuantity());
			
			check = ps.executeUpdate();	
			connect.close();
			System.out.println(sql);
			JOptionPane.showMessageDialog(null, "Insert successfully ><");
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e);
		}
		return check;
	}

	@Override
	public int delete(Product t) {
		int check = 0;
		Connection connect = ConnectDatabase.getInstance().getConnection();
		String sql = "DELETE FROM computer_management.product WHERE computer_code=?";
		try {
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, t.getComputerCode());
			check = ps.executeUpdate();
			connect.close();
			System.out.println("----------\n"+ sql + t.getComputerCode());
			JOptionPane.showMessageDialog(null, "Delete successfully ");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " +e);
		}
		
		return check;
	}

	@Override
	public int update(Product t, String condition) {
		int check = 0;
		Connection connect = ConnectDatabase.getInstance().getConnection();
		String sql = "UPDATE computer_management.product SET computer_name=?, computer_code=?, brand=?, price=?, cpu=?, ram=?, vga=?, screen_size=?, weight=?, computer_type=?,origin=?, quantity=?"
				+ "WHERE id=?";
		try {
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, t.getComputerName());
			ps.setString(2, t.getComputerCode());
			ps.setString(3, t.getBrand());
			ps.setDouble(4, t.getPrice());
			ps.setString(5, t.getCpu());
			ps.setInt(6, t.getRam());
			ps.setString(7, t.getVga());
			ps.setDouble(8, t.getScreenSize());
			ps.setDouble(9, t.getWeight());
			ps.setString(10, t.getComputerType());
			ps.setString(11, t.getOrigin());
			ps.setInt(12, t.getQuantity());
			ps.setString(13, condition);
			check = ps.executeUpdate();
			connect.close();
			JOptionPane.showMessageDialog(null, "Edit successfully ><");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error: " + e);
		}
		
		return 0;
	}

	@Override
	public ArrayList<Product> selectAll() {
		Connection connect = ConnectDatabase.getInstance().getConnection();
		
		try {
			Statement st = connect.createStatement();
			String sql = "SELECT * FROM computer_management.product";
			ResultSet rs = st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
		
			int cols = rsmd.getColumnCount();
//			String[] colName = new String[cols];
			String[] colName = {"computerName", "computerCode", "brand", "price", "cpu", "ram", "vga", "screenSize", "weight", "computerType","origin", "quantity"};
//			for(int i=0; i<cols; i++) {
//				colName[i] = rsmd.getColumnClassName(i+1); //thu tu cot bat dau tu 1
//			}
			productView.model.setColumnIdentifiers(colName);
			String computerName, computerCode, brand, cpu, vga, computerType, origin;
			int quantity, ram;
			Double price, screen_size, weight;
			while(rs.next()) {
				computerName = rs.getString(2);
				computerCode = rs.getString(3);
				brand = rs.getString(4);
				price = rs.getDouble(5);
				cpu = rs.getString(6);
				ram = rs.getInt(7);
				vga = rs.getString(8);
				screen_size = rs.getDouble(9);
				weight = rs.getDouble(10);
				computerType = rs.getString(11);
				origin = rs.getString(12);
				quantity = rs.getInt(13);
				String[] row = { computerName, computerCode, brand, String.valueOf(price), cpu, String.valueOf(ram), vga, String.valueOf(screen_size), String.valueOf(weight), computerType, origin, String.valueOf(quantity)};
				productView.model.addRow(row);
			}
			connect.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return null;
	}

	@Override
	public Product selectById(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int update(Product t) {
		// TODO Auto-generated method stub
		return 0;
	}


}
