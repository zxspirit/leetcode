package com.newzhxu.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NotImpl extends RuntimeException {
    public NotImpl() {
    }

    public NotImpl(String message) {
        super(message);
    }

    public NotImpl(String message, Throwable cause) {
        super(message, cause);
    }

    public NotImpl(Throwable cause) {
        super(cause);
    }

    public NotImpl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
