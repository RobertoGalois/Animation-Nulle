package subPanels;

import java.awt.Color;
import java.awt.Graphics;

public class Drawer 
{
	protected Graphics	m_graphic;
	
	public		Drawer()
	{
		this.m_graphic = null;
	}
	
	public		Drawer(Graphics p_graphic)
	{
		this.m_graphic = p_graphic;
	}
	
	public void	setGraphic(Graphics p_graphic)
	{
		this.m_graphic = p_graphic;
	}
	
	public Graphics	getGraphics()
	{
		return (this.m_graphic);
	}
	
	public void	clearScreen(int p_width, int p_height, Color p_color)
	{
		this.m_graphic.setColor(p_color);
		this.m_graphic.fillRect(0, 0, p_width, p_height);
	}
	
	public void	drawSquare(int p_x, int p_y)
	{
		this.m_graphic.setColor(Color.RED);
		this.m_graphic.fillRect(p_x, p_y, 40, 40);
	}
	
	public void	drawRoundSquare(int p_x, int p_y)
	{
		this.m_graphic.setColor(Color.RED);
		this.m_graphic.fillRoundRect(p_x, p_y, 40, 40, 10, 10);
	}
	
	public void	drawCircle(int p_x, int p_y)
	{
		this.m_graphic.setColor(Color.RED);
		this.m_graphic.fillOval(p_x, p_y, 40, 40);
	}
	
	public void	drawRectangle(int p_x, int p_y)
	{
		this.m_graphic.setColor(Color.RED);
		this.m_graphic.fillRect(p_x, p_y, 60, 40);
	}
	
	public void	drawOval(int p_x, int p_y)
	{
		this.m_graphic.setColor(Color.RED);
		this.m_graphic.fillOval(p_x, p_y, 40, 60);
	}
	
	
	
	
	
}
