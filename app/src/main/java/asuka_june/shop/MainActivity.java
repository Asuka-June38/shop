package asuka_june.shop;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting, sorting and preparing list of items for being viewed.
        final ArrayList<Merchandise> ItemList = new MerchandiseList();
        ArrayList<Merchandise> bookList = new ArrayList<Merchandise>();
        ArrayList<Merchandise> discList = new ArrayList<Merchandise>();
        for (Merchandise item : ItemList){
            if (item.subname == "Music" ||  item.subname == "Soft" || item.subname == "Video"){
                discList.add(item);
            }
            else{
                bookList.add(item);
            }
        }

        // Linking data with logic and layout.
        final ArrayList<HashMap<String, String>> bookHashList = new ArrayList<>();
        for (Merchandise item : bookList) {
            HashMap<String, String> map = new HashMap<>();
            map.put("name", item.name);
            map.put("subname", item.subname);
            bookHashList.add(map);
        }
        ArrayList<HashMap<String, String>> discHashList = new ArrayList<>();
        for (Merchandise item : discList) {
            HashMap<String, String> map = new HashMap<>();
            map.put("name", item.name);
            map.put("subname", item.subname);
            discHashList.add(map);
        }

        // Create adapter.
        SeparatedListAdapter Adapter = new SeparatedListAdapter(this);
        Adapter.addSection("Books", new SimpleAdapter(this, bookHashList, android.R.layout.simple_list_item_2,
                new String[] {"name", "subname"},
                new int[] {android.R.id.text1, android.R.id.text2}));
        Adapter.addSection("Discs", new SimpleAdapter(this, discHashList, android.R.layout.simple_list_item_2,
                new String[] {"name", "subname"},
                new int[] {android.R.id.text1, android.R.id.text2}));

        ListView listView = getListView();
        listView.setAdapter(Adapter);

        // Transport object from one activity to another.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Integer numberOfItemToView;
                if ((int)id<=bookHashList.size()+1){numberOfItemToView = (int)id - 1;}
                else{ numberOfItemToView = (int)id - 2;}
                Merchandise itemToView = ItemList.get(numberOfItemToView);
                Intent intent = new Intent(getApplication(), InformationActivity.class);
                intent.putExtra(InformationActivity.EXTRA_ITEM, (Parcelable) itemToView);
                startActivity(intent);
            }
        });
    }
}

