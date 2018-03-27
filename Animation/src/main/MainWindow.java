package	main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame
{
	protected MainPanel		m_mainPanel;
	
	public		MainWindow()
	{
		super();
		this.m_mainPanel = new MainPanel();
		this.setContentPane(this.m_mainPanel);
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public MainPanel	getMainPanel()
	{
		return (this.m_mainPanel);
	}
}
