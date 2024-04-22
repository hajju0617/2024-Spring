package com.green.board;

import com.green.board.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;                   // 목적: 화면 응답
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;


@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        System.out.println(p);
        service.postBoard(p);
        return 10;
    }

    @DeleteMapping
    public int deleteBoard(@RequestParam int boardId) {
        return service.deleteBoard(boardId);
    }
}


