package asuka_june.shop;

public class CookBookMerchandise extends BookMerchandise {
    public String ingredient;

    public CookBookMerchandise(){
        super();
        ingredient = "Python 3.x";
    }

    public CookBookMerchandise(String name, Integer price, String barcode, Integer quant, String ingredient){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.quant = quant;
        this.ingredient = ingredient;
    }
}
