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

        // Linking data with logic and layout.
        ArrayList<HashMap<String, String>> itemList = new ArrayList<>();
        final ArrayList<Merchandise> ItemList = new MerchandiseList();
        for (Merchandise item: ItemList) {
            HashMap<String, String> map = new HashMap<>();
            map.put("name", item.name);
            map.put("subname", item.subname);
            itemList.add(map);
        }

        // Creating adapter.
        SimpleAdapter adapter = new SimpleAdapter(this, itemList, android.R.layout.simple_list_item_2,
                new String[] {"name", "subname"},
                new int[] {android.R.id.text1, android.R.id.text2});

        // Transport object from one activity to another.
        ListView listView = getListView();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
               Merchandise itemToView = ItemList.get((int)id);
               Intent intent = new Intent(getApplication(), InformationActivity.class);
               intent.putExtra(InformationActivity.EXTRA_ITEM, (Parcelable) itemToView);
               startActivity(intent);
            }
        });
    }
}

