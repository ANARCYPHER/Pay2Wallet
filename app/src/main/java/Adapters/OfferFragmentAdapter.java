package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import wolfsoft1.pay2wallet.Fragment_one;
import wolfsoft1.pay2wallet.OfferFragment;

public class OfferFragmentAdapter extends FragmentStatePagerAdapter {



    public OfferFragmentAdapter(FragmentManager fm, int tabCount) {
        super(fm);

    }



    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OfferFragment tab1 = new OfferFragment();
                return tab1;

            case 1:
                OfferFragment tab2 = new OfferFragment();
                return tab2;


            case 2:
                OfferFragment tab3 = new OfferFragment();
                return tab3;

            case 3:
                OfferFragment tab4 = new OfferFragment();
                return tab4;

            case 4:
                OfferFragment tab5 = new OfferFragment();
                return tab5;

            case 5:
                OfferFragment tab6 = new OfferFragment();
                return tab6;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}