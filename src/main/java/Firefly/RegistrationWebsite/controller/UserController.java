package Firefly.RegistrationWebsite.controller;


import Firefly.RegistrationWebsite.dao.Result;
import Firefly.RegistrationWebsite.entity.User;
import Firefly.RegistrationWebsite.service.UserService;
import Firefly.RegistrationWebsite.service.UserServiceImp;
import Firefly.RegistrationWebsite.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/user")
@RestController
@Api(tags = "UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增")
    @PostMapping("/add")
    public Result<User> hello(@RequestParam(value = "userId") Integer id,
                              @RequestParam(value = "name") String name) {
        Integer temp = 1;
        User user = new User(id, temp, name);
        userService.addUser(user);
        return ResultUtil.success(user);
    }

    @ApiOperation(value = "删除")
    @PostMapping("/delete")
    public Result<Integer> deleteByPrimaryKey(@RequestParam(value = "userId") Integer id) {

        userService.deleteByPrimaryKey(id);
        return ResultUtil.success(id);
    }
    @ApiOperation(value = "获取所有数据")
    @GetMapping("/getAllUser")
    public Result<List<User>> getAllUser() {
        List<User> users =   userService.getAllUser();
        return ResultUtil.success(users);
    }



    @ApiOperation(value = "testapi")
    @GetMapping("massage")
    @ResponseBody
    public Map helloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "hello");
        map.put("time", new Date().toString());
        return map;
    }


}
