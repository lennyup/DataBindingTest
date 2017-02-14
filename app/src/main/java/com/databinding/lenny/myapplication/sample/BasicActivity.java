package com.databinding.lenny.myapplication.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityBasicBinding;
import com.databinding.lenny.myapplication.model.User;

/**
 * Created by lenny on 2017/2/14.
 */

public class BasicActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("fei", "liang", 25);
        binding.setUser(user);
    }
}
