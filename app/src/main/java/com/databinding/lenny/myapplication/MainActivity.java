package com.databinding.lenny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.databinding.lenny.myapplication.sample.AttributeSettersActivity;
import com.databinding.lenny.myapplication.sample.BasicActivity;
import com.databinding.lenny.myapplication.sample.CollectionActivity;
import com.databinding.lenny.myapplication.sample.ConversionsActivity;
import com.databinding.lenny.myapplication.sample.CustomBindingActivity;
import com.databinding.lenny.myapplication.sample.DynamicActivity;
import com.databinding.lenny.myapplication.sample.IncludeActivity;
import com.databinding.lenny.myapplication.sample.ObservableActivity;
import com.databinding.lenny.myapplication.sample.ResourceActivity;
import com.databinding.lenny.myapplication.sample.ViewStubActivity;
import com.databinding.lenny.myapplication.sample.ViewWithIDsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openBasic(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }
    public  void openCustomBinding(View view) {
        startActivity(new Intent(this, CustomBindingActivity.class));
    }
    public void openIncludes(View view) {
        startActivity(new Intent(this, IncludeActivity.class));
    }
    public void openCollections(View view) {
        startActivity(new Intent(this, CollectionActivity.class));
    }
    public void openResources(View view) {
        startActivity(new Intent(this, ResourceActivity.class));
    }
    public void openObservable(View view) {
        startActivity(new Intent(this, ObservableActivity.class));
    }
    public void openViewWithIDs(View view) {
        startActivity(new Intent(this, ViewWithIDsActivity.class));
    }
    public void openViewStub(View view) {
        startActivity(new Intent(this, ViewStubActivity.class));
    }
    public void openDynamicVariables(View view) {
        startActivity(new Intent(this, DynamicActivity.class));
    }
    public void openAttributeSetters(View view) {
        startActivity(new Intent(this, AttributeSettersActivity.class));
    }
    public void openConverters(View view) {
        startActivity(new Intent(this, ConversionsActivity.class));
    }
}
