package model;
import service.CinemaTicketManagement;
import service.StaffManagement;

public class CinemaRoom {
    StaffManagement staffManagement =new StaffManagement() ;
    private static final String PROJECTOR_HD = "Projector Christie CP2220";
    private static final String PROJECTOR_3D = "Technology ScreenX 4k";
    private static final String SOUND_3D = "AV Receiver Denon 7.1";
    private static final String SOUND_HD = "AV Receiver Denon 5.1";
    private static final String SCREEN_3D = "200 Inches";
    private static final String SCREEN_HD = "150 Inches";
    private static final int SEAT_3D = 100;
    private static final int SEAT_HD = 150;
    private static final String ROOM_A = "Vip";
    private static final String ROOM_B = "Normal";
    private static final String STATUS_A = "Còn chỗ";
    private static final String STATUS_B = "Hết chỗ";

    private String roomCode ;
    private int totalNumberOfSeats;
    private String kindOfRoom;
    private String projectorType;
    private String soundType;
    private String screen;
    private String status;
    private String staff;
    private int numberOfSeatsBookedByGuests;
    private MovieScheduleByRoom scheduleByRoom;


    public CinemaRoom() {
    }

    public CinemaRoom(String roomCode, String kindOfRoom,String staff) {
        this.roomCode = roomCode;
        this.kindOfRoom = kindOfRoom;
        this.staff = staff;
    }

    public String getStaff() {
        return staff;
    }

    public static String getProjectorHd() {
        return PROJECTOR_HD;
    }

    public static String getProjector3d() {
        return PROJECTOR_3D;
    }

    public static String getSound3d() {
        return SOUND_3D;
    }

    public static String getSoundHd() {
        return SOUND_HD;
    }

    public static String getScreen3d() {
        return SCREEN_3D;
    }

    public static String getScreenHd() {
        return SCREEN_HD;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public int getTotalNumberOfSeats() {
        if (kindOfRoom.equals(ROOM_A)){
            this.totalNumberOfSeats = SEAT_3D;
        }else if (kindOfRoom.equals(ROOM_B)){
            this.totalNumberOfSeats = SEAT_HD;
        }
        return totalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public String getKindOfRoom() {
        if (kindOfRoom.equals("1")){
            this.kindOfRoom=ROOM_A;
        }else if (kindOfRoom.equals("2"))
            this.kindOfRoom=ROOM_B;
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public String getProjectorType() {
        if (kindOfRoom.equals(ROOM_A)){
            this.projectorType=PROJECTOR_3D;
        }else if (kindOfRoom.equals(ROOM_B)){
            this.projectorType=PROJECTOR_HD;
        }
        return projectorType;
    }

    public void setProjectorType(String projectorType) {
        this.projectorType = projectorType;
    }

    public String getSoundType() {
        if (kindOfRoom.equals(ROOM_A)){
            this.soundType=SOUND_3D;
        }else if (kindOfRoom.equals(ROOM_B)){
            this.soundType=SOUND_HD;
        }
        return soundType;
    }

    public void setSoundType(String soundType) {
        this.soundType = soundType;
    }

    public String getScreen() {
        if (kindOfRoom.equals(ROOM_A)){
            this.screen=SCREEN_3D;
        }else if (kindOfRoom.equals(ROOM_B)){
            this.screen=SCREEN_HD;
        }
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getStatus() {
        if (getNumberOfSeatsBookedByGuests(roomCode)<totalNumberOfSeats){
            this.status = getNumberOfSeatsBookedByGuests(roomCode)+"/"+getTotalNumberOfSeats();
        }else if (getNumberOfSeatsBookedByGuests(roomCode)==totalNumberOfSeats){
            this.status = STATUS_B;
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStaff(String staff) {
        for (int i = 0; i < staffManagement.getListStaff().size(); i++) {
            if (staffManagement.getListStaff().get(i).getId().equals(staff)){
               return staffManagement.getListStaff().get(i).getName();
            }
        }
        return "Not Found";
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public int getNumberOfSeatsBookedByGuests(String roomCode) {
        CinemaTicketManagement cnTicket = new CinemaTicketManagement();

        for (int i = 0; i < cnTicket.getCinemaTicketList().size(); i++) {
            if (roomCode.equals(cnTicket.getCinemaTicketList().get(i).getRoomCode())){
                numberOfSeatsBookedByGuests += 1 ;
            }
        }
        return numberOfSeatsBookedByGuests;
    }

    public void setNumberOfSeatsBookedByGuests(int numberOfSeatsBookedByGuests) {
        this.numberOfSeatsBookedByGuests = numberOfSeatsBookedByGuests;
    }

    public MovieScheduleByRoom getScheduleByRoom() {
        return scheduleByRoom;
    }

    public void setScheduleByRoom(MovieScheduleByRoom scheduleByRoom) {
        this.scheduleByRoom = scheduleByRoom;
    }

    @Override
    public String toString() {
        return "CinemaRoom{ ID ROOM: "+roomCode+", KIND OF ROOM: "+getKindOfRoom()+", TOTAL SEATS: "+getTotalNumberOfSeats()
                +", PROJECTOR TYPE: "+getProjectorType()+", SOUND TYPE: "+getSoundType()+", SCREEN SIZE: "+getScreen()
                +", STATUS: "+getStatus()+", STAFF: "+ getStaff(staff)+ '}';
    }
}
