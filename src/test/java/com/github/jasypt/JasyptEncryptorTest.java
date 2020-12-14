package com.github.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@DirtiesContext
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JasyptEncryptorTest {

    @Autowired
    private StringEncryptor jasyptStringEncryptor;

//    @Value("${username}")
//    private String username;

    @Test
    public void encrypt() {
        System.out.println("encrypt: waf:  ENC(" + jasyptStringEncryptor.encrypt("waf") + ")");
        System.out.println("encrypt: root:  ENC(" + jasyptStringEncryptor.encrypt("root") + ")");
        System.out.println("encrypt: root:  ENC(" + jasyptStringEncryptor.encrypt("root") + ")");
        System.out.println("encrypt: 123456:  ENC(" + jasyptStringEncryptor.encrypt("123456") + ")");
        System.out.println("encrypt: 445d6058af80d7773da6a7bab16cf9407a589eebb285d54ba80824f7dd8e4c9a:  ENC(" + jasyptStringEncryptor.encrypt("445d6058af80d7773da6a7bab16cf9407a589eebb285d54ba80824f7dd8e4c9a") + ")");
        System.out.println("encrypt: 175tH:_aEQnzWsVx:  ENC(" + jasyptStringEncryptor.encrypt("175tH:_aEQnzWsVx") + ")");
        System.out.println("encrypt: ab3MQzkp:  ENC(" + jasyptStringEncryptor.encrypt("ab3MQzkp") + ")");
        System.out.println("encrypt: 578790035@qq.com:  ENC(" + jasyptStringEncryptor.encrypt("578790035@qq.com") + ")");
        System.out.println("encrypt: nbywbqxjgadwbcaj:  ENC(" + jasyptStringEncryptor.encrypt("nbywbqxjgadwbcaj") + ")");

    }

//    @Test
//    public void decrypt() {
//        System.out.println("decrypt: " + jasyptStringEncryptor.decrypt("AmMH8oZmBxfAps2ZVUp9N3tkKb5bIPUg4Rj0YpTuNeZz9xi9typ5VlFZV6LID1El"));
//    }

}