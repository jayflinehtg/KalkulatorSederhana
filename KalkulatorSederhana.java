import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

        int pilihan = 1;

                System.out.println("Selamat datang di Kalkulator Sederhana saya!!!");
        do {

            if (pilihan==1){
                System.out.print("Masukkan angka pertama: ");
                double angkaPertama = inputanUser.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double angkaKedua = inputanUser.nextDouble();

                System.out.println("Pilih Operator berikut: ");
                System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian \n4. Pembagian");
                System.out.print("Masukkan kode operator:");
                int pilihanOperator = inputanUser.nextInt();

                switch (pilihanOperator) {
                    case 1 -> System.out.println("Hasil: " + (angkaPertama + angkaKedua));
                    case 2 -> System.out.println("Hasil: " + (angkaPertama - angkaKedua));
                    case 3 -> System.out.println("Hasil: " + angkaPertama * angkaKedua);
                    case 4 -> {
                        if(angkaKedua!=0){
                            double hasilBagi = angkaPertama/angkaKedua;
                            System.out.println("Hasil: " + hasilBagi);
                        } else {
                            System.out.println("Pembagian dengan angka 0 tidak diperbolehkan");
                        }
                    }
                    default -> System.out.println("Kode operator tidak dikenal. Masukkan angka antara 1 sampai 4");
                }
                System.out.println("Apakah anda masih ingin menggunakan aplikasi ini?");
                System.out.println("1. Ya\n2. Tidak");
                pilihan = inputanUser.nextInt();

                if (pilihan ==2 ){
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    inputanUser.close();
                }
            }

        }while(pilihan == 1);
    }
}
