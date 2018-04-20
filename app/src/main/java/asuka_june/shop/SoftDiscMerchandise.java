package asuka_june.shop;

public class SoftDiscMerchandise extends DiscMerchandise {
    public SoftDiscMerchandise(String name, Integer price, String barcode, DiscType disctype){
        super(name, "Soft", price, barcode, disctype);
    }
}
