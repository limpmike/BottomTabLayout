package com.mahm.bottomtab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager2 viewPager2 = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        viewPager2.setAdapter(new BottomTabAdapter());
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(ContextCompat.getDrawable(MainActivity.this,R.drawable.android));
                viewPager2.setCurrentItem(tab.getPosition(), true);
            }
        }).attach();
    }
}
