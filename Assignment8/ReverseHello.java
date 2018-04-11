package Assignment8;

public class ReverseHello implements Runnable{
	 private int threadNumber;
	    private Object lastLock;
	    private Object lock;

	    public ReverseHello(int threadNumber, Object lastLock) {
	        this.threadNumber = threadNumber;
	        this.lastLock = lastLock;
	        lock = new Object();
	    }

	    public ReverseHello(int threadNumber) {
	        this.threadNumber = threadNumber;
	        lock = new Object();
	    }

	    public int getThreadNumber() {
	        return threadNumber;
	    }

	    public void run() {
	        synchronized (lock) {
	            if (this.getThreadNumber() <= 50) {
	                ReverseHello reverseHello = new ReverseHello(this.getThreadNumber() + 1, lock);
	                new Thread(reverseHello).start();


	                if (this.getThreadNumber() != 50) {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                System.out.println("Hello from Thread " + this.getThreadNumber());
	                
	                if (this.getThreadNumber() != 1) {
	                    synchronized (lastLock) {
	                        lastLock.notify();
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ReverseHello reverseHello = new ReverseHello(1);
	        new Thread(reverseHello).start();
	    }


}
