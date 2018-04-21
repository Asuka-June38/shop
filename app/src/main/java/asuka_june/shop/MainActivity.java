package asuka_june.shop;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView listView = (ListView) findViewById(R.id.list);

        ArrayList<HashMap<String, String>> itemList = new ArrayList<>();
        for (Merchandise item: new MerchandiseList()) {
            HashMap<String, String> map = new HashMap<>();
            map.put("name", item.name);
            map.put("subname", item.subname);
            itemList.add(map);
        }



        SimpleAdapter adapter = new SimpleAdapter(this, itemList, android.R.layout.simple_list_item_2,
                new String[] {"name", "subname"},
                new int[] {android.R.id.text1, android.R.id.text2});

        ListView listView = getListView();

        listView.setAdapter(adapter);




    }
}

