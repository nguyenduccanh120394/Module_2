public class Student {
    private int soBaoDanh;
    private String name;
    private String address;
    private int mucUuTien;

    public Student() {
    }

    public Student(int soBaoDanh, String name, String address, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.name = name;
        this.address = address;
        this.mucUuTien = mucUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
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

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "Student{" +
                "soBaoDanh=" + soBaoDanh +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
