package listeners;

import subPanels.ScreenPanel;

public class AnimThread extends Thread 
{
	protected ScreenPanel	m_screenPanel;
	
	public 		AnimThread(ScreenPanel p_screenPanel)
	{
		super();
		this.m_screenPanel = p_screenPanel;
	}
	
	private void sleep(int pTime)
	{
		try
		{
			Thread.sleep(pTime);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
}
	
	public void run()
	{
		int		addX = 1;
		int		addY = 1;
		
		while (true)
		{
			if ((this.m_screenPanel.getShapeCoordX() < 0)
				|| ((this.m_screenPanel.getShapeCoordX() + 40) > this.m_screenPanel.getWidth()))
			{
				addX = -addX;
			}
			
			if ((this.m_screenPanel.getShapeCoordY() < 0)
				|| ((this.m_screenPanel.getShapeCoordY() + 40) > this.m_screenPanel.getHeight()))
			{
				addY = -addY;
			}
			
			this.m_screenPanel.setShapeCoordX((this.m_screenPanel.getShapeCoordX()) + addX);
			this.m_screenPanel.setShapeCoordY((this.m_screenPanel.getShapeCoordY()) + addY);
			this.m_screenPanel.repaint();
			this.sleep(5);
		}
	}
}
