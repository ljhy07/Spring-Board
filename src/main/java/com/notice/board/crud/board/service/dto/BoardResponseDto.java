package com.notice.board.crud.board.service.dto;

import com.notice.board.crud.board.domain.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardResponseDto {
    private String title;
    private String content;

    public BoardResponseDto(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
