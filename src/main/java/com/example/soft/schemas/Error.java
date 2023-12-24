package com.example.soft.schemas;


import lombok.*;

@Setter
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private String Code;
    private String Content;
}