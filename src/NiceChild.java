
public class NiceChild extends Child implements Runnable {
	
	public NiceChild(String nome) {
		super(nome); 
	}
	
	@Override
	public String getType() {
		return "NiceChild"; 
		
	}
	@Override 
	public void run() {
		System.out.println("The child " + this+ "sits Santa Claus' lap");
		System.out.println("The child " + this+ "asks for a gift");
		System.out.println("The child " + this+ "receives the gift");
		System.out.println("Santa Claus says HOHOHO to " + this);
	}
	

}
