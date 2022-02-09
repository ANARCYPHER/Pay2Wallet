package wolfsoft1.pay2wallet;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

import Adapters.OfferFragmentAdapter;

public class OfferActivity extends AppCompatActivity {

    WrapContentHeightViewPager wrapContentHeightViewPager;
    BottomBar mBottomBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        mBottomBar=(BottomBar)findViewById(R.id.bottombar);
        setupBottomBar();
        TabLayout tabLayout = findViewById(R.id.tab);


        wrapContentHeightViewPager = (WrapContentHeightViewPager)findViewById(R.id.vp);

        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("ALL OFFERS"));
        tabLayout.addTab(tabLayout.newTab().setText("RECHARGE"));
        tabLayout.addTab(tabLayout.newTab().setText("DTH/BILLS"));
        tabLayout.addTab(tabLayout.newTab().setText("FOOD"));
        tabLayout.addTab(tabLayout.newTab().setText("MOVIES"));

        tabLayout.setTabGravity(TabLayout.MODE_FIXED);
        OfferFragmentAdapter tabAdapter1 = new OfferFragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
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
    private void setupBottomBar() {


        for (int i = 0; i < mBottomBar.getTabCount(); i++) {
            BottomBarTab tab = mBottomBar.getTabAtPosition(i);
            tab.setGravity(Gravity.CENTER);

            View icon = tab.findViewById(com.roughike.bottombar.R.id.bb_bottom_bar_icon);
            // the paddingTop will be modified when select/deselect,
            // so, in order to make the icon always center in tab,
            // we need set the paddingBottom equals paddingTop
            icon.setPadding(0, icon.getPaddingTop(), 0, icon.getPaddingTop());

            View title = tab.findViewById(com.roughike.bottombar.R.id.bb_bottom_bar_title);
            title.setVisibility(View.VISIBLE);
        }
    }
}



