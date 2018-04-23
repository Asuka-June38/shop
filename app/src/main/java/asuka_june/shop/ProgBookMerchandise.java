package asuka_june.shop;

import android.os.Parcel;
import android.os.Parcelable;

public class ProgBookMerchandise extends BookMerchandise implements Parcelable{
    public static final Creator<ProgBookMerchandise> CREATOR = new ProgBookMerchandiseCreator();
    public  String language;
    public ProgBookMerchandise(String name, Integer price, String barcode, Integer pageQuantity, String language){
        super(name, "Programming", price, barcode, pageQuantity);
        this.language = language;
    }
    @Override
    public String toString(){
        return name + "\n" + subname + "\n" + "Price: " + price + "\n" + "Barcode: " + barcode + "\n" + "Page quantity: " + pageQuantity +
                "\n" + "Programming language: " + language;
    }

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
        dest.writeString(language);
    }

    public static class ProgBookMerchandiseCreator implements Parcelable.Creator<ProgBookMerchandise> {
        @Override
        public ProgBookMerchandise createFromParcel(Parcel source) {
            String name = source.readString();
            Integer price = source.readInt();
            String barcode = source.readString();
            Integer pageQuantity = source.readInt();
            String language = source.readString();

            return new ProgBookMerchandise(name, price, barcode, pageQuantity, language);
        }
        @Override
        public ProgBookMerchandise[] newArray(int size) {
            return new ProgBookMerchandise[size];
        }
    }

}
