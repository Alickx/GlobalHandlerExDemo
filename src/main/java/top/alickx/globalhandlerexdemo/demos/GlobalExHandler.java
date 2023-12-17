package top.alickx.globalhandlerexdemo.demos;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Alickx
 * @Date: 2023/12/17/23:02
 */
@RestControllerAdvice
public class GlobalExHandler {

	private final Logger logger = LoggerFactory.getLogger(GlobalExHandler.class);

	@ExceptionHandler(BizException.class)
	public R BizExHandler(BizException e) {
		logger.info("捕获业务异常",e.getLocalizedMessage());
		return new R(400,e.getLocalizedMessage());
	}

}
