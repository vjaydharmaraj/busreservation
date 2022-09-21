package busrev;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<bus> buses = new ArrayList<bus>();
        buses.add(new bus(1, true, 2));
        buses.add(new bus(2, false, 5));
        buses.add(new bus(3, true, 4));


        ArrayList<booking> bookings = new ArrayList<booking>();


        for (bus b : buses) {
            b.DisplayInfo();
        }
        boolean flag = true;
        while (flag == true) {
            System.out.println("Do u want to book bus ticket Press 1 to book and 2 to exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                booking bo = new booking();
               if (bo.isavailable(buses,bookings))
               {
                   bookings.add(bo);
                   System.out.println("Your booking is Confrimed");
               }
               else {
                   System.out.println("Sorry Bus full try another date or bus");
               }
            }

            else
            {
                System.out.println("ThankYou Have a Safe journey");
                flag = false;
            }
        }
    }
}
