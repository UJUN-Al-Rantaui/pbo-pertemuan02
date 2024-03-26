public class InputOutput {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nama;
        System.out.print("Masukkan nama anda : ");
        nama = scanner.nextLine();
        System.out.println("Hai, " + nama);
    }
}