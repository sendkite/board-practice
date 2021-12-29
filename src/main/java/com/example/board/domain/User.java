package com.example.board.domain;

import com.example.board.dto.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@NoArgsConstructor
@Getter
public class User extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserRole role;

    public User(UserRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }
}
