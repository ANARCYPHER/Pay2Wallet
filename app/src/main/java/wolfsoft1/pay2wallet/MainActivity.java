package wolfsoft1.pay2wallet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.ActivityListAdapter;
import Adapters.MyTransactionAdapter;
import Models.ActivityListModel;
import Models.MyTransactionModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ActivityListAdapter bAdapter;
    private ArrayList<ActivityListModel> homeListModelClassArrayList1;

    TextView txt;
    String itemtxt[]={"SplashActivity","WelcomeActivity","LoginActivity","SignupActivity","MobileVerificationActivity","FingerPrintActivity","OtpActivity","SecureLoginActivity",
    "HomePay2Activity","ScanAndPayActivity","OfferActivity","MyTransactionActivity","AddNewCardActivity","AddWalletBalanceActivity",
    "SaveCardsActivity","MyAccountActivity","TransactionDetailsActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < itemtxt.length; i++) {
            ActivityListModel beanClassForRecyclerView_contacts = new ActivityListModel(itemtxt[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new ActivityListAdapter(MainActivity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);


    }
}
