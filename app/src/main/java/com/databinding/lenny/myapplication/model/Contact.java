package com.databinding.lenny.myapplication.model;

/**
 * Created by lenny on 2017/2/14.
 */

public class Contact {
    private final String mTel;
    private final String mAddress;

    public Contact(String tel, String address) {
        mTel = tel;
        mAddress = address;
    }

    public String getTel() {
        return mTel;
    }

    public String getAddress() {
        return mAddress;
    }
}
