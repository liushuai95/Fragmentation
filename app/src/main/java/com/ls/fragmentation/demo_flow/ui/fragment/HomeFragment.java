package com.ls.fragmentation.demo_flow.ui.fragment;

import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import com.ls.fragmentation.demo_flow.base.BaseMainFragment;

public class HomeFragment extends BaseMainFragment implements Toolbar.OnMenuItemClickListener {

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
