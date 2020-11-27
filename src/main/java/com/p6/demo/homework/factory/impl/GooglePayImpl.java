package com.p6.demo.homework.factory.impl;

import com.p6.demo.homework.factory.IPay;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/27
 */
public class GooglePayImpl implements IPay {

    @Override
    public String pay() {

        return "执行Google的相关逻辑,之后扣减!";
    }
}
