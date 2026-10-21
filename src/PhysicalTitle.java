public class PhysicalTitle extends Title{
    protected int copies;

    PhysicalTitle(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

}
