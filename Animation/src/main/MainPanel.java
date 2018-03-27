package	main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import listeners.AnimThread;
import listeners.ButGoListener;
import listeners.ButStopListener;
import listeners.ComboListener;
import subPanels.FormPanel;
import subPanels.KeyBoardPanel;
import subPanels.ScreenPanel;


public class MainPanel extends JPanel 
{
	protected BorderLayout		m_layout;
	protected FormPanel			m_formPanel;
	protected ScreenPanel		m_screenPanel;
	protected KeyBoardPanel		m_keyBoardPanel;
	
	protected ComboListener		m_comboListener;
	protected ButGoListener		m_butGoListener;
	protected ButStopListener	m_butStopListener;
	
	protected AnimThread		m_animThread;
	
	public		MainPanel()
	{
		super();
		
		/* initialisation of the member variables */
		this.m_layout = new BorderLayout();
		this.m_formPanel = new FormPanel();
		this.m_screenPanel = new ScreenPanel((E_Forms)(this.m_formPanel.getComboBox().getSelectedItem()));
		this.m_keyBoardPanel = new KeyBoardPanel();
			
		/* initialisation of the listeners */
		this.m_comboListener = new ComboListener(this);
		this.m_butGoListener = new ButGoListener(this);
		this.m_butStopListener = new ButStopListener(this);
	
		/* initialisation of the Thread animation */
		this.m_animThread = new AnimThread(this.m_screenPanel);
		
		/* adding the subpanels to the panel */
		this.setLayout(this.m_layout);
		this.add(this.m_formPanel, BorderLayout.NORTH);
		this.add(this.m_screenPanel, BorderLayout.CENTER);
		this.add(this.m_keyBoardPanel, BorderLayout.SOUTH);
		
		/* linking the listeners to the composants */
		this.m_formPanel.getComboBox().addActionListener(this.m_comboListener);
		this.m_keyBoardPanel.getButtonGo().addActionListener(this.m_butGoListener);
		this.m_keyBoardPanel.getButtonStop().addActionListener(this.m_butStopListener);
	}
	
	//getters
	public FormPanel 		getFormPanel()			{ return (this.m_formPanel); }
	public ScreenPanel 		getScreenPanel()		{ return (this.m_screenPanel); }
	public KeyBoardPanel 	getKeyBoardPanel()		{ return (this.m_keyBoardPanel); }
	public AnimThread		getAnimThread()			{ return (this.m_animThread); }
	
}
