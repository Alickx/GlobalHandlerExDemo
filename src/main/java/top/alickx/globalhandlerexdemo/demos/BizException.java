package top.alickx.globalhandlerexdemo.demos;

/**
 * @Author: Alickx
 * @Date: 2023/12/17/23:01
 */
public class BizException extends RuntimeException{

	public final String message;

	public BizException (String message) {
		super(message);
		this.message = message;
	}


}
