package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestEle {
    public int kthSmallest(int[] arr, int k) {

       //MAX HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){  // nlogk
            pq.add(ele);   //logk
            if(pq.size()>k) pq.remove();  //logk
        }
        return pq.peek();

    }

}
