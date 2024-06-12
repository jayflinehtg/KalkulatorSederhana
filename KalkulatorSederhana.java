import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

        double pilihan;

         do {
             System.out.println("Apakah anda masih ingin menggunakan aplikasi ini?");
             System.out.println("1. Ya\n2. Tidak");
             pilihan = inputanUser.nextDouble();

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
                             System.out.println(hasilBagi);
                         } else {
                             System.out.println("Pembagian dengan angka 0 tidak diperbolehkan");
                         }
                     }
                     default -> System.out.println("Kode operator tidak dikenal. Masukkan angka antara 1 sampai 4");
                 }
                 try {
                     Thread.sleep(1500); // Program akan menunggu selama 1500 milisecond
                 } catch (InterruptedException e) {
                     System.out.println("Terjadi kesalahan saat menunggu.");
                 }
             } else if (pilihan == 2) {
                 System.out.println("Terima kasih telah menggunakan kalkulator ini");
                 break;
             } else {
                 System.out.println("Inputan anda tidak dikenali program (Diluar pilihan yang telah diberikan)!");
                 break;
             }

             System.out.println("Apakah anda masih ingin menggunakan aplikasi ini?");
             System.out.println("1. Ya\n2. Tidak");
             pilihan = inputanUser.nextInt();

        }while(pilihan == 1);

         if (pilihan ==2 ){
             System.out.println("Terima kasih telah menggunakan kalkulator ini.");
         }
        }
}



