package asuka_june.shop;

public class VideoDiscMerchandise extends DiscMerchandise {

    public VideoDiscMerchandise(String name, Integer price, String barcode, DiscType disctype){
        super(name, "Video", price, barcode, disctype);
    }
}
