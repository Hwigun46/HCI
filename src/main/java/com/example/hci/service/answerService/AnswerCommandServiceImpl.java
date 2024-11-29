package com.example.hci.service.answerService;


import com.example.hci.converter.AnswerConverter;
import com.example.hci.domain.*;
import com.example.hci.repository.*;
import com.example.hci.web.dto.questionAnswer.AnswerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class AnswerCommandServiceImpl implements AnswerCommandService{
    private final Q1Repository q1Repository;
    private final Q2Repository q2Repository;
    private final Q3Repository q3Repository;
    private final Q4Repository q4Repository;
    private final Q5Repository q5Repository;
    private final Q6Repository q6Repository;
    private final Q7Repository q7Repository;
    private final Q8Repository q8Repository;
    private final Q9Repository q9Repository;
    private final Q10Repository q10Repository;
    private final Q11Repository q11Repository;
    private final Q12Repository q12Repository;

    public BaseEntity saveAnswer(int questionNumber, AnswerDTO request) {
        LocalTime responseTime = AnswerConverter.convertToTime(request.getResponseTime());

        switch (questionNumber) {
            case 1 -> {
                Q1 q1 = Q1.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q1Repository.save(q1);
            }
            case 2 -> {
                Q2 q2 = Q2.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q2Repository.save(q2);
            }
            case 3 -> {
                Q3 q3 = Q3.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q3Repository.save(q3);
            }
            case 4 -> {
                Q4 q4 = Q4.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q4Repository.save(q4);
            }
            case 5 -> {
                Q5 q5 = Q5.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q5Repository.save(q5);
            }
            case 6 -> {
                Q6 q6 = Q6.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q6Repository.save(q6);
            }
            case 7 -> {
                Q7 q7 = Q7.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q7Repository.save(q7);
            }
            case 8 -> {
                Q8 q8 = Q8.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q8Repository.save(q8);
            }
            case 9 -> {
                Q9 q9 = Q9.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q9Repository.save(q9);
            }
            case 10 -> {
                Q10 q10 = Q10.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q10Repository.save(q10);
            }
            case 11 -> {
                Q11 q11 = Q11.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q11Repository.save(q11);
            }
            case 12 -> {
                Q12 q12 = Q12.builder()
                        .answer(request.getAnswer())
                        .responseTime(responseTime)
                        .build();
                return q12Repository.save(q12);
            }
            default -> throw new IllegalArgumentException("Invalid question number: " + questionNumber);
        }
    }
}