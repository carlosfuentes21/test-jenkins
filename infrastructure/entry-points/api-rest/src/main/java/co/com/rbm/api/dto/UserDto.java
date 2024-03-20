package co.com.rbm.api.dto;

import lombok.*;


@Builder
@Getter
@ToString
public class UserDto{
    private String name;
    private String lastname;
    private String document;
    private String phone;
}
