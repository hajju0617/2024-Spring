package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetRes> getBoardList();
    BoardGetDetailRes getBoardOne(long boardId);
    int deleteBoard(int p);
}

/* DAO 제작
@RestController : 빈등록 + 역할 지정
빈등록 : 빈(Bean) 등록은 스프링 프레임워크에서 객체를 관리하기 위한 방법 중 하나
빈은 스프링이 생성하고 관리하는 객체를 의미하며, 빈 등록을 통해 빈을 생성하고, 빈의 생명주기를 관리할 수 있습니다.

(wrtn) Spring에서 빈(Bean)은 Spring IoC(Inversion of Control) 컨테이너가 관리하는 객체를 의미합니다
IoC 컨테이너는 객체의 생성과 관리를 담당하며
이를 통해 개발자는 객체 간의 의존성 관리를 보다 쉽게 할 수 있습니다
빈 등록은 Spring 컨테이너에게 어떤 객체를 생성하고 관리해야 하는지 알려주는 과정입니다.

(wrtn) 빈을 등록하는 이유는 Spring IoC 컨테이너가 빈의 생명주기를 관리할 수 있게 하고
의존성 주입(Dependency Injection) 등의 기능을 활용하여 애플리케이션의 결합도를 낮추고 유연성을 높이기 위함입니다.
(clova) 빈 등록을 통해 스프링은 객체를 효율적으로 관리할 수 있으며
객체 간의 의존성을 자동으로 주입할 수 있습니다. 이를 통해 코드의 복잡성을 줄이고, 개발 시간을 단축할 수 있습니다.
 */

/*
FrontEnd -> BackEnd 요청 + 데이터 전송 방법
- Query String (쿼리 스트링) or Parameter (파라미터) : URL에 데이터를 실어서 보내는 방식 (쿼리 스트링은 주소창에 내용이 노출이 된다.)
1. URL 뒤에서 ?로 시작
2. key, value 로 구성
3. 구분자는 &
4. 주로 get, delete 때 사용
ex) www.naver.com?name=honggildong&age=10&height=170.1
name,age,height는 key
honggildong, 10, 170.1 은 value
 */

/*
Body에 데이터를 담아서 보낸다
1.여러가지 형태일 수 있다
2.FormData
3.Not FormData (ex. JSON, XML 등)
 */

/*
JSON
1.JavaScript Object Notation
2.자바스크립트에서 객체 생성할때 사용하는 문법을 채택
3.문자열 포맷
4.데이터를 표현하는 방식
5.키와 문자열은 꼭 쌍따옴표를 사용
6.객체에 담겨져 있는 데이터를 문자열로 직렬화 (Serialization)
7.모든 플랫폼에서 사용 가능 (마크업 언어, 프로그래밍 언어)
 */

/*
Request, Response
1.요청과 응답은 Header, Body 로 이루어진 패킷을 보낸다.
2.Header 는 목적지, 형식, 보내는 장치의 정보 등등의 메타 데이터가 담겨져 있음
3.Body 는 대상에 보내고 싶은 데이터가 담겨져 있을 수 있다
 */