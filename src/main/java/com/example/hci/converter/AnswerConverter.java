package com.example.hci.converter;

import com.example.hci.domain.*;
import com.example.hci.web.dto.questionAnswer.AnswerDTO;
import com.example.hci.web.dto.questionAnswer.AnswerResponseDTO;

import java.time.LocalTime;

public class AnswerConverter {

    // Helper method to convert seconds (double) to LocalTime
    public static LocalTime convertToTime(double seconds) {
        int minutes = (int) (seconds / 60); // 분 계산
        double remainingSeconds = seconds % 60; // 초 계산
        int wholeSeconds = (int) remainingSeconds; // 초의 정수 부분
        int nanos = (int) ((remainingSeconds - wholeSeconds) * 1_000_000_000); // 나노초 계산
        return LocalTime.of(0, minutes, wholeSeconds, nanos);
    }


    public static BaseEntity convertToEntity(AnswerDTO request, int questionNumber) {
        LocalTime responseTime = convertToTime(request.getResponseTime());
        switch (questionNumber) {
            case 1: return Q1.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 2: return Q2.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 3: return Q3.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 4: return Q4.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 5: return Q5.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 6: return Q6.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 7: return Q7.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 8: return Q8.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 9: return Q9.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 10: return Q10.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 11: return Q11.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            case 12: return Q12.builder().answer(request.getAnswer()).responseTime(responseTime).build();
            default: throw new IllegalArgumentException("Invalid question number: " + questionNumber);
        }
    }


    public static AnswerResponseDTO convertToResponse(BaseEntity entity) {
        return AnswerResponseDTO.builder()
                .answer(entity.getAnswer())
                .responseTime(entity.getResponseTime())
                .build();
    }
}