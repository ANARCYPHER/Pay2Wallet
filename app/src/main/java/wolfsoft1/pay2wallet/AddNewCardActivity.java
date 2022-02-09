package wolfsoft1.pay2wallet;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import Adapters.AddNewCardFragmentAdapter;
import Adapters.OfferFragmentAdapter;

public class AddNewCardActivity extends AppCompatActivity {
    TextView txt;

    WrapContentHeightViewPager wrapContentHeightViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_card);

        txt=(TextView)findViewById(R.id.txt);

        txt.setText("Add New Card");

        TabLayout tabLayout = findViewById(R.id.tab);

        wrapContentHeightViewPager = (WrapContentHeightViewPager)findViewById(R.id.vp);

        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("Debit Card"));
        tabLayout.addTab(tabLayout.newTab().setText("Credit Card"));

        tabLayout.setTabGravity(TabLayout.MODE_FIXED);
        AddNewCardFragmentAdapter tabAdapter1 = new AddNewCardFragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        wrapContentHeightViewPager.setAdapter(tabAdapter1);
        //  tabLayout.setupWithViewPager(wrapContentHeightViewPager);

        wrapContentHeightViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                wrapContentHeightViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}



