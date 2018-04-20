package asuka_june.shop;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

//        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
//        HashMap<String, String> map;
//
//        // Досье на первого кота
//        map = new HashMap<>();
//        map.put("Name", "Мурзик");
//        map.put("Tel", "495 501-3545");
//        arrayList.add(map);
//
//        // Досье на второго кота
//        map = new HashMap<>();
//        map.put("Name", "Барсик");
//        map.put("Tel", "495 241-6845");
//        arrayList.add(map);
//
//        // Досье на третьего кота
//        map = new HashMap<>();
//        map.put("Name", "Васька");
//        map.put("Tel", "495 431-5468");
//        arrayList.add(map);
//
//        SimpleAdapter adapter = new SimpleAdapter(this, arrayList, android.R.layout.simple_list_item_2,
//                new String[]{"Name", "Tel"},
//                new int[]{android.R.id.text1, android.R.id.text2});


        SimpleAdapter adapter = new SimpleAdapter(this, arrayList, android.R.layout.simple_list_item_2,
                new String[]{"Name", "Tel"},
                new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);
    }
}

