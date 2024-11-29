package com.example.hci.service.answerService;

import com.example.hci.domain.*;
import com.example.hci.web.dto.questionAnswer.AnswerDTO;

public interface AnswerCommandService {

    BaseEntity saveAnswer(int questionNumber, AnswerDTO request);
}
