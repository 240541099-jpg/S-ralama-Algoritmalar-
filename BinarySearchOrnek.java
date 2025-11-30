 
    public class BinarySearchOrnek {

    public static int binarySearch(int[] dizi, int aranan) {
        int sol = 0;
        int sag = dizi.length - 1;

        while (sol <= sag) {
            // Ortadaki indeksi buluyoruz
            // (sol + sag) / 2 yaparsak çok büyük sayılarda taşma (overflow) olabilir.
            // Bu formül daha güvenlidir:
            int orta = sol + (sag - sol) / 2;

            // 1. Durum: Aranan sayı tam ortadaysa
            if (dizi[orta] == aranan) {
                return orta;
            }

            // 2. Durum: Aranan sayı ortadakinden büyükse, sağ tarafa bak
            if (dizi[orta] < aranan) {
                sol = orta + 1;
            }
            // 3. Durum: Aranan sayı ortadakinden küçükse, sol tarafa bak
            else {
                sag = orta - 1;
            }
        }

        // Sayı bulunamazsa
        return -1;
    }

    public static void main(String[] args) {
        // DİKKAT: Dizi sıralı olmalıdır!
        int[] siraliDizi = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int arananSayi = 2;

        int sonuc = binarySearch(siraliDizi, arananSayi);

        if (sonuc == -1) {
            System.out.println("Sayı bulunamadı.");
        } else {
            System.out.println("Sayı bulundu! İndeks: " + sonuc);
        }
    }
}
    
 
