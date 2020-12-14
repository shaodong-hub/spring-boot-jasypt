package com.github.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 石少东
 * @version 2.5.0
 * @date 2020/7/15 16:55
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class JasyptDecryptTest {

    @Resource
    private StringEncryptor stringEncryptor;

    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("username", "IQSTImSemKZ97+P1cXncSXVzy1Jz/M5T");
        map.put("password", "uBY/AHqyZDoEObfSIIgwGyMCXKiN4DNTMX9Djap0IjQ=");

    }

    @Test
    public void decrypt() {
        map.values().forEach(this::decrypt);
    }

    private void decrypt(String str) {
        System.out.println("密文: " + str + "  明文: " + stringEncryptor.decrypt(str));
    }
}
