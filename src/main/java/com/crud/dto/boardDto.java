package com.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class boardDto {
    private Long id;
    private String name;
    private String text;
    private String password;
}
