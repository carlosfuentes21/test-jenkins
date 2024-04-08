package co.com.rbm.api.dto;

import lombok.*;


@Builder
@Getter
@ToString
public class JobDto {
    private String name;
    private String kind;
    private Integer salary;
    private String education;
}
