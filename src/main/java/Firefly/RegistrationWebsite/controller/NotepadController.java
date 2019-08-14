package Firefly.RegistrationWebsite.controller;


import Firefly.RegistrationWebsite.dao.Result;
import Firefly.RegistrationWebsite.entity.Notepad;
import Firefly.RegistrationWebsite.service.NotepadService;
import Firefly.RegistrationWebsite.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/notepad")
@RestController
@Api(tags = "NotepadController")
public class NotepadController {


    @Autowired
    private NotepadService notepadService;


    @ApiOperation(value = "新增")
    @PostMapping("/add")
    public Result<Object> add(@RequestBody  Notepad notepad) {
        notepadService.addOne(notepad);
        return ResultUtil.success();
    }


    @ApiOperation(value = "获取所有数据")
    @GetMapping("/getAllMsg")
    public Result<List<Notepad>> getAllMsg() {
        List<Notepad> notepad = notepadService.getAllMsg();
        return ResultUtil.success(notepad);
    }

    @ApiOperation(value = "设置flag")
    @PostMapping("/setislike")
    public Result<Object> setObjectIsLike(@RequestParam(value = "code") int code, @RequestParam(value = "flag") int id) {
        notepadService.setIsLike(code, id);
        return ResultUtil.success();
    }

    @ApiOperation(value = "like+")
    @PostMapping("/like")
    public Result<Object> like(@RequestParam(value = "code") int code) {
        notepadService.like(code);
        return ResultUtil.success();
    }

    @ApiOperation(value = "like-")
    @PostMapping("/dislike")
    public Result<Object> disLike(@RequestParam(value = "code") int code) {
        notepadService.disLike(code);
        return ResultUtil.success();
    }


}
