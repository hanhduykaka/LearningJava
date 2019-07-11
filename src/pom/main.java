/**
 * 
 */
package pom;

/**
 * @author taittn.gh
 *
 */
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
	}	
	
	public static int COUNT =0 ; 

}


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


