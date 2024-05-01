package com.cineverse.springsecuritytest.vo;

import lombok.Data;

@Data
public class ResponseUser {
    private String name;
    private String email;
    private String userId;

    /* FeignClient 이후 추가할것 */
//    private List<ResponseOrder> orders;
}
