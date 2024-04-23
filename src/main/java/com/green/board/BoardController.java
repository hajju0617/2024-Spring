package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;                   // 목적: 화면 응답
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.List;


@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return service.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetDetailRes getBoardOne(@PathVariable long boardId) {
        return service.getBoardOne(boardId);
    }

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        System.out.println(p);
        service.postBoard(p);
        return 10;
    }

    @DeleteMapping
    public int deleteBoard(@RequestParam(name="board_id") int boardId) {
        return service.deleteBoard(boardId);
    }
}

/*
Spring Framework에서 @Controller와 @RestController는 웹 애플리케이션에서
컨트롤러 계층을 정의할 때 사용하는 주요 어노테이션입니다.
두 어노테이션 모두 Spring의 웹 MVC(Model-View-Controller) 패턴에서 'Controller' 부분을 담당합니다.

1.@Controller: 뷰를 처리하는 컨트롤러를 생성하는 어노테이션입니다
클라이언트의 요청을 받아 해당 요청에 대한 뷰를 반환합니다. 뷰는 HTML, JSP, Thymeleaf 등의 템플릿 엔진을 사용하여 생성됩니다.

(wrtn)
@Controller 어노테이션은 주로 웹 페이지를 반환하는 컨트롤러에 사용됩니다.
이 어노테이션이 붙은 클래스는 클라이언트의 요청을 처리하고, 모델 객체를 뷰에 전달하며, 뷰 이름을 반환합니다.
반환된 뷰 이름을 기반으로 뷰 리졸버(view resolver)가 실제 뷰를 찾고, 렌더링을 수행합니다.
주로 HTML 페이지를 서빙하는 등의 클라이언트 측으로 직접적인 뷰를 반환할 때 사용됩니다.

2.@RestController: RESTful API를 처리하는 컨트롤러를 생성하는 어노테이션입니다
클라이언트의 요청을 받아 해당 요청에 대한 JSON 또는 XML 형태의 데이터를 반환합니다
뷰를 생성하지 않고, 직접 데이터를 반환하기 때문에 @Controller에 비해 처리 속도가 빠릅니다.
주로 RESTful 웹 서비스를 구축할 때 사용됩니다. JSON이나 XML 같은 형식의 데이터를 클라이언트에게 직접 반환합니다.

(wrtn)
@RestController 어노테이션은 @Controller에 @ResponseBody를 추가한 것으로 볼 수 있습니다.
이 어노테이션이 붙은 클래스의 모든 메소드는 기본적으로 @ResponseBody 어노테이션의 동작을 수행하게 됨
즉, 메소드가 반환하는 값은 응답 본문(Response Body)에 직접 쓰여집니다.
주로 RESTful 웹 서비스를 구축할 때 사용됩니다. JSON이나 XML 같은 형식의 데이터를 클라이언트에게 직접 반환합니다.
클라이언트와 서버 간의 데이터 통신에 최적화되어 있으며, 주로 AJAX 요청 처리에 사용됩니다.

@Controller와 @RestController의 차이점

목적: @Controller는 주로 뷰를 반환하는 데 사용되며
@RestController는 RESTful 서비스를 만들기 위해 JSON, XML 같은 데이터를 반환하는 데 사용됩니다.

뷰와 데이터: @Controller는 뷰 이름을 반환하여 뷰 리졸버가 처리할 수 있게 하며
@RestController는 데이터를 반환하여 클라이언트에게 직접 응답 본문으로 제공합니다.

반환 형식: @Controller는 뷰를 반환하고, @RestController는 JSON 또는 XML 형태의 데이터를 반환합니다.

처리 속도: @RestController는 뷰를 생성하지 않고, 직접 데이터를 반환하기 때문에 @Controller에 비해 처리 속도가 빠릅니다.

HTTP 상태 코드: @RestController는 HTTP 상태 코드를 직접 반환할 수 있습니다
반면에 @Controller는 HTTP 상태 코드를 직접 반환할 수 없습니다.

API 문서화: @RestController는 Swagger와 같은 API 문서화 도구를 사용하여 API 문서를 쉽게 생성할 수 있습니다
반면에 @Controller는 API 문서화 도구를 사용하기 어렵습니다.
 */


