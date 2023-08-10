package com.multicampus.springex.dto;


import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor // 모든 속성에 대한 아규먼트 처리
@NoArgsConstructor // Default 생성자
public class TodoDTO {

    private Long tno;
    @NotEmpty //빈 문자열 불가,null 불가
    private String title;
    @Future //현재보다 미래인지 확인하는 @
    private LocalDate dueDate;

    private boolean finished;
    @NotEmpty
    private String writer; // 새로 추가됨
}
