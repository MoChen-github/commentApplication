package com.example.comment.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.comment.entity.Comment;
import com.example.comment.service.CommentService;
import com.example.comment.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@RestController
@RequestMapping("/comments")
public class commentsController {
    private CommentService commentService;

    commentsController() {}

    @Autowired
    commentsController(CommentService commentService) {
        this.commentService = commentService;

    }

    /**
     * 根据商品ID查询该商品对应的评论
     * @param comment
     * @param pageNo
     * @param pageSize
     * @param goodsId
     * @param req
     * @return
     */
    @GetMapping(value = "/list")
    public Result<?> queryPageListByGoodId(Comment comment,
                                           @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                           @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
                                           @RequestParam(name="goods_id",required=true) String goodsId,
                                           HttpServletRequest req) {
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("goods_id", goodsId);
        Page<Comment> page = new Page<Comment>(pageNo, pageSize);
        IPage<Comment> pageList = commentService.page(page, queryWrapper);
        return Result.OK(pageList);
    }

    /**
     *   添加
     *
     * @param
     * @return
     */

    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody Comment comment) {
        commentService.save(comment);
        return Result.OK("添加成功！");
    }

    /**
     *  编辑
     *
     * @param comment
     * @return
     */
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody Comment comment) {
        commentService.updateById(comment);
        return Result.OK("编辑成功!");
    }

    /**
     *   通过id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        commentService.removeById(id);
        return Result.OK("删除成功!");
    }

    /**
     *  批量删除
     *
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.commentService.removeByIds(Arrays.asList(ids.split(",")));
        return Result.OK("批量删除成功!");
    }

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/queryById")
    public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
        Comment comment = commentService.getById(id);
        if(comment ==null) {
            return Result.error("未找到对应数据");
        }
        return Result.OK(comment);
    }
}
