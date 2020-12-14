package com.github.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 杜家浩
 * @version 2.5.0
 * @date 2020/7/15 16:55
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class JasyptEncryptTest {

    @Resource
    private ConfigProperties configProperties;

    @Resource
    private StringEncryptor stringEncryptor;


    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("username", "user");
        map.put("password", "Gs2&8oq#");
    }

    @Test
    public void encrypt() {
        map.values().forEach(this::encrypt);
    }

    private void encrypt(String str) {
        System.out.println("明文: " + str + "  密文: ENC(" + stringEncryptor.encrypt(str) + ")");
    }

}
