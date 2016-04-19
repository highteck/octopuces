package ihm.pageajoutcompte;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import ihm.pageconnexion.LeftPanel;

public class FrameAjoutCompte extends JFrame {

	private JPanel contentPane;


	public FrameAjoutCompte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 690);
		setTitle("Ajouter un compte Adminitrateur - Modérateur");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		PAddAccount panelAjoutCompte = new PAddAccount();
		contentPane.add(panelAjoutCompte);
	}

}
