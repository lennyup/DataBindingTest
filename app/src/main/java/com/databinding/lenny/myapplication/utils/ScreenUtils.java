package com.databinding.lenny.myapplication.utils;

import android.content.Context;

/**
 * Created by lenny on 2017/2/14.
 */

public class ScreenUtils {
    public static float dp2px(final Context context, final float dpValue) {
        return dpValue * context.getResources().getDisplayMetrics().density;
    }
}
