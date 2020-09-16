package project1;


/*
 * The abstract class Employee, which has all the abstract methods of zookeeper, 
 * such as arrive, wake, feed, rollcall, exercise, tellsleep, leave, setDay, etc.
 */
public abstract class Employee
{
   private String name;

   public Employee(String name)
   {
      this.name = name;
   }
   
   public abstract void arrive();
   
   public abstract void wake(Animal[] animalArray);
   
   public abstract void feed(Animal[] animalArray);
   
   public abstract void rollCall(Animal[] animalArray);
   
   public abstract void exercise(Animal[] animalArray);
   
   public abstract void tellSleep(Animal[] animalArray);
   
   public abstract void leave();

   public abstract void setDay(int day);


}