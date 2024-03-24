package com.notice.board.crud.board.dto;

import com.notice.board.crud.board.entity.Board;
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
