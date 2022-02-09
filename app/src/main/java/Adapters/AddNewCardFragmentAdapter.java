package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import wolfsoft1.pay2wallet.AddNewCardFragment;
import wolfsoft1.pay2wallet.OfferFragment;

public class AddNewCardFragmentAdapter extends FragmentStatePagerAdapter {


    public AddNewCardFragmentAdapter(FragmentManager fm, int tabCount) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AddNewCardFragment tab1 = new AddNewCardFragment();
                return tab1;

            case 1:
                AddNewCardFragment tab2 = new AddNewCardFragment();
                return tab2;



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}