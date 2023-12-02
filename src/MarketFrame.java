import javax.swing.*;

public class MarketFrame extends JFrame {
	
	//metodo con nome della classe
	public MarketFrame() {
	
		super("Market"); //il jframe lo creo nel main in XmasMarketPro
		
		//JFrame frame=new JFrame("Market"); //titolo della finestra
		
		setSize(800,500); //imposto la grandezza altezzaxlarghezza
		
		//frame.setLocation (400,200);	
		//dove appare la finestra sullo schermo
		//l'angolo superiore sx della finestra è collocato a 400 px da sopra e 200 dal lato
		setLocationRelativeTo(null); //cosi appare al centro dello schermo
		
		//per bloccare la ridimensione della finestra
		setResizable(false);
		
		//quando chiudo la finestra si ferma il processo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);	//rendo visibile la finestra (dopo che l'ho impostata, meglio metterla alla fine)
}}
