package Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Models.MyTransactionModel;
import Models.SaveCardsModel;
import wolfsoft1.pay2wallet.R;

public class SaveCardAdapter extends RecyclerView.Adapter<SaveCardAdapter.MyViewHolder>{

        Context context;


private List<SaveCardsModel> OfferList;


public class MyViewHolder extends RecyclerView.ViewHolder {



    ImageView bankLogo,cardLogo;
    TextView  bankName,card,cardNo,cardHolderName,date;


    public MyViewHolder(View view) {
        super(view);

        bankName=(TextView)view.findViewById(R.id.bankName);
        card=(TextView)view.findViewById(R.id.card);
        cardNo=(TextView)view.findViewById(R.id.cardNo);
        cardHolderName=(TextView)view.findViewById(R.id.cardHolderName);
        date=(TextView)view.findViewById(R.id.date);

        bankLogo=(ImageView)view.findViewById(R.id.bankLogo);
        cardLogo=(ImageView)view.findViewById(R.id.cardLogo);


    }

}


    public SaveCardAdapter(Context mainActivityContacts, List<SaveCardsModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public SaveCardAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_saved_cards, parent, false);


        return new SaveCardAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(SaveCardAdapter.MyViewHolder holder, int position) {
        SaveCardsModel lists = OfferList.get(position);


        holder.bankName.setText(lists.getBankName());
        holder.card.setText(lists.getCard());
        holder.cardNo.setText(lists.getCardNo());
        holder.cardHolderName.setText(lists.getCardHolderName());
        holder.date.setText(lists.getDate());
        holder.bankLogo.setImageResource(lists.getBankLogo());
        holder.cardLogo.setImageResource(lists.getCardLogo());

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


