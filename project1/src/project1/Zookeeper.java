package project1;


/*
 * extends Employee,Implemented the abstract method in Employee
 */
public class Zookeeper extends Employee {

	private int day;
	private String name;

	public Zookeeper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name=name;
	}


	   
   @Override
	public void setDay(int day) 
	{
		this.day=day;
	}

   @Override
   public void arrive()
   {
	   System.out.println(this.name+" arrive at Zoo on day "+this.day);
   }
   @Override
   public void wake(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   System.out.println(this.name+" wake up "+animalArray[i].name);
		   animalArray[i].beWaked();
	   }
	   
   }
   @Override
   public void feed(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   System.out.println(this.name+" feed "+animalArray[i].name);
		   animalArray[i].eat();
	   }
   }
   @Override
   public void rollCall(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   System.out.println(this.name+" rollCall "+animalArray[i].name);
		   animalArray[i].speek();
	   }
   }
   @Override
   public void exercise(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   System.out.println(this.name+" excercise "+animalArray[i].name);
		   animalArray[i].exercise();
	   }
   }
   @Override
   public void tellSleep(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   System.out.println(this.name+" let "+animalArray[i].name +" go to sleep.");
		   animalArray[i].sleep();
	   }
   }
   @Override
   public void leave()
   {
	   System.out.println(this.name+" leave the Zoo on day "+this.day);
   }

   //Zookeeper's daily workflow
   public void work(Animal[] animalArray)
   {
	arrive();
	wake(animalArray);
	rollCall(animalArray);
	feed(animalArray);
	exercise(animalArray);
	tellSleep(animalArray);
	leave();
   }

}
