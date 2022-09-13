package com.example.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.comment.entity.Comments;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public interface CommentService extends IService<Comments> {

    public Comments getById(String id);
}
