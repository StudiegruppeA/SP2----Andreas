import java.text.DecimalFormat;
import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }


    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double money = 0;

        for(Title title : titles) {
            money += title.calculateRoyalty()  ;

        }
        return money;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
       return "Name: " + name + " Earned: " + df.format(calculateRoyalties());
    }
}
