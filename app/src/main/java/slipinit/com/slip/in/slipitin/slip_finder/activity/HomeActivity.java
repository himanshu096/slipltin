package slipinit.com.slip.in.slipitin.slip_finder.activity;

import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import slipinit.com.slip.in.slipitin.R;
import slipinit.com.slip.in.slipitin.slip_finder.fragments.HomeTabFragment;
import slipinit.com.slip.in.slipitin.slip_finder.fragments.LocationFragment;
import slipinit.com.slip.in.slipitin.slip_finder.fragments.ProfileFragment;

public class HomeActivity extends AppCompatActivity implements OnMenuTabClickListener,
        HomeTabFragment.OnFragmentInteractionListener {
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        getBottomBarConfig();
    }

    private void getBottomBarConfig() {
        mBottomBar.setItems(R.menu.bottombar_menu);
        mBottomBar.setOnMenuTabClickListener(this);
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorBlack));
        mBottomBar.mapColorForTab(1, ContextCompat.getColor(this, R.color.colorBrown));
        mBottomBar.mapColorForTab(2, ContextCompat.getColor(this, R.color.colorGrey));
        mBottomBar.mapColorForTab(3, ContextCompat.getColor(this, R.color.colorLightGrey));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mBottomBar.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onMenuTabSelected(@IdRes int menuItemId) {
        switch(menuItemId) {
            case R.id.bb_home:
                HomeTabFragment homeTabFragment = (HomeTabFragment) getFragmentManager().findFragmentByTag("home_frag");
                if (homeTabFragment == null) {
                    homeTabFragment = HomeTabFragment.newInstance();
                    android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.id_fragmentContainer, homeTabFragment, "home_frag");
                    fragmentTransaction.commit();
                }
                break;
            case R.id.bb_location:
                break;
//            LocationFragment locationFragment=(LocationFragment)getFragmentManager().findFragmentByTag("location_frag");
//                if(locationFragment==null){
//                    locationFragment= LocationFragment.newInstance();
//                    android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.id_fragmentContainer,locationFragment,"location_frag");
//                    fragmentTransaction.commit();
//                }
//                break;

            case R.id.bb_setting:
                ProfileFragment profileFragment=(ProfileFragment)getFragmentManager().findFragmentByTag("pro_frag");
                if (profileFragment==null){
                    profileFragment=new ProfileFragment();
                    android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.id_fragmentContainer, profileFragment, "pro_frag");
                    fragmentTransaction.commit();

                }
                break;
        }
    }

    @Override
    public void onMenuTabReSelected(@IdRes int menuItemId) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

