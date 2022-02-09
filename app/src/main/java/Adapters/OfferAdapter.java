package Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Models.GridModel;
import Models.OfferModel;
import wolfsoft1.pay2wallet.R;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder>{

    Context context;


    private List<OfferModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView logoImage;
        TextView offerField1,offerField2,offerField3;

        public MyViewHolder(View view) {
            super(view);

            offerField1=(TextView)view.findViewById(R.id.offerField1);
            offerField2=(TextView)view.findViewById(R.id.offerField2);
            offerField3=(TextView)view.findViewById(R.id.offerField3);

            logoImage=(ImageView)view.findViewById(R.id.logoImage);


        }

    }


    public OfferAdapter(Context mainActivityContacts, List<OfferModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public OfferAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_offer, parent, false);


        return new OfferAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(OfferAdapter.MyViewHolder holder, int position) {
        OfferModel lists = OfferList.get(position);


        holder.offerField1.setText(lists.getOfferField1());
        holder.offerField2.setText(lists.getOfferField2());
        holder.offerField3.setText(lists.getOfferField3());
        holder.logoImage.setImageResource(lists.getLogoImage());


    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}

