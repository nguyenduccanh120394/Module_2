public class Examinee_B extends Examinee {
    private final String MONTOAN = "Toán";
    private final String MONHOA = "Hóa";
    private final String MONSINH = "Sinh";

    public Examinee_B() {
    }

    public Examinee_B(int SBD, String name, String address, int priority) {
        super(SBD, name, address, priority);
    }

    @Override
    public String toString() {
        return "Examinee_B{ SBD : "+getSBD()+", Name: "+getName()+", Address: "+getAddress()+
                "Priority: "+getPriority()+"Exams: "+MONTOAN+" , "+MONSINH+" , "+MONHOA+ '}';
    }
}
