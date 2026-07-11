package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {

        // 1.length()
//        String str = "Hello";
//        int len = str.length();
//        System.out.println(len); // Output: 5

        // 2.charAt(int index)
//        String str = "Java";
//        char ch = str.charAt(2);
//        System.out.println(ch); // Output: v (0->J, 1->a, 2->v)

        // 3.substring(int beginIndex,int endIndex)   //beginIndex include hota hai aur endIndex shamil nhi hota.
//        String str = "Programming";
//        String sub = str.substring(0, 4);
//        System.out.println(sub); // Output: Prog

        // 4.contains(charSequence s) // ye true ya false return karta hai
//        String str = "Learn Java code";
//        boolean hasJava = str.contains("Java");
//        System.out.println(hasJava); // Output: true

        //5.equals(Object anObject) aur equalsIgnoreCase(String anotherString)
//        String s1 = "Hello";
//        String s2 = "hello";
//
//        System.out.println(s1.equals(s2));           // Output: false
//        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true

        //6.toUpperCase() aur toLowerCase()
//        String str = "JaVa";
//        System.out.println(str.toUpperCase()); // Output: JAVA
//        System.out.println(str.toLowerCase()); // Output: java

        //7.replace(char oldChar, char newChar)
//        String str = "Java is good";
//        String newStr = str.replace("good", "awesome");
//        System.out.println(newStr); // Output: Java is awesome

        //8.trim()
//        String str = "   Hello World   ";
//        System.out.println(str.trim()); // Output: "Hello World"

       //9. indexOf(String str)
//        String str = "Hello Reader";
//        int index = str.indexOf("Reader");
//        System.out.println(index); // Output: 6

        //10.split(String regex)
        String str = "Apple,Banana,Mango";
        String[] fruits = str.split(",");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
// Output:
// Apple
// Banana
// Mango

        //11.Concat()
        String a = "Roman";
        String b = "reigns";
//      a.concat(b);  //isse String nhi badlegi
//      System.out.println(a);  //Roman
        a =  a.concat(b);  //isse  a ki current value hatkar iska output  ho jaygea
        System.out.println(a);  //Romanreigns
//      System.out.println(a.concat(b));  // Romanreigns


//        💡 Tip: Agar aapki string null hai aur aap concat()
//        use karenge, toh NullPointerException error aayegi.
//        Lekin + operator null ko text ki tarah jod deta hai.
//        Isliye zyadatar developers + operator ka hi use karte hain kyunki wo likhne mein aasan hota hai.
    }
}
