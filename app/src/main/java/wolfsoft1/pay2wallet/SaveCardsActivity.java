package wolfsoft1.pay2wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.MyTransactionAdapter;
import Adapters.SaveCardAdapter;
import Models.MyTransactionModel;
import Models.SaveCardsModel;

public class SaveCardsActivity extends AppCompatActivity {
    TextView txt;

    private ArrayList<SaveCardsModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private SaveCardAdapter bAdapter;

    Integer bankLogo[]={R.drawable.bank,R.drawable.bank};
    Integer cardLogo[]={R.drawable.visa,R.drawable.mastercard_1};
    String bankName[]={"Bank Name","Bank Name"};
    String card[]={"Debit card","Credit card"};
    String cardNo[]={"4029 **** **** 1213","4029 **** **** 1213"};
    String cardHolderName[]={"John Doe","John Doe"};
    String date[]={"01/21","01/21"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_cards);

        txt=(TextView)findViewById(R.id.txt);
        txt.setText("Save Cards");

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SaveCardsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < bankLogo.length; i++) {
            SaveCardsModel beanClassForRecyclerView_contacts = new SaveCardsModel(bankLogo[i],cardLogo[i], bankName[i],card[i],cardNo[i],cardHolderName[i],date[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new SaveCardAdapter(SaveCardsActivity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);
    }
}
