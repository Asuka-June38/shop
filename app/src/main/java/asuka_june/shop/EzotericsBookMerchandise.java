package asuka_june.shop;

public class EzotericsBookMerchandise extends BookMerchandise {
    public Integer age;

    public EzotericsBookMerchandise(){
        super();
        age = 18;
    }

    public EzotericsBookMerchandise(String name, Integer price, String barcode, Integer quant, Integer age){
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.quant = quant;
        this.age = age;
    }
}
