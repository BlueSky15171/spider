package com.su.utils;

import java.security.MessageDigest;

/**
 * @author suyupeng
 */
public class MD5Util {
    public static String getMD5(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(s.getBytes("utf-8"));
            return toHex(bytes);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String toHex(byte[] bytes) {

        final char[] hex = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i=0; i<bytes.length; i++) {
            ret.append(hex[(bytes[i] >> 4) & 0x0f]);
            ret.append(hex[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }
}
