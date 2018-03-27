package listeners;

import java.awt.event.ActionEvent;
import java.lang.Thread.State;

import main.MainPanel;

public class ButStopListener extends Listener 
{
	public		ButStopListener(MainPanel p_parentPanel)
	{
		super(p_parentPanel);
	}
	
	public void	actionPerformed(ActionEvent e)
	{	
		AnimThread	animThread = this.m_parentPanel.getAnimThread(); 
		
		this.m_parentPanel.getKeyBoardPanel().getButtonStop().setEnabled(false);
		this.m_parentPanel.getKeyBoardPanel().getButtonGo().setEnabled(true);
		
		if ((animThread.getState() == State.RUNNABLE)
			|| (animThread.getState() == State.TIMED_WAITING))
		{
			this.m_parentPanel.getAnimThread().suspend();
		}
	}
}
