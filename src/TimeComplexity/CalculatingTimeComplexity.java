//       O(1) > O(log n) > O(/n) > O(n) > O(n log n) > O(n^2) > O(n^3) >> O(2^n)
     //Fastest                                                            //Slowest

//1.
//for(int i = 1;i<=n;i++){
//    sout("ANSH");
//}                   // Total Number Of Operation = n
//        //Time Complexity = O(n) -> Linear Time


//2.
//for(int i = 1;i<=n;i++){
//    sout("ANSH");
//    sout("MUSKAN");       T.N.O = 3n
//    sout("KUSHWAHA");     T.C = O(n)
// }


//3.
//for(int i = 1;i<=n;i+=2){
//    sout("ANSH");    // T.N.O = n/2
//}
//        //T.C  = O(n/2) = O(n)


//4.
//for(int i = 1;i<=n-7;i++){
//    sout("ANSH");
//}                   // T.N.O = n-7
//        //T.C = O(n-7) = O(n)


//5.
//for(int i = 1;i<=n;i++){
//    sout("KUSHWAHA");            //O (n)
//}
//                         T.N.O = 2n
//                          T.C = O(2n) = O(n)
//for(int i = 1;i<=n;i++){
//    sout("ANSH");            // O(n)
//}


//6.
//for(int i = 1;i<=n;i++){
//    sout("ANSH");            //O (n)
//}
//                         T.N.O = m+n
//                          T.C = O(m+n)
//for(int i = 1;i<=m;i++){
//    sout("KUSHWAHA");            // O(m)
//}


//7.
//for(int i = 1;i<=100;i++){     T.N.O = 100
//    sout("ANSH");              T.C = O(100) = O(1) Constant Time
//}

//Nested Loops

//8.
//for(int i = 1;i<=m;i++){
//    for(int j =1;j<=n;j++){      T.N.O = m * n
//        sout("ANSH");            T.C = O(m*n);
//    }
//}

//9.
//for(int i = 1;i<=n;i++){
//    for(int j =1;j<=n;j++){      T.N.O = n * n
//        sout("ANSH");            T.C = O(n^2);  Quadratic Time
//    }
//}


//10.
//for(int i = 1;i<=n;i++){         i = 1 -> j = 1 , i = 2 -> j = 1,2 , i = n -> j =1,2,3,....n
//    for(int j =1;j<=i;j++){
//        sout("ANSH");          T.N.O = n(n+1)/2 = n^2+n/2
//    }                          T.C = O(n^2+n)/2 = O(n^2+n)= O(n^2);
//}


//11.
//for(int i=1;i<=n;i++){          // n
//    for(int j=i+1;i<=n;i++){    //n-1
//        sout("ANSH");                 T.N.O = 1+2+3+... n-1 = (n-1)*n/2 = n^2-n/2
//    }                                 T.C. = O(n^2)
//
//      Working...
//        i = 1  ->  j = 2,3,4,....n    (n-1)
//        i = n-1  -> j = n               1
//        i = n  ->  j=n+1   XXX
//}


//12.
//for(int i = 1;i<=n;i*=2){
//    sout("ANSH");       T.C. = O(x) = O(log2n) = O(log n)
//
//    working...
//      i = 1,2,4,8,16,32,64......n    (Total xth term)    GP
//x = ?
//a.r^x-1 = n (xth term)
//1.2^x-1 = n
//x-1 = log2n
//x = log2n +1
//}


//13.
//for(int i = 1;i<=n;i*=3){            x = ?
//    sout("ANSH");                    1.3^x-1 = n (xth term)
//                                     x-1 = log3n
//                                     x = log3n +1
//                   T.C = O(x) = O(log3n) = O(log n)
//}


//14.
//for(int i = 1;i<=n;i*=2){       // log n
//    for(int j =1;j<=n;j++){     //  n
//        sout("ANSH");
//    }                          T.C. = O(n log n)
//}


//15.
//for(int i =1;i*i<=n;i++){   // i*i = i^2
//    sout("ANSH");           // i^2 <= n
//                            // i<= root n
//        T.N.O = root n
//        T.C. = O(root n)
//}


//16.
//for(int i = 1;i*1<=n;i*=2){n   // i <= root n   //  log2n = log n
//    sout("ANSH");       T.C. = O(log root n) = O(log n)
//}

