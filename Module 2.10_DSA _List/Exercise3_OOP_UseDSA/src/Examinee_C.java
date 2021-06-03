public class Examinee_C extends  Examinee {
    private final String MONVAN = "Văn";
    private final String MONSU = "Sử";
    private final String MONDIA = "Địa";

    public Examinee_C() {
    }

    public Examinee_C(int SBD, String name, String address, int priority) {
        super(SBD, name, address, priority);
    }

    @Override
    public String toString() {
        return "Examinee_C{ SBD : "+getSBD()+", Name: "+getName()+", Address: "+getAddress()+
                "Priority: "+getPriority()+"Exams: "+MONVAN+" , "+MONSU+" , "+MONDIA+ '}';
    }
}
