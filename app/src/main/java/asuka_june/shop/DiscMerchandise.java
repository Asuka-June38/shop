package asuka_june.shop;

import static asuka_june.shop.DiscContent.music;
import static asuka_june.shop.DiscType.dvd;

public class DiscMerchandise extends Merchandise {
    public DiscType disctype;
    public DiscContent disccontent;

    public DiscMerchandise(){
        super();
        disctype = dvd;
        disccontent = music;
    }

    public DiscMerchandise(String name, Integer price, String barcode, DiscType disctype, DiscContent disccontent){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.disctype = disctype;
        this.disccontent = disccontent;
    }
}
