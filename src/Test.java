import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class Test {


    @org.junit.Test
    public void test(){
        Jedis jedis = new Jedis("192.168.146.128",6379);
        String set = jedis.set("name", "西萌吹雪");
        System.out.println(set);

        String name = jedis.get("name");
        System.out.println(name);


    }
    @org.junit.Test
    public void testRedisCluster(){
        Set<HostAndPort> set = new HashSet<HostAndPort>();
        set.add(new HostAndPort("192.168.146.128",7001));
        set.add(new HostAndPort("192.168.146.128",7002));
        set.add(new HostAndPort("192.168.146.128",7003));
        set.add(new HostAndPort("192.168.146.128",7004));
        set.add(new HostAndPort("192.168.146.128",7005));
        set.add(new HostAndPort("192.168.146.128",7006));


        JedisCluster jedisCluster = new JedisCluster(set);

        String set1 = jedisCluster.set("hello", "world");
        System.out.println(set1);
        System.out.println(jedisCluster.get("hello"));


    }

    @org.junit.Test
    public void testGit(){
        System.out.println("hello world");


    }





}
