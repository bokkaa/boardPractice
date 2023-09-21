package com.example.boardpractice.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SearchVo {

    private String noticeSearch;
    private String noticeSearchByTitleAndContent;

}
