package OOPS;

public class Constructors {
    public static class Car{
        int price; //0
        String color; // null

        Car(){  //default Constructor

        }
        //Constructor OverLoading
        Car(int x , String y){
            price = x;
            color = y;
        }
        Car(String y , int x){
            price = x;
            color = y;

        }


        void print(){

            System.out.println(price+" "+color);
        }

    }
    public static void main(String[] args) {
        Car c1 = new Car(1000,"BLACK");
        c1.print();
        Car c2 = new Car("WHITE",2000);
        c2.print();
        Car c3 = new Car();
        c3.price = 7000;
        System.out.println(c3.price);


    }
}
