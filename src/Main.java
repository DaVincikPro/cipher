import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        String[] ciphers = {"normal", "caesar"};
        System.out.println("Chose cipher from translate and to");
        for (int i = 0; i < ciphers.length; i++) {
            System.out.println(i + " " + ciphers[i]);
        }
        System.out.println("Write index of first cipher");
        int index1 = scanInt.nextInt();
        System.out.println("Write index of second cipher");
        int index2 = scanInt.nextInt();

        System.out.println("Enter text to translate");
        String text = scanStr.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            int[] Index = new int[words[i].length()];
            switch (index1) {
                case 0:
                    normal_cipher C0 = new normal_cipher();
                    C0.MakeList();
                    Index = C0.GetIndex(words[i]);
                    break;
                case 1:
                    caesar_cipher C1 = new caesar_cipher();
                    C1.MakeList();
                    Index = C1.GetIndex(words[i]);
                    break;
            }
            switch (index2) {
                case 0:
                    normal_cipher C0 = new normal_cipher();
                    C0.MakeList();
                    C0.PrintWord(Index);
                    break;
                case 1:
                    caesar_cipher C1 = new caesar_cipher();
                    C1.MakeList();
                    C1.PrintWord(Index);
                    break;
            }
        }
    }
}
