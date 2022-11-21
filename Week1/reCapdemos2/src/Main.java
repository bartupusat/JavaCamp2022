public class Main {
    public static void main(String[] args) {
        double[] MyList = {1.2, 7.3, 4.3, 5.6};
        double total = 0;
        double max = MyList[0];
        for (double number : MyList) {
            if (max < number) {
                max = number;
            }

            total = total + number;
            System.out.print(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}