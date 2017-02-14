package com.databinding.lenny.myapplication.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.databinding.lenny.myapplication.BaseActivity;
import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.databinding.ActivityViewStubBinding;
import com.databinding.lenny.myapplication.databinding.ViewStubBinding;
import com.databinding.lenny.myapplication.model.User;


public class ViewStubActivity extends BaseActivity {
    private ActivityViewStubBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
        mBinding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewStubBinding binding = DataBindingUtil.bind(inflated);
                User user = new User("liang", "lei");
                binding.setUser(user);
            }
        });

    }


    /**
     * Don't panic for red error reporting. Just ignore it and run the app. Surprise never ends.
     */
    public void inflateViewStub(View view) {
        if (!mBinding.viewStub.isInflated()) {
            mBinding.viewStub.getViewStub().inflate();
        }
    }
}