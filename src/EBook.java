public class EBook extends NetTitle {
    private int charecters;
    private boolean isIlustrated;

    public EBook(String name, String literatureType, int avalibility, int reach, int use, int charecters, boolean isIlustrated) {
        super(name, literatureType, avalibility, reach, use);
        this.charecters = charecters;
        this.isIlustrated = isIlustrated;
    }

    private double calculatePages() {
        return charecters/1800 + 20;

    }

    @Override
    protected double calculatePoints() {
        double points = calculatePages() * convertLiteratureType() * super.getPseduCopies();
        if(this.isIlustrated) {
            points *= 1.10;

        }
        return points;
    }
}
