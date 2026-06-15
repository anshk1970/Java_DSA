package OOPS;
class Fraction{
    int num;
    int den;
    Fraction(int num,int den){
        this.num = num;
        this.den = den;
        simplify();  //simplifies the fraction
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){   //Adding
        num = num*f.den + den*f.num;
        den *= f.den;
        simplify();
    }
    void multi(Fraction f){  //multiplication
        this.num = this.num * f.num ;
        this.den = this.den * f.den ;
        simplify();
    }
    void divide(Fraction f){   //divide
        num = num * f.den;
        den = den * f.num;
        simplify();
    }

    //SIMPLIFIER
    void  simplify(){
        boolean isNegative = (num*den <0)? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den); //gcd = 3
        num = num/gcd;
        den = den/gcd;
        if(isNegative) num  = -num;
    }
    int hcf(int a, int b){
        if(a==0) return b;    // 3
        return hcf(b%a,a);   // (0,3)
    }


}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        Fraction f2 = new Fraction(7,3);
//      f1.add(f2);   // 58/21
//      f1.print();
//      f1.multi(f2);  // 21/21
//      f1.print();
//      f1.divide(f2);
//      f1.print();    // 9/49


        Fraction f3 = new Fraction(3,12);
        f3.print();

    }
}
