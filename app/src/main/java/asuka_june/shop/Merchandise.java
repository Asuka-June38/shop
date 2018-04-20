package asuka_june.shop;

public class Merchandise {
    public String name;
    public Integer price;
    public String barcode;

    public Merchandise(String name, Integer price, String barcode){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public Merchandise(){
        name = "Name";
        price = 5;
        barcode = "12345";
    }
}
