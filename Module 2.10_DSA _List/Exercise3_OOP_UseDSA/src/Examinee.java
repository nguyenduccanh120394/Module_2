public class Examinee implements Comparable<Examinee>{
    private final String MONTOAN = "Môn Toán";
    private final String MONLY = "Môn Lý";
    private final String MONHOA = "Môn Hóa";
    private final String MONSINH = "Môn Sinh";
    private final String MONVAN = "Môn Văn";
    private final String MONSU = "Môn Sử";
    private final String MONDIA = "Môn Địa";

    private int SBD;
    private String name;
    private String address;
    private int priority;

    public Examinee() {
    }

    public Examinee(int SBD, String name, String address, int priority) {
        this.SBD = SBD;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Examinee{" +
                "SBD=" + SBD +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Examinee o) {
        return getSBD()-o.getSBD();
    }
}
