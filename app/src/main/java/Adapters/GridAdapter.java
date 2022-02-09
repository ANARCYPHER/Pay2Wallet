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
import wolfsoft1.pay2wallet.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.MyViewHolder>{

    Context context;


    private List<GridModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView fieldImage;
        TextView fieldName;
        CardView tick;

        public MyViewHolder(View view) {
            super(view);

            fieldName=(TextView)view.findViewById(R.id.fieldName);

            fieldImage=(ImageView)view.findViewById(R.id.fieldImage);
            tick=(CardView) view.findViewById(R.id.tick);


        }

    }


    public GridAdapter(Context mainActivityContacts, List<GridModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public GridAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_pay2, parent, false);


        return new GridAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(GridAdapter.MyViewHolder holder, int position) {
        GridModel lists = OfferList.get(position);


        holder.fieldName.setText(lists.getFieldName());
        holder.fieldImage.setImageResource(lists.getFieldImage());

        if (position == 7) {

           holder.tick.setVisibility(View.VISIBLE);
        }
        else {
            holder.tick.setVisibility(View.GONE);
        }

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}

