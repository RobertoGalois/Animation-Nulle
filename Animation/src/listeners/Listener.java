package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.MainPanel;

public abstract class Listener implements ActionListener
{
	protected MainPanel		m_parentPanel;
	
	public Listener(MainPanel p_parentPanel)
	{
		this.m_parentPanel = p_parentPanel;
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		
	}
}
