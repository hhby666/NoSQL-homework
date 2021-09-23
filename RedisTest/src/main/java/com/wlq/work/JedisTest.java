package com.wlq.work;

import redis.clients.jedis.Jedis;

/**
 * program: homework
 * <br>description: Redis测试
 *
 * @author by 王林清 on 2021/9/23
 * @version Java1.8 IntelliJ IDEA
 */
public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hhby.xyz", 6379);
        jedis.auth("Wang666");
        System.out.println(jedis.ping());
        jedis.set("name", "wlq");
        System.out.println(jedis.get("name"));
    }
}
