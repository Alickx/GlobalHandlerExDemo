package top.alickx.globalhandlerexdemo.demos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Alickx
 * @Date: 2023/12/17/23:00
 */
@RestController
public class DemoController {

	@GetMapping("/test")
	public String demo() {

		throw new BizException("触发业务异常");

	}

}
