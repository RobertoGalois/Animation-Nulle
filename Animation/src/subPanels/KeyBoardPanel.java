package	subPanels;

import javax.swing.JButton;
import javax.swing.JPanel;


public class KeyBoardPanel extends JPanel
{
	protected JButton	m_butGo;
	protected JButton	m_butStop;
	
	public		KeyBoardPanel()
	{
		super();
		this.m_butGo = new JButton("Go");
		this.m_butGo.setEnabled(true);
		
		this.m_butStop = new JButton("Stop");
		this.m_butStop.setEnabled(false);
		
		this.add(this.m_butGo);
		this.add(this.m_butStop);
	}
	
	public JButton	getButtonGo()		{ return (this.m_butGo); }
	public JButton	getButtonStop()		{ return (this.m_butStop); }
}
