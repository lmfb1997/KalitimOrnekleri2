package kalitimornekleri;

public class Personel {
    private String adi;
    private String soyadı;
    private int yasi;
    
    //default yapılandırıcı
    public Personel(){
        adi="isim yok";
        soyadı="Soyadı yok";
        yasi=0;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        if ( yasi < 0) {
        this.yasi = 0;
        }
        else {
            this.yasi=yasi;
    } }
//parametre alan yapılandırıcı
    public Personel(String adi, String soyadı, int yasi) {
        this.adi = adi;
        this.soyadı = soyadı;
        setYasi(yasi);
        //this.yasi = yasi;
    }
    
    public String getKimlikBilgileri(){
        return " Bilgiler: İsim: " + adi + " Soyadı: " + soyadı + " Yaşı: " + yasi;
    }
    
    // toString metodunu çağırıp düzenleyelim
    @Override public String toString(){
        return " Bilgiler: " + adi + " " + soyadı + " " + yasi;
    }
}
