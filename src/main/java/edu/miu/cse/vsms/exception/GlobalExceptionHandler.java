package edu.miu.cse.vsms.exception;

import edu.miu.cse.vsms.dto.response.ErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(ResourceNotFoundException ex) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;

        log.warn("Client Error: ResourceNotFoundException: {}", ex.getMessage());
        return ResponseEntity.status(httpStatus)
                .body(new ErrorResponseDto(httpStatus.value(), ex.getMessage()));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponseDto> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        log.error("DataIntegrityViolationException: {}", ex.getMessage());
        return ResponseEntity.status(httpStatus)
                .body(new ErrorResponseDto(httpStatus.value(), "Data Integrity Violation"));
    }

}
