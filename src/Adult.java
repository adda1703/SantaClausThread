
public class Adult extends Thread{
	
	private String name;
	
	public Adult(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("The adult " + this.name+ " tells a story");
		System.out.println("The adult " + this.name + " receives a gift ");
		System.out.println("The adult " + this.name+ " thanks Santa Claus");
	}
}
