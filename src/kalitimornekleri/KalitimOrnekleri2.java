package kalitimornekleri;
public class KalitimOrnekleri2 {

    public static void main(String[] args) {
        
        Personel prsnlNesne = new Personel("Ali İsmail","Korkmaz",19);
        System.out.println(prsnlNesne.getKimlikBilgileri());
        
        System.out.println(prsnlNesne.toString()+"\n");
        
        Ogrenci ogrenciNesne = new Ogrenci("Fenerbahçe", "Şampiyon",1907, 2014);
        System.out.println(ogrenciNesne.getKimlikBilgileri());
        System.out.println(ogrenciNesne.toString());
        
        
        
    }
    
}
