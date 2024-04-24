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
Spring MVC 실행 순서
사용자 -> controller -> service -> dao -> mapper -> (service) -> controller -> view -> 사용자

1.사용자 : 사용자가 웹 인터페이스를 통해 특정 작업을 요청함 (ex) 폼 제출, 링크 클릭 등)

2.Controller : 사용자의 요청을 받아 해당 요청을 처리할 Service 를 호출함
Controller 는 사용자의 입력을 받고, 어떤 처리가 필요한지 결정하는 역할을 함

3.Service : 비즈니스 로직을 처리하는 부분.
사용자의 요청에 따라 필요한 데이터 처리나 계산, 조건 판단 등의 작업을 수행함.
데이터베이스와 관련된 작업이 필요하면 DAO 를 호출합니다.

4.DAO (Data Access Object) : 실제 데이터베이스에 접근하여 데이터를 조회하거나 수정하는 역할을 함
CRUD (생성, 조회, 수정, 삭제) 작업을 담당합니다.

5.Mapper : DAO 에서 호출되며, SQL 쿼리를 구성하고 실행하는 역할을 함.
MyBatis 와 같은 영속성 프레임워크에서 사용됩니다          (영속성 : 영속성(Persistence) 이란 데이터가 프로그램이 종료되어도 사라지지 않고 지속되는 성질을 의미
Mapper 는 데이터베이스와의 구체적인 통신을 담당하며, 결과를 DAO 로 반환함

6.Controller (다시 반환) : DAO 로부터 받은 데이터를 처리하여 View 로 전달함
필요한 데이터가 준비되면, 그 데이터를 바탕으로 사용자에게 보여줄 View 를 선택하고, View 에 데이터를 전달합니다.

7.View : 최종적으로 사용자에게 보여질 화면을 구성함.
HTML, CSS, JavaScript 등을 사용하여 사용자 인터페이스를 생성하고
Controller 로부터 받은 데이터를 화면에 표시합니다.

사용자 (응답 받음): View 를 통해 최종적으로 구성된 화면이 사용자에게 보여지며, 사용자는 요청한 작업의 결과를 볼 수 있습니다.
 */

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