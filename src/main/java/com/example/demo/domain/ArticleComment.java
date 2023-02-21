package com.example.demo.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; //게시글(ID)
    private String content;//본문
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;


}
