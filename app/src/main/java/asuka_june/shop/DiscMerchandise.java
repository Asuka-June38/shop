package asuka_june.shop;

public class DiscMerchandise extends Merchandise {
    public DiscType disctype;

    public DiscMerchandise(String name, String subname, Integer price, String barcode, DiscType disctype){
        super(name, subname, price, barcode);
        this.disctype = disctype;
    }
}
