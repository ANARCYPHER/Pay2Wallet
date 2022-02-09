package wolfsoft1.pay2wallet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapters.OfferAdapter;
import Adapters.ProfilePagerAdapter_walkthrough_01;
import Models.OfferModel;
import me.relex.circleindicator.CircleIndicator;

public class OfferFragment extends Fragment {
    private ViewPager viewPager;
    private ProfilePagerAdapter_walkthrough_01 profilePagerAdapterWalkthrough01;

    private ArrayList<OfferModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private OfferAdapter bAdapter;

    Integer logoImage[]={R.drawable.ic_ccd_logo,R.drawable.ic_mcd,R.drawable.ic_kfc};
    String offerField1[]={"Get","Flat","Flat"};
    String offerField2[]={"45% Cashback*","$5 Cashback*","$10 Cashback*"};
    String offerField3[]={"On 2 coffee at Cafe Coffe Day","On large combo at McDonald’s","On transactions at KFC"};



    Integer rlogoImage[]={R.drawable.foodpanda,R.drawable.swiggylogo,R.drawable.amazon_logo};
    String rofferField1[]={"Get","Flat","Flat"};
    String rofferField2[]={"45% Cashback*","$5 Cashback*","$10 Cashback*"};
    String rofferField3[]={"On 1st ever order","On large combo at Swiggy","On transactions at Amazon"};


    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_offer,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);

        profilePagerAdapterWalkthrough01 = new ProfilePagerAdapter_walkthrough_01(getChildFragmentManager());

        viewPager.setAdapter(profilePagerAdapterWalkthrough01);

        indicator.setViewPager(viewPager);

        profilePagerAdapterWalkthrough01.registerDataSetObserver(indicator.getDataSetObserver());


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < logoImage.length; i++) {
            OfferModel beanClassForRecyclerView_contacts = new OfferModel(logoImage[i],offerField1[i],offerField2[i],offerField3[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new OfferAdapter(getActivity(),homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);


        recyclerView = view.findViewById(R.id.recyclerView1);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < rlogoImage.length; i++) {
            OfferModel beanClassForRecyclerView_contacts = new OfferModel(rlogoImage[i],rofferField1[i],rofferField2[i],rofferField3[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new OfferAdapter(getActivity(),homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);
        return  view;
    }
}