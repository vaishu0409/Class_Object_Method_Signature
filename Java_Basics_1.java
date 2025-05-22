//How to create a class, object, method and its signature 
public class Java_Basics_1 {
   static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void greet() {
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("vaish", 20);
        person1.greet();
    }
}


