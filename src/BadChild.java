
public class BadChild extends Child implements Runnable {
	
	public BadChild(String nome) {
		super(nome); //prende il nome dalla classe child
	}
	
	@Override
	public String getType() {
		return "BadChild"; 
		
	}
	@Override 
	public void run() {
		System.out.println("The child " + this+ "sits Santa Claus' lap");
		System.out.println("The child " + this+ "asks for a gift");
		System.out.println("The child " + this+ "doesn't receive the gift");
		System.out.println("The child " + this+ "cries");
	}
	

}
