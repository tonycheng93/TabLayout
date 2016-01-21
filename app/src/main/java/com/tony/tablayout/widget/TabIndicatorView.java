package com.tony.tablayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tony.tablayout.R;

/**
 * Created by tonycheng on 2016/1/21.
 */
public class TabIndicatorView extends RelativeLayout {

    private ImageView ivTabIcon;
    private TextView tvTabHint;

    public TabIndicatorView(Context context) {
        this(context, null);
    }

    public TabIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        /**
         * 绑定布局
         */
        View.inflate(context, R.layout.tab_indicator, this);
        ivTabIcon = (ImageView) findViewById(R.id.tab_indicator_icon);
        tvTabHint = (TextView) findViewById(R.id.tab_indicator_hint);
    }

    /**
     * 设置Tab的title
     *
     * @param title
     */
    public void setTabHint(String title) {
        tvTabHint.setText(title);
    }

    public void setTabHint(int titleId) {
        tvTabHint.setText(titleId);
    }


    /**
     * 给Tab设置图标
     * @param resId
     */
    public void setTabIcon(int resId){
        ivTabIcon.setImageResource(resId);
    }

    public void setTabHintColor(boolean isSeclected){
        if (isSeclected){
            tvTabHint.setTextColor(getResources().getColor(R.color.green));
        }else {
            tvTabHint.setTextColor(getResources().getColor(R.color.grey));
        }
    }
}
