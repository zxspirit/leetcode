package com.newzhxu.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class RequestAndResult<S, T> {
    private S request;
    private T result;

}
