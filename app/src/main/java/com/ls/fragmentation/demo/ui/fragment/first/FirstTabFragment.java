package com.ls.fragmentation.demo.ui.fragment.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.ls.fragmentation.R;

import me.yokeyword.fragmentation.SupportFragment;

public class FirstTabFragment extends SupportFragment {

    public static FirstTabFragment newInstance() {

        Bundle args = new Bundle();

        FirstTabFragment fragment = new FirstTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_first, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }


}
