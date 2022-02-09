package wolfsoft1.pay2wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileVerificationActivity extends AppCompatActivity {
    TextView one,two,three,four,five,six,seven,eight,nine,zero;
    ImageView clear;
    EditText edtxt;
    String nos, number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_verification);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        one=(TextView)findViewById(R.id.one);
        two=(TextView)findViewById(R.id.two);
        three=(TextView)findViewById(R.id.three);
        four=(TextView)findViewById(R.id.four);
        five=(TextView)findViewById(R.id.five);
        six=(TextView)findViewById(R.id.six);
        seven=(TextView)findViewById(R.id.seven);
        eight=(TextView)findViewById(R.id.eight);
        nine=(TextView)findViewById(R.id.nine);
        zero=(TextView)findViewById(R.id.zero);
        clear=(ImageView)findViewById(R.id.clear);
        edtxt=(EditText)findViewById(R.id.edtxt);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                nos= (String) one.getText();

                number =   number + "1";
                Log.e("number", number);

                edtxt.setText(number);


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) two.getText();
                edtxt.setText(nos);

                number =   number + "2";
                edtxt.setText(number);
                Log.e("number", number);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) three.getText();
                edtxt.setText(nos);

                number = number +"3";
                edtxt.setText(number);
                Log.e("number", number);



            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) four.getText();
                edtxt.setText(nos);

                number = number +"4";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) five.getText();
                edtxt.setText(nos);

                number = number +"5";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) six.getText();
                edtxt.setText(nos);

                number = number +"6";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nos= (String) seven.getText();
                edtxt.setText(nos);

                number = number +"7";
                edtxt.setText(number);
                Log.e("number", number);

                }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) eight.getText();
                edtxt.setText(nos);

                number = number +"8";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nos= (String) nine.getText();
                edtxt.setText(nos);

                number = number +"9";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nos= (String) zero.getText();
                edtxt.setText(nos);

                number = number +"0";
                edtxt.setText(number);
                Log.e("number", number);


            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
