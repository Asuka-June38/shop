package asuka_june.shop;

import android.os.Parcel;
import android.os.Parcelable;

public class DiscMerchandise extends Merchandise implements Parcelable{
    public static final Creator<DiscMerchandise> CREATOR = new DiscMerchandiseCreator();
    public  DiscType disctype;
    public DiscMerchandise(String name, String subname, Integer price, String barcode, DiscType disctype){
        super(name, subname, price, barcode);
        this.disctype = disctype;
    }
    @Override
    public String toString(){
        return name + "\n" + subname + "\n" + price + "\n" + barcode + "\n" + "Disc type: " + disctype;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(subname);
        dest.writeInt(price);
        dest.writeString(barcode);
        dest.writeSerializable(disctype);
    }

    public static class DiscMerchandiseCreator implements Parcelable.Creator<DiscMerchandise> {
        @Override
        public DiscMerchandise createFromParcel(Parcel source) {
            String name = source.readString();
            String subname = source.readString();
            Integer price = source.readInt();
            String barcode = source.readString();
            DiscType discType = (DiscType)source.readSerializable();

            return new DiscMerchandise(name, subname, price, barcode, discType);
        }
        @Override
        public DiscMerchandise[] newArray(int size) {
            return new DiscMerchandise[size];
        }
    }
}
