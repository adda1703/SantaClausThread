
public class XmasMarketSimple {

		public static void main(String[] args) {
			BadChild c1 = new BadChild("Mario");
			NiceChild c2=new NiceChild("Sergio");
			Adult a1= new Adult("Elena");
			
			//Le classi che implementano runnable: devo creare thread
			//le classi che estendono la classe Thread: è già un thread
			
			Thread t1= new Thread(c1);
			Thread t2=new Thread(c2);
			
			t1.start();		
			t2.start();
			a1.start();
			
		}
	
}
