public abstract class Title  {
    private String title;
    private String literatureType;
    private static final double rate = 0.067574;


    public Title(String name, String literatureType) {
        this.title = name;
        this.literatureType = literatureType;
    }


    public double calculateRoyalty() {
        return this.calculatePoints() * rate;
    }

    protected double calculatePoints() {
        return 0;
    }


    protected double convertLiteratureType() {
       switch (literatureType) {
           case "BI", "TE" -> {
               return 3;
           }
           case "LYRIK" -> {
               return 6;
           }
           case "SKØN" -> {
               return 1.7;
           }
           case "FAG" -> {
               return 1;
           }
           default -> {
               return 0;
           }
       }

    }



}
