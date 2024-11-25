package edu.miu.cse.vsms.dto.response;

public record ErrorResponseDto(
        boolean error,
        int statusCode,
        Object message
) {

    public ErrorResponseDto(int statusCode, Object message) {
        this(true, statusCode, message);
    }

}
