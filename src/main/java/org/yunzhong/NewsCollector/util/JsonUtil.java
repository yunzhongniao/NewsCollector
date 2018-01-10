package org.yunzhong.NewsCollector.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {

    private static ObjectMapper om = new ObjectMapper();

    public static String toJson(Object obj) {
        try {
            return om.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Convert to JSON error!!!", e);
        }
        return null;
    }

    public static <T> T toObject(String str, Class<T> className) {
        try {
            return om.readValue(str, className);
        } catch (IOException e) {
            log.error("Convert to Object error!!!", e);
        }
        return null;
    }
}
