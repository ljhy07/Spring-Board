package com.notice.board.crud.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "board")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long UserId;


}
