public class ONIGIRI {
    private String umplutura;
    ONIGIRI (String umplutura) {
        this.umplutura = umplutura;
    }
    public String getUmplutura() {
        return umplutura;
    }
    public void setUmplutura(String umplutura) {
        this.umplutura = umplutura;
    }
    @Override
    public String toString() {
        return "ONIGIRI{umplutura='"+umplutura+"'}";
    }
}
