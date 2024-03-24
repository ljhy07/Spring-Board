package com.notice.board.crud.board.repository;

import com.notice.board.crud.board.dto.BoardListResponseDto;
import com.notice.board.crud.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}
