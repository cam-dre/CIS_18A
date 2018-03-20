public abstract class Container {
    protected String mfr;
    protected String stockNum;

    public Container(String mfr, String stockNum) {
        this.mfr = mfr;
        this.stockNum = stockNum;
    }
    public abstract String toString();
}
