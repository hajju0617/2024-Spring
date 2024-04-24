package com.green.board.model;

import lombok.*;
@Setter
@Getter
@ToString
// @Setter, @Getter, @ToString: Lombok에서 제공하는 어노테이션으로
// 각각 setter, getter, toString 메서드를 자동으로 생성해줌. 이를 통해 코드 작성을 간소화할 수 있음.
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

