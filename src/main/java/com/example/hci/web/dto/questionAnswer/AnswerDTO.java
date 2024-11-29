package com.example.hci.web.dto.questionAnswer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerDTO {
    private int questionNumber; // 질문 번호 (Q1 ~ Q12)
    private String answer; // 답변
    private double responseTime; // 초 단위 응답 시간
}

