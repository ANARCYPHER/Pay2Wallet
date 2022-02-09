package wolfsoft1.pay2wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

import java.util.ArrayList;

import Adapters.MyTransactionAdapter;
import Models.MyTransactionModel;

public class MyTransactionActivity extends AppCompatActivity {

    private ArrayList<MyTransactionModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private MyTransactionAdapter bAdapter;
    private RecyclerView recyclerView1;
    BottomBar mBottomBar;

    Integer iconImage[]={R.drawable.mobile_1,R.drawable.electricity_1};
    Integer debitLogo[]={R.drawable.visa,R.drawable.wallet};
    String billname[]={"Mobile recharged","Electricity bill paid"};
    String amount[]={"50","100.49"};
    String phnNo[]={"9382332131","34522"};

    Integer iconImage1[]={R.drawable.mobile_1,R.drawable.electricity_1,R.drawable.mobile_1};
    Integer debitLogo1[]={R.drawable.visa,R.drawable.visa,R.drawable.wallet};
    String billname1[]={"Mobile recharged","Electricity bill paid","Mobile recharged"};
    String amount1[]={"50","100","100"};
    String phnNo1[]={"9382332131","34522","34522"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_transaction);
        mBottomBar=(BottomBar)findViewById(R.id.bottombar);
        setupBottomBar();

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyTransactionActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < iconImage.length; i++) {
            MyTransactionModel beanClassForRecyclerView_contacts = new MyTransactionModel(iconImage[i],debitLogo[i], billname[i],amount[i],phnNo[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new MyTransactionAdapter(MyTransactionActivity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);


        recyclerView1 = findViewById(R.id.recyclerView1);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(MyTransactionActivity.this);
        recyclerView1.setLayoutManager(mlayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < iconImage1.length; i++) {
            MyTransactionModel beanClassForRecyclerView_contacts = new MyTransactionModel(iconImage1[i],debitLogo1[i], billname1[i],amount1[i],phnNo1[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new MyTransactionAdapter(MyTransactionActivity.this,homeListModelClassArrayList1);
        recyclerView1.setAdapter(bAdapter);

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
