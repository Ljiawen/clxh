package com.hnrcc.clxh.base;
/*
 * @author ljw
 * @emil 654799896@qq.com
 * create at 2018/12/26 23:45
 * description:
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.logging.Logger;

public abstract class BaseActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = convertView();

        setContentView(view);
    }
    private View convertView() {
        View contentView = null;
        if (getLayout() instanceof Integer) {
            Integer layoutId = (Integer) getLayout();
            contentView = getLayoutInflater().inflate(layoutId, null, false);
        }
        if (getLayout() instanceof View) {
            contentView = (View) getLayout();
        }
        return contentView;
    }

    protected abstract Object getLayout();

}
