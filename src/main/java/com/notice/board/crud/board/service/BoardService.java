package com.notice.board.crud.board.service;

import com.notice.board.crud.board.dto.BoardListResponseDto;
import com.notice.board.crud.board.dto.BoardRequestDto;
import com.notice.board.crud.board.dto.BoardResponseDto;
import com.notice.board.crud.board.entity.Board;
import com.notice.board.crud.board.repository.BoardRepository;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardResponseDto createBoard(BoardRequestDto requestDto){
        Board board = new Board(requestDto);
        boardRepository.save(board);
        return new BoardResponseDto(board);
    }

    public List<BoardListResponseDto> findAllBoard(){
        try {
            List<Board> boardList = boardRepository.findAll();

            List<BoardListResponseDto> responseDtoList = new ArrayList<>();

            for (Board board : boardList) {
                responseDtoList.add(
                        new BoardListResponseDto()
                );
            }

            return responseDtoList;
        } catch (Exception e){
            System.out.println("exception");
        }

        return null;
    }

    public BoardResponseDto findOneBoard(Long id){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("조회 실패")
        );

        return new BoardResponseDto(board);
    }

    @Transactional
    public Long updateBoard(Long id, BoardRequestDto requestDto){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);

        return  board.getBoardId();
    }

    @Transactional
    public Long deleteBoard(Long id){
        boardRepository.deleteById(id);
        return id;
    }
}
