package chat.hemant.com.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class fragmentpageradaptet extends FragmentPagerAdapter {
    public fragmentpageradaptet(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int postion) {

        switch (postion){
            case 0:
                first_fragment first = new first_fragment();
                return first;
            case 1:
                Second_fragment second = new Second_fragment();
                return second;
            case 2:
                Third_fragment third = new Third_fragment();
                return third;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {


            case 0:
                return "FIRST";
            case 1:
                return "SECOND";
            case 2:
                return "THIRD";

            default:
                return null;
        }
    }
}
