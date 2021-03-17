package com.github.games647.fastlogin.bukkit.listener.protocollib;

import com.github.games647.fastlogin.bukkit.auth.protocollib.EncryptionUtil;

import java.security.SecureRandom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class EncryptionUtilTest {

    @Test
    public void testVerifyToken() throws Exception {
        SecureRandom random = new SecureRandom();
        byte[] token = EncryptionUtil.generateVerifyToken(random);

        assertThat(token, notNullValue());
        assertThat(token.length, is(4));
    }

    // @Test
    // public void testDecryptSharedSecret() throws Exception {
    //
    // }
    //
    // @Test
    // public void testDecryptData() throws Exception {
    //
    // }

    // private static SecretKey createNewSharedKey() {
    //     try {
    //         KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
    //         keygenerator.init(128);
    //         return keygenerator.generateKey();
    //     } catch (NoSuchAlgorithmException nosuchalgorithmexception) {
    //         throw new Error(nosuchalgorithmexception);
    //     }
    // }
}
