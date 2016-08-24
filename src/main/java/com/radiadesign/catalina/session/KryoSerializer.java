package com.radiadesign.catalina.session;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Summary .
 * @Author jimmy lin
 * @Date 2016/8/24 20:33
 */
public class KryoSerializer implements Serializer {

    @Override
    public void setClassLoader(ClassLoader loader) {

    }

    @Override
    public byte[] serializeFrom(HttpSession session) throws IOException {
        return new byte[0];
    }

    @Override
    public HttpSession deserializeInto(byte[] data, HttpSession session) throws IOException, ClassNotFoundException {
        return null;
    }
}
