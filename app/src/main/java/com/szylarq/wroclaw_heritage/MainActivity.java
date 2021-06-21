package com.szylarq.wroclaw_heritage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    int[] images = {R.drawable.wro0, R.drawable.wro1, R.drawable.wro2,
            R.drawable.wro3, R.drawable.wro4, R.drawable.wro5,
            R.drawable.wro6, R.drawable.wro7};
    int[] headers = {R.string.header0, R.string.header1, R.string.header2, R.string.header3,
            R.string.header4, R.string.header5, R.string.header6, R.string.header7};
    int[] descriptions = {R.string.description0, R.string.description1, R.string.description2,
            R.string.description3,R.string.description4, R.string.description5, R.string.description6,
            R.string.description7};

    MyViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        MyViewPagerAdapter adapter = new MyViewPagerAdapter(images, headers, descriptions);

        viewPager.setAdapter(adapter);
    }
}