public class BlockB extends Student{
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public BlockB() {
    }
    public BlockB(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }
    @Override
    public String toString() {
        return "Block B { "+" Số Báo Danh"+getSoBaoDanh()+
                ", Tên : "+getName()+", Địa chỉ:"+getAddress()+
                ", Mức Ưu Tiên: "+getMucUuTien()+", Subject: "+
                MON_TOAN+","+MON_HOA+","+MON_SINH+'}';
    }
}
