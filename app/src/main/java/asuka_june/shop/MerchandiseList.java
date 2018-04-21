package asuka_june.shop;

import java.util.ArrayList;

import static asuka_june.shop.DiscType.CD;
import static asuka_june.shop.DiscType.DVD;

public class MerchandiseList extends ArrayList<Merchandise> {
    public MerchandiseList() {
        add(new CookBookMerchandise("Burger", 200, "759491807891", 10, "salad"));
        add(new CookBookMerchandise("Coffee", 150, "768879797878", 101, "water"));
        add(new ProgBookMerchandise("Python for biology stat", 500, "579893818887", 400, "Python"));
        add(new ProgBookMerchandise("Java for dummies", 300, "51749574", 200, "Java"));
        add(new EsotericsBookMerchandise("Donuts vs Doughnuts", 250, "458887749392", 600, 30));
        add(new EsotericsBookMerchandise("Cats among people", 700, "44749392", 340, 16));
        add(new MusicDiscMerchandise("Reise, reise", 500, "5978829278", CD));
        add(new MusicDiscMerchandise("Mutter", 600, "549493937891", CD));
        add(new VideoDiscMerchandise("Pride and prejudice", 400, "5791827778", CD));
        add(new VideoDiscMerchandise("The walk", 450, "96748584", CD));
        add(new SoftDiscMerchandise("HOMM3", 150, "4956545429", CD));
        add(new SoftDiscMerchandise("Plague inc.", 300, "578574809478", CD));
        add(new MusicDiscMerchandise("Liebe ist fur alle da", 100500, "5382787578", DVD));
        add(new MusicDiscMerchandise("Sehnsucht", 404, "607881879294768193", DVD));
        add(new VideoDiscMerchandise("Star wars", 1, "609374912096749192", DVD));
        add(new VideoDiscMerchandise("Alien", 2, "4285827887", DVD));
        add(new SoftDiscMerchandise("Portal", 79, "578891937485", DVD));
        add(new SoftDiscMerchandise("Don't starve", 67, "929374919578", DVD));
    }

    public MerchandiseList(MerchandiseList listOfMerchadise) {
        this.addAll(listOfMerchadise);
    }
}
