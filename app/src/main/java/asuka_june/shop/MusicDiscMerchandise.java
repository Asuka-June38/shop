package asuka_june.shop;

public class MusicDiscMerchandise extends DiscMerchandise {

    public MusicDiscMerchandise(String name, Integer price, String barcode, DiscType disctype){
        super(name, "Music", price, barcode, disctype);
    }
}
