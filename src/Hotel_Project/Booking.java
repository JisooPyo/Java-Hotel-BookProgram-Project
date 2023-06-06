package Hotel_Project;

import java.util.*;

public class Booking {
    Guest guest;
    Room room;
    Integer idNumber = 1000;
    Hotel hotel = new Hotel();
    Map< Integer, Queue< Room > > mapRoom = hotel.makeMapRoom();
    // Integer에는 1,2,3,4가 들어갑니다.
    Map< Integer, Booking > mapBooking = new HashMap<>();
    // Integer에는 idNumber가 들어갑니다.
    List< Booking > bookingList = new ArrayList<>();

    public Booking() {
    }

    public Booking( Guest guest, Room room, Integer idNumber ) {
        this.guest = guest;
        this.room = room;
        this.idNumber = idNumber;
    }


    /////////////////////////// 행복님 구현부 /////////////////////////////////////////////
    public Booking makeBooking( Guest guest ) {
        // 매개변수로 들어온 Guest와 손님이 고른 Room을 받아서
        // Booking 객체를 만들어 return하는 메서드

        // 남은 객실의 수는 mapRoom에서 Queue<Room> 의 size 를 이용하면 될 것 같습니다.

        Queue< Room > pickRoom = mapRoom.get( 2 ); // 2 대신 고른 room이 들어가야 함.
        Room room = pickRoom.peek();
        Guest g = guest;
        Booking booking = new Booking( g, room, idNumber );

//        pickRoom.poll();
//        mapRoom.put(2,pickRoom);

        // 이런식으로 객실에서 하나 빼주기
        // 예약 객체 리턴.
        return booking;

    }


    ///////////////////////// 채원님 구현부 ////////////////////////////////////////////////

    public void showBookingToManager() {
        //bookingList 이용해서 for문 만들어서 출력하기. - 채원님

    }


    ////////////////////////// 지수 구현부/////////////////////////////////////////////////

    public void showBookingToGuest() {
        // mapGuest를 이용하여 idNumber에 맞는 Value값(Booking)을 찾아옵니다.
        // idNumber가 맞지 않으면 "ID에 맞는 예약 현황이 없습니다."를 출력합니다.
        // idNumber가 일치하면 [예약 현황]을 보여주고 1. 메인메뉴 2. 예약취소를 출력합니다.
        // 1번을 선택하면 메서드종료(BookProgram 클래스로 돌아가고 메인메뉴로 돌아갑니다.)
        // 2번을 선택하면 예약을 취소할지 물어보고 1. 취소 2. 취소 안함
        // 1번을 선택하면 예약 취소 -> mapRoom 추가, mapGuest 빼기, bookingList 빼기
        if ( bookingList.size() == 0 ) {
            System.out.println( "예약현황이 없습니다." );
            System.out.println( "메인화면으로 돌아갑니다.\n" );
            return;
        }
        System.out.println( "[ 예약조회 ] ( 고객용 )\n" );
        System.out.println( "예약조회를 위해 idNumber가 필요합니다." );
        System.out.println( "idNumber을 입력해주세요." );

        Scanner sc = new Scanner( System.in );
        Integer inputIdNum = Integer.valueOf( sc.nextLine() );
        if ( !mapBooking.keySet().contains( inputIdNum ) ) {
            System.out.println( "ID에 맞는 예약 현황이 없습니다." );
            System.out.println( "메인 화면으로 돌아갑니다.\n" );
            return;
        }
        cancelBookingcheck( inputIdNum );

    }

    public void cancelBookingcheck( Integer inputIdnum ) {
        System.out.println( "[ 예약현황 ]" );
        System.out.println( "예약번호 : " + inputIdnum );
        System.out.println( "이름 : " + mapBooking.get( inputIdnum ) );
        System.out.println( "연락처 : " );
        System.out.println( "예약날짜 : " );
        System.out.println( "객실크기 : \n" );
        System.out.println( "1. 메인메뉴 / 2. 예약 취소" );
    }
}
