package OOPS;


public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("BHAU BHAU");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("MEAU MEAU");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("HELLO");
        }
    }
    public static void main(String[] args) {
        Dog Tommy = new Dog();
        Cat Billu = new Cat();
        Lion leo = new Lion();


        Tommy.speak();
        Billu.speak();
        leo.speak();


    }
}
