package com.hnrcc.clxh.base;
/*
 * @author ljw
 * @emil 654799896@qq.com
 * create at 2018/12/26 23:46
 * description:
 */

public interface BaseView {
    /*
    * 加载中
    */
    void showLoding();
    /*
    * 隐藏
    */
    void hideLoding();
    /*
    * 显示网络错误
    */
    void showNetError();
}
