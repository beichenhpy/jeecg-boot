package org.jeecg.modules.mock;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanpengyu
 * @since 2021-1-5
 * @version 1.0
 * mock测试
 */
@Slf4j
@RestController
@RequestMapping("/mock")
@Api(tags = "mock")
public class MockController {

    @GetMapping("/ok")
    @AutoLog
    @ApiOperation(value = "模拟测试")
    public String mockTest(){
        return "ok";
    }
}
