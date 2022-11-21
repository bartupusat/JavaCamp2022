public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Bartu";
        String ogrenci2 = "Kaan";
        String ogrenci3 = "Barış";
        String ogrenci4 = "Uğur";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Bartu";
        ogrenciler[1] = "Kaan";
        ogrenciler[2] = "Barış";
        ogrenciler[3] = "Uğur";



        for (int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);

        }
        System.out.println("--------------------------");
            for(String ogrenci:ogrenciler) {
                System.out.println(ogrenci);
            }
        }
    }
