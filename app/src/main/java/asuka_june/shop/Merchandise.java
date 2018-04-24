package asuka_june.shop;

public class Merchandise {
    public  String name;
    public  String subname;
    public  Integer price;
    public  String barcode;

    public Merchandise(String name, String subname, Integer price, String barcode){
        this.name = name;
        this.subname = subname;
        this.price = price;
        this.barcode = barcode;
    }

    public Merchandise(){
        name = "Name";
        subname = "Subname";
        price = 5;
        barcode = "12345";
    }
}
