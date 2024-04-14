package ite.computer_management.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ite.computer_management.view.AddProductView;
import ite.computer_management.view.Dashboard;
import ite.computer_management.view.ProductView;


public class ProductController implements MouseListener , KeyListener{
	ProductView productView;
	Dashboard dashboard;
	public ProductController(ProductView pv) {
		productView = pv;
	}
	public ProductController(Dashboard dashboard) {
		this.dashboard = dashboard;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == productView.addLbl) {
			ProductView pv = new ProductView();
		}else if(e.getSource() == productView.deleteLbl) {
		    productView.clickDeleteLbl();
		}else if(e.getSource() == productView.editLbl) {
			
		}else if(e.getSource() == productView.seeDetailLbl) {
			
		}
//		else if(e.getSource() == productView.refreshBtn) {
//			productView.clickRefreshBtn();
//		}

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == productView.searchTxt) {
			
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource() == productView.searchTxt) {
			productView.clickSearchBtn();
		}
	}
}
