package com.cineverse.springsecuritytest.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HelloVo {

    @Value("${swcamp.message}")
    private String message;
}
