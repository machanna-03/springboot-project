package com.getmyschool.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getmyschool.common.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
