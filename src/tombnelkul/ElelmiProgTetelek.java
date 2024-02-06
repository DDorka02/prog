
package tombnelkul;

import java.util.Scanner;

public class ElelmiProgTetelek {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Összegzés, python
//    while n < 0:
//        n = int(input("N = "))
//    osszeg = 0
//    for i in range(0, n+1):
//        osszeg += i
//    print(f"Az első {n} db természetes szám összege: {osszeg}")

        // java:
        int n = -1;
        while (n < 0){
            System.out.print("N= ");
            n = sc.nextInt();

        }
        
        int ossz = 0;    
        for (int i = 0;  i < n+1; i++) {
            ossz += i;
        }    
//            System.out.println("Az első n szám összege: "+ossz);
            System.out.printf("Az első %d szám összege: %d\n", n,ossz);
        
            
//          megszamlalas, python:
//    db = 0
//    for i in range(10, 100, 1):
//        if i % 2 == 0:
//            db += 1
//    print(db)

//          java:
        int db = 0;
        for ( int i = 10; i < 100;i++){
            if (i % 2 == 0){
                  db += 1;
            }
        }
        System.out.printf("Kétjegyű párosok száma: %d\n",db);
        
//     min/max szélső érték, python:
//    vege = 0
//    db = 0
//    mini = 214748
//    while szam := int(input("Szám: ")) != vege:
//        if szam < mini:
//            mini = szam
//            db += 1
//    print(f"{db} számból a legkisebb: {mini}")


        // java
          int vege = 0;
          db = 0;
          int min = 2147483647;
          int szam ;
          System.out.print("0ra kilép: ");
          while ((szam= sc.nextInt()) != vege){
            if (szam < min) {
                min = szam;
             }
            db++;
           }
            System.out.printf("%d számból a legkisebb:%d\n",db,min);
                
            
//      eldöntés, python:
//
//        n: int =int(input('\nszám: '))
//          prim: bool

//        if n <2:
//          prim = false
//      else:
//            i = 2
//      while i <= math.sqrt(n) and n % i != 0
//                i += 1
            


        //java
//          n = sc.nextInt();
//          prim = bool;
//          if (n < 2){
//              prim = False;
//    }
//                  
//          
//          

        
        //        System.out.printf("Kétjegyű párosok száma: %d\n",db);
//      , python:

        //java

        
        //        System.out.printf("Kétjegyű párosok száma: %d\n",db);

//      , python:

        //java
       
        
        //        System.out.printf("Kétjegyű párosok száma: %d\n",db);
    }
    
}

