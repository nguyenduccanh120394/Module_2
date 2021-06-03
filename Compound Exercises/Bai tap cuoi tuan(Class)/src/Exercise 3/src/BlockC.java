public class BlockC extends Student{
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public BlockC() {
    }

    public BlockC(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }

    @Override
    public String toString() {
        return "Block C { "+" Số Báo Danh"+getSoBaoDanh()+
                ", Tên : "+getName()+", Địa chỉ:"+getAddress()+
                ", Mức Ưu Tiên: "+getMucUuTien()+", Subject: "+
                MON_VAN+","+MON_SU+","+MON_DIA+'}';
    }
}
