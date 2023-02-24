package com.khaledamin.mawardyrestapi;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class BaseResponse<T> {
    @NonNull
    private Boolean status;
    @NonNull
    private String message;
    private T data;
}
