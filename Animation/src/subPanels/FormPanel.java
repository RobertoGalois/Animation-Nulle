package		subPanels;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.E_Forms;

public class FormPanel extends JPanel
{
	protected JLabel		m_label;
	protected JComboBox		m_comboBox;
	protected E_Forms[]		m_formOptions;
	
	public 		FormPanel()
	{
		super();
		this.m_label = new JLabel("Choix de la forme");
		this.m_formOptions = E_Forms.values();
		this.m_comboBox = new JComboBox(this.m_formOptions);
		
		this.add(this.m_label);
		this.add(this.m_comboBox);
	}
	
	public JLabel		getLabel()			{ return (this.m_label); }
	public JComboBox	getComboBox()		{ return (this.m_comboBox); }
	public E_Forms[]	getFormOptions()	{ return (this.m_formOptions); }
}
