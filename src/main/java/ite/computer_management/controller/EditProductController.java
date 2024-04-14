package ite.computer_management.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ite.computer_management.view.EditProductView;

public class EditProductController implements MouseListener {
	EditProductView edit;
	public EditProductController(EditProductView edit) {
		this.edit = edit;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == edit.saveBtn) {
			edit.clickSaveBtn();
		}else if(e.getSource() == edit.cancelBtn) {
			edit.clickCancelBtn();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
