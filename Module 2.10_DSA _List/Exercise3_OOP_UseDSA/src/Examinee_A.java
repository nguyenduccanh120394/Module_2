public class Examinee_A extends Examinee{
    private final String MONTOAN = "Toán";
    private final String MONLY = "Lý";
    private final String MONHOA = "Hóa";

    public Examinee_A() {
    }

    public Examinee_A(int SBD, String name, String address, int priority) {
        super(SBD, name, address, priority);
    }

    @Override
    public String toString() {
        return "Examinee_A{ SBD : "+getSBD()+", Name: "+getName()+", Address: "+getAddress()+
                ", Priority: "+getPriority()+", Exams: "+MONTOAN+" , "+MONLY+" , "+MONHOA+ '}';
    }
}
