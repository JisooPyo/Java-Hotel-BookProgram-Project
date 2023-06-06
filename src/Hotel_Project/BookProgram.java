package Hotel_Project;

import java.util.Scanner;

public class BookProgram {
    Guest guest = new Guest();
    Booking booking = new Booking();
    Scanner sc = new Scanner( System.in );

    public void onProgram(){
        System.out.println("[ HI5 호텔 예약 프로그램 ]");
        System.out.println("안녕하세요. HI5 호텔입니다.");
        System.out.println("원하시는 옵션을 선택해 주세요.");
        System.out.println("1. 예약");
        System.out.println("2. 예약조회");
        System.out.println("3. 전체 예약 목록 조회(비밀번호 입력)");
        System.out.println("4. 프로그램 종료");
        int pick = sc.nextInt();
        switch ( pick ){
            case 1:{
                guestScreen();
            }
            case 2:{
                checkBookingGuest();
            }
            case 3:{
                checkBookingManager();
            }
            case 4:{
                offProgram();
            }
            default:{
                System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
                onProgram();
            }
        }

    }

    public void guestScreen(){
        Guest g = guest.inputGuest();
        bookingScreen( g );
    }

    public void bookingScreen(Guest g){
        Booking b = booking.makeBooking( g );
        booking.bookingList.add( b );
        onProgram();
    }

    public void checkBookingManager(){
        booking.showBookingToManager();
        onProgram();
    }

    public void checkBookingGuest(){
        booking.showBookingToGuest();
        onProgram();
    }

    public void offProgram(){
        System.out.println("프로그램을 종료합니다.");
    }
}