package com.example.comment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

public class goodsController {
    /**
     * 分页列表查询
     *
     * @param mallGoods
     * @param pageNo
     * @param pageSize
     * @param req
     * @return
     */
/*    @GetMapping(value = "/list")
    public Result<?> queryPageList(MallGoods mallGoods,
                                   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
                                   HttpServletRequest req) {
        QueryWrapper<MallGoods> queryWrapper = QueryGenerator.initQueryWrapper(mallGoods, req.getParameterMap());
        Page<MallGoods> page = new Page<MallGoods>(pageNo, pageSize);
        IPage<MallGoods> pageList = mallGoodsService.page(page, queryWrapper);
        return Result.OK(pageList);
    }*/
}
