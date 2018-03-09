package com.su.repository;

import com.su.bo.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author suyupeng
 */
public interface ChapterRepository extends JpaRepository<Chapter, String>, PagingAndSortingRepository<Chapter, String>, JpaSpecificationExecutor<Chapter> {
}
