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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


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
        ItemList.clear();
        ItemList.add(new Header("Books"));
        ItemList.addAll(bookList);
        ItemList.add(new Header("Discs"));
        ItemList.addAll(discList);



        // Linking data with logic and layout.
        ArrayList<HashMap<String, String>> itemList = new ArrayList<>();
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



        ListView listView = getListView();
        listView.setAdapter(adapter);

        // Transport object from one activity to another.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
               Merchandise itemToView = ItemList.get((int)id);
                if (itemToView.name != "Books" && itemToView.name != "Discs"){
                   Intent intent = new Intent(getApplication(), InformationActivity.class);
                   intent.putExtra(InformationActivity.EXTRA_ITEM, (Parcelable) itemToView);
                   startActivity(intent);
               }
            }
        });
    }
}

