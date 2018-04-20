package asuka_june.shop;

public class BookMerchandise extends Merchandise {
    public Integer quant;

    public  BookMerchandise(){
        super();
        quant = 100;
    }

    public BookMerchandise(String name, Integer price, String barcode, Integer quant){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.quant = quant;
    }
}
