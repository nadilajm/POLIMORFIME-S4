import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Rumus Fisika ======");
        System.out.println("1. Massa Jenis");
        System.out.println("2. Energi Potensial");
        System.out.println("3. Energi Kinetik");
        System.out.println("Pilih Rumus:");
        int pilihan = sc.nextInt();
        System.out.println("=========================");
        
        
        
        if(pilihan == 1) {
            MassaJenis mj = new MassaJenis(5);
            mj.info();
            System.out.println(mj);
            System.out.println("=========================");
        }
        if(pilihan == 2) {
            EnergiPotensial ep = new EnergiPotensial(2, 9.8F,6 );
            ep.info();
            System.out.println(ep);
            System.out.println("=========================");
        }
        if(pilihan == 3) {
            EnergiKinetik ek = new EnergiKinetik(3.2F, 4);
            ek.info();
            System.out.println(ek);
            System.out.println("=========================");
        }
        
    }
}
