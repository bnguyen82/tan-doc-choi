package exams.thread.practice.exam3.ex46;

public class Skip { 
	   public static void main(String[] args) throws Exception { 
	     Thread t1 = new Thread(new Jump()); 
	     Thread t2 = new Thread(new Jump()); 
	     t1.start(); t2.start(); 
	     t1.join(500); 
	     new Jump().run(); 
	 } } 
	 class Jump implements Runnable { 
	   public void run() { 
	     for(int i = 0; i < 5; i++) { 
	       try { Thread.sleep(200); } 
	       catch (Exception e) { System.out.print("e "); } 
	       System.out.print(Thread.currentThread().getId() + "-" + i + " "); 
	 } } }
