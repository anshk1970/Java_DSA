package OOPS;

public class thisKeyword {
    public static class Car{
        int price;
        String color;
        Car(int price,String color){
            this.price = price;  //this keyWord
            this.color = color;

        }
        Car(String x,int y){
            color = x;    //normal
            price = y;

        }
        void print(){
            int price = 777;
            System.out.println(color+" "+this.price);
        }


    }
    public static void main(String[] args) {
        Car c1 = new Car(1200,"BLACK");
        c1.print();
        Car c2 = new Car("RED",1100);
        c2.print();

    }
}
