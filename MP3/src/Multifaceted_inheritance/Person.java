package Multifaceted_inheritance;

class Person {
     private String name;
     private int age;
     private char sex;
     private String maidenName;
     private Boolean militaryService;


     public Person(String name, int age, char sex, String maidenName, Boolean militaryService) {
         this.name = name;
         this.age = age;
         this.sex = sex;
         this.maidenName = maidenName;
         this.militaryService = militaryService;
     }

     public void introduce(){
         System.out.println("Person." +
                 "\nName: " + getName());
         System.out.println("Age: " + getAge());
         System.out.println("Sex: " + getSex());
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public char getSex() {
         return sex;
     }

     public void giveBirth(){
         if (!maidenName.isEmpty()){
             System.out.println("Birth given! Congrats!!");
         }
     }

     public void goToArmy(){
         if (militaryService){
             System.out.println("To army I go");
         }
     }
 }
