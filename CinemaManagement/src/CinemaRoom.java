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
    private static final String STATUS_A = "Ready";
    private static final String STATUS_B = "Cleaning up";
    private static final String STATUS_C = "Installing...";
    private static final String STATUS_D = "Trouble!!";

    private String roomCode ;
    private int totalNumberOfSeats;
    private String kindOfRoom;
    private String projectorType;
    private String soundType;
    private String screen;
    private String status;
    private String staff;
    private int soGheTrong;

    public CinemaRoom() {
    }

    public CinemaRoom(String roomCode, String kindOfRoom, String status,String staff) {
        this.roomCode = roomCode;
        this.kindOfRoom = kindOfRoom;
        this.status = status;
        this.staff = staff;
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
        if (status.equals("1")){
            this.status = STATUS_A;
        }else if (status.equals("2")){
            this.status = STATUS_B;
        }else if (status.equals("3")){
            this.status = STATUS_C;
        }else if (status.equals("4")){
            this.status = STATUS_D;
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStaff(String staff) {
        for (int i = 0; i < staffManagement.listStaff.size(); i++) {
            if (staffManagement.listStaff.get(i).getId().equals(staff)){
               return staffManagement.listStaff.get(i).getName();
            }
        }
        return "Not Found";
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "CinemaRoom{ ID ROOM: "+roomCode+", KIND OF ROOM: "+getKindOfRoom()+", TOTAL SEATS: "+getTotalNumberOfSeats()
                +", PROJECTOR TYPE: "+getProjectorType()+", SOUND TYPE: "+getSoundType()+", SCREEN SIZE: "+getScreen()
                +", STATUS: "+getStatus()+", STAFF: "+ getStaff(staff)+ '}';
    }
}
