package Hotel_Project;

import java.util.LinkedList;
import java.util.Queue;

public class Hotel {
    Room room;
    int asset;
    public Queue<Room> singleQueue(){
        Room room1 = new Room( "single",100 );
        Room room2 = new Room( "single",100 );
        Room room3 = new Room( "single",100 );
        Room room4 = new Room( "single",100 );
        Room room5 = new Room( "single",100 );
        Queue<Room> singleQueue = new LinkedList<>();
        singleQueue.add( room1 );
        singleQueue.add( room2 );
        singleQueue.add( room3 );
        singleQueue.add( room4 );
        singleQueue.add( room5 );
        return singleQueue;
    }

    public Queue<Room> doubleQueue(){
        Room room1 = new Room( "double",130 );
        Room room2 = new Room( "double",130 );
        Room room3 = new Room( "double",130 );
        Room room4 = new Room( "double",130 );
        Room room5 = new Room( "double",130 );
        Queue<Room> doubleQueue = new LinkedList<>();
        doubleQueue.add( room1 );
        doubleQueue.add( room2 );
        doubleQueue.add( room3 );
        doubleQueue.add( room4 );
        doubleQueue.add( room5 );
        return doubleQueue;
    }

    public Queue<Room> twinQueue(){
        Room room1 = new Room( "twin",130 );
        Room room2 = new Room( "twin",130 );
        Room room3 = new Room( "twin",130 );
        Room room4 = new Room( "twin",130 );
        Room room5 = new Room( "twin",130 );
        Queue<Room> twinQueue = new LinkedList<>();
        twinQueue.add( room1 );
        twinQueue.add( room2 );
        twinQueue.add( room3 );
        twinQueue.add( room4 );
        twinQueue.add( room5 );
        return twinQueue;
    }

    public Queue<Room> suiteQueue(){
        Room room1 = new Room( "suite",130 );
        Room room2 = new Room( "suite",130 );
        Room room3 = new Room( "suite",130 );
        Room room4 = new Room( "suite",130 );
        Room room5 = new Room( "suite",130 );
        Queue<Room> suiteQueue = new LinkedList<>();
        suiteQueue.add( room1 );
        suiteQueue.add( room2 );
        suiteQueue.add( room3 );
        suiteQueue.add( room4 );
        suiteQueue.add( room5 );
        return suiteQueue;
    }



}
