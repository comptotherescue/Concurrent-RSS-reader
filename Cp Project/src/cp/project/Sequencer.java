package cp.project;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class Sequencer {
	static int val;
	Lock lock;
    public Sequencer() {
    val = 0;
    lock = new ReentrantLock();
    }
    
    public int getNext(){
    	 lock.lock();
         try{
             return val++;
         }finally{
             lock.unlock();
         }    
        
    }
}





    
