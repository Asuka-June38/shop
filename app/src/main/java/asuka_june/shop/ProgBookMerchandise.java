package asuka_june.shop;

public class ProgBookMerchandise extends BookMerchandise {
    public String language;

    public ProgBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, String language){
        super(name, "Program", price, barcode, pageQuantity);
        this.language = language;
    }
}
