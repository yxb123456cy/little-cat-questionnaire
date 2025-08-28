package com.star.littlecatquestionnaire.enums;


import com.star.littlecatquestionnaire.exceptions.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ResponseCodeEnum implements BaseExceptionInterface {

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("SYSTEM_ERROR-p0", "出错啦，后台小哥正在努力修复中..."),
    PARAM_NOT_VALID("PARAM_NOT_VALID-p1", "参数错误"),

    ;

    // ----------- 业务异常状态码 -----------



    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;
}
