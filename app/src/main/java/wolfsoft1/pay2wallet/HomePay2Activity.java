package wolfsoft1.pay2wallet;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

import java.util.ArrayList;

import Adapters.GridAdapter;
import Adapters.ProfilePagerAdapter_walkthrough_01;
import Models.GridModel;
import me.relex.circleindicator.CircleIndicator;

public class HomePay2Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private ProfilePagerAdapter_walkthrough_01 profilePagerAdapterWalkthrough01;


    private ArrayList<GridModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private GridAdapter bAdapter;
    BottomBar mBottomBar;

    String fieldName []={"Mobile","DTH","Data Card","Landline","Broadband",
            "Gas","Electricity","Water",
            "Insurance","Fees","Credit Card","Google Play"};
    Integer fieldImage []={R.drawable.mobile,R.drawable.dth,R.drawable.data_card,R.drawable.landlne,
            R.drawable.broadband,R.drawable.gas,R.drawable.electricity,
            R.drawable.water,R.drawable.insurance,R.drawable.fee,R.drawable.creditcard,R.drawable.google_play};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pay2);

        mBottomBar=(BottomBar)findViewById(R.id.bottombar);
        setupBottomBar();

        //View Pager Code


        viewPager = (ViewPager) findViewById(R.id.viewPager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        profilePagerAdapterWalkthrough01 = new ProfilePagerAdapter_walkthrough_01(getSupportFragmentManager());

        viewPager.setAdapter(profilePagerAdapterWalkthrough01);

        indicator.setViewPager(viewPager);

        profilePagerAdapterWalkthrough01.registerDataSetObserver(indicator.getDataSetObserver());


        //Recycler View Code


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(HomePay2Activity.this,4);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < fieldName.length; i++) {
            GridModel beanClassForRecyclerView_contacts = new GridModel(fieldName[i],fieldImage[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new GridAdapter(HomePay2Activity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);
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
