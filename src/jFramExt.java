import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class jFramExt extends JFrame {
	//private jFramExt frame;
	private JPanel contentPane;
	private jPanelExt jPanelExt_ = new jPanelExt();
	//private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					jFramExt frame = new jFramExt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jFramExt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		jPanelExt_.setBackground(new Color(102, 255, 51));
		contentPane.add(jPanelExt_, BorderLayout.CENTER);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(153, 51, 51));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Start");
		
		btnNewButton.addActionListener(new ActionListener() 
		 {
		  public void actionPerformed(ActionEvent arg0)
			   {
				//frame.s
				jPanelExt_.setMoving(true);
			   }
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("stop");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jPanelExt_.setMoving(false);
				
				
			}
		});
		panel.add(btnNewButton_1);
	}

	}
