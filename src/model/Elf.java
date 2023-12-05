package model;

public class Elf extends Thread{
	
	private String colour;
	
	public Elf(String colour) {
		this.colour=colour;
	}
	
	@Override
	public void run() {
		System.out.println("The " + this.colour+ " Elf starts singing");
		System.out.println("The " + this.colour +" Elf brings more gifts");
		System.out.println("The " + this.colour + " Elf finishes is work");
	}
}
