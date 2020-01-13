package com.ls.fragmentation.demo.ui.fragment.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.ls.fragmentation.R;

import me.yokeyword.fragmentation.SupportFragment;

public class ThirdTabFragment extends SupportFragment {

    public static ThirdTabFragment newInstance() {

        Bundle args = new Bundle();

        ThirdTabFragment fragment = new ThirdTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_third, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }


}
