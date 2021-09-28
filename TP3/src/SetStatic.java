import java.util.Arrays;
class StaticSet {
    private int[] data;
    private int lastEl;
    public StaticSet(int taille) {
        this.data = new int[taille];
        this.lastEl = 0;
    }

    public boolean add(int el) {
        if (this.contains(el)) {
            return true;
        }
        if (this.lastEl >= this.data.length) {
            return false;
        }
        this.data[this.lastEl] = el;
        this.lastEl += 1;
        return true;
    }
    public boolean contains(int el) {
        for (int i = 0; i < this.lastEl; i++) {
            if (this.data[i] == el) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        Arrays.sort(this.data, 0, this.lastEl);
        String res = "";
        for (int i = 0; i < this.lastEl; i++) {
            res += this.data[i] + "-";
        }
        return res.substring(0, res.length() - 1);
    }
}