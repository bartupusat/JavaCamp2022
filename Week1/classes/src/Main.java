public class Main {
    public static void main(String[] arguments) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

        //Burada sayilar2 referans numarası sayilar1`e eşittir dediğimiz için sayilar2 referansındaki sayılar
        // artık geçersiz oluyor.
        //sayilar1`in 0. elemanı 10dur dediğimiz için 1 10 oluyor ve sonucu bize veriyor.


    }


}

