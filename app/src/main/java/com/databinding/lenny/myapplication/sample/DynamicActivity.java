package com.databinding.lenny.myapplication.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.databinding.lenny.myapplication.BaseActivity;
import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.adapter.UserAdapter;
import com.databinding.lenny.myapplication.databinding.ActivityDynamicBinding;


public class DynamicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDynamicBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_dynamic);

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new UserAdapter());
    }
}
