package com.example.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.comment.entity.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentMapper extends BaseMapper<Comments> {

}
