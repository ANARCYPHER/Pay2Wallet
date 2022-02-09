package wolfsoft1.pay2wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

public class ScanAndPayActivity extends AppCompatActivity {
    private BottomBar mBottomBar;
    TextView txt;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_and_pay);


        txt=(TextView)findViewById(R.id.txt);
        back=(ImageView)findViewById(R.id.back);

        txt.setText("Scan & Pay");
        back.setVisibility(View.GONE);

        setupBottomBar();
    }
    private void setupBottomBar() {
        mBottomBar = (BottomBar) findViewById(R.id.bottombar);

        for (int i = 0; i < mBottomBar.getTabCount(); i++) {
            BottomBarTab tab = mBottomBar.getTabAtPosition(i);
            tab.setGravity(Gravity.CENTER);

            View icon = tab.findViewById(com.roughike.bottombar.R.id.bb_bottom_bar_icon);
            // the paddingTop will be modified when select/deselect,
            // so, in order to make the icon always center in tab,
            // we need set the paddingBottom equals paddingTop
            icon.setPadding(0, icon.getPaddingTop(), 0, icon.getPaddingTop());


        }
    }
}
