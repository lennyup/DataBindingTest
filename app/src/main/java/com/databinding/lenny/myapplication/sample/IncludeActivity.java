package com.databinding.lenny.myapplication.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityIncludeBinding;
import com.databinding.lenny.myapplication.listener.OKListener;
import com.databinding.lenny.myapplication.model.User;

/**
 * Created by lenny on 2017/2/14.
 */

public class IncludeActivity extends Activity implements OKListener{
    private ActivityIncludeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        binding.setListener(this);
        binding.setOkText("show toast");
        binding.layoutInput.etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                User user = new User(charSequence.toString(), "liang");
                binding.setUser(user);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "哈哈哈哈", Toast.LENGTH_SHORT).show();
    }
}
