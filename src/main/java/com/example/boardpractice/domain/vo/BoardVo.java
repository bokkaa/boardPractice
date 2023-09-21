package com.example.boardpractice.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BoardVo {

    Long boardNumber;
    String boardTitle;
    String boardContent;
    String boardRegisterDate;
    String boardUpdateDate;
    Integer boardCount;

}
