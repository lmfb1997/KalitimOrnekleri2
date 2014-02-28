package kalitimornekleri;

public class Ogrenci extends Personel {

    private int ogrenciNo = 0;
    

    public Ogrenci() {
       super();
    }

    public Ogrenci(String adi, String soyadı, int yasi, int ogrenciNo) {

        super(adi, soyadı, yasi);
        setOgrenciNo(ogrenciNo);
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo < 0) {
            ogrenciNo = 0;
        } else {
            this.ogrenciNo = ogrenciNo;
        }
    }
        @Override
        public String getKimlikBilgileri(){
        return super.getKimlikBilgileri() + " Öğrenci No: " + ogrenciNo;
    }
}



