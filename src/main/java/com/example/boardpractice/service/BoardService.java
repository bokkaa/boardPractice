package com.example.boardpractice.service;


import com.example.boardpractice.domain.dto.BoardDto;
import com.example.boardpractice.domain.vo.BoardVo;
import com.example.boardpractice.domain.vo.Criteria;
import com.example.boardpractice.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {


    private final BoardMapper boardMapper;



    //전체조회
    public List<BoardDto> selectAll(Criteria criteria){
       return boardMapper.selectAll(criteria);
    }


    //공지사항 상세보기
    public BoardVo selectOne(Long boardNumber){
        return boardMapper.selectOne(boardNumber);
    }



    public int getTotal(){
        return boardMapper.getTotal();
    }
}
