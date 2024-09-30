package com.getmyschool.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getmyschool.common.domain.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

}
