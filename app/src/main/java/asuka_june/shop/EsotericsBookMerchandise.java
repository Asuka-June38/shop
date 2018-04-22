package asuka_june.shop;

import android.os.Parcel;
import android.os.Parcelable;


public class EsotericsBookMerchandise extends BookMerchandise implements Parcelable{
    public static final Creator<EsotericsBookMerchandise> CREATOR = new EsotericsBookMerchandiseCreator();
    public  Integer age;
    public EsotericsBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, Integer age){
        super(name, "Esoterics", price, barcode, pageQuantity);
        this.age = age;
    }
//    @Override
//    public String toString(){
//        return EsotericsBookMerchandise.name + "\n" + EsotericsBookMerchandise.subname + "\n" + EsotericsBookMerchandise.price +
//                "\n" + EsotericsBookMerchandise.barcode + "\n" + "Page quantity: " + EsotericsBookMerchandise.pageQuantity +
//                "\n" + "Legal age: " + EsotericsBookMerchandise.age;
//    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
        dest.writeString(barcode);
        dest.writeInt(pageQuantity);
        dest.writeInt(age);
    }

    public static class EsotericsBookMerchandiseCreator implements Parcelable.Creator<EsotericsBookMerchandise> {
        @Override
        public EsotericsBookMerchandise createFromParcel(Parcel source) {
            String name = source.readString();
            Integer price = source.readInt();
            String barcode = source.readString();
            Integer pageQuantity = source.readInt();
            Integer age = source.readInt();

            return new EsotericsBookMerchandise(name, price, barcode, pageQuantity, age);
        }
        @Override
        public EsotericsBookMerchandise[] newArray(int size) {
            return new EsotericsBookMerchandise[size];
        }
    }

}
