package com.soomin.projectboarddevelop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * fileName     : ArticleComment
 * author       : lia
 * date         : 2023/06/27
 * description  : 댓글 Entity
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/06/27       lia          최초 생성
 */
@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@Entity
public class ArticleComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;         // 댓글 고유번호

    @Setter
    @ManyToOne(optional = false)
    private Article article;    // 게시글
    @Setter
    @Column(nullable = false, length = 500)
    private String  content;    // 본문

    //    메타데이터
    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime   createdAt;      // 생성일시
    @CreatedBy
    @Column(nullable = false, length = 100)
    private String          createdBy;      // 생성자
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime   modifiedAt;     // 수정일시
    @LastModifiedBy
    @Column(nullable = false, length = 100)
    private String          modifiedBy;     // 수정자

    // 기본 생성자
    protected ArticleComment() {}

    private ArticleComment(Article article, String content) {
        this.article = article;
        this.content = content;
    }

    // ArticleComment 생성할 때 필요한 요소들
    public static ArticleComment of(Article article, String content) {
        return new ArticleComment(article, content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleComment that)) return false;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

