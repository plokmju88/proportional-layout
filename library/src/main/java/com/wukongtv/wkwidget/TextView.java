package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LC;

/**
 * TextView
 * Created by zhangge on 14-10-27.
 */
public class TextView extends android.widget.TextView {

    public TextView(Context context) {
        this(context, null);
    }

    public TextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);

        // textsize
        setTextSize(LC.getScaledLength(getTextSize()));

        // drawable padding
        int drawablePadding = LC.getScaledLength(getCompoundDrawablePadding());
        setCompoundDrawablePadding(drawablePadding);

        // :TODO max height
    }
}
