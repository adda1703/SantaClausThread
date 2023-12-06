package model;

import java.util.Random;
//library for random function

import javax.swing.*;

public class Threading {

		private final static int N_SC = 4; //numbers of Santa Claus in the market
		private final static int N_E= 5;   //number of max elfs
		private final static String[] NAMES = {"Elena", "Sergio", "Adelina", "Alessandra",
				"Mario", "Sofia"};
		private final static String[] COLOURS= {"red", "green", "yellow", "pink", "violet", "blue"};
		
		public void marketStart() {
			
		Random r=new Random(System.currentTimeMillis());
		
		int n_children = r.nextInt(N_SC);
		int n_elfs=r.nextInt(N_E);
		
		Thread[] threads_to_start =new Thread[n_children+n_elfs];
		
		
		for(int i=0; i<n_children; i++) {
			
			boolean nice= r.nextBoolean(); //scelgo in modo random se il bambino è nice o bad
			
			int indexName= r.nextInt(NAMES.length);
			
			if(nice) {
				NiceChild c = new NiceChild(NAMES[indexName]);
				threads_to_start[i]= new Thread (c);
			}	else {
				BadChild c =new BadChild (NAMES[indexName]);
				threads_to_start[i]= new Thread (c);}		
			}
		
		
		for(int i=0; i<n_elfs; i++) {
			
			int indexName= r.nextInt(COLOURS.length);
			
			Elf e = new Elf(COLOURS[indexName]);
				threads_to_start[n_children+i]= e;
		}
		
		//faccio partire i thread
		for(Thread t : threads_to_start) {
			t.start();
		}
	
		//exception
		for(Thread t: threads_to_start) {
			try {
				t.join();
			} catch (InterruptedException e) {
				System.err.println("Main Thread has been interrupted");
				e.printStackTrace();
				}
		}
		
		System.out.println("Market closed");
			
		}	
	}
	

