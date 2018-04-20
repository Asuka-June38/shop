package asuka_june.shop;

public class ProgBookMerchandise extends BookMerchandise {
    public String language;

    public ProgBookMerchandise(){
        super();
        language = "Python 3.x";
    }

    public ProgBookMerchandise(String name, Integer price, String barcode, Integer quant, String language){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.quant = quant;
        this.language = language;
    }
}
