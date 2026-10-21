public class Main {

    public void main() {

        Author Astrid = new Author("Astrid");


        Title ebog = new EBook("pipi","FAG", 97, 50,205, 360000, false);
        Astrid.addTitle(ebog);

        System.out.println(Astrid);




    }
}