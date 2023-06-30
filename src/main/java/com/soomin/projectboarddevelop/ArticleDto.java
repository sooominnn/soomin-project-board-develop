package com.soomin.projectboarddevelop;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * fileName     : ArticleDto
 * author       : lia
 * date         : 2023/06/28
 * description  : 게시글 DTO
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/06/28       lia          최초 생성
 */
public record ArticleDto(String title, String content, String hashtag, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) implements Serializable {
}
