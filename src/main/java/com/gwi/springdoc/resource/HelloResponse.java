package com.gwi.springdoc.resource;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class HelloResponse {

    private final String userName;
    private final String message;
    private final int statusCode;
}
