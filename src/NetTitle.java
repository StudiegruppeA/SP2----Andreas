public class NetTitle extends Title {
    private int avaliability;
    private int reach;
    private int use;

    public NetTitle(String name, String literatureType, int avalibility, int reach, int use) {
        super(name, literatureType);
        this.avaliability = avalibility;
        this.reach = reach;
        this.use = use;
    }

    protected double getPseduCopies() {
        return ((reach * 5) + (avaliability * 0.5) + use);

    }
    private int getUseFactor() {
        return use;
    }

}
