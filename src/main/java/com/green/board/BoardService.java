package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import com.green.board.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service // 빈 등록, 로직 담당
@RequiredArgsConstructor    // @RequiredArgsConstructor 는 Lombok 에서 제공하는 어노테이션
                            // final 이나 @NonNull 이 붙은 파라미터를 가진 생성자를 자동으로 생성해주는 어노테이션입니다.
/*@RequiredArgsConstructor 를 사용하면 다음과 같은 장점이 있습니다.
객체 생성 시 필요한 의존성을 자동으로 주입할 수 있습니다.
코드 작성을 간소화할 수 있습니다.
객체의 안정성을 높일 수 있습니다.
 */
public class BoardService {

    private final BoardMapper mapper;
    public int postBoard(BoardPostReq p) {      // INSERT
        System.out.println("BoardService - postBoard");
        return mapper.postBoard(p);
    }
    public List<BoardGetRes> getBoardList() {   // SELECT
        return mapper.getBoardList();
    }
    public BoardGetDetailRes getBoardOne(long boardId) {    // SELECT
        return mapper.getBoardOne(boardId);
    }
    public int putBoard(BoardPutReq p) {    // UPDATE
        return mapper.putBoard(p);
    }
    public int deleteBoard(int boardId) {   // DELETE
        return mapper.deleteBoard(boardId);
    }
}

/*
<Non IoC>                           <IoC>                                외부객체
new A();                             A a;       <------객체 주입(DI)----- new A()
new B();                             B b;       <------객체 주입(DI)----- new B()
IoC는 제어의 역전이라는 뜻으로 객체가 자신이 사용할 오브젝트를 스스로 선택하지 않으며
자신이 어떻게 만들어지고 사용되는 지에 대한 정보도 알 수 없도록 하는 기법입니다
즉, 제어권을 타 객체에게 넘겨주어 자신이 사용하는 객체에 대한 컨트롤을 하지 않습니다.

DI(Dependency Injection)란 스프링이 다른 프레임워크와 차별화되어 제공하는 의존 관계 주입 기능으로,
객체를 직접 생성하는 게 아니라 외부에서 생성한 후 주입 시켜주는 방식이다.

DI(의존성 주입)를 통해서 모듈 간의 결합도가 낮아지고 유연성이 높아짐
외부에서 생성 된 객체를 setter()를 통해 사용하는 방법이다.
A 객체에서 B, C객체를 사용(의존)할 때 A 객체에서 직접 생성 하는 것이 아니라
외부(IOC컨테이너)에서 생성된 B, C객체를 조립(주입)시켜 setter 혹은 생성자를 통해 사용하는 방식
스프링에서는 객체를 Bean이라고 부르며, 프로젝트가 실행될때 사용자가 Bean으로 관리하는
객체들의 생성과 소멸에 관련된 작업을 자동적으로 수행해주는데 객체가 생성되는 곳을 스프링에서는 Bean 컨테이너라고 부른다.
 */
