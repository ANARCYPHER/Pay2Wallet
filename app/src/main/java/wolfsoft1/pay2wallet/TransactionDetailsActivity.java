package wolfsoft1.pay2wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TransactionDetailsActivity extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);
        txt=(TextView)findViewById(R.id.txt);

        txt.setText("My Transaction");

    }
}
