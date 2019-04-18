/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

public class CpProject {
    public static void main(String[] args) {
    	Constants.init_huge();
    	Thread threads[] = new Thread[2];
    	threads[0] = new Thread(new SerialThread());
    	threads[1] = new Thread(new ParallelThread());
    	for(int i = 0 ; i < 2; i++) {
			threads[i].start();
		}
    	for(int i = 0 ; i < 2; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
