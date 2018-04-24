//package asuka_june.shop;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class MyAdapter extends BaseAdapter {
//
//    private static final int TYPE_ITEM = 0;
//    private static final int TYPE_HEADER = 1;
//
//    private LayoutInflater mInflater;
//
//    public MyAdapter(Context context) {
//        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//
//
//
//
//
//    public View getView(int position, View convertView, ViewGroup parent) {
//        CustomAdapter.ViewHolder holder = null;
//        int rowType = getItemViewType(position);
//
//// Pattern of changig type of rows: item and headers.
//        if (convertView == null) {
//            holder = new CustomAdapter.ViewHolder();
//            switch (rowType) {
//                case TYPE_ITEM:
//                    convertView = mInflater.inflate(R.layout.row_item, null);
//                    holder.textView = (TextView) convertView.findViewById(R.id.txtName);
//                    holder.txtSubname = (TextView) convertView.findViewById(R.id.txtSubname);
//                    break;
//                case TYPE_HEADER:
//                    convertView = mInflater.inflate(R.layout.header_item, null);
//                    holder.textView = (TextView) convertView.findViewById(R.id.textSeparator);
//                    break;
//            }
//            convertView.setTag(holder);
//        }
//        else {
//            holder = (CustomAdapter.ViewHolder) convertView.getTag();
//        }
//// Getting information from arraylist.
//        if(rowType == TYPE_ITEM){
//            holder.textView.setText(DATA111.get(position).gettName());
//            holder.txtSubname.setText(DATA111.get(position).getSubame());
//        }
//        else if(rowType == TYPE_HEADER){
//            holder.textView.setText(DATA111.get(position).gettName());
//        }
//
//        return convertView;
//    }
//
//    public static class ViewHolder {
//        public TextView textView;
//        public TextView txtSubname;
//    }
//
//
//}
//
