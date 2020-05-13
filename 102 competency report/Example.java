public class Example{

    public static void public static void main(String[] args){
        //object intreraction


        User shay= new User("Shay",200);
        //display the object
         shay.printUser();
         //display the second object
        User gerry= new User("Gerry",150);
        gerry.printUser();

        Student christian= new Student("Christian", 30,9);
        christian.printStudent();
        //print the second student
         Student john= new Student("John",25,3);
        john.printStudent();
        

        Animal Dog= new Animal("Dog","Poodle");
        dog.printAnimal();
        Animal Cat= new Animal("Cat","Marble");
        cat.printAnimal();

        dog.attacks(christian);
        cat.attacks(shay);
        
   
   
   
    }

   

}