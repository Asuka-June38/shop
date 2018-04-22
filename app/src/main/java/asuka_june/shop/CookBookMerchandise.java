package asuka_june.shop;

import android.os.Parcel;
import android.os.Parcelable;


public class CookBookMerchandise extends BookMerchandise implements Parcelable{
    public static final Creator<CookBookMerchandise> CREATOR = new CookBookMerchandiseCreator();
    public String ingredient;
    public CookBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, String ingredient){
        super(name, "Cook", price, barcode, pageQuantity);
        this.ingredient = ingredient;
    }

//    @Override
//    public String toString(){
//        return CookBookMerchandise.name + "\n" + CookBookMerchandise.subname + "\n" + CookBookMerchandise.price +
//                "\n" + CookBookMerchandise.barcode + "\n" + "Page quantity: " + CookBookMerchandise.pageQuantity +
//                "\n" + "Main ingredient: " + CookBookMerchandise.ingredient;
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
        dest.writeString(ingredient);
    }

    public static class CookBookMerchandiseCreator implements Parcelable.Creator<CookBookMerchandise> {
        @Override
        public CookBookMerchandise createFromParcel(Parcel source) {
            String name = source.readString();
            Integer price = source.readInt();
            String barcode = source.readString();
            Integer pageQuantity = source.readInt();
            String ingredient = source.readString();

            return new CookBookMerchandise(name, price, barcode, pageQuantity, ingredient);
        }
        @Override
        public CookBookMerchandise[] newArray(int size) {
            return new CookBookMerchandise[size];
        }
    }


}