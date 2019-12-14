package com.imooc.web.converter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @author youyu.song
 * @date 2019/12/14 15:11
 */
public class PropertiesHttpMessageConverter extends AbstractGenericHttpMessageConverter<Properties> {

    public PropertiesHttpMessageConverter() {
        // 设置支持的 MediaType
        super(new MediaType("text", "properties"));
    }

    @Override
    protected void writeInternal(Properties properties, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // Properties -> String
        HttpHeaders httpHeaders = outputMessage.getHeaders();
        MediaType contentType = httpHeaders.getContentType();
        Charset charset = contentType.getCharset();
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        OutputStream outputStream = outputMessage.getBody();
        Writer writer = new OutputStreamWriter(outputStream, charset);
        properties.store(writer, "Hello World.");
    }

    @Override
    protected Properties readInternal(Class<? extends Properties> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        // 从请求头 ContentType 解析编码
        HttpHeaders httpHeaders = inputMessage.getHeaders();
        MediaType mediaType = httpHeaders.getContentType();
        // 获得编码
        Charset charset = mediaType.getCharset();
        // 当编码不存在时设置默认编码
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        InputStream inputStream = inputMessage.getBody();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        Properties properties = new Properties();
        // 加载字符流称为 Properties 对象.
        properties.load(inputStreamReader);

        return properties;
    }

    @Override
    public Properties read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return readInternal(null, inputMessage);
    }
}
