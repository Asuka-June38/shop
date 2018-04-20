package asuka_june.shop;

public class CookBookMerchandise extends BookMerchandise {
    public String ingredient;

    public CookBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, String ingredient){
        super(name, "Cook", price, barcode, pageQuantity);
        this.ingredient = ingredient;
    }
}