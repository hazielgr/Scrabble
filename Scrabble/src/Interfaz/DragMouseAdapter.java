package Interfaz;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class DragMouseAdapter extends MouseAdapter{
	
	public void mousePressed(MouseEvent e) {
		JComponent c = (JComponent) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.COPY);
		//System.out.println(A.getValor());
	}
	
	
	
}
