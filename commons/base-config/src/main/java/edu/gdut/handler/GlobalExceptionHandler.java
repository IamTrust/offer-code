package edu.gdut.handler;

import edu.gdut.util.ResponseDate;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 *
 * @author Trust
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseDate exception(Exception e) {
        return ResponseDate.failure().message(e.getMessage());
    }
}
