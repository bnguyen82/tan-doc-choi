package exams.thread.practice.exam4.ex48;

public class Tshirt extends Thread { 
	public static void main(String[] args) { 
		System.out.print(Thread.currentThread().getId() + " "); 
		Thread t1 = new Thread(new Tshirt());  
		Thread t2 = new Thread(new Tshirt()); 
		t1.start(); 
		t2.run(); 
	} 
	public void run() { 
		for(int i = 0; i < 2; i++)    
			System.out.print(Thread.currentThread().getId() + " ");  
	} }