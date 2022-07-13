package com.example.soloaws.dto.response;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AwsResponseDtoTest {

    @Test
    public void lombok_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        AwsResponseDto dto = new AwsResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
    }

}