public class LinearSearch{
  

    // Linear Search Metodu
    
    static int linearSearch(int[] dizi, int arananSayi) {
        // Dizinin tüm elemanlarını tek tek geziyoruz
        for (int i = 0; i < dizi.length; i++) {
            
            // Eğer o anki eleman aranan sayıya eşitse
            if (dizi[i] == arananSayi) {
                return i; // Bulunan elemanın indeksini döndür
            }
        }
        
        // Döngü biterse ve sayı bulunamazsa -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        int[] sayilar = {10, 50, 30, 70, 80, 20};
        int aranan = 50;

        int sonuc = linearSearch(sayilar, aranan);

        if (sonuc == -1) {
            System.out.println("Sayı dizide bulunamadı.");
        } else {
            System.out.println("Sayı bulundu! İndeks: " + sonuc);
        }
    }
}
