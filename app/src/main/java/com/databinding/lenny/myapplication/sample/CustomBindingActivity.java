package com.databinding.lenny.myapplication.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityBasicBinding;
import com.databinding.lenny.myapplication.model.Contact;

/**
 * Created by lenny on 2017/2/14.
 */

public class CustomBindingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.databinding.lenny.myapplication.ContactBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_bind);
        Contact contact = new Contact("15213457890", "Japan");
        binding.setContact(contact);
    }
}
