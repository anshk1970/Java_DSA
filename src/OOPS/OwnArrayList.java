package OOPS;
import java.util.*;
class Arraylist {   //Used Defined Data Structure
    int[] arr;
    int idx = 0;
    int size = 0;

    Arraylist(int capacity){
        arr = new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    void add(int ele){
        if(idx == arr.length) {     //array is full
            capacityIncrease();

        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i = 0;i<arr.length;i++){   //copy paste
            arr2[i] = arr[i];
        }
        arr =arr2;
    }
    void display(){
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int getEle(int idx){   //getter
        return arr[idx];
    }
    void setEle(int idx,int val){  //setter
        arr[idx] = val;
    }
    void removeFromEnd(){
        idx--;
        size--;
    }
    void removeAtIndex(int index){ //Forward loop

        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];   // leftShift arr[2] = arr[3] (replacing)
        }   //delete nhi hota overwrite + size kam hota hai
        idx--;
        size--;
    }
    void insertAtIndex(int index, int val){  //Backward loop
        if(size == arr.length){
            capacityIncrease();
        }

        // Right shift
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[index] = val;

        size++;
        idx++;
    }

}

public class OwnArrayList {
    public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
        Arraylist arr = new Arraylist(3);
        System.out.println(arr.capacity());
        arr.add(10);  arr.add(20);  arr.add(30);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.getEle(2));
        arr.add(40); arr.add(50);  //ArrayIndexOutOfBounds if capacity is 3 without CapacityIncrease function
        arr.display();
        arr.setEle(2,77);
        arr.display();
        arr.removeAtIndex(2);
        arr.display();
        arr.insertAtIndex(1,99);
        arr.display();


    }
}
