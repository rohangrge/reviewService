package com.reviewservice.learning;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ApiResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean success = true;
    //    @JsonIgnoreProperties(value = {"createdAt", "updatedAt"})
    private Object data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String displayMsg;
}
