package OOPS;

class Pokemon{
    String name;
    String type;
    int power;   //private
    Pokemon(){

    }
    Pokemon(String type ,int power){  //setter
        this.type = type;   //this Keyword
        this.power = power;
    }

    Pokemon(int power,String type){  //Constructor Overloading
        this.power = power;
        this.type = type;
    }

    int getPower(){  //getter for private
        return power;
    }
    void print(){
        System.out.println(this.type+" "+this.power);
    }
}
public class RevisionOOPS {
    public static int sum(int a, int b){  //Method Overloading
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu"; p1.type ="Electric";
        Pokemon p2 = new Pokemon();
        p2 = p1;  //p2 is shallow copy of p1 ( p2 has control )
        p2.type = "Water";
        System.out.println(p1.type);  //changes in p2 reflected in p1


        Pokemon onyx = new Pokemon("ROCK",100);
        onyx.print();
        Pokemon snorlax  = new Pokemon("PowerHouse",150);
        //snorlax.power = 130;   //ERROR BECAUSE OF PRIVATE
        //System.out.println(snorlax.power);   //ERROR
        snorlax.print();
        System.out.println(snorlax.getPower());   //Private Getter
        Pokemon psyduck = new Pokemon(777,"Water");
        psyduck.print();

        System.out.println(sum(4,5));
        System.out.println(sum(3,7,2));




    }
}
