package com.databinding.lenny.myapplication.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by lenny on 2017/2/14.
 */

public class PlainUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
