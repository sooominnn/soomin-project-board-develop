package com.soomin.projectboarddevelop.repository;

import com.soomin.projectboarddevelop.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * fileName     : ArticleCommentRepository
 * author       : lia
 * date         : 2023/06/28
 * description  : 댓글 Repository
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/06/28       lia          최초 생성
 */
@RepositoryRestResource
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
