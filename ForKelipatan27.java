import java.util.Scanner;
public class ForKelipatan27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, 
        jumlah = 0, 
        counter = 0;
        float rataRata = 0;

        System.out.println("masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1 ; i <= 50 ; i++)  {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            
        }
        rataRata = jumlah / counter;

        System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adlah %d\n", kelipatan, jumlah);
        System.out.printf("rata-rata dari %d adalah %f\n", kelipatan, rataRata);

    }
}