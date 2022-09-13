package com.example.comment.controller;

import com.example.comment.entity.Comments;
import com.example.comment.service.CommentService;
import com.example.comment.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class commentsController {
    private CommentService commentService;

    commentsController() {}

    @Autowired
    commentsController(CommentService commentService) {
        this.commentService = commentService;

    }

/*    @GetMapping(value = "/list")
    public Result<?> queryPageList(MallShops mallShops,
                                   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
                                   HttpServletRequest req) {
        QueryWrapper<MallShops> queryWrapper = QueryGenerator.initQueryWrapper(mallShops, req.getParameterMap());
        Page<MallShops> page = new Page<MallShops>(pageNo, pageSize);
        IPage<MallShops> pageList = mallShopsService.page(page, queryWrapper);
        return Result.OK(pageList);
    }

    *//**
     *   添加
     *
     * @param
     * @return
     *//*

    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody MallShops mallShops) {
        mallShopsService.save(mallShops);
        return Result.OK("添加成功！");
    }

    *//**
     *  编辑
     *
     * @param mallShops
     * @return
     *//*
    @AutoLog(value = "mall_shops-编辑")
    @ApiOperation(value="mall_shops-编辑", notes="mall_shops-编辑")
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody MallShops mallShops) {
        mallShopsService.updateById(mallShops);
        return Result.OK("编辑成功!");
    }

    *//**
     *   通过id删除
     *
     * @param id
     * @return
     *//*
    @AutoLog(value = "mall_shops-通过id删除")
    @ApiOperation(value="mall_shops-通过id删除", notes="mall_shops-通过id删除")
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        mallShopsService.removeById(id);
        return Result.OK("删除成功!");
    }

    *//**
     *  批量删除
     *
     * @param ids
     * @return
     *//*
    @AutoLog(value = "mall_shops-批量删除")
    @ApiOperation(value="mall_shops-批量删除", notes="mall_shops-批量删除")
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.mallShopsService.removeByIds(Arrays.asList(ids.split(",")));
        return Result.OK("批量删除成功!");
    }*/

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/queryById")
    public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
        Comments comments = commentService.getById(id);
        if(comments==null) {
            return Result.error("未找到对应数据");
        }
        return Result.OK(comments);
    }
}
