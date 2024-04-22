package com.green.board.model;

import lombok.*;
@Setter
@Getter
@ToString
public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}

/*
Restful API

GET 		    (조회)
POST 		    (생성)
PUT (PATCH) 	(수정)
DELETE 		    (삭제)
 */

