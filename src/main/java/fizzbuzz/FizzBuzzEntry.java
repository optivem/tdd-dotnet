package fizzbuzz;

public class FizzBuzzEntry {
    private int mod;
    private String line;

    public FizzBuzzEntry(int mod, String line) {
        this.mod = mod;
        this.line = line;
    }

    public int getMod() {
        return mod;
    }

    public String getLine() {
        return line;
    }
}