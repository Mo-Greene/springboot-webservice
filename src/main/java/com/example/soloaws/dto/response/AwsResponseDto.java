package com.example.soloaws.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AwsResponseDto {

    private final String name;
    private final int amount;
}
