public class EAudioBook extends NetTitle implements IAudioBook {
    private int durationminutes;

    public EAudioBook(String name, String literatureType, int avalibility, int reach, int use, int durationminutes) {
        super(name, literatureType, avalibility, reach, use);
        this.durationminutes = durationminutes;
    }


    protected double calculatePoints() {
        return ((double) durationminutes / 2) * super.getPseduCopies();

    }


    @Override
    public int getDurationInMinutes() {
        return durationminutes;
    }
}
