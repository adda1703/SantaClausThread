public abstract class Child{
	
	private String name;
	
	public Child(String name) {
		this.name=name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public abstract String getType(); 
	
	
	
	//viene implementata poi per ogni child
	
	//funzione fondamentale, quando metto .this, esce fuori il nome del bambino
		//nelle classi che implementano Child; al posto di un numero in esadecimale
		//toDtring serve per far uscire quello che voglio quando metto this
}
