package asuka_june.shop;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class InformationActivity extends Activity {
    public static final String EXTRA_ITEM = "extra_item";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inforamtion);

        // Get item from main activity.xml.
        Merchandise itemToView = getIntent().getParcelableExtra(EXTRA_ITEM);
        TextView text = (TextView)findViewById(R.id.text);
        text.setText(itemToView.toString());
    }
}
