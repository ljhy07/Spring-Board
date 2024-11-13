package com.notice.board.crud.board.service.dto;

import com.notice.board.crud.board.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {
    private String title;
    private String username;
    public BoardListResponseDto(Board board){
        this.title = board.getTitle();
    }

    public BoardListResponseDto(Optional<Board> board){
        this.title = board.get().getTitle();
    }
}
