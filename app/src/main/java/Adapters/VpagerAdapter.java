package Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Fragments.RecyclerviewFragment;
import Fragments.SalaryFragment;
import Fragments.jobsFragment;

public class VpagerAdapter extends FragmentStatePagerAdapter{


    public VpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new RecyclerviewFragment();
            case 1:
                return new jobsFragment();
            case 2:
                return new SalaryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
