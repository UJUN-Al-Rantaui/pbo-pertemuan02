public class InputOutput {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nama;
        int jumlahSks;
        double IPK;

        System.out.print("Masukkan nama anda : ");
        nama = scanner.nextLine();
        System.out.println("Hai, " + nama);

        System.out.print("Masukkan jumlah SKS yang telah ditempuh : ");
        jumlahSks = scanner.nextInt();

        System.out.print("Masukkan IPK sementara : ");
        IPK = scanner.nextDouble();

        double jumlah = IPK * jumlahSks;
        System.out.println("Total Nilai = " + jumlah);
    }
}