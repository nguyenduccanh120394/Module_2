import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> Person ;
    private int soNha;

    public HoGiaDinh() {
    }

    public HoGiaDinh(List<Nguoi> soThanhVien, int soNha) {
        this.Person = soThanhVien;
        this.soNha = soNha;
    }

    public List<Nguoi> getSoThanhVien() {
        return Person;
    }

    public void setSoThanhVien(List<Nguoi> soThanhVien) {
        this.Person = soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "Apartment Number: "+soNha+", Person: " + Person ;

    }
}
