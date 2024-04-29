package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import com.green.board.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service // ----> 빈 등록, 로직 담당   => 해당 클래스가 서비스 계층에 속한다는 것을 나타냄
         // -----> 스프링 프레임워크는 이 어노테이션이 붙은 클래스를 자동으로 인식하여 객체를 생성하고 관리함
         // -----> Spring의 컴포넌트 스캔 기능을 사용하여 해당 클래스를 서비스 계층의 빈(Bean)으로 등록함
         // ------> 서비스 계층은 비즈니스 로직을 담당하는 부분
         // -----> @Service 어노테이션을 사용하면 Spring이 자동으로 해당 클래스의 인스턴스를 생성하고 관리함

@RequiredArgsConstructor    // @RequiredArgsConstructor 는 Lombok 에서 제공하는 어노테이션
                            // final 이나 @NonNull 이 붙은 파라미터를 가진 생성자를 자동으로 생성해주는 어노테이션입니다.
                            // 이를 통해 의존성 주입(Dependency Injection)을 쉽게 할 수 있습니다.
                            // (이를 통해 생성자 주입(Constructor Injection) 방식을 사용할 수 있습니다.
                            // 생성자 주입은 의존성 주입(Dependency Injection)의 한 방식으로, 객체 간의 의존관계를 생성자를 통해 주입받는 방식)

/*@RequiredArgsConstructor 를 사용하면 다음과 같은 장점이 있습니다.
객체 생성 시 필요한 의존성을 자동으로 주입할 수 있습니다.
코드 작성을 간소화할 수 있습니다.
객체의 안정성을 높일 수 있습니다.
 */

/*
BoardService 클래스에는 @Service 어노테이션이 붙어 있어서 Spring이 이 클래스를 서비스 계층의 빈으로 등록함
@RequiredArgsConstructor 어노테이션이 붙어 있어, BoardMapper 타입의 final 필드에 대한 생성자가 자동으로 생성됩니다.
따라서 BoardService 클래스의 생성자에는 BoardMapper 타입의 객체가 주입 됨
이를 통해 BoardService 클래스는 BoardMapper 클래스에 의존하게 되며, 이러한 의존관계는 생성자 주입 방식으로 관리 됨.
 */
public class BoardService { // 이 클래스는 BoardMapper라는 객체를 의존성으로 가지고 있음

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

DI(Dependency Injection)란 스프링이 제공하는 의존 관계 주입 기능으로,
객체를 직접 생성하는 게 아니라 외부에서 생성한 후 주입 시켜주는 방식이다.

DI(의존성 주입)를 통해서 모듈 간의 결합도가 낮아지고 유연성이 높아짐
외부에서 생성 된 객체를 setter()를 통해 사용하는 방법이다.
A 객체에서 B, C객체를 사용(의존)할 때 A 객체에서 직접 생성 하는 것이 아니라
외부(IOC컨테이너)에서 생성된 B, C객체를 조립(주입)시켜 setter 혹은 생성자를 통해 사용하는 방식
스프링에서는 객체를 Bean이라고 부르며, 프로젝트가 실행될때 사용자가 Bean으로 관리하는
객체들의 생성과 소멸에 관련된 작업을 자동적으로 수행해주는데 객체가 생성되는 곳을 스프링에서는 Bean 컨테이너라고 부른다.
 */
