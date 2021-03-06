package com.databinding.lenny.myapplication.sample;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.view.View;

import com.databinding.lenny.myapplication.BaseActivity;
import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityObservableBinding;
import com.databinding.lenny.myapplication.model.ObservableUser;
import com.databinding.lenny.myapplication.model.PlainUser;

/**
 * Created by lenny on 2017/2/14.
 */

public class ObservableActivity extends BaseActivity {

    private ObservableUser user = new ObservableUser();
    private PlainUser plainUser =  new PlainUser();
    private ObservableMap<String, Object> mapUser = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable);
        setMyName(null);

        binding.setUser(user);
        binding.setPlainUser(plainUser);
        binding.setMapUser(mapUser);
    }

    public void setOtherName(View view) {
        user.setFirstName("zhu");
        user.setLastName("chen");

        plainUser.firstName.set("zhu");
        plainUser.lastName.set("chen");
        plainUser.age.set(27);

        mapUser.put("firstName", "zhu");
        mapUser.put("lastName", "chen");
        mapUser.put("age", 27);
    }

    public void setMyName(View view) {
        user.setFirstName("liang");
        user.setLastName("fei");

        plainUser.firstName.set("liang");
        plainUser.lastName.set("fei");
        plainUser.age.set(27);

        mapUser.put("firstName", "liang");
        mapUser.put("lastName", "fei");
        mapUser.put("age", 27);
    }
}
