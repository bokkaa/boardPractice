package com.example.boardpractice.controller;

import com.example.boardpractice.domain.vo.Criteria;
import com.example.boardpractice.domain.vo.PageVo;
import com.example.boardpractice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/*")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/list")
    public String showNoticeList(Model model, Criteria criteria){
        model.addAttribute("pageInfo", new PageVo(boardService.getTotal(), criteria));


        return "notice/list";
    }



    @GetMapping("/detail")
    public void showNoticeDetailPage(Long boardNumber, Model model){

        model.addAttribute("boardDetail",  boardService.selectOne(boardNumber));

    }

}
