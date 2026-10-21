public class PrintedBook extends PhysicalTitle {
    private int pages;

    PrintedBook (String name, String literatureType, int pages, int copies) {
        super(name, literatureType, copies);
        this.pages = pages;
    }

    protected double calculatepoints() {
        return pages * super.convertLiteratureType() * copies;
    }

}
