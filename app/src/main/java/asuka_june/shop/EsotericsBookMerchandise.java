package asuka_june.shop;

public class EsotericsBookMerchandise extends BookMerchandise {
    public Integer age;

    public EsotericsBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, Integer age){
        super(name, "Esoterics", price, barcode, pageQuantity);
        this.age = age;
    }
}
