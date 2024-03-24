package com.notice.board.crud.board.dto;

import com.notice.board.crud.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.spec.RSAOtherPrimeInfo;

@NoArgsConstructor
@Getter
public class BoardRequestDto {
    private String title;
    private String content;
    private String password;
}
