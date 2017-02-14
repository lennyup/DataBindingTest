package com.databinding.lenny.myapplication.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.databinding.lenny.myapplication.BaseActivity;
import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityViewWithIdsBinding;


public class ViewWithIDsActivity extends BaseActivity {

    ActivityViewWithIdsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_with_ids);
    }

    public void showMyName(View view) {
        binding.firstName.setText("liang");
        binding.lastName.setText("fei");
    }
}
