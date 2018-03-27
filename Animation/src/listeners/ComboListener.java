package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.E_Forms;
import main.MainPanel;

public class ComboListener implements ActionListener
{
	MainPanel	m_parentPanel;
	
	public		ComboListener(MainPanel p_parentPanel)
	{
		this.m_parentPanel = p_parentPanel;
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		E_Forms comboSelected = (E_Forms)(this.m_parentPanel.getFormPanel().getComboBox().getSelectedItem());
		
		this.m_parentPanel.getScreenPanel().setShape(comboSelected);
		this.m_parentPanel.getScreenPanel().repaint();
	}
}
