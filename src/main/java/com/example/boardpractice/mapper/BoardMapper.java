package com.example.boardpractice.mapper;

import com.example.boardpractice.domain.dto.BoardDto;
import com.example.boardpractice.domain.vo.BoardVo;
import com.example.boardpractice.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    //공지사항 전체조회
    public List<BoardDto> selectAll(Criteria criteria);

    //공지사항 상세보기
    public BoardVo selectOne(Long boardNumber);

    //공지사항 게시물 총 개수
    public int getTotal();

}
