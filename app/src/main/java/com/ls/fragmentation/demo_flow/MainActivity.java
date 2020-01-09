package com.ls.fragmentation.demo_flow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ls.fragmentation.R;
import com.ls.fragmentation.demo_flow.base.MySupportActivity;
import com.ls.fragmentation.demo_flow.base.MySupportFragment;
import com.ls.fragmentation.demo_flow.ui.fragment.HomeFragment;

import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends MySupportActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySupportFragment fragment = findFragment(HomeFragment.class);
    }


}
