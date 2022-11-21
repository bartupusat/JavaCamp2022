public class Main {
    public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel - Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi - Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("Fena değil - Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef - Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }
    }

}