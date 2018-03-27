package listeners;

import java.awt.event.ActionEvent;
import java.lang.Thread.State;

import main.MainPanel;

public class ButGoListener extends Listener
{
	public		ButGoListener(MainPanel p_parentPanel)
	{
		super(p_parentPanel);
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		Thread	animThread = this.m_parentPanel.getAnimThread();
		
		this.m_parentPanel.getKeyBoardPanel().getButtonGo().setEnabled(false);
		this.m_parentPanel.getKeyBoardPanel().getButtonStop().setEnabled(true);
		
		if (animThread.getState() == State.NEW)
			animThread.start();
		
		else if (animThread.getState() == java.lang.Thread.State.TIMED_WAITING)
			animThread.resume();
	}
}
