package com.example.hci.web.controller;


import com.example.hci.api.ApiResponse;
import com.example.hci.converter.AnswerConverter;
import com.example.hci.domain.*;
import com.example.hci.service.answerService.AnswerCommandService;
import com.example.hci.web.dto.questionAnswer.AnswerDTO;
import com.example.hci.web.dto.questionAnswer.AnswerResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/q")
public class AnswerController {

    private final AnswerCommandService answerCommandService;

    @PostMapping("/{questionNumber}")
    public ApiResponse<AnswerResponseDTO> handleAnswer(
            @PathVariable int questionNumber,
            @RequestBody @Valid AnswerDTO request
    ) {
        // 서비스 호출하여 저장 및 응답 변환
        BaseEntity entity = answerCommandService.saveAnswer(questionNumber, request);
        return ApiResponse.onSuccess(AnswerConverter.convertToResponse(entity));
    }
}