import java.util.Scanner;
public class DoWhileCuti {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = scan27.nextInt();

        do {
            System.out.print("apakah anda ingin mengambil jatah cuti (y/t)? ");
            konfirmasi = scan27.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari: ");
                jumlahHari = scan27.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                    
                }
            }
            
        } while (jatahCuti > 0);
    }
}
