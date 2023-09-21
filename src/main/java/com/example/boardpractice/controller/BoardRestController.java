package com.example.boardpractice.controller;


import com.example.boardpractice.domain.dto.BoardDto;
import com.example.boardpractice.domain.vo.Criteria;
import com.example.boardpractice.domain.vo.PageVo;
import com.example.boardpractice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notices")
public class BoardRestController {

    private final BoardService boardService;


    @GetMapping("/list/{page}")
    public Map<String, Object> findAll(Criteria criteria)
                                 {

        PageVo pageVo = new PageVo(boardService.getTotal(), criteria);
        List<BoardDto> boardDtoList = boardService.selectAll(criteria);

        Map<String, Object> boardMap = new HashMap<>();
        boardMap.put("pageVo", pageVo);
        boardMap.put("boardList", boardDtoList);


        return boardMap;
    }




}
