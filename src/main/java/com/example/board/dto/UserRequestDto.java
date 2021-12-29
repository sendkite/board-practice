package com.example.board.dto;

import com.example.board.domain.UserRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String username;
    private String password;
    private UserRole role;
}
