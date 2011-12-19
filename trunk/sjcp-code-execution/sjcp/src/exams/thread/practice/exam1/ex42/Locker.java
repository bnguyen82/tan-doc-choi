package exams.thread.practice.exam1.ex42;

class Locker extends Thread { 
	private static Thread t;   
	public void run() { 
		if(Thread.currentThread() == t) { 
			System.out.print("1 "); 
			synchronized(t) { 
				doSleep(2000); } 
			System.out.print("2 "); 
		} else { 
			System.out.print("3 "); 
			synchronized(t) { 
				doSleep(1000); } 
			System.out.print("4 "); 
		} 
	} 
	private void doSleep(long delay) { 
		try { Thread.sleep(delay); } 
		catch(InterruptedException ie) { ; } 
	}   
	public static void main(String args[]) { 
		t = new Locker(); 
		t.start(); 
		new Locker().start(); 
	} }
