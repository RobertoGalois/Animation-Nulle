package		subPanels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import main.E_Forms;

public class ScreenPanel extends JPanel
{
	private static final long serialVersionUID = 424242424242421L;
	
	protected int		m_shapeCoordX;
	protected int		m_shapeCoordY;
	protected E_Forms	m_shapeType;
	protected Drawer	m_drawer;
	
	public			ScreenPanel(E_Forms p_shapeType)
	{
		super();
		this.setBackground(Color.WHITE);
		this.m_shapeCoordX = 0;
		this.m_shapeCoordY = 0;
		this.m_shapeType = p_shapeType;
		this.m_drawer = new Drawer();
	}
	
	public void		paintComponent(Graphics g)
	{
		this.m_drawer.setGraphic(g);
		this.m_drawer.clearScreen(this.getWidth(), this.getHeight(), this.getBackground());
		
		if (this.m_shapeType == E_Forms.CARRE)
			this.m_drawer.drawSquare(this.m_shapeCoordX, this.m_shapeCoordY);
		
		else if (this.m_shapeType == E_Forms.CARRE_ROND)
			this.m_drawer.drawRoundSquare(this.m_shapeCoordX, this.m_shapeCoordY);
		
		else if (this.m_shapeType == E_Forms.ROND)
			this.m_drawer.drawCircle(this.m_shapeCoordX, this.m_shapeCoordY);

		else if (this.m_shapeType == E_Forms.RECTANGLE)
			this.m_drawer.drawRectangle(this.m_shapeCoordX, this.m_shapeCoordY);
		
		else if (this.m_shapeType == E_Forms.OVALE)
			this.m_drawer.drawOval(this.m_shapeCoordX, this.m_shapeCoordY);
	}
	
	public void	setShape(E_Forms p_shape)
	{
		this.m_shapeType = p_shape;
	}
	
	public int		getShapeCoordX()		{ return (this.m_shapeCoordX); }
	public int		getShapeCoordY()		{ return (this.m_shapeCoordY); }
	public Drawer	getDrawer()				{ return (this.m_drawer); }
	
	public void		setShapeCoordX(int p_X) { this.m_shapeCoordX = p_X; }
	public void		setShapeCoordY(int p_Y) { this.m_shapeCoordY = p_Y; }
}