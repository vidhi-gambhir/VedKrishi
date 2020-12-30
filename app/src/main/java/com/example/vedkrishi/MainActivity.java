package com.example.vedkrishi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

//        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
//        this.getSupportActionBar().setTitle("");
       // getSupportActionBar().setDisplayShowTitleEnabled(false);

        tabLayout.addTab(tabLayout.newTab().setText("Suggestion"));
        tabLayout.addTab(tabLayout.newTab().setText("Season"));
        tabLayout.addTab(tabLayout.newTab().setText("Region"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.action_suggestion:
//                        Toast.makeText(MainActivity.this, "Suggestion", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.action_season:
//                        Toast.makeText(MainActivity.this, "Season", Toast.LENGTH_SHORT).show();
//                        Intent intent=new Intent(getApplicationContext(),SeasonActivity.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.action_region:
//                        Toast.makeText(MainActivity.this, "Region", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                return true;
//            }
//        });
    }
}