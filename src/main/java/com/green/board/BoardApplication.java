package com.green.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }

}

/*
Restful
- 메소드(요청을 보내는 방식) : get, post, put(patch), delete
- 메소드 mapping DB => get == select, post == insert, put == update, delete == delete
- 주소값을 깔끔하게 한다.
- 동사는 method로 구분
- 명사는 url로 구분
- URL은 명사만 작성

EX)
Create : (get)/board -->> select list
Read : (get)/board/1 -->> select one ( /1 : path variable 로 PK값을 보낸다.)
Read : (post)/board -->> insert data
Update : (put)/board -->> update data
Delete : (delete)/board -->> delete data

Postman : Restful API Tester
 */

/*
RESTful 웹 서비스에서 HTTP 메서드는 자원에 대한
CRUD(Create, Read, Update, Delete) 작업을 수행하는 데 사용

주요 HTTP 메서드인 GET, POST, PUT, DELETE에 대한 설명
1.GET: 서버로부터 정보를 요청하는 데 사용됩니다
주로 조회 작업에 사용되며, 클라이언트가 서버로 데이터를 요청할 때 사용됩니다.

2.POST: 새로운 리소스를 생성하는 데 사용됩니다
클라이언트가 서버로 데이터를 전송하면, 서버는 해당 데이터를 기반으로 새로운 리소스를 생성합니다.

3.PUT: 기존 리소스를 수정하는 데 사용됩니다
클라이언트가 서버로 수정된 데이터를 전송하면
서버는 해당 데이터를 기반으로 기존 리소스를 수정합니다.

4.DELETE: 기존 리소스를 삭제하는 데 사용됩니다
클라이언트가 서버로 삭제 요청을 전송하면, 서버는 해당 리소스를 삭제합니다.

이러한 HTTP 메서드들은 RESTful API의 기본적인 동작을 구현하는 데 사용
각각의 메서드들은 리소스의 조회, 생성, 수정, 삭제 등의 작업을 수행합니다.
각 HTTP 메서드는 RESTful 웹 서비스의 기본 원칙에 따라 자원의 상태를 관리하는 데 필수적이며
이를 통해 클라이언트와 서버 간의 효율적이고 명확한 커뮤니케이션이 가능해집니다.

 */