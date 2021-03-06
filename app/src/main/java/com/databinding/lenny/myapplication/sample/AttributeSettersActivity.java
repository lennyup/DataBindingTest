package com.databinding.lenny.myapplication.sample;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.databinding.lenny.myapplication.BaseActivity;
import com.databinding.lenny.myapplication.R;
import com.databinding.lenny.myapplication.core.App;
import com.databinding.lenny.myapplication.databinding.ActivityAttributeSettersBinding;
import com.databinding.lenny.myapplication.utils.Randoms;
import com.squareup.picasso.Picasso;

public class AttributeSettersActivity extends BaseActivity {
    private ActivityAttributeSettersBinding mBinding;

    public View.OnClickListener avatarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(AttributeSettersActivity.this, "Come on", Toast.LENGTH_SHORT).show();
            mBinding.setImageUrl(Randoms.nextImgUrl());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        mBinding.setActivity(this);
        mBinding.setImageUrl(Randoms.nextImgUrl());
    }

    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        Log.d(App.TAG, "load image");
        Picasso.with(view.getContext()).load(url).error(error).into(view);
    }
}

