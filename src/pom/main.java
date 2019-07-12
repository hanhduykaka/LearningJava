/**
 * 
 */
package pom;

import java.util.ArrayList;

/**
 * @author taittn.gh
 *
 */


interface  People{
	int legs = 0 ;
	abstract  void makeSound();
}

abstract class Animal{
	int legs = 0 ;
	abstract  void makeSound();
}
class Cat extends Animal implements People{
	public void makeSound() {
		System.out.print("Meow\n");
	}
}

class Machine{
	public void start() {
		System.out.print("start\n");
	}
}

// Thread // extends Thread

class Loader extends Thread{
	public void run() {
		System.out.println("hes loo");
	}
}

//

// Another Thread create // implements Runnable

class Loader2 implements Runnable{
	public void run() {
		System.out.println("hes loo 2");
	}
}




public class main {

	/**
	 * 
	 */
	public main() {
		// TODO Auto-generated constructor stub
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COUNT++;
		System.out.print(COUNT+"\n");
		Cat c1 = new Cat();
		c1.makeSound();
		
		Machine m = new Machine() {
			@Override public void start() {
				System.out.print("whoo\n");
			}
		};
		m.start();
		
		
		// Thread
		Loader obj = new Loader();
		try {
			obj.sleep(2000);
			obj.start();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		// end Thread
		
		// Thread Runnale
		Thread t = new Thread(new Loader2());
		t.start();
		
		
		// Array list
		ArrayList colors = new ArrayList<>();
		 colors.add("Red");
			System.out.print(colors);
	}	
	
	public static int COUNT =0 ; 

}





