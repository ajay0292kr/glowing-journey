package thread;

public class ThreadB {
	public String total;

	public static class Thread {
		public static void main(String[] args){
		ThreadB b = new ThreadB();
                /* Now Thread is created*/
		b.start();
		synchronized(b){
		try{
		System.out.println("Waiting for bto complete...");
		b.wait();
		}catch(InterruptedException e){
		e.printStackTrace();
		}
		System.out.println("Total is: " + b.total);
		} } }

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
