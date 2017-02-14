package com.databinding.lenny.myapplication.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ResourceBinding;

/**
 * Created by lenny on 2017/2/14.
 */

public class ResourceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ResourceBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_resources);

        binding.setLarge(true);

        binding.setFirstName("liang");
        binding.setLastName("fei");

        binding.setBananaCount(2);
        binding.setOrangeCount(10);
    }
}
