import java.util.ArrayList;
import java.util.List;

  public class KhuPho {
    private List<HoGiaDinh>danhSachHoGiaDinh;
  public KhuPho(){
    danhSachHoGiaDinh= new ArrayList<>();
 }

  public List<HoGiaDinh> getDanhSachHoGiaDinh() {
    return danhSachHoGiaDinh;
  }

  public void setDanhSachHoGiaDinh(List<HoGiaDinh> danhSachHoGiaDinh) {
    this.danhSachHoGiaDinh = danhSachHoGiaDinh;
  }
  public void add(HoGiaDinh hoGiaDinh){
   danhSachHoGiaDinh.add(hoGiaDinh);
  }
 }
