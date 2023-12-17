package top.alickx.globalhandlerexdemo.demos;

/**
 * @Author: Alickx
 * @Date: 2023/12/17/23:02
 */
public class R {

	private Integer code;

	private String message;

	public R(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
