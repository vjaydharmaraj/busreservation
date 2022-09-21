package busrev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class booking {
    String passengername;
    int busno;
    Date date;


    booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bus number : ");
        busno = sc.nextInt();
        System.out.println("Enter the passenger name : ");
        passengername = sc.next();
        System.out.println("Enter the date : dd-MM-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isavailable(ArrayList<bus> buses, ArrayList<booking> bookings) {
        int capacity =0;
        for (bus b : buses) {
            if (b.getBus_no() == busno) {
                capacity = b.getCapacity();
            }

        }
        int booked =0;
        for ( booking boo:bookings)
        {
            if(boo.busno == busno && boo.date.equals(date))
            {
                booked++;
            }
        }

        return booked<capacity?true:false;
    }

}

