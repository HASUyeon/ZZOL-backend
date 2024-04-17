package com.hasu.zzol.global.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class Response {
    private int status;
    private String message;
    private MessageCode messageCode;
    private Object content;

    public Response() {
        this.status = HttpStatus.OK.value();
        this.message = "";
        this.messageCode = MessageCode.SUCCESS;
        this.content = null;
    }
}
