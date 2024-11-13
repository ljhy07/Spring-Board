package com.notice.board.crud.board.controller;

import com.notice.board.crud.board.service.dto.BoardListResponseDto;
import com.notice.board.crud.board.service.dto.BoardRequestDto;
import com.notice.board.crud.board.service.dto.BoardResponseDto;
import com.notice.board.crud.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // json으로 데이터를 주고 받음
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 글 등록
    @PostMapping("/boards")
    public BoardResponseDto creatBoard(@RequestBody BoardRequestDto requestDto){
        BoardResponseDto board = boardService.createBoard(requestDto);
        return board;
    }

    
    @GetMapping("/boards")
    public List<BoardListResponseDto> getAllBoards(){
        return boardService.findAllBoard();
    }

    @GetMapping("/boards/{id}")
    public BoardResponseDto getOneBoard(@PathVariable Long id){
        return boardService.findOneBoard(id);
    }

    @PutMapping("/boards/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto){
        return boardService.updateBoard(id, requestDto);
    }

    @DeleteMapping("/boards/{id}")
    public Long deleteBoard(@PathVariable Long id){
        return boardService.deleteBoard(id);
    }

//    @GetMapping("/board/check/{id}/{inputPassword}")
//    public boolean checkPassword(@PathVariable Long id, @PathVariable String inputPassword){
//        return boardService.checkPassword(id, inputPassword);
//    }
}
