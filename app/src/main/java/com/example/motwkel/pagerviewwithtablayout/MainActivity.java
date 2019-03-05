package com.example.motwkel.pagerviewwithtablayout;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        PagerViewAdapter adapter = new PagerViewAdapter(getSupportFragmentManager());
        adapter.addFragment(new NumberFragment(), "Number");
        adapter.addFragment(new ColorFragment(), "Color");
        adapter.addFragment(new FamilyFragment(), "Family");
        adapter.addFragment(new PhrasesFragment(), "Phrases");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
