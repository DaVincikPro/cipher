import java.util.ArrayList;

public class normal_cipher {
    private ArrayList<String> List = new ArrayList<>();

    public void MakeList() {
        List.add("a");
        List.add("b");
        List.add("c");
        List.add("d");
        List.add("e");
        List.add("f");
        List.add("g");
        List.add("h");
        List.add("i");
        List.add("j");
        List.add("k");
        List.add("l");
        List.add("m");
        List.add("n");
        List.add("o");
        List.add("p");
        List.add("s");
        List.add("t");
        List.add("u");
        List.add("v");
        List.add("w");
        List.add("x");
        List.add("y");
        List.add("z");
    }

    public int[] GetIndex(String word) {
        int[] Index = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            Index[i] = this.List.indexOf(word.charAt(i));
        }
        return Index;
    }

    public void PrintWord(int[] Index) {
        for (int i = 0; i < Index.length; i++) {
            System.out.print(this.List.get(Index[i]));
        }
    }
}
