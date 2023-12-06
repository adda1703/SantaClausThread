package model;

public class Ticket {
	int nWait;
	int nServed;
	int childCount;
	
	public Ticket() {
		this.childCount=0;
		this.nWait=0;
		this.nServed=0;}

	// child takes number
	public synchronized int takeTicket() {
		nWait++;
		childCount++;
		notifyAll(); //risvgelia i thread che sono in attesa su quel oggetto
		return nWait;
		
	}

	
	// child waits its turn
	public synchronized void waitTurn(int num) {
		while(nServed != num) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Abort");
				e.printStackTrace();
			}
		}
	}
	
	
	
	// Santa Claus check if there are anymore children
	public synchronized int moreChildren() {
		while (nWait == nServed) {
			try {
				wait();
				//gui.changeLabelVen(Color.red);
					
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(childCount!=0) {
			childCount--;
			}
		nServed++;
		notifyAll();
		
		return nServed;
	}
	
	
	public synchronized int getCount() {
		
		return childCount;
	}
	
	
}