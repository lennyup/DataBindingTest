package com.databinding.lenny.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databinding.lenny.myapplication.BR;

/**
 * Created by lenny on 2017/2/14.
 */

public class ObservableUser extends BaseObservable{
    private String mFirstName;
    private String mLastName;

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
        notifyPropertyChanged(BR.lastName);
    }
}
