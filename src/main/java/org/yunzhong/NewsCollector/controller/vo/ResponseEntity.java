package org.yunzhong.NewsCollector.controller.vo;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private T data;
    private String msg;

    public static <T> ResponseEntity<T> entity(T data) {
        ResponseEntity<T> entity = new ResponseEntity<T>();
        entity.setData(data);
        return entity;
    }
}
