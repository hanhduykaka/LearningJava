/**
 * 
 */
package pom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author taittn.gh
 *
 */

interface People {
	int legs = 0;

	abstract void makeSound();
}

abstract class Animal {
	int legs = 0;

	abstract void makeSound();
}

class Cat extends Animal implements People {
	public void makeSound() {
		System.out.print("Meow\n");
	}
}

class Machine {
	public void start() {
		System.out.print("start\n");
	}
}

// Thread // extends Thread

class Loader extends Thread {
	public void run() {
		System.out.println("hes loo");
	}
}

//

// Another Thread create // implements Runnable

class Loader2 implements Runnable {
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
		System.out.print(COUNT + "\n");
		Cat c1 = new Cat();
		c1.makeSound();

		Machine m = new Machine() {
			@Override
			public void start() {
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
		System.out.print(colors + "\n");
		System.out.print(colors.get(0) + "\n");
		System.out.print(colors.size() + "\n");
		System.out.print(colors.contains("Red") + "\n");
		colors.add("Blue");
		colors.add("Alue");
		System.out.println(colors.size());
		System.out.println(colors);
		// sorting
		Collections.sort(colors);
		System.out.println(colors);

		// Iterator
		Iterator<String> it = colors.iterator();
		String value = it.next();
		value = it.next();
		System.out.println(value);
		boolean hasNextValue = it.hasNext();
		System.out.println(hasNextValue);

		it.remove();

		boolean hasNextValueAfter = it.hasNext();
		System.out.println(value);
		//

		// File
		File x = new File("D:\\eula.1028.txt");
		if (x.exists()) {
			Scanner sc = null;
			try {
				System.out.println("exist file !");
				sc = new Scanner(x);
				while (sc.hasNext()) {
					System.out.println(sc.next());
				}
			} catch (FileNotFoundException e) {
				System.out.println("Error");
			} finally {
				sc.close();
			}
			
			  try {
				    Formatter f = new Formatter("D:\\JavaScript\\Java\\ConsoleProj\\src\\pom\\data\\test.txt");
				    f.format("%s %s %s", "1","John", "Smith \r\n");
				    f.format("%s %s %s", "2","Amy", "Brown");
				    f.close();    
				  } catch (Exception e) {
				    System.out.println("Error");
				  }
			
			
		}

	}

	public static int COUNT = 0;

}
