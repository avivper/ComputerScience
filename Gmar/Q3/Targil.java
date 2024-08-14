package Gmar.Q3;

public class Targil {
    private String word;
    private Targil tail;

    public Targil(String word) {
        this.word = word;
        if (this.word.length() > 1) {
            this.tail = new Targil(this.word.substring(1));
        } else {
            this.tail = null;
        }
    }

    public void rReport() {
        if (this.tail != null) {
            this.tail.rReport();
        }
        System.out.println(this.word);
    }

    // todo: Question C: write iReport as the iterative approach for rReport

    public void iReport() {
        if (this.tail == null) {
            return;
        }

        String result = "";
        for (int i = this.word.length(); 0 < i; i--) {
            result = this.word.charAt(i-1) + result;
            System.out.println(result);
        }
    }
}
