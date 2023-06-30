package com.soomin.projectboarddevelop.repository;

import com.soomin.projectboarddevelop.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * fileName     : ArticleRepository
 * author       : lia
 * date         : 2023/06/28
 * description  : 게시글 Repository
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/06/28       lia          최초 생성
 */
@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
