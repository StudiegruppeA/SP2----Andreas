public class AudioBook extends PhysicalTitle implements IAudioBook {
    private int durationMinutes;

    AudioBook(String name, String literatureType, int durationMinutes, int copies) {
        super(name, literatureType, copies);
        this.durationMinutes = durationMinutes;

    }

    protected double calculatePoints() {
        return (durationMinutes * 0.5) * super.convertLiteratureType() * copies;



    }

    @Override
    public int getDurationInMinutes() {
        return durationMinutes;
    }
}
