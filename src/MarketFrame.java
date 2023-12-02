import javax.swing.*; //CREAZIONE FRAME
import java.awt.*; //LAYOUT DEL FRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarketFrame extends JFrame {
	
	private JTextArea textArea; //area di testo
	private JButton button;
	private JTextField textField; //area di testo con una sola riga(tipo di ricerca)
	
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
		
		//LAYOUT
		setLayout(new BorderLayout());
		
		textArea= new JTextArea();
		button =new JButton("Open Market"); //testo sul bottone
		textField=new JTextField();
		
		//aggiungo i componenti che ho creato specificando dove li metto
		add(textArea, BorderLayout.CENTER);
		add(button, BorderLayout.PAGE_START);
		add(textField, BorderLayout.PAGE_END);
		
		//AGGIUNGO ACTION LISTENERS
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//il bottone mi metterà nella text area cosa scrivo nella text field
				String text_textField = textField.getText();
				//textArea.append(text_textField +"\n");
			}
		});
		
		
		
		setVisible(true);	//rendo visibile la finestra (dopo che l'ho impostata, meglio metterla alla fine)
}}
