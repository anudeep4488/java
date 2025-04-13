// public class practice{
//     public static void main(String args[]){
//         int n=10899;
//         while(n>0){
//             int lastdigt=n%10;
//             System.out.print(lastdigt);
//             n=n/10;


//         }
//         System.out.println();
//     }
// }
// public class practice{
//     public static void main(String args[]){
//         for(int i=0;i<100;i++){
//             if(i==85){
//                 continue;
//             }
//         System.out.println(i);
//         }
//     }
// }

// import java.util.Scanner;

// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         do{
//             System.out.println("eneter any number");
//             int n=sc.nextInt();

//             if(n%10==0){
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

// check if a number is prime or not

import java.util.Scanner;

public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%2==0){
        System.out.print(i+"is not prime");}
        else{
        System.out.println(i + " is a prime number ");
            }
        


    }
}
