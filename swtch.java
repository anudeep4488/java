// import java.util.*;
// public class swtch {
//     public static void main(String[] args){
//         int a=65;
//         int b=48;
//         System.out.println(a|b);
//         switch(a|b){
//         case 0: System.out.println("sum is zeo");
//         break;
//         case 1: System.out.println("sum is negative");
//         break;
//         case 2: System.out.println("sum is 113");
//         break;
        
//     }
//     }
    
// }

import java.util.Scanner;

public class swtch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char cont = input.next().charAt(0);

        if (cont >= 'A' && cont <= 'Z') {
            System.out.println(1);
        } else if (cont >= 'a' && cont <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

        input.close();
    }
}


