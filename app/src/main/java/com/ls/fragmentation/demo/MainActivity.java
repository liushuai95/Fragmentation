package com.ls.fragmentation.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.ls.fragmentation.R;
import com.ls.fragmentation.demo.ui.fragment.MainFragment;

import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findFragment(MainFragment.class) == null) {
            loadRootFragment(R.id.fl_container, MainFragment.newInstance());
        }
    }



}
