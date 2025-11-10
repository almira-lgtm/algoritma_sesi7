import java.util.ArrayList;
import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        usernames.add("aira");
        passwords.add("12345");
        usernames.add("mira");
        passwords.add("54321");
        usernames.add("al");
        passwords.add("123");
        usernames.add("mir");
        passwords.add("456");
        usernames.add("illa");
        passwords.add("234");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pengguna: ");
        String namaInput = input.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String sandiInput = input.nextLine();
        boolean loginBerhasil = false;

        for (int i = 0; i < usernames.size(); i++) {
            if (namaInput.equals(usernames.get(i)) && sandiInput.equals(passwords.get(i))) {
                loginBerhasil = true;
                break;
            }
        }

        if (loginBerhasil) {
            System.out.println("Nama pengguna dan kata sandi valid, Anda dapat masuk ke dasbor.");
        } else {
            System.out.println("Nama pengguna dan kata sandi salah.");
        }

        input.close();
    }
}
