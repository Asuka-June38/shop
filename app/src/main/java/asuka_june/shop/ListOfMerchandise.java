package asuka_june.shop;

import java.util.ArrayList;

import static asuka_june.shop.DiscContent.music;
import static asuka_june.shop.DiscContent.soft;
import static asuka_june.shop.DiscContent.video;
import static asuka_june.shop.DiscType.cd;
import static asuka_june.shop.DiscType.dvd;

public class ListOfMerchandise {
    public ArrayList<Merchandise> listOfMerchandise;

    public ListOfMerchandise() {
        listOfMerchandise = new ArrayList<Merchandise>();
    }

    public ListOfMerchandise(ArrayList<Merchandise> listOfMerchadise) {
        this.listOfMerchandise = listOfMerchandise;
    }

    public void createlist() {

        listOfMerchandise.add(new CookBookMerchandise("Burger", 200, "759491807891", 10, "salad"));

        listOfMerchandise.add(new CookBookMerchandise("Coffee", 150, "768879797878", 101, "water"));

        listOfMerchandise.add(new ProgBookMerchandise("Python for biology stat", 500, "579893818887", 400, "Python"));

        listOfMerchandise.add(new ProgBookMerchandise("Java for dummies", 300, "51749574", 200, "Java"));

        listOfMerchandise.add(new EzotericsBookMerchandise("Donuts vs Doughnuts", 250, "458887749392", 600, 30));

        listOfMerchandise.add(new EzotericsBookMerchandise("Cats among people", 700, "44749392", 340, 16));

        listOfMerchandise.add(new DiscMerchandise("Reise, reise", 500, "5978829278", cd, music));

        listOfMerchandise.add(new DiscMerchandise("Mutter", 600, "549493937891", cd, music));

        listOfMerchandise.add(new DiscMerchandise("Pride and prejudice", 400, "5791827778", cd, video));

        listOfMerchandise.add(new DiscMerchandise("The walk", 450, "96748584", cd, video));

        listOfMerchandise.add(new DiscMerchandise("HOMM3", 150, "4956545429", cd, soft));

        listOfMerchandise.add(new DiscMerchandise("Plague inc.", 300, "578574809478", cd, soft));

        listOfMerchandise.add(new DiscMerchandise("Liebe is fur alle da", 100500, "5382787578", dvd, music));

        listOfMerchandise.add(new DiscMerchandise("Sehnsucht", 404, "607881879294768193", dvd, music));

        listOfMerchandise.add(new DiscMerchandise("Star wars", 1, "609374912096749192", dvd, video));

        listOfMerchandise.add(new DiscMerchandise("Alien", 2, "4285827887", dvd, video));

        listOfMerchandise.add(new DiscMerchandise("Portal", 79, "578891937485", dvd, soft));

        listOfMerchandise.add(new DiscMerchandise("Don't starve", 67, "929374919578", dvd, soft));

    }
}
