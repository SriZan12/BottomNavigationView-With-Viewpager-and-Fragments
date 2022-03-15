package com.srijan.recyclerinfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import Adapters.VpagerAdapter;
import Fragments.RecyclerviewFragment;
import Fragments.SalaryFragment;
import Fragments.jobsFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigationView;
    ViewPager pager2;
    FrameLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.BottomNav);
        pager2 = findViewById(R.id.pager2);
        layout = findViewById(R.id.fm);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Courses with Jobs");

        VpagerAdapter adapter = new VpagerAdapter(getSupportFragmentManager());
        pager2.setAdapter(adapter);

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Language:
                        pager2.setCurrentItem(0);
                       Toast toast = Toast.makeText(MainActivity.this,"Pick Any Language",Toast.LENGTH_LONG);
                       toast.setGravity(Gravity.CENTER,0,0);
                       toast.show();
                        break;
                    case R.id.jobs:
                        pager2.setCurrentItem(1);
                        Toast toast2 = Toast.makeText(MainActivity.this,"Pick Your Job Expertise",Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER | Gravity.LEFT, 0,0);
                        toast2.show();
                        break;
                    case R.id.salary:
                        pager2.setCurrentItem(2);
                        Toast.makeText(MainActivity.this, "Salary", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });


        pager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                    navigationView.getMenu().findItem(R.id.Language).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.jobs).setChecked(true);// setchecked will highlight the menu
                        break;
                    case 2:
                        navigationView.getMenu().findItem(R.id.salary).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



}