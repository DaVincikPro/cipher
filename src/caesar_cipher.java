import java.util.ArrayList;

public class caesar_cipher {
    private ArrayList<String> ListC = new ArrayList<>();

    public void MakeList() {
        ListC.add("x");
        ListC.add("y");
        ListC.add("z");
        ListC.add("a");
        ListC.add("b");
        ListC.add("c");
        ListC.add("d");
        ListC.add("e");
        ListC.add("f");
        ListC.add("g");
        ListC.add("h");
        ListC.add("i");
        ListC.add("j");
        ListC.add("k");
        ListC.add("l");
        ListC.add("m");
        ListC.add("n");
        ListC.add("o");
        ListC.add("p");
        ListC.add("s");
        ListC.add("t");
        ListC.add("u");
        ListC.add("v");
        ListC.add("w");
    }

    public int[] GetIndex(String word) {
        int[] Index = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            Index[i] = this.ListC.indexOf(String.valueOf(word.charAt(i)));
        }
        return Index;
    }

    public void PrintList() {
        for (int i = 0; i < this.ListC.size(); i++) {
            System.out.println(this.ListC.get(i));
        }
    }

    public void PrintWord(int[] Index) {
        for (int i = 0; i < Index.length; i++) {
            System.out.print(this.ListC.get(Index[i]));
        }
        System.out.print(" ");
    }
}
