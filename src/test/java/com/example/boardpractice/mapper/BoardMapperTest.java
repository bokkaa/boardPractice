package com.example.boardpractice.mapper;

import com.example.boardpractice.domain.dto.BoardDto;
import com.example.boardpractice.domain.vo.BoardVo;
import com.example.boardpractice.domain.vo.Criteria;
import com.example.boardpractice.domain.vo.SearchVo;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Slf4j
class BoardMapperTest {

    @Autowired
    BoardMapper boardMapper;


    BoardDto boardDto;
    BoardVo boardVo;

    @BeforeEach
    void setUp() {

        boardDto = new BoardDto();

        boardDto.setBoardContent("test입니당");
        boardDto.setBoardCount(1);
        boardDto.setBoardTitle("test");


    }

//    @Test
//    void selectAll() {
//
//        List<BoardDto> boardList = boardMapper.selectAll();
//
//        log.info(boardList.toString());
//        //매퍼 테스트
//        Assertions.assertThat(boardList.size()).isEqualTo(5);
//
//    }

    @Test
    void selectOne(){
       BoardVo boardVoList = boardMapper.selectOne(1L);
        log.info(boardVoList.toString());

        Assertions.assertThat(boardVoList.getBoardCount()).isEqualTo(boardDto.getBoardCount());
    }

    @Test
    void searchResult() {

        List<BoardDto> boardDtoList= boardMapper.searchResult(
                new Criteria(), new SearchVo());

        log.info(boardDtoList.toString()+"==========================");

        Assertions.assertThat(boardDtoList).isNotNull();

    }
}