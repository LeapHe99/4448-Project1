package project1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String path = "D:/dayatthezoo.out"; 
	    FileOutputStream puts = new FileOutputStream(path,true);
	    PrintStream out = new PrintStream(puts);
	    System.setOut(out);
		
		//Create 3 instances of Cat and 2 instances of Dog
		Cat cat1=new Cat("mimi");
		Cat cat2=new Cat("wawa");
		Cat cat3=new Cat("tutu");
		Dog dog1=new Dog("dodo");
		Dog dog2=new Dog("gaga");
		
		
		//Create an Array to store the objects of each animal.
		Animal[] animalArray=new Animal[5];
		animalArray[0]=cat1;
		animalArray[1]=cat2;
		animalArray[2]=cat3;
		animalArray[3]=dog1;
		animalArray[4]=dog2;
		
		//Create an instance of Zookeeper.
		Zookeeper e=new Zookeeper("Tom");
		//Zookeeper work 5 days
		for(int i =1;i<6;i++)
		{
			e.setDay(i);
			e.work(animalArray);
			System.out.println("-------------------------");
		}
	}

}
