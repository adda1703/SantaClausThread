import javax.swing.*; //CREAZIONE FRAME
import java.awt.*; //LAYOUT DEL FRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarketFrame extends JFrame {
	
	private JButton button; 
	
	public MarketFrame() {
	
		super("Market"); //il jframe lo creo nel main in XmasMarketPro
		
		setSize(800,500); 				//altezzaxlarghezza
		setLocationRelativeTo(null); 	//al centro dello schermo
		setResizable(false);			//blocco ridimensione della finestra
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//stop process quando exit
		
		//LAYOUT
		setLayout(new BorderLayout());
		
		button =new JButton("Open Market"); //testo sul bottone
		add(button, BorderLayout.CENTER);	//aggiungo button specificando il posto
		
		//AGGIUNGO ACTION LISTENERS
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				XmasMarketPro market=new XmasMarketPro();
				market.marketStart();
			}
		});
		setVisible(true);	//rendo visibile la finestra 
}}
