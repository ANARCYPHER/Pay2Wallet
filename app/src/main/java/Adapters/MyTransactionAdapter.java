package Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Models.ActivityListModel;
import Models.MyTransactionModel;
import wolfsoft1.pay2wallet.R;

public class MyTransactionAdapter extends RecyclerView.Adapter<MyTransactionAdapter.MyViewHolder>{

    Context context;


    private List<MyTransactionModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView iconImage,debitLogo;
        TextView billName,amount,phnNo;


        public MyViewHolder(View view) {
            super(view);

            billName=(TextView)view.findViewById(R.id.billName);
            amount=(TextView)view.findViewById(R.id.amount);
            phnNo=(TextView)view.findViewById(R.id.phnNo);

            iconImage=(ImageView)view.findViewById(R.id.iconImage);
            debitLogo=(ImageView)view.findViewById(R.id.debitLogo);


        }

    }


    public MyTransactionAdapter(Context mainActivityContacts, ArrayList<MyTransactionModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyTransactionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_my_tarnsaction, parent, false);


        return new MyTransactionAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(MyTransactionAdapter.MyViewHolder holder, int position) {
        MyTransactionModel lists = OfferList.get(position);


        holder.billName.setText(lists.getBillName());
        holder.amount.setText(lists.getAmount());
        holder.phnNo.setText(lists.getPhnNO());
        holder.iconImage.setImageResource(lists.getIconImage());
        holder.debitLogo.setImageResource(lists.getDebitLogo());

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


