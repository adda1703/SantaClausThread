
public class Adult extends Thread{
	
	private String name;
	
	public Adult(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("The adult" + this+ "tells a story");
		System.out.println("The adult " + this+ "receives a gift ");
		System.out.println("The adult " + this+ "thanks Santa Claus");
	}
}
