package com.wlq.hutool;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

/**
 * program: homework
 * <br>description: 测试hutool工具包
 *
 * @author by 王林清 on 2021/10/5
 * @version Java1.8 IntelliJ IDEA
 */
public class HuToolTest {
    public static void main(String[] args) {
        String today = DateUtil.today();
        DateTime time = DateUtil.parse(today);
        System.out.println("time = " + time);
    }
}
