package Collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        //numRows = 7;
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        //System.out.println(numRows - 1);
       // System.out.println(lastRow);
        for(char row = 'A'; row <= lastRow; row++) {

            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);

            }
        }


//        //  (A + 1) = B according to ASCII table in int that is 65 + 1 = 66
//        int lastRow = 'A' + (numRows -1);    // adding char and int will be int since char is int internally
//        for (char row = 'A'; row <= lastRow; row++) {    // using char in loop since internally it is int
//            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {  // nested for loop to generate seat numbers
//                String seatNumberFormatted = String.format("%02d", seatNum); // formats seatNum with 2 digits and converts to string e.g. "01", "02" etc
//                String seatNumberString = row + seatNumberFormatted; // adds row to seatNum e.g. A01, A02 etc
//                Seat seat = new Seat(seatNumberString); // creates a new seat with seatNumberString as param
//                seats.add(seat);
//            }
//        }
        
    }
    public String getTheatreName() {
        return theatreName;
    }

//    public boolean reservedSeat (String seatNumber) {
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if (foundSeat >= 0) {
//            System.out.println(".");
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
//    }
    
    // for testing

    public boolean reserveSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }
    
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }


public class Seat implements  Comparable<Seat> {

    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel(){
        if (this.reserved) {
            this.reserved = false;
            System.out.println("reservation of seat " + seatNumber + " cancelled");
            return true;
        } else {
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    /// is gonna return -1 for false, 0 for equal, 1 for true

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
}
}
