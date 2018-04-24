package asuka_june.shop;

public class BookMerchandise extends Merchandise {
    public  Integer pageQuantity;

    public BookMerchandise(String name, String subname, Integer price, String barcode, Integer pageQuantity){
        super(name, subname, price, barcode);
        this.pageQuantity = pageQuantity;
    }
}
