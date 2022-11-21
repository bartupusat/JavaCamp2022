import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla (15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4);
        System.out.println(toplam);
    }

        public static void ekle() {
        System.out.print("Eklendi");
        }


    public static void sil() {
        System.out.print("Silindi");
    }

    public static void guncelle() {
        System.out.print("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2) {
        int toplam =0;
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi:sayilar) {
            toplam = toplam+sayi;
        }
        return toplam;
    }
    public static String sehirVer() {
        return "Ankara";
    }

}