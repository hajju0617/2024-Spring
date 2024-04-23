package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service // 빈 등록, 로직 담당
@RequiredArgsConstructor    // @RequiredArgsConstructor는 Lombok에서 제공하는 어노테이션
                            // final이나 @NonNull이 붙은 파라미터를 가진 생성자를 자동으로 생성해주는 어노테이션입니다.
/*@RequiredArgsConstructor를 사용하면 다음과 같은 장점이 있습니다.
객체 생성 시 필요한 의존성을 자동으로 주입할 수 있습니다.
코드 작성을 간소화할 수 있습니다.
객체의 안정성을 높일 수 있습니다.
 */
public class BoardService {

    private final BoardMapper mapper;
    public int postBoard(BoardPostReq p) {
        System.out.println("BoardService - postBoard");
        return mapper.postBoard(p);
    }
    public int deleteBoard(int boardId) {
        return mapper.deleteBoard(boardId);
    }
    public List<BoardGetRes> getBoardList() {
        return mapper.getBoardList();
    }
    public BoardGetDetailRes getBoardOne(long boardId) {
        return mapper.getBoardOne(boardId);
    }
}
