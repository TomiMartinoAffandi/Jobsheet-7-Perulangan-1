import java.util.Scanner;
public class WhileGaji27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0.0;
        double totalGajiLembur = 0.0;
        String jabatan;

        System.out.print("masukan jumlah karyawan : ");
        jumlahKaryawan = scan27.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan27.next();
            System.out.print("masukan jumlah jam lembur: ");
            jumlahJamLembur = scan27.nextInt();
            i++;
            
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){ 
                gajiLembur = jumlahJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }else {System.out.println("jabatan invalid");
            i--;
            }
                

            totalGajiLembur += gajiLembur;
        }
        System.out.println("total gaji lembur: " + totalGajiLembur);
        
    }
}
