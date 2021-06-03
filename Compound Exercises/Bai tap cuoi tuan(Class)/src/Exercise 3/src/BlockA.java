public class BlockA extends Student{
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

    public BlockA() {
    }

    public BlockA(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }

    @Override
    public String toString() {
        return "Block A { "+" Số Báo Danh"+getSoBaoDanh()+
                ", Tên : "+getName()+", Địa chỉ:"+getAddress()+
                ", Mức Ưu Tiên: "+getMucUuTien()+", Subject: "+
                MON_TOAN+","+MON_LY+","+MON_HOA+'}';
    }
}
